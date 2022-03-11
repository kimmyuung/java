package Day08;

import java.util.Random;

public class Money {
	// 1. 필드
	int 계좌번호; // 
	String 은행이름 = "농협";
	String 예금종류; // 입력받아야됨
	String 계좌이름; // 회원정보의 name
	int 돈;
	// 2. 생성자 : 
	Money(int 계좌번호, String 은행이름, String 예금종류, String 계좌이름, int 돈) 
	{
		this.계좌번호 = 계좌번호;
		this.은행이름 = 은행이름;
		this.예금종류 = 예금종류;
		this.계좌이름 = 계좌이름;
		this.돈 = 돈;
	}
	Money() {}
	// 3. 메소드 : 계좌 생성, 입금, 출금, 이체, 대출
	void 계좌생성 () {
		
		System.out.println("계좌 생성을 시작합니다");
		System.out.println("모바일 생성 : 1  지점 생성 : 2");
		Money money = new Money(계좌번호, 은행이름, 예금종류, 계좌이름, 돈);
		int select1 = Day08_5.scanner.nextInt();
		if(select1 == 1) {
			System.out.println("모바일 계좌를 개설합니다.");
			System.out.println("예금종류를 입력해주세요");
			//String 예금종류1 = scanner.next();
			int  i =0;
			for(Money temp : Day08_5.account) {
				if(temp==null) {
					System.err.println("계좌개설 완료");
					Day08_5.account[i]= money;	
					return;
				}
				i++;
			}
			System.out.println("계좌생성 완료");
			System.out.printf("\n계좌번호  : %d", money.계좌번호);	
		if(select1 == 2) {
			System.out.println("계좌를 개설합니다.");
			System.out.println("예금종류를 입력해주세요");
			String 예금종류2 = Day08_5.scanner.next();
			for(Money temp : Day08_5.account) {
				if(temp==null) {
					System.err.println("계좌개설 완료");
					Day08_5.account[i]= money;
					return;
				}
				i++;
				}
			}
		}
		System.out.println("계좌생성 완료");
		System.out.printf("\n계좌번호  : %d", money.계좌번호);
		
	}
	void 입금 () {
		System.out.println("입금을 시행합니다");
		int income = Day08_5.scanner.nextInt();
		System.out.println("비밀번호를 입력해주세요");
		String pw = Day08_5.scanner.next();
		for(Member temp : Day08_5.members) {
			if(temp!=null && temp.password.equals(pw)) {
				System.out.println("비밀번호와 일치합니다.");
				for(Money i : Day08_5.account) {
					if(temp!=null) {
					System.out.println("입금되었습니다." + income);
					 i.돈 += income;
					return;}
				}
			}
			else {System.out.println("비밀번호 오류");}
		}
	}
	void 출금 () {
		System.out.println("출금을 시행합니다");
		int outcome = Day08_5.scanner.nextInt();
		System.out.println("비밀번호를 입력해주세요");
		String pw = Day08_5.scanner.next();
		for(Member temp : Day08_5.members) {
			if(temp!=null && temp.password.equals(pw)) {
				System.out.println("비밀번호와 일치합니다.");
				for(Money temp2 : Day08_5.account) {
					System.out.println("출금되었습니다." + outcome);
					outcome -= temp2.돈;
					break;}
			}
			else {System.out.println("비밀번호 오류");}
		}
	}
	void 대출 () {
		
	}
	
}
