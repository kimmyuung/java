package Day08_5연습;

public class Day08_5연습 {
	// 모바일 뱅크 프로그램
	// 요구사항
	// 회원주요기능: 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
	// 계좌주요기능: 1.계좌생성 2.입금 3.출금 4.이체 5.대출 6.계좌목록
	// 설계: 통장, 대출상품, 회원
	// 필드
	// 메소드
	public static void main(String[] args) {
		Day08_5연습 app = new Day08_5연습();
		app.menu();
	}

	void menu() {
		Controleer controleer = new Controleer();
		try {
		while (true) {
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기");
			int ch = Controleer.sc.nextInt();
			if (ch == 1) {
				boolean result = controleer.회원가입();
				if (result) {
					System.out.println("회원가입이 완료되었습니다.");
				} else
					System.out.println("회원가입에 실패하였습니다. 다시 시도해주세요.");
			} else if (ch == 2) {
				boolean result = controleer.로그인();
				int i = 0;
				for (Member temp : controleer.memberlist) {
					if (result) {
						System.out.println("로그인 성공");
						System.out.println("환영합니다\t" + controleer.memberlist[i].getId() + "님");
						System.out.println("1.계좌생성 2.입금 3.출금 4.이체 5.대출 6.계좌목록");
						int ch1 = controleer.sc.nextInt();
						if (ch1 == 1) {
							boolean result1 = controleer.계좌생성();
							if(result1) {System.out.println("계좌 개설이 완료되었습니다.");}
							else {System.out.println("계좌 개설 실패!!");}
						} else if (ch1 == 2) {
							System.out.println("입금 페이지");
							System.out.println("입금하실 금액을 입력하세요");
							int money = controleer.sc.nextInt();
							boolean result1 = controleer.입금(money);
							if(result) {System.out.println("입금이 완료되었습니다.");}
							else System.out.println("입금에 실패하였습니다.");
							
						} else if (ch1 == 3) {
							System.out.println("출금 페이지");
							System.out.println("계좌 비밀번호를 입력하세요");
							String pw = controleer.sc.next();
							System.out.println("출금하실 금액을 입력하세요");
							int money = controleer.sc.nextInt();
							boolean result1 = controleer.출금(money, pw);
							if(result) {System.out.println("출금이 완료되었습니다.");}
							else System.out.println("출금에 실패하였습니다.");
							
						} else if (ch1 == 4) {
							System.out.println("이체 페이지");
							System.out.println("이체하실 계좌의 이름을 입력하세요");
							String name = controleer.sc.next();
							// 계좌번호 대신 이름으로 했습니다...
							System.out.println("비밀번호를 입력하세요.");
							String pw = controleer.sc.next();
							System.out.println("이체 금액을 입력하세요");
							int money = controleer.sc.nextInt();
							boolean result1 = controleer.이체(name, pw, money);
							if(result1) System.out.println("이체 성공!!");
							else System.out.println("이체 실패!!");
							
						} else if (ch1 == 5) {
							System.out.println("대출 페이지");
							System.out.println("1. 빠른대출(이율 5%) 2. 일반대출(이율 3%)");
							int ch2 = controleer.sc.nextInt();
							System.out.println("대출하실 금액을 입력하세요");
							int money = controleer.sc.nextInt();
							boolean result1 = controleer.대출(money);
							if(result1 == true && ch2 == 1) {
								System.out.println("대출 성공!!");
								System.out.println("대출하신금액 : " + money);
								System.out.printf("\n갚아아야하는 금액 : %d", ((int)money + money *0.05));
							}
							else if(result == true && ch2 == 2) {
								System.out.println("대출 성공!!");
								System.out.println("대출하신금액 : " + money);
								System.out.printf("\n갚아아야하는 금액 : %d", ((int)money + (money *0.03)));
							}
							else {System.out.println("대출 실패!!");}
						} else if (ch1 == 6) {
							controleer.계좌목록();
						} else {
							System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요.");
						}
					} else {
						System.out.println("로그인이 실패하였습니다.");
					}
				}
			} else if (ch == 3) {
				boolean result = controleer.아이디찾기();
				int i = 0;
				for (Member temp : controleer.memberlist) {
					if (result) {
						System.out.println("당신의 아이디는 : " + controleer.memberlist[i].getId());
						break;
					} else {
						System.out.println("등록하신 회원정보를 가진 아이디가 없습니다.");
					}
				}
			} else if (ch == 4) {
				boolean result = controleer.비밀번호찾기();
				int i = 0;
				for (Member temp : controleer.memberlist) {
					if (result) {
						System.out.println("당신의 비밀번호 : " + controleer.memberlist[i].getPw());
						break;
					} else {
						System.out.println("입력하신 회원정보를 가진 회원이 없습니다.");
					}
				}
			} else {
				System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요");
			}
			
		}
		}catch(Exception e) {System.out.println("문자열을 입력했습니다. 다시 입력해주세요");}
	}
}
