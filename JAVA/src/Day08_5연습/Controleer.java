package Day08_5연습;

import java.util.Scanner;
//회원주요기능: 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
//계좌주요기능:  1.계좌생성 2.입금 3.출금 4.이체 5.대출 6.계좌목록
public class Controleer {

	static Money[] moneylist = new Money[100];
	static Member[] memberlist = new Member[100];
	static Borrow[] borrowlist = new Borrow[100];
	static Scanner sc = new Scanner(System.in);
	
	boolean 회원가입 () {
		System.out.println("회원가입 페이지");
		System.out.println("Id : ");			String id = sc.next();	
		System.out.println("Pw : ");			String pw = sc.next();
		System.out.println("Name : ");			String name = sc.next();
		System.out.println("Phonenumber : ");	String number = sc.next();
		int i = 0;
		boolean pass = false;
		for(Member temp : memberlist) {
			if(temp != null && memberlist[i].getId().equals(id)) {
				System.out.println("아이디가 중복됩니다. 다시 입력해주세요");
				pass = true;
			}
		}
		if(pass == false) {
		for(Member temp : memberlist) {
			if(temp == null) {
				Member member = new Member(id, pw, name, number);
				memberlist[i] = member;
				return true;
					}
			i++;}	
			}
	return false;}
	boolean 로그인 () {
		System.out.println("로그인 페이지");
		System.out.println("Id : ");			String id = sc.next();	
		System.out.println("Pw : ");			String pw = sc.next();
		int i = 0;
		for(Member temp : memberlist) {
			if(temp != null && memberlist[i].getId().equals(id) && memberlist[i].getPw().equals(pw)) 
			{
				 return true;
			}
			i++;}
		return false;
	}
	boolean 아이디찾기 () {
		System.out.println("아이디 찾기 페이지");
		System.out.println("Name : ");			String name = sc.next();
		System.out.println("Phonenumber : ");	String number = sc.next();
		int i = 0;
		for(Member temp : memberlist) {
			if(temp != null && memberlist[i].getName().equals(name) && memberlist[i].getPhone().equals(number)) 
			{
				return true;
			}
			i++;}
		return false;
	}
	boolean 비밀번호찾기 () {
		System.out.println("비밀번호 찾기 페이지");
		System.out.println("Id : ");	        String id = sc.next();
		System.out.println("Name : ");			String name = sc.next();
		System.out.println("Phonenumber : ");	String number = sc.next();
		int i = 0;
		for(Member temp : memberlist) {
			if(temp != null && memberlist[i].getName().equals(name) && 
					memberlist[i].getPhone().equals(number) && memberlist[i].getId().equals(id) )
			{
				return true;
			}
		i++;}
		return false;
	}
	boolean 계좌생성 () {
		System.out.println("계좌생성 페이지");
		System.out.println("계좌이름 : ");			String id = sc.next();
		System.out.println("계좌비밀번호 : ");		String pw = sc.next();
		int i = 0;
		for(Money temp : moneylist) {
			if(moneylist[i] == null) {
				Money money = new Money(id, pw, 0);
				moneylist[i] = money;
				return true;
			}
		i++;}
	return false;}
	boolean 입금 (int money) {
		int i = 0;
		for(Money temp : moneylist) {
			if(moneylist[i] == null) {
				moneylist[i].setMoney(money); 
				return true;
			}
		i++;}
		return false;
	}
	boolean 출금 (int money) {
		int i = 0;
		for(Money temp : moneylist) {
			if(moneylist[i] != null && moneylist[i].getMoney() >= money) {
				moneylist[i].setMoney(moneylist[i].getMoney() - money); 
				return true;
			}
		i++;}
		return false;
	}
	boolean 이체 (String name, String pw, int money) {
		
		for(int i = 0; i < moneylist.length; i++) {
			for(int j = 0; j < moneylist.length; j++) {
				if(moneylist[i] != null && moneylist[j] != null && moneylist[j].getAccount().equals(name) 
						&& moneylist[i].getPw().equals(pw)) {
					moneylist[i].setMoney(moneylist[i].getMoney() - money);
					moneylist[j].setMoney(moneylist[j].getMoney() + money);
					return true;
				}
			}
		}
		return false;
	}
	public boolean 대출 (int money) {
		int i = 0;
		for(Money temp : moneylist) {
			if(moneylist[i] == null) {
				moneylist[i].setMoney(moneylist[i].getMoney() + money); 
				return true;
			}
		i++;}
		return false;
	}
	void 계좌목록 () {
		System.out.println("계좌목록을 출력합니다.");
		int i = 0;
		for(Money temp : moneylist) {
			if(moneylist[i] != null) {
				System.out.printf("계좌 : %s \t  잔액 : %d", moneylist[i].account, moneylist[i].getMoney());
				break;
			}
		i++;}
	}
	
	
}
