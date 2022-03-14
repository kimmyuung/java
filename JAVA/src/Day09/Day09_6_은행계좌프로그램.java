package Day09;

import java.util.Scanner;

public class Day09_6_은행계좌프로그램 {
public static Bank[] 계좌리스트 = new Bank[100];
public static void main(String[] args) {
	은행컨트롤러 컨트롤러 = new 은행컨트롤러();
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("------ 계좌 시스템");
		System.out.println("1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 계좌목록");
		int select = sc.nextInt();
	if (select == 1) {
		System.out.println("+++ 계좌등록 페이지 +++");
		System.out.println("비밀번호 : "); String pw = sc.next(); 
		System.out.println("계좌주 : ");  String name = sc.next();
		System.out.println("은행선택 <1. 국민 2. 신한 3. 하나 >"); int bnum = sc.nextInt();
		// 컨트롤러 연결 
		// 다른 클래스내 멤버 호출 방법
		// 1. 객체 생성(new)해서 메소드 호출
		// 2. static 메소는 객체 없이 호출 가능
		String result = 컨트롤러.계좌생성(pw, name, 0);
			// 메소드 반환 저장 = 계좌번호 혹은 null
			// 메소드 실행 후 메시지 출력
		if(result != null) {System.out.println("** 계좌 생성 **");}
		else {System.out.println("시스템 오류");}
	}
	else if(select == 2) {
		System.out.println("+++ 입금 페이지 +++");
		System.out.println("계좌번호 : "); String 계좌번호 = sc.next();
		System.out.println("입금액 : "); int 입금액 = sc.nextInt();
		컨트롤러.입금(계좌번호, 입금액);
		boolean result = 컨트롤러.입금(계좌번호, 입금액);
		if(result) {
			System.out.println("입금 성공");
		}
		else {
			System.out.println("입금 실패");
		}
	}
	else if(select == 3) {
		System.out.println("+++ 출금 페이지 +++");
		System.out.println("계좌번호 : "); String 계좌번호 = sc.next();
		System.out.println("비밀번호 : "); String 비밀번호 = sc.next();
		System.out.println("출금액 : "); int 출금액 = sc.nextInt();
	컨트롤러.출금(계좌번호, 비밀번호, 출금액);
	int result = 컨트롤러.출금(계좌번호, 비밀번호, 출금액);
	if (result == 1) {
		System.out.println("잔액 부족");
	}
	else if(result == 2) {
		System.out.println("출금 성공");
	} 
	else if(result == 3) {
		System.out.println("올바른 정보가 아닙니다");
	}
	
	
	}
	else if(select == 4) {
		System.out.println("+++ 계좌이체 페이지 +++");
		System.out.println("보내는 사람의 계좌번호를 입력하세요"); 
		String 계좌번호 = sc.next();
		System.out.println("비밀번호를 입력하세요"); 
		String 비밀번호 = sc.next();
		System.out.println("이체금액을 입력하세요"); 
		int 이체금액 = sc.nextInt();
		System.out.println("받는 사람의 계좌를 입력하세요"); 
		String 받는계좌 = sc.next();
		컨트롤러.이체(계좌번호, 비밀번호, 이체금액, 받는계좌);
		int result = 컨트롤러.이체(계좌번호, 비밀번호, 이체금액, 받는계좌);
		if(result ==1) {
			System.out.println("잔액 부족");
		}
		else if(result == 2) {
			System.out.println("이체 성공");
		}
		else if(result == 3) {
			System.out.println("받는 계좌 정보가 없습니다.");
		}
		else if(result == 4) {
			System.out.println("보내는 계좌 정보가 없습니다.");
		}
	}
	else if(select == 5) {
		System.out.println("+++ 계좌목록 페이지 +++");
		System.out.println("계좌주 : "); String name = sc.next();
		Bank[] 내계좌목록 = 컨트롤러.계좌목록(name);
		System.out.println("검색하신 계좌주 님의 계좌목록");
		int i = 0;
		for(Bank temp : 내계좌목록) {
			if(temp != null)
			System.out.println(i + "번 계좌목록 : " + temp.getName());
			i++;
		}
	}
	else {System.out.println("잘못된 숫자입니다. 다시 입력해주세요");}
	}
	
	// 은행계좌프로그램 [ 상속 ]
	// 은행(슈퍼클래스) 기능
	// 1.계좌생성 2.입금 3.출금 4.이체 5.내계좌목록 6.대출  
	// 국민은행, 신한은행, 하나은행(서브클래스)
	}
	// 뷰
	
}
