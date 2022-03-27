package Day09_6연습;

import java.util.ArrayList;

public class 은행컨트롤러 {
	// 해당 클래스는 은행 관련 컨트롤러
		// M : 모델 [데이터]
		// V : 뷰 [HTML]
		// C : 모델[M]과 뷰[V] 연결 역할
		
		// 생성자 : 기본생성자
		
	// 뷰에서 요청하는 서비스[기능]를 제공
		// 1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 계좌목록 6. 대출
		// 1. 생성 (Create)
	static ArrayList<Bank> 계좌리스트 = new ArrayList<>();
	static int[] 대출 = new int[100];
	boolean 계좌생성 (String bnum, String account, String name, String pw, int money) {
		
		for(Bank temp : 계좌리스트) {
			if(temp.getBnum().equals(bnum)) {
				return false;
			}
		}
			Bank bank = new Bank(bnum, account, name, pw, money);
			계좌리스트.add(bank);
			return true;
	}
	boolean 입금 (String bnum, int money) {
		for(Bank temp : 계좌리스트) {
			if(temp.getBnum().equals(bnum)) {
				temp.setMoney(money);
				return true;
			}
		}
		return false;
	}
	boolean 출금 (String bnum, String pw, int money) {
		for(Bank temp : 계좌리스트) {
			if(temp.getBnum().equals(bnum) && temp.getPw().equals(pw) 
					&& temp.getMoney() >= money) {
				temp.setMoney(temp.getMoney() - money);
				return true;
			}
		}
		return false;
	}
	boolean 이체 (String bnum, String pw, int money) {
		for(int i = 0 ; i < 계좌리스트.size() ; i++) {
			for(int j = 0; j < 계좌리스트.size(); j++) {
				if(계좌리스트.get(i).getPw().equals(pw) && 계좌리스트.get(j).getBnum().equals(bnum)) {
					계좌리스트.get(i).setMoney(계좌리스트.get(i).getMoney() - money);
					계좌리스트.get(j).setMoney(계좌리스트.get(j).getMoney() + money);
					return true;
				}	
			}
		}
		return false;
		
	}
	void 계좌목록 () {
		for(Bank temp : 계좌리스트) {
			if(temp != null) {
				System.out.println("계좌번호 :" + temp.getBnum());
				System.out.println("계좌이름 : " + temp.getAccount());
				System.out.println("계좌잔고 : " + temp.getMoney());
			}
		}
	}
	boolean 대출 (String bnum, int sumMoney, int 대출인덱스) {
		for(Bank temp : 계좌리스트)
			if(temp.getBnum().equals(bnum)) {
				temp.setMoney(temp.getMoney() + sumMoney);
			} 
		for(int temp : 대출) {
			if(temp == 0) {
				대출[대출인덱스] = sumMoney;
				대출인덱스++;
				return true;
			}
		}
	return false;
	}
	boolean 상환(String bnum, int money, int 대출인덱스) {
		for(Bank temp : 계좌리스트) {
			if(temp.getBnum().equals(bnum)) {
				temp.setMoney(temp.getMoney() - money);
			}
		}
		for(int temp : 대출) {
			if(temp != 0) {
				대출[대출인덱스] -= money;
				return true;
			}
		}
	return false;
	}
	
}
