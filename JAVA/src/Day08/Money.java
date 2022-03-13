package Day08;

import java.util.Random;

public class Money {
	// 1. 필드
	int 계좌번호; // 
	String 은행이름 = "농협";
	String 예금종류; // 입력받아야됨
	String 계좌이름; // 회원정보의 name
	int 돈;
	String 계좌비번;
	// 2. 생성자 : 
	Money(int 계좌번호, String 은행이름, String 예금종류, String 계좌이름, int 돈, String 계좌비번) 
	{
		this.계좌번호 = 계좌번호;
		this.은행이름 = 은행이름;
		this.예금종류 = 예금종류;
		this.계좌이름 = 계좌이름;
		this.돈 = 돈;
		this.계좌비번 = 계좌비번;
	}
	Money() {}
	// 3. 메소드 : 계좌 생성, 입금, 출금, 이체, 대출
	void 계좌생성 () {
		
		System.out.println("계좌 생성을 시작합니다");
		System.out.println("모바일 생성 : 1  지점 생성 : 2");
		Money money = new Money(계좌번호, 은행이름, 예금종류, 계좌이름, 돈, 계좌비번);
		int select1 = Day08_5.scanner.nextInt();
		if(select1 == 1) {
			System.out.println("모바일 계좌를 개설합니다.");
			int  i =0;
			for(Money temp : Day08_5.account) {
				if(temp==null) {
					System.err.println("계좌개설 완료");
					System.out.println("계좌 비밀번호 설정"); String pw = Day08_5.scanner.next();
					Day08_5.account[i]= money;	money.계좌비번 = pw; 	
					System.out.println("현재 회원님의 계좌 상태 : " + money.계좌번호);
					System.out.println("현재 회원님의 계좌 비밀번호 : " + money.계좌비번);
					return;
				}
				i++;
			}
			System.out.println("계좌생성 완료");
			System.out.printf("\n계좌번호  : %d", Day08_5.account[i].계좌번호);	
		if(select1 == 2) {
			System.out.println("계좌를 개설합니다.");
			System.out.println("예금종류를 입력해주세요");
			for(Money temp : Day08_5.account) {
				if(temp==null) {
					System.err.println("계좌개설 완료");
					System.out.println("계좌 비밀번호 설정"); String pw = Day08_5.scanner.next();
					Day08_5.account[i]= money; money.계좌비번 = pw; 
					System.out.println("현재 회원님의 계좌 상태 : " + money.계좌번호);
					System.out.println("현재 회원님의 계좌 비밀번호 : " + money.계좌비번);
					return;
				}
				i++;
				}
			
			}
		}
		System.out.println("계좌생성 완료");
		System.out.printf("\n계좌번호  : %d", money.계좌번호);
		return;
	}
	void 입금 () {
		boolean pwcheck = false;
		System.out.println("입금을 시행합니다");
		int income = Day08_5.scanner.nextInt();
		System.out.println("비밀번호를 입력해주세요");
		String pw = Day08_5.scanner.next();
		int i = 0;
		// 인덱스
		for(Money temp : Day08_5.account) {
			if(temp !=null && temp.계좌비번.equals(pw)) {
				System.out.println("비밀번호와 일치합니다.");
			
			System.out.println("입금되었습니다." + income);
					Day08_5.account[i].돈 += income;
					 return;
					 
		}	
			
			else {System.out.println("비밀번호 오류");}
			i++;
		}
	}
	void 출금 () {
		boolean pwcheck = false;
		System.out.println("출금할 금액을 입력합니다");
		int outcome = Day08_5.scanner.nextInt();
		System.out.println("비밀번호를 입력해주세요");
		int pw = Day08_5.scanner.nextInt();
		int i = 0;
		// 인덱스
		for(Money temp : Day08_5.account) {
			if(temp !=null && temp.계좌비번.equals(pw)) {
			System.out.println("비밀번호와 일치합니다.");
			if(temp != null && Day08_5.account[i].돈 > outcome) 
			{
			System.out.println("출금되었습니다." + outcome);
				Day08_5.account[i].돈 -= outcome;
				 return; }
			else {System.out.println("잔액이 부족합니다");}
					 
		}	
			
			else {System.out.println("비밀번호 오류");}
			i++;
		}
	}
	void 이체 (){
		// 1. 계좌번호를 입력받는다 . 계좌번호는 account에 있다.
		// 2. 이체할 금액을 입력한다. 
		// 3. 이체할 계좌를 입력한다. + (비밀번호 확인)
		// 4. 비밀번호 확인 후 금액을 이체한다.
		int index = 0;
		System.out.println("계좌번호를 입력하세요."); int bnum = Day08_5.scanner.nextInt();
		System.out.println("이체할 금액을 입력하세요"); int money = Day08_5.scanner.nextInt();
		System.out.println("이체할 계좌를 입력하세요"); int bid = Day08_5.scanner.nextInt();
		System.out.println("계좌 비밀번호를 입력하세요"); String pw = Day08_5.scanner.next();
		for(Money temp : Day08_5.account) {
			if(temp !=null && temp.계좌비번.equals("pw")) {
				System.out.println("비밀번호와 일치합니다.");
			}
		for(Money temp2 : Day08_5.account) { // 보내는 계좌번호가 존재하는지 확인
			if( temp2 != null && Day08_5.account[index].계좌번호 == bnum) { // 계좌번호가 존재하면
				System.out.println("계좌이체가 완료되었습니다.");
				Day08_5.account[bnum].돈 =  Day08_5.account[index].돈 + money;
			}
			
		}
		index++;
	}
	
}}
