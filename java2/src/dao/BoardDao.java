package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Board;
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
	
	public BoardDao() {// 생성자에서 연동하는 이유 : 객체 생성시 바로 연동 하기 위해
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC",
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
	
	// 8. 조회수 증가
	
}
