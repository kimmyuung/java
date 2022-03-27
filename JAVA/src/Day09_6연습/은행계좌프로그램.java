package Day09_6연습;

import java.util.Scanner;

public class 은행계좌프로그램 {
// 1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 계좌목록
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	은행컨트롤러 con = new 은행컨트롤러();
	int i = 0;// index
	int 대출인덱스 = 0;
	while(true) {
		
	System.out.println("은행계좌프로그램");
	System.out.println("1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 계좌목록 6. 대출 7. 로그아웃");
	int ch = sc.nextInt();
	if(ch == 1) {
		String index = i +"";
		System.out.println("계좌의 이름을 입력해주세요");		  	String account = sc.next();
		System.out.println("계좌 소유주의 이름을 입력해주세요"); 	String name = sc.next();
		System.out.println("계좌의 비밀번호를 입력해주세요");   	String pw = sc.next();
		boolean result = con.계좌생성(index, account, name, pw, 0);
		System.out.println("계좌의 개설을 원하는 은행을 선택해주세요");
		System.out.println("1. 국민은행 2. 신한은행 3. 하나은행");
		int ch1 = sc.nextInt();
		if(result && ch1 == 1) {
			Bank temp = null; // 빈객체
			System.out.println("국민은행계좌 개설이 완료되었습니다.");
			temp = new 국민은행(index, account, name, pw, 0);
			i++;
			}
		else if(result && ch1 == 2) {
			Bank temp = null; // 빈객체
			System.out.println("신한은행계좌 개설이 완료되었습니다.");
			temp = new 신한은행(index, account, name, pw, 0);
			i++;
			}
		else if(result && ch1 == 3) {
			Bank temp = null; // 빈객체
			System.out.println("하나은행계좌 개설이 완료되었습니다.");
			temp = new 하나은행(index, account, name, pw, 0);
			i++;
			}
	}
	else if(ch == 2) {
		System.out.println("계좌번호를 입력해주세요"); String bnum = sc.next();
		System.out.println("입금할 금액을 입력해주세요"); int money = sc.nextInt();
		boolean result = con.입금(bnum, money);
		if(result) System.out.println("입금 성공");
		else System.out.println("입금 실패!!");
	}
	else if(ch == 3) {
		System.out.println("계좌번호를 입력해주세요"); String bnum = sc.next();
		System.out.println("계좌의 비밀번호를 입력해주세요"); String pw = sc.next();
		System.out.println("출금할 금액을 입력해주세요"); int money = sc.nextInt();
		boolean result = con.출금(bnum, pw, money);
		if(result) System.out.println("출금 성공!!");
		else System.out.println("출금 실패!");
	}
	else if(ch == 4) {
		System.out.println("이체할 계좌번호를 입력해주세요"); String bnum = sc.next();
		System.out.println("이체할 금액을 입력해주세요");		int money = sc.nextInt();
		System.out.println("계좌의 비밀번호를 입력해주세요");	String pw = sc.next();
		boolean result = con.이체(bnum, pw, money);
		if(result) System.out.println("이체 성공!!");
		else System.out.println("이체 실패!!");
	}
	else if(ch == 5) {
		con.계좌목록();
	}
	else if(ch == 6) {
		System.out.println("대출코너에 오신 걸 환영합니다.");
		System.out.println("1. 대출         2. 상환");
		System.out.println("메뉴를 선택해주세요");
		int ch1 = sc.nextInt();
		if(ch1 == 1) {
			System.out.println("대출상품을 선택해주세요");
			System.out.println("1. 일반대출(이율3%) 2. 빠른대출(이율5%)");
			int ch2 = sc.nextInt();
			if (ch2 == 1) {
				System.out.println("일반 대출금 코너입니다.");
				System.out.println("대출금을 받으실 계좌번호를 입력해주세요");
				String bnum = sc.next();
				System.out.println("대출받으실 금액을 입력해주세요");
				int money = sc.nextInt();
				double sumMoney = (int)(money * 0.03) + money;
				boolean result = con.대출(bnum, (int)sumMoney, 대출인덱스);
				if(result)	System.out.println("대출 성공!!");
				else System.out.println("대출 실패!!");
			}
			else if (ch2 == 2) {
				System.out.println("일반 대출금 코너입니다.");
				System.out.println("대출금을 받으실 계좌번호를 입력해주세요");
				String bnum = sc.next();
				System.out.println("대출받으실 금액을 입력해주세요");
				int money = sc.nextInt();
				double sumMoney = (int)(money * 0.05) + money;
				boolean result = con.대출(bnum, (int)sumMoney, 대출인덱스);
				if(result)	System.out.println("대출 성공!!");
				else System.out.println("대출 실패!!");
			}
		}
		else if(ch1 == 2) {
			System.out.println("상환코너에 오신걸 환영합니다.");
			System.out.println("상환하실 계좌번호를 입력해주세요");
			String bnum = sc.next();
			System.out.println("상환하실 금액을 입력해주세요");
			int money = sc.nextInt();
			boolean result = con.상환(bnum, money, 대출인덱스);
			if(result) System.out.println("상환성공!!");
			else System.out.println("상환 실패!");
		}
	}
	else if(ch == 7) {
		System.out.println("로그아웃!!"); break;
	}
		
	}
	
}

}

