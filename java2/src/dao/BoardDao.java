package dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import controller.login.Login;
import dto.Board;
import dto.Member;
import dto.Reply;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class BoardDao {

	private Connection conn; // 1. DB  연결 클래스
	private PreparedStatement ps; // 2. 연결된 DB내 SQL 조작 인터페이스
	private ResultSet rs; // 3. SQL 결과 레코드
	public static BoardDao boardDao = new BoardDao(); // DB 연동 객체
	public static ArrayList<String> viewlist = new ArrayList<String>();
	public BoardDao() {// 생성자에서 연동하는 이유 : 객체 생성시 바로 연동 하기 위해
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=Asia/Seoul ",
				"root", "1234"); // jdbc:mysql:ip주소/port번호
	} catch(Exception e) {System.out.println(e);}	
	}
	
	public boolean write( Board board) {   
		try {
		// 1. SQL 작성
			String sql = "insert into board(btitle , bcontent , bwrite) values(?,?,?)";
		// 2. SQL 조작
			ps = conn.prepareStatement(sql);
			ps.setString( 1 , board.getBtitle() ); 
			ps.setString( 2 , board.getBcontent() ); 
			ps.setString( 3 , board.getBwrite() );
		// 3. SQL 실행
			ps.executeUpdate(); // insert , update, delete <----> ps.executeQuery(); // select
		// 4. SQL 결과
			return true;
		}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
		return false;  
	}
		// 2. 모든 글 호출 메소드 [ 반환타입 : ObservableList
	public ObservableList<Board> list() {
		// * 리스트 선언 
		ObservableList<Board> boardlist = FXCollections.observableArrayList();
		try {
		// 1. SQL 작성
				// 정렬 : order by 필드명 asc   [ 해당 필드명 기준으로 오름차순 ]
				//		 order by 필드명 desc	 [ 해당 필드명 기준으로 내림차순 ] 
			String sql = "select * from board order by bnum asc";
		// 2. SQL 조작
			ps = conn.prepareStatement(sql);
		// 3. SQL 실행
			rs = ps.executeQuery(); //select
		// 4. SQL 결과
			// rs : 검색 결과의 레코드를 하나씩 순회[가져오기=next()]
				// rs.next() : 검색결과의 다음 레코드 
				// rs.get자료형( 해당필드순서번호 ) : 현 레코드에서 해당 필드의 데이터 가져오기
			while( rs.next() ) { // 다음 레코드가 없을때까지 반복
				// 1. 객체화
				Board board = new Board( rs.getInt(1) ,
						rs.getString(2),
						rs.getString(3), 
						rs.getString(4), 
						rs.getString(5), 
						rs.getInt(6));
				// 2. 해당 객체를 리스트에 담기 
				boardlist.add(board); 
			}
			// 성공시 리스트 반환 
			return boardlist;
		}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
		return null; // 실패시 null
	}
	public boolean delete(int bnum) {
		try {
		// 1. SQL 작성
		String sql = "delete from javafx.board where bnum = ?";
		// 2. SQL 실행
		ps = conn.prepareStatement(sql);
		ps.setInt(1, bnum);
		// 3. SQL 실행
		ps.executeUpdate();
		// 4. SQL 결과
		return true;
		}catch(Exception e) {System.out.println(e);}
		return false;
		}
	public boolean update(int bnum, String title, String content) {
		try {
			String sql = "update board set btitle=? , bcontent=? where bnum=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, bnum);
			ps.executeUpdate();
			return true;
		}catch(Exception e) {System.out.println(e);}
		
		
		return false;
	}
	
	// 5. 댓글 작성 [ 현재 게시물의 번호 필요 ]
	public boolean rwrite(Reply reply) {
		try {
		String sql = "insert into javafx.reply(rcontent, rwrite, bnum) values(?,?,?)";
		ps = conn.prepareStatement(sql);
		ps.setString(1, reply.getRcontent());
		ps.setString(2, reply.getRwrite());
		ps.setInt(3, reply.getBnum());
		ps.executeUpdate();
		return true;
		}catch(Exception e) {System.out.println(e);}
		return false;
	}
	// 6. 댓글 호출 
	public ObservableList<Reply> replylist(int bnum) {
		ObservableList<Reply> replylist = FXCollections.observableArrayList();
		try {
			String sql = "select * from javafx.reply where bnum =? order by rnum asc";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bnum);
			rs = ps.executeQuery();
			while(rs.next()) {
				Reply reply = new Reply(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getInt(5) );
				replylist.add(reply);
			}
			return replylist;
		}catch(Exception e) {System.out.println(e);}
		return null;
	}
	// 7. 댓글 삭제(개인적으로)
	public boolean rdelete(int rnum) {
		try {
			// 레코드 삭제 : delate from 테이블명 where 조건
		String sql = "delete from javafx.reply where rnum = ?";
		// 2. SQL 조작
		ps = conn.prepareStatement(sql);
		ps.setInt(1, rnum);
		// 3. SQL 실행
		ps.executeUpdate();
		return true;
		}catch(Exception e) {System.out.println(e);}
		return false;}
	
	// 8. 조회수 증가 -- 구현 (저장, 로드, 판단 구현 해야 할듯...)
	
	public boolean viewplus() {
		load();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String now = Login.member.getMid()+","+format.format(new Date())+","+controller.board.Board.board.getBnum();
		
		try {
			if(controller.board.Board.board != null) {
				boolean p = false;
				for(int i=0; i<viewlist.size(); i++) {
					if(viewlist.get(i).equals(now)) {
						System.out.println(viewlist.get(i));
						p=true;
					}
				}
				if(p) {
					System.out.println("조회수 미증가");
					return false;
				}else {
					controller.board.Board.board.setBview(controller.board.Board.board.getBview() + 1);
					save();
					String sql = "update javafx.board set bview=? where bnum=?";
					ps = conn.prepareStatement(sql);
					ps.setInt(1, controller.board.Board.board.getBview());
					ps.setInt(2, controller.board.Board.board.getBnum());
					ps.executeUpdate();
					System.out.println("조회수 증가");
					return true;
				}	
			}
		} catch(Exception e) {System.out.println("조회 증가 오류 " + e);}
		return false;
	}
	
	public void save() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
		FileOutputStream fileOutputStream = new FileOutputStream("D:/자바/view.txt", true);
		
			String 내용 = Login.member.getMid() +","+ format.format(new Date()) +","+ controller.board.Board.board.getBnum() + "\n";
			fileOutputStream.write(내용.getBytes());
			fileOutputStream.close();
		}catch(Exception e) {System.out.println("저장 오류 발생 ! " + e);}
	}
	
	public void load() {
		try {
				FileInputStream fileInputStream = new FileInputStream("D:/자바/view.txt");
				byte[] bytes = new byte[1024];
				fileInputStream.read(bytes);
				String file = new String(bytes);
				String[] point = file.split("\n");

				int i=0; // 인덱스용
				for(String temp : point) { 
					if(i+1==point.length) {break;}
					String field = point[0] + point[1] + point[2];
					viewlist.add(field);
					i++; // 인덱스 증가
				}
				fileInputStream.close(); 
				
			} catch(Exception e) {
				System.out.println("알림)) 파일 로드 실패(관리자에게 문의) " + e);
			}
		
	}
	// 9. 전체 수 반환
	public Map<String, Integer> bdatetotal(String table, String date) {
		try {
			Map<String, Integer> map = new HashMap<>();
		String sql = "select substring_index(" + date + " , ' ' , 1 )  , count(*) from" + table + "group by substring_index( + " + date +", ' ' , 1 )";
		// 날짜랑 시간이 같이 존재하기 때문에 날짜랑 시간 분리 [ 공백 기준 ]
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		while(rs.next()) {
			map.put(rs.getString(1), rs.getInt(2));
			
			return map;
		}}catch(Exception e) {}
		return null;
	}
	
	
}
