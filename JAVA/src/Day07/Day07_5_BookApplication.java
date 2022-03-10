package Day07;

import java.util.Scanner;

public class Day07_5_BookApplication {
	// *main 밖에 변수를 선언하는 이유 : 모든 메소드에서 사용하기 위해
	// 지역변수 : {변수선언} 괄호내에서 선언한 변수는 {} 밖을 못나감
	// 전역변수 : 서로 다른 메소드(={})에서 사용하는 변수
	// static : 프로그램 종료시까지 메모리 할당
		// why? 함수 종료시 함수내에서 사용된 메모리 초기화(값만 남김)
		// 프로그램 전반적으로 모든곳에 사용되는 변수(메모리)
	static Scanner scanner = new Scanner(System.in);
	// 단, static인 객체만 호출 가능
	static Member[] members = new Member[1000]; // 모든 파일에서 사용하는 회원목록 배열
	static Book[] books = new Book[1000];
	public static void main(String[] args) { // 코드 읽는 시작 메소드[스레드]
	
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
	
	Day07_5_BookApplication app = new Day07_5_BookApplication();
	app.menu();
	// bookapplication 클래스 : 입출력 관련코드
	// Book 클래스 : 도서 관련 코드
	// Member 클래스 : 회원 관련 코드
	// menu(); 
		// main 메소드 static 메소드 이기때문에 static 매소드만 내부호출 가능
		// static : 메모리 우선할당 이기때문에 static  외 메소드, 필드, 못읽음.
	//2. 외부호출 
	//2-1 객체생성 -> 메소드 호출
	
	} // me
	// 메소드 호출 : 내부호출, 외부호출
	// MVC : Model, View, Controlee
// 1. 초기 메뉴 메소드
void menu() {
	while(true) {
	System.out.println("------------- 도서 대여 프로그램 ---------------");
	System.out.println("[1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호 찾기]");
	int ch = scanner.nextInt();
	Member member = new Member(); //1~4 {}괄호에서 사용가능
	if(ch == 1) {
		// 회원가입 메소드 호출
		boolean result = member.join();
		if(result) System.out.println("회원가입 성공");
		else System.out.println("회원가입 실패");
	}
	else if(ch==2) {
		String result = member.login();
		// 로그인 메소드 호출
		// 1. 일반회원 메뉴 메소드 호출
		// 2. 관리자 메뉴 메소드 호출
		if(result == null) {
			System.out.println("알림)) 동일한 회원정보가없습니다.");
		}
		else if(result.equals("admin")) {
			System.out.println("알림)) 관리자모드로 로그인합니다.");
			admin();
		}
		else if(result != null) {
			System.out.println("로그인이 성공하였습니다.");
			System.out.println("안녕하세요 " + result + "님");
			normal(result);
		}
		
	}
	else if(ch==3) {
		// 아이디 찾기 메소드 호출
		member.idcheck();
	}
	else if(ch==4) {
		// 비번 찾기 메소드 호출
		member.pwcheck();
	}
	else {
		System.err.println("알수 없는 번호입니다.");
			}
		}
	}
// 2. 일반 회원 메뉴 메소드
void normal(String loginid) {
	while(true) {
	System.out.println("------------- 회원 메뉴 ---------------");
	System.out.println("[1. 도서 검색 2. 도서 목록 3. 도서 대여 4. 도서 반납 5. 로그 아웃]");
	System.out.println(">>>>>> 선택 : ");	 int ch = scanner.nextInt();
	Book book = new Book(); 
	if(ch == 1) {
		book.도서검색();
	}
	else if(ch == 2) {
		book.도서목록();
	}
	else if(ch == 3) {
		book.도서대여(loginid);
	}
	else if(ch == 4) {
		book.도서반납();
	}
	else if(ch==5) {return;}
	else System.out.println("알림]] 알 수 없는 번호입니다.");
		}
	}
// 3. 관리자 메뉴 메소드
void admin() {
	System.out.println("------------- 관리자 메뉴 ---------------");
	System.out.println("[1. 도서 등록 2. 도서 목록 3. 도서 삭제 4. 로그아웃]");
	System.out.println(">>>>>> 선택 : "); int ch = scanner.nextInt();
	Book book = new Book();	
	if(ch == 1) {
			book.도서등록();
		}
		else if(ch == 2) {
			book.도서목록();
		}
		else if(ch == 3) {
			book.도서삭제();
		}
		else if(ch == 4) { return;}
		else System.out.println("알림]] 알 수 없는 번호입니다.");
	}
} // ce
