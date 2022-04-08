package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Room;
import dto.Roomlive;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class RoomDao {

	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	public static RoomDao roomDao = new RoomDao();
	
	public RoomDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC",
					"root", "1234");
		} catch(Exception e) {}
	}
	// �� ���� �޼ҵ�
	public boolean roomadd(Room room) {
		try {
		String sql = "insert into javafx.room(roname,roip) values(?,?)";
					// ���̺� ���ڵ带 �߰��ϴ� ���� : insert into ���̺��(�ʵ��) values(��1, ��2)
		ps = con.prepareStatement(sql);
		ps.setString(1, room.getRoname());
		ps.setString(2, room.getRoip());
		ps.executeUpdate();
		return true;
		}catch(Exception e) {System.out.println("Sql ����" + e);}
		return false;
	}
	// �� ��ȣ ȣ�� �޼ҵ�(���ȣ = ��Ʈ��ȣ�� ����� ����)
	public int getroomnum() {
		try { // ���� �ֱٿ� ��ϵ� ���ȣ�� ����
			String sql = "select max(ronum) from javafx.room";
			// select max(ǥ�����ʵ��) from ���̺�� : �ִ밪(�ش� �ʵ��� ���� ū ���� �� -> ���ȣ�� ���ڼ����� �ڵ����� ��ϵǱ� ������ ȣ��)
			// select count(ǥ�����ʵ��) from ���̺�� : �ʵ��� �� �ִ� �������� ����
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		} catch(Exception e) {System.out.println(e);}
		return 0;
	}
	
	// ��� �� ȣ�� ����Ʈ
	public ObservableList<Room> roomlist () {
		ObservableList<Room> roomlist = FXCollections.observableArrayList();
		try {
		String sql = "select * from javafx.room order by ronum desc";
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery(); // select -> query // insert, update, delete -> update
		// rs = ResultSet �������̽� ��ü : select�� ��� ��������
			// resultset (�ʱⰪ null)
			// rs.next() : select ����� ���ڵ� 1�� ��������
			// rs(null) -> rs.next() -> rs(�����ù��°���ڵ�) -> rs.next -> rs(����ǵι�°���ڵ�)
			while(rs.next()) {
				Room room = new Room(rs.getInt(1), rs.getString(2), rs.getString(3), 0);
				roomlist.add(room);
				
			}
			return roomlist;
		}catch(Exception e) {System.out.println(e);} 
		return null;
	}
	
	// ä�ù� ���� ��� �߰�
	public boolean addroomlive(Roomlive roomlive) {
		try {
		String sql = "insert into roomlive(ronum,mid)values(?,?)";
		ps = con.prepareStatement(sql);
		ps.setInt(1, roomlive.getRonum());
		ps.setString(2, roomlive.getMid());
		ps.executeUpdate();
		return true;
		}catch(Exception e) {System.out.println("sql����" + e);}
		return false;
	}
	// ä�ù� ���� ��� ȣ��
	public ArrayList<Roomlive> getroomlivelist(int ronum) {
		ArrayList<Roomlive> roomlivelist = new ArrayList<>();
		try {
			String sql = "select * from javafx.roomlive where ronum = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, ronum);
			rs = ps.executeQuery();
			while(rs.next()) {
				Roomlive roomlive = new Roomlive(rs.getInt(1), rs.getInt(2), rs.getString(3));
				roomlivelist.add(roomlive);
			}
			return roomlivelist;
		} catch(Exception e) {System.out.println(e);}
		return null;
	}
	// ä�ù� ���� ��� ����
	public boolean roomlivedelete(String mid) {
		try {
			String sql = "delete from roomlive where mid = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, mid);
			ps.executeUpdate();
			return true;
		} catch(Exception e) {System.out.println(e);}
		return false;
	}
	// ä�ù� ����(���� : �ش� ä�ù濡 ���Ӹ���� 0 �̸�)
	public boolean roomdelete(int ronum) {
		// ���࿡ �ش� ���ȣ�� roomlive�� �˻�������
			// �˻���� �����ϸ� �� ���� X
			// �˻���� ������ �� ���� O
		try {
			String sql = "select * from javafx.roomlive where ronum = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, ronum);
			rs = ps.executeQuery();
			if(rs.next()) {
				return false;
			}
			else {
				String sql2 = "delete from javafx.room where ronum = ?";
				ps = con.prepareStatement(sql2);
				ps.setInt(1, ronum);
				ps.executeUpdate();
				return true;
			}
		} catch(Exception e) {System.out.println(e);}
		return false;
	}
	
	// 
}
