package 회원제프로그램_클래스;

import java.util.Scanner;

public class 회원제프로그램_1 {
	// 회원제 프로그램[클래스]
				// 1. 초기메뉴 [1. 회원가입 2. 로그인 3. 아이디 찾기 4. 비밀번호 찾기]
				// 1-1. 회원가입시 아이디, 비밀번호, 이름 입력받아 저장
				// 2. 로그인시 아이디와 비밀번호가 동일하면 로그인처리
				// 3. 아이디 찾기 => 이름과 전화번호가 동일하면 아이디 출력
				// 4. 비밀번호 찾기 => 아이디 + 전화번호가 동일하면 비밀번호 출력
			
			// 준비 
			// 0. 회원 설계 => 회원 클래스 만들기
				// 1. 필드 -> 일단 이것만 사용(아이디, 비번, 이름, 전화번호)
				// 2. 생성자
				// 3. 메소드0
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Member[] memberlist = new Member[100];
		
		while(true) {
		System.out.println("회원제 프로그램");
		System.out.println("[[1. 회원가입 2. 로그인 3. 아이디 찾기 4. 비밀번호 찾기 ]]");
		int select = sc.nextInt();
		if(select == 1) {
			System.out.println("회원가입 페이지");
			System.out.println("Id : "); String id = sc.next();
			System.out.println("pw : "); String pw = sc.next();
			System.out.println("name : "); String name = sc.next();
			System.out.println("phonenumber : "); String number = sc.next();
			int i = 0;
			boolean pass = false;
			Member member = new Member(id, pw, name, number);
			
			for (Member temp : memberlist) {
				if(temp != null && temp.getId().equals(id)) {
					System.out.println("아이디가 중복됩니다. 다시 입력해주세요.");
					pass = true;
					break;
				}
			}
			for(Member temp : memberlist) {
				if(temp == null) {
					memberlist[i] = member;
					pass = true;
					System.out.println("회원가입이 완료되었습니다.");
					break;
					} 
			i++; }
			
			
			if(pass == false) {System.out.println("회원가입이 실패하였습니다. 처음부터 다시 해주세요");}
		}
		else if(select == 2) {
			System.out.println("로그인 페이지");
			System.out.println("Id : "); String id = sc.next();
			System.out.println("pw : "); String pw = sc.next();
			boolean pass = false;
			for (Member temp : memberlist) {
				if(temp != null && temp.getId().equals(id) && temp.getPw().equals(pw)) {
					System.out.println("로그인 성공");
					pass = true;
					break;
				}
			}
			if(pass == false) {System.out.println("로그인이 실패하였습니다. 다시 시도해주세요");}
		}
		else if(select == 3) {
			System.out.println("아이디 찾기 페이지");
			System.out.println("name : "); String name = sc.next();
			System.out.println("phone : "); String phone = sc.next();
			boolean pass = false;
			for (Member temp : memberlist) {
				if(temp != null && temp.getName().equals(phone) && temp.getName().equals(name)) {
					System.out.println("아이디 찾기 성공");
					System.out.println(" 아이디 : " + temp.getId());
					pass = true;
					break;
				}
			}
			if(pass == false) {System.out.println("아이디 찾기가 실패하였습니다. 다시 시도해주세요");}
		}
		else if(select == 4) {
			System.out.println("비밀번호 찾기 페이지");
			System.out.println("Id : "); String id = sc.next();
			System.out.println("name : "); String name = sc.next();
			System.out.println("phone : "); String phone = sc.next();
			boolean pass = false;
			for (Member temp : memberlist) {
				if(temp != null && temp.getPhone().equals(phone) && temp.getName().equals(name)
						&& temp.getId().equals(id)) {
					System.out.println("비밀번호 찾기 성공");
					System.out.println(" 비밀번호 : " + temp.getPw());
					pass = true;
					break;
				}
			}
			if(pass == false) {System.out.println("아이디 찾기가 실패하였습니다. 다시 시도해주세요");}
		}
		else {System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해주세요");}
		
		
		}
	}
}
