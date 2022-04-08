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
	// 방 저장 메소드
	public boolean roomadd(Room room) {
		try {
		String sql = "insert into javafx.room(roname,roip) values(?,?)";
					// 테이블에 레코드를 추가하는 문법 : insert into 테이블명(필드명) values(값1, 값2)
		ps = con.prepareStatement(sql);
		ps.setString(1, room.getRoname());
		ps.setString(2, room.getRoip());
		ps.executeUpdate();
		return true;
		}catch(Exception e) {System.out.println("Sql 오류" + e);}
		return false;
	}
	// 방 번호 호출 메소드(방번호 = 포트번호라 사용할 예정)
	public int getroomnum() {
		try { // 가장 최근에 등록된 방번호를 빼옴
			String sql = "select max(ronum) from javafx.room";
			// select max(표시할필드명) from 테이블명 : 최대값(해당 필드의 가장 큰 값이 옴 -> 방번호는 숫자순으로 자동으로 등록되기 때문에 호출)
			// select count(표시할필드명) from 테이블명 : 필드의 들어가 있는 데이터의 갯수
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		} catch(Exception e) {System.out.println(e);}
		return 0;
	}
	
	// 모든 방 호출 리스트
	public ObservableList<Room> roomlist () {
		ObservableList<Room> roomlist = FXCollections.observableArrayList();
		try {
		String sql = "select * from javafx.room order by ronum desc";
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery(); // select -> query // insert, update, delete -> update
		// rs = ResultSet 인터페이스 객체 : select의 결과 가져오기
			// resultset (초기값 null)
			// rs.next() : select 결과의 레코드 1개 가져오기
			// rs(null) -> rs.next() -> rs(결과의첫번째레코드) -> rs.next -> rs(결과의두번째레코드)
			while(rs.next()) {
				Room room = new Room(rs.getInt(1), rs.getString(2), rs.getString(3), 0);
				roomlist.add(room);
				
			}
			return roomlist;
		}catch(Exception e) {System.out.println(e);} 
		return null;
	}
	
	// 채팅방 접속 명단 추가
	public boolean addroomlive(Roomlive roomlive) {
		try {
		String sql = "insert into roomlive(ronum,mid)values(?,?)";
		ps = con.prepareStatement(sql);
		ps.setInt(1, roomlive.getRonum());
		ps.setString(2, roomlive.getMid());
		ps.executeUpdate();
		return true;
		}catch(Exception e) {System.out.println("sql오류" + e);}
		return false;
	}
	// 채팅방 접속 명단 호출
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
	// 채팅방 접속 명단 삭제
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
	// 채팅방 삭제(조건 : 해당 채팅방에 접속명단이 0 이면)
	public boolean roomdelete(int ronum) {
		// 만약에 해당 방번호로 roomlive로 검색했을때
			// 검색결과 존재하면 방 삭제 X
			// 검색결과 없으면 방 삭제 O
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
