package Day08;

public class Borrow {
	String 대출이름;
	int 금액;
	int 이자;
	String bid;
	Borrow () {}
	public Borrow(String 대출이름, int 금액, int 이자, String bid) {
		this.대출이름 = 대출이름;
		this.금액 = 금액;
		this.이자 = 이자;
		this.bid = bid;
	}


	void 대출 () { // 대출클래스 = 도서클래스 
		// 1. 대출이름 2. 금액 3. 이자 4. 빌린아이디
		// 1. 계좌번호를 입력받는다.
		// 2. 원하는 만큼 대출을 받는다.
		// 3. 금액과 이자를 합쳐서 얼마를 갚아야 하는지 출력한다.
		// 4. 빌린아이디는 회원으로 하면 될듯??
		Borrow borrow = new Borrow(대출이름, 금액, 이자, bid);
		System.out.println("대출 상품을 선택해주세요");
		System.out.println("1. 일반 대출 2. 빠른 대출");
		System.out.println("일반대출의 이율은 2%, 빠른 대출은 5%입니다.");
		int select = Day08_5.scanner.nextInt();
		if(select ==1) {
			System.out.println("대출을 원하는 금액을 입력하세요"); borrow.금액 = Day08_5.scanner.nextInt();
			borrow.이자 = 2;
			System.out.println("대출 원금 :" + borrow.금액);
			System.out.println("대출 이자 :" + borrow.이자);
			int 상환 = borrow.금액 + (borrow.금액 * borrow.이자 / 100);
			System.out.printf("\n총 상환해야하는 금액 : %d ", 상환 );
			System.out.println("계좌에 돈을 입금합니다.");
			int i = 0;
			for(Money temp : Day08_5.account) {
			Day08_5.account[i].돈 = Day08_5.account[i].돈 + borrow.금액;
			i++;}
		}
		else if(select ==2) {
			System.out.println("대출을 원하는 금액을 입력하세요"); borrow.금액 = Day08_5.scanner.nextInt();
			borrow.이자 = 5; 
			System.out.println("대출 원금 :" + borrow.금액);
			System.out.println("대출 이자 :" + borrow.이자);
			int 상환 = borrow.금액 + (borrow.금액 * borrow.이자 / 100);
			System.out.printf("\n총 상환해야하는 금액 : %d ", 상환 );
			System.out.println("계좌에 돈을 입금합니다.");
			int i = 0;
			for(Money temp : Day08_5.account) {
				Day08_5.account[i].돈 += Day08_5.account[i].돈 + borrow.금액;
				i++;}
		}
		else {System.out.println("알림)) 잘못된 숫자입니다.");}
		
	}
}
