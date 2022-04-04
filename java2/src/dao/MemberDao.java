package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Member;

public class MemberDao { // DB 접근객체

	private Connection con; // DB연동시 사용되는 클래스 : DB연동클래스
	private PreparedStatement ps; // 연결된 DB내 SQL 조작할때 사용되는 인터페이스
	private ResultSet rs; // 결과물을 조작하는 인터페이스 검색 [select]
	// DB 연동할때마다 객체 선언시 불필요
	
	public static MemberDao memberDao = new MemberDao();// DB 연동 객체;
	
	public MemberDao () {
		memberDao = this;
		try {
		// DB 연동
		Class.forName("com.mysql.cj.jdbc.Driver"); // 1. DB 드라이버 가져오기
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx?serverTimezone=UTC", 
				"root", "1234"); // 2. DB 주소 연결
		
	}
	catch(Exception e) {System.out.println(e);}
	}
	
	// 메소드
	// * 아이디 중복체크 메소드(아이디를 인수로 받아 db에 존재하는지 체크)
	public boolean idcheck(String id) {
		try {
		// 1. SQL 작성
			// 검색 : select * from 테이블명 where 조건
		String sql = "select * from javafx.member where mid = ?";
		// 2. SQL 조작
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		// 3. SQL 실행
		rs = ps.executeQuery(); // select 실행 -> 검색은 결과물 존재 -> resultset 0
		// resultSet 처음 기본 값은 : null -> next() -> 결과 레코드
		// 4. SQL 결과
		if(rs.next()) return true;
		
		} catch(Exception e) {}
		return false;
	}
	// 1. 회원가입 (인수 : db에 넣을 아이디, 비번, 이메일, 주소)
	public boolean signup(Member member) {
		try {
		// 1. sql 작성 [ 회원번호(자동번호 = auto), 포인트(가입시 0) 제외한 모든 필드 삽입
		String sql = "insert into member(mid,mpassword,memail,maddress,mpoint,msince)values(?,?,?,?,?,?)";
		// 2. sql 조작
		ps = con.prepareStatement(sql); // PreparedStatement 인터페이스내 연결된 db에 sql 넣기
		ps.setString( 1 , member.getMid() ); // 1번 ? 에 아이디 넣어주기
		ps.setString( 2 , member.getMpassword() ); // 2번 ? 에 비밀번호 넣어주기
		ps.setString( 3 , member.getMemail() ); // 3번 ? 에 이메일 넣어주기
		ps.setString( 4 , member.getMaddress() ); // 4번 ? 에 주소 넣어주기
		ps.setInt( 5 , member.getMpoint() ); // 5번 ? 에 포인트 넣어주기
		ps.setString( 6 , member.getMsince() ); // 6번 ? 에 가입일 넣어주기
		// 3. sql 실행
		ps.executeUpdate(); // insert 실행
		return true;
		}catch(Exception e) {System.out.println(e);}
		// 3. sql 실행
		return false;
		}
	// 2. 로그인(인수 : 로그인시 필요한 아이디, 비번)
	public boolean login(String id, String password) throws SQLException {
		
		// 1. sql 작성
		String sql = "select * from javafx.member where mid=? and mpassword=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, id); // 첫번째 ?에 id 넣기
		ps.setString(2, password); // 두번째 ?에 pw 넣기
		
		rs = ps.executeQuery(); // select 실행 -> resultset
		
		if(rs.next()) {return true;}
		return false;
		}
	// 3. 아이디찾기 메소드(인수 : 아이디 찾기시 필요한 이메일)
	public String findid(String email, String address) throws SQLException {
		String sql = "select * from javafx.member where memail = ? and maddress = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, address);
		rs = ps.executeQuery();
		
		if(rs.next()) { // 실행 결과의 다음 레코드가 있으면
			String id = rs.getString("mid");
			return id;
			}
		return null;
		}
	// 4. 비밀번호찾기 메소드(인수 : 비번 찾기 시 필요한 아이디, 이메일)
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
	
	// 5. 아이디로 회원정보 호출
	public Member getmember(String id) {
		try {
		// 1. SQL 작성
		String sql = "select * from javafx.member where mid=?";
		// 2. SQL 조직
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		// 3. SQL 실행
		rs = ps.executeQuery();
		// 4. SQL 결과
		if(rs.next() ) {
			// 1. 객체선언
			Member member = new Member(rs.getInt(1), rs.getString(2), rs.getString(3),
					rs.getString(4),rs.getString(5), rs.getInt(6) , rs.getString(7) );
			// rs.next() : 결과내 다음 레코드(줄, 가로)
			// rs.getInt(필드 순서 번호) : 해당 필드의 자료형이 정수형으로 가져오기
			// rs.getString(필드 순서 번호) : 해당 필드의 자료형이 문자열로 가져오기
			// 2. 반환
			return member;
		}
		}catch(Exception e) {System.out.println(e);}
		return null;
	}
	// 6. 회원탈퇴 // 회원번호를 인수로 받아 해당 회원번호의 레코드 삭제
	public boolean delate(int mnum) {
		try {
			// 레코드 삭제 : delate from 테이블명 where 조건
		String sql = "delete from javafx.member where mnum = ?";
		// 2. SQL 조작
		ps = con.prepareStatement(sql);
		ps.setInt(1, mnum);
		// 3. SQL 실행
		ps.executeUpdate();
		return true;
		}catch(Exception e) {System.out.println(e);}
		return false;
	}
	// 7. 회원수정[회원번호 ,이메일, 주소 인수로 받아 수정]
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
	
}
