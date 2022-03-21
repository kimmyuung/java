package Day07_5연습;

import java.util.Scanner;

public class 도서대여프로그램연습_1 {
	// 도서 대여 console 프로그램(ver. class)
				// 1. 클래스
				// 1-1. book	: 필드(도서코드(ISBN), 도서명, 저자, 도서대여여부, 대여회원) 
							//	메소드(도서 검색, 도서 목록, 도서 대여, 도서 반납, 관리자)) 도서 등록, 도서 삭제)
				// 1-2. member	: 필드(회원번호, 아이디, 비번, 이름, 연락처) 
								 // 메소드(회원가입, 로그인, 아이디 찾기, 비번 찾기, 로그아웃)
				// 로그인시 아이디가 admin이면 관리자메뉴
				// 1. 도서 등록 2. 도서 삭제
				// + 도서 등록시 도서명 입력받아 도서 등록처리
				// + 도서 목록시 모든 도서명 출력 // 도서삭제시 삭제할 도서명 입력받아 동일한 도서명 삭제(NULL)
				// 로그아웃시 초기메뉴로
				// 2. 화면 설계
					//2-1. 초기 메뉴[1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호 찾기]
					//2-2. 일반회원 메뉴[1. 도서검색 2. 도서목록 3. 도서대여 4. 도서반납 5. 로그아웃]
					//2-3. 관리자 메뉴[1. 도서등록 2. 도서목록 3. 도서삭제 4. 순위(=베스트셀러) 5. 로그아웃]
	public static Book[] booklist = new Book[100];
	public static Member[] memberlist = new Member[100];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		도서대여프로그램연습_1 app= new 도서대여프로그램연습_1();
		app.menu();
	}
	void menu() {
		while(true) {
		System.out.println("도서 대여 프로그램");
		System.out.println("1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기 5. 로그아웃");
		int ch = sc.nextInt();
		Member member = new Member();
		Book book = new Book();
		if(ch == 1) {
			member.회원가입();
		}
		else if(ch == 2) {
			String result = member.로그인();
			
		if(result.equals("admin"))	{
			System.out.println("1. 도서등록 2. 도서목록 3. 도서삭제 4. 순위 5. 로그아웃");
			int ch1 = sc.nextInt();
			if(ch1 == 1) {
				book.도서등록();
			}
			else if(ch1 == 2) {
				book.도서목록();
			}
			else if(ch1 == 3) {
				book.도서삭제();
			}
			else if(ch1 == 4) {
				book.도서순위();
			}
			else if(ch1 == 5) {
				System.out.println("로그아웃!"); break;
			}
			else {System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");}
			}
			
		else {
			System.out.println("1. 도서검색 2. 도서목록 3. 도서대여 4. 도서반납 5. 로그아웃");
			int ch1 = sc.nextInt();
			if (ch1 == 1) {
				book.도서검색();
			}
			else if (ch1 == 2) {
				book.도서목록();
			}
			else if (ch1 == 3) {
				book.도서대여();
			}
			else if (ch1 == 4) {
				book.도서반납();
			}
			else if (ch1 == 5) {System.out.println("로그아웃"); break;}
			else {System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");}
			}
		}
		else if(ch == 3) {
			member.아이디찾기();
		}
		else if(ch == 4) {
			member.비번찾기();
		}
		else if(ch == 5) {
			member.로그아웃(); break;
		}
		else {System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");}
		}
	}
}
