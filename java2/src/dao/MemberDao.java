package dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import controller.login.Login;
import dto.Member;

public class MemberDao { // DB ���ٰ�ü

	private Connection con; // DB������ ���Ǵ� Ŭ���� : DB����Ŭ����
	private PreparedStatement ps; // ����� DB�� SQL �����Ҷ� ���Ǵ� �������̽�
	private ResultSet rs; // ������� �����ϴ� �������̽� �˻� [select]
	// DB �����Ҷ����� ��ü ����� ���ʿ�
	
	public static MemberDao memberDao = new MemberDao();// DB ���� ��ü;
	public static ArrayList<String> pointlist = new ArrayList<>();
	public MemberDao () {
		memberDao = this;
		try {
		// DB ����
		Class.forName("com.mysql.cj.jdbc.Driver"); // 1. DB ����̹� ��������
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC", 
				"root", "1234"); // 2. DB �ּ� ����
		
	}
	catch(Exception e) {System.out.println(e);}
	}
	
	// �޼ҵ�
	// * ���̵� �ߺ�üũ �޼ҵ�(���̵� �μ��� �޾� db�� �����ϴ��� üũ)
	public boolean idcheck(String id) {
		try {
		// 1. SQL �ۼ�
			// �˻� : select * from ���̺�� where ����
		String sql = "select * from javafx.member where mid = ?";
		// 2. SQL ����
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		// 3. SQL ����
		rs = ps.executeQuery(); // select ���� -> �˻��� ����� ���� -> resultset 0
		// resultSet ó�� �⺻ ���� : null -> next() -> ��� ���ڵ�
		// 4. SQL ���
		if(rs.next()) return true;
		
		} catch(Exception e) {}
		return false;
	}
	// 1. ȸ������ (�μ� : db�� ���� ���̵�, ���, �̸���, �ּ�)
	public boolean signup(Member member) {
		try {
		// 1. sql �ۼ� [ ȸ����ȣ(�ڵ���ȣ = auto), ����Ʈ(���Խ� 0) ������ ��� �ʵ� ����
		String sql = "insert into member(mid,mpassword,memail,maddress,mpoint,msince)values(?,?,?,?,?,?)";
		// 2. sql ����
		ps = con.prepareStatement(sql); // PreparedStatement �������̽��� ����� db�� sql �ֱ�
		ps.setString( 1 , member.getMid() ); // 1�� ? �� ���̵� �־��ֱ�
		ps.setString( 2 , member.getMpassword() ); // 2�� ? �� ��й�ȣ �־��ֱ�
		ps.setString( 3 , member.getMemail() ); // 3�� ? �� �̸��� �־��ֱ�
		ps.setString( 4 , member.getMaddress() ); // 4�� ? �� �ּ� �־��ֱ�
		ps.setInt( 5 , member.getMpoint() ); // 5�� ? �� ����Ʈ �־��ֱ�
		ps.setString( 6 , member.getMsince() ); // 6�� ? �� ������ �־��ֱ�
		// 3. sql ����
		ps.executeUpdate(); // insert ����
		return true;
		}catch(Exception e) {System.out.println(e);}
		// 3. sql ����
		return false;
		}
	// 2. �α���(�μ� : �α��ν� �ʿ��� ���̵�, ���)
	public boolean login(String id, String password) throws SQLException {
		
		// 1. sql �ۼ�
		String sql = "select * from javafx.member where mid=? and mpassword=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, id); // ù��° ?�� id �ֱ�
		ps.setString(2, password); // �ι�° ?�� pw �ֱ�
		
		rs = ps.executeQuery(); // select ���� -> resultset
		
		if(rs.next()) {return true;}
		return false;
		}
	// 3. ���̵�ã�� �޼ҵ�(�μ� : ���̵� ã��� �ʿ��� �̸���)
	public String findid(String email, String address) throws SQLException {
		String sql = "select * from javafx.member where memail = ? and maddress = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, address);
		rs = ps.executeQuery();
		
		if(rs.next()) { // ���� ����� ���� ���ڵ尡 ������
			String id = rs.getString("mid");
			return id;
			}
		return null;
		}
	// 4. ��й�ȣã�� �޼ҵ�(�μ� : ��� ã�� �� �ʿ��� ���̵�, �̸���)
	public String findpw(String id, String email) throws SQLException {
		String sql = "select * from javafx.member where mid = ? and memail = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, email);
		rs = ps.executeQuery();
		
		if(rs.next()) {
			String pw = rs.getString("mpassword");
			return pw;
			}
		return null;
		}
	
	// 5. ���̵�� ȸ������ ȣ��
	public Member getmember(String id) {
		try {
		// 1. SQL �ۼ�
		String sql = "select * from javafx.member where mid=?";
		// 2. SQL ����
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		// 3. SQL ����
		rs = ps.executeQuery();
		// 4. SQL ���
		if(rs.next() ) {
			// 1. ��ü����
			Member member = new Member(rs.getInt(1), rs.getString(2), rs.getString(3),
					rs.getString(4),rs.getString(5), rs.getInt(6) , rs.getString(7) );
			// rs.next() : ����� ���� ���ڵ�(��, ����)
			// rs.getInt(�ʵ� ���� ��ȣ) : �ش� �ʵ��� �ڷ����� ���������� ��������
			// rs.getString(�ʵ� ���� ��ȣ) : �ش� �ʵ��� �ڷ����� ���ڿ��� ��������
			// 2. ��ȯ
			return member;
		}
		}catch(Exception e) {System.out.println(e);}
		return null;
	}
	// 6. ȸ��Ż�� // ȸ����ȣ�� �μ��� �޾� �ش� ȸ����ȣ�� ���ڵ� ����
	public boolean delate(int mnum) {
		try {
			// ���ڵ� ���� : delate from ���̺�� where ����
		String sql = "delete from javafx.member where mnum = ?";
		// 2. SQL ����
		ps = con.prepareStatement(sql);
		ps.setInt(1, mnum);
		// 3. SQL ����
		ps.executeUpdate();
		return true;
		}catch(Exception e) {System.out.println(e);}
		return false;
	}
	// 7. ȸ������[ȸ����ȣ ,�̸���, �ּ� �μ��� �޾� ����]
	public boolean update(int mnum, String email, String address) {
		try {
			String sql = "update javafx.member set memail = ?, maddress = ? where mnum = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, address);
			ps.setInt(3, mnum);
			ps.executeUpdate();
			return true;
		}catch(Exception e){System.out.println(e);}
		return false;
	}
	// 8. ����Ʈ ȹ��
	// 8. �α��ν� ����Ʈ+10
		public boolean pointplus() {
			try {
				load();
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				
				String now = Login.member.getMid()+format.format(new Date());
				System.out.println("now : "+now);
				String sql = "update member set mpoint=? where mnum=?";
				ps = con.prepareStatement(sql);
				boolean pass = false;
				for(int i=0; i<pointlist.size(); i++) {
					if(pointlist.get(i).equals(now)) {
						pass=true;
					}
				}
				if(pass==true) {
					System.out.println("����Ʈ������");
					ps.setInt(1, Login.member.getMpoint());
				}else {
					System.out.println("����Ʈ����");
					ps.setInt(1, (Login.member.getMpoint()+10));
					i = Login.member.getMid()+format.format(new Date());
					save();
				}
				ps.setInt(2, Login.member.getMnum());
				ps.executeUpdate();
				
				
				return true;
			} catch(Exception e) {
				System.out.println("sql ���� : "+ e);
			}
			return false;
		}
		
		public static String i;
		
		// ���� ����
		public static void save() {
			
			try {
				FileOutputStream outputStream = new FileOutputStream("D:/�ڹ�/����Ʈ.txt", true);
				String a = i+"\n";
				outputStream.write(a.getBytes());
				
			}catch(Exception e) {
				System.out.println("�˸�)) ���� ���� ����(�����ڿ��� ����)");
			}
		}
		// ���� �ҷ�����
		// 8. �Խù��ҷ�����޼ҵ� [���α׷� ����] ���� --> ����Ʈ
			public static void load() {
				try {
					FileInputStream fileInputStream = new FileInputStream("D:/�ڹ�/����Ʈ.txt");
					byte[] bytes = new byte[1024];
					fileInputStream.read(bytes);
					String file = new String(bytes);
					String[] point = file.split("\n");

					int i=0; // �ε�����
					for(String temp : point) { 
						if(i+1==point.length) break;			
						pointlist.add(temp);
						i++; // �ε��� ����
					}
					
				} catch(Exception e) {
					System.out.println("�˸�)) ���� �ε� ����(�����ڿ��� ����)");
				}
			}
	
}
