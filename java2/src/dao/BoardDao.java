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

	private Connection conn; // 1. DB  ���� Ŭ����
	private PreparedStatement ps; // 2. ����� DB�� SQL ���� �������̽�
	private ResultSet rs; // 3. SQL ��� ���ڵ�
	public static BoardDao boardDao = new BoardDao(); // DB ���� ��ü
	public static ArrayList<String> viewlist = new ArrayList<String>();
	public BoardDao() {// �����ڿ��� �����ϴ� ���� : ��ü ������ �ٷ� ���� �ϱ� ����
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=Asia/Seoul ",
				"root", "1234"); // jdbc:mysql:ip�ּ�/port��ȣ
	} catch(Exception e) {System.out.println(e);}	
	}
	
	public boolean write( Board board) {   
		try {
		// 1. SQL �ۼ�
			String sql = "insert into board(btitle , bcontent , bwrite) values(?,?,?)";
		// 2. SQL ����
			ps = conn.prepareStatement(sql);
			ps.setString( 1 , board.getBtitle() ); 
			ps.setString( 2 , board.getBcontent() ); 
			ps.setString( 3 , board.getBwrite() );
		// 3. SQL ����
			ps.executeUpdate(); // insert , update, delete <----> ps.executeQuery(); // select
		// 4. SQL ���
			return true;
		}catch(Exception e ) { System.out.println( "[SQL ����]"+e  ); }
		return false;  
	}
		// 2. ��� �� ȣ�� �޼ҵ� [ ��ȯŸ�� : ObservableList
	public ObservableList<Board> list() {
		// * ����Ʈ ���� 
		ObservableList<Board> boardlist = FXCollections.observableArrayList();
		try {
		// 1. SQL �ۼ�
				// ���� : order by �ʵ�� asc   [ �ش� �ʵ�� �������� �������� ]
				//		 order by �ʵ�� desc	 [ �ش� �ʵ�� �������� �������� ] 
			String sql = "select * from board order by bnum asc";
		// 2. SQL ����
			ps = conn.prepareStatement(sql);
		// 3. SQL ����
			rs = ps.executeQuery(); //select
		// 4. SQL ���
			// rs : �˻� ����� ���ڵ带 �ϳ��� ��ȸ[��������=next()]
				// rs.next() : �˻������ ���� ���ڵ� 
				// rs.get�ڷ���( �ش��ʵ������ȣ ) : �� ���ڵ忡�� �ش� �ʵ��� ������ ��������
			while( rs.next() ) { // ���� ���ڵ尡 ���������� �ݺ�
				// 1. ��üȭ
				Board board = new Board( rs.getInt(1) ,
						rs.getString(2),
						rs.getString(3), 
						rs.getString(4), 
						rs.getString(5), 
						rs.getInt(6));
				// 2. �ش� ��ü�� ����Ʈ�� ��� 
				boardlist.add(board); 
			}
			// ������ ����Ʈ ��ȯ 
			return boardlist;
		}catch(Exception e ) { System.out.println( "[SQL ����]"+e  ); }
		return null; // ���н� null
	}
	public boolean delete(int bnum) {
		try {
		// 1. SQL �ۼ�
		String sql = "delete from javafx.board where bnum = ?";
		// 2. SQL ����
		ps = conn.prepareStatement(sql);
		ps.setInt(1, bnum);
		// 3. SQL ����
		ps.executeUpdate();
		// 4. SQL ���
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
	
	// 5. ��� �ۼ� [ ���� �Խù��� ��ȣ �ʿ� ]
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
	// 6. ��� ȣ�� 
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
	// 7. ��� ����(����������)
	public boolean rdelete(int rnum) {
		try {
			// ���ڵ� ���� : delate from ���̺�� where ����
		String sql = "delete from javafx.reply where rnum = ?";
		// 2. SQL ����
		ps = conn.prepareStatement(sql);
		ps.setInt(1, rnum);
		// 3. SQL ����
		ps.executeUpdate();
		return true;
		}catch(Exception e) {System.out.println(e);}
		return false;}
	
	// 8. ��ȸ�� ���� -- ���� (����, �ε�, �Ǵ� ���� �ؾ� �ҵ�...)
	
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
					System.out.println("��ȸ�� ������");
					return false;
				}else {
					controller.board.Board.board.setBview(controller.board.Board.board.getBview() + 1);
					save();
					String sql = "update javafx.board set bview=? where bnum=?";
					ps = conn.prepareStatement(sql);
					ps.setInt(1, controller.board.Board.board.getBview());
					ps.setInt(2, controller.board.Board.board.getBnum());
					ps.executeUpdate();
					System.out.println("��ȸ�� ����");
					return true;
				}	
			}
		} catch(Exception e) {System.out.println("��ȸ ���� ���� " + e);}
		return false;
	}
	
	public void save() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
		FileOutputStream fileOutputStream = new FileOutputStream("D:/�ڹ�/view.txt", true);
		
			String ���� = Login.member.getMid() +","+ format.format(new Date()) +","+ controller.board.Board.board.getBnum() + "\n";
			fileOutputStream.write(����.getBytes());
			fileOutputStream.close();
		}catch(Exception e) {System.out.println("���� ���� �߻� ! " + e);}
	}
	
	public void load() {
		try {
				FileInputStream fileInputStream = new FileInputStream("D:/�ڹ�/view.txt");
				byte[] bytes = new byte[1024];
				fileInputStream.read(bytes);
				String file = new String(bytes);
				String[] point = file.split("\n");

				int i=0; // �ε�����
				for(String temp : point) { 
					if(i+1==point.length) {break;}
					String field = point[0] + point[1] + point[2];
					viewlist.add(field);
					i++; // �ε��� ����
				}
				fileInputStream.close(); 
				
			} catch(Exception e) {
				System.out.println("�˸�)) ���� �ε� ����(�����ڿ��� ����) " + e);
			}
		
	}
	// 9. ��ü �� ��ȯ
	public Map<String, Integer> bdatetotal(String table, String date) {
		try {
			Map<String, Integer> map = new HashMap<>();
		String sql = "select substring_index(" + date + " , ' ' , 1 )  , count(*) from" + table + "group by substring_index( + " + date +", ' ' , 1 )";
		// ��¥�� �ð��� ���� �����ϱ� ������ ��¥�� �ð� �и� [ ���� ���� ]
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		while(rs.next()) {
			map.put(rs.getString(1), rs.getInt(2));
			
			return map;
		}}catch(Exception e) {}
		return null;
	}
	
	
}
