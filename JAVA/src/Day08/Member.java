package Day08;

import java.util.Scanner;


public class Member {
	
	// 필드
	String id;
	String password;
	String name;
	String phone;

	//생성자
	public Member () {}
	
	public Member(String id, String password, String name, String phone) {
		
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	// 메소드 
	//회원주요기능: 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
		///회원가입
		boolean 회원가입 (){
			System.out.println("------회원가입------");
			System.out.println("아이디: "); String id = Day08_5.scanner.next();
			System.out.println("비밀번호: "); String password = Day08_5.scanner.next();
			System.out.println("이름: ");		String name = Day08_5.scanner.next();
			System.out.println("연락처: "); String phone = Day08_5.scanner.next();
			
			////아이디 중복
			for(Member temp: Day08_5.members) {
				if(temp != null) {
					System.out.println("현재 사용중인 아이디입니다.");
					return false;
				}
			}
			
			///회원가입 성공
			Member member = new Member(id, password, name, phone);
			
			int  i =0;
			for(Member temp : Day08_5.members) {
				if(temp==null) {
					System.err.println("회원가입 완료");
					Day08_5.members[i]= member;
					return true;
				}
				i++;
			}
			
			return false;
			
		}
		///로그인
		String 로그인() {
			System.out.println("----로그인 페이지-----"); 
			System.out.println("아이디: "); String id = Day08_5.scanner.next();
			System.out.println("비밀번호: "); String password = Day08_5.scanner.next();
		
		
		/////로그인 성공
			for(Member temp : Day08_5.members) {
				if(temp!=null && temp.id.equals(id) && temp.password.equals(password)) {
					System.out.println("로그인 성공");
					return temp.id;
				}
				
			}
		/////로그인 실패
			return null;
		
		}
		
		///아이디찾기
		void 아이디찾기() {
			System.out.println(" ----- 아이디찾기 페이지 ------");
			System.out.println("이름: "); String name =Day08_5.scanner.next();
			System.out.println("전화번호: "); String phone = Day08_5.scanner.next();
		///아이디 찾기 성공
			for(Member temp : Day08_5.members) {
				if(temp!=null && temp.name.equals(name)&&temp.phone.equals(phone)) {
				System.out.println("회원님의 아이디: " + temp.id);
				return;
				}
			}	
			
		///아이디찾기 실패
			System.out.println("동일한 회원정보가 없습니다.");
		
		}
		////비밀번호찾기
		void 비밀번호찾기() {
			System.out.println(" ----- 비밀번호찾기 페이지 ------");
			System.out.println("아이디: "); String id =Day08_5.scanner.next();
			System.out.println("전화번호: "); String phone = Day08_5.scanner.next();
		///아이디 찾기 성공
			for(Member temp : Day08_5.members) {
				if(temp!=null && temp.id.equals(id)&&temp.phone.equals(phone)) {
				System.out.println("회원님의 비밀번호: " + temp.password);
				return;
				}
			}	
			
		//비밀번호찾기 실패
			System.out.println("동일한 회원정보가 없습니다.");
		
		}
		
	
	
}
