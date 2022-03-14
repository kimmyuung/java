package Day09;

import java.util.Scanner;

public class Day09_6_은행계좌프로그램 {
public static Bank[] 계좌리스트 = new Bank[100];
public static void main(String[] args) {
	
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
		은행컨트롤러 컨트롤러 = new 은행컨트롤러();
		Boolean result = 컨트롤러.생성(pw, name, bnum);
				
		if(result) {System.out.println("** 계좌 생성 **");}
		else {System.out.println("시스템 오류");}
	}
	else if(select == 2) {
		System.out.println("+++ 입금 페이지 +++");
	}
	else if(select == 3) {
		System.out.println("+++ 출금 페이지 +++");
	}
	else if(select == 4) {
		System.out.println("+++ 계좌이체 페이지 +++");
	}
	else if(select == 5) {
		System.out.println("+++ 계좌목록 페이지 +++");
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
