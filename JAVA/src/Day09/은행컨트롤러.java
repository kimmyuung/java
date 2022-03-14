package Day09;

import java.util.Random;

public class 은행컨트롤러 {
 // 해당 클래스는 은행 관련 컨트롤러
	// M : 모델 [데이터]
	// V : 뷰 [HTML]
	// C : 모델[M]과 뷰[V] 연결 역할
	
	// 생성자 : 기본생성자
	
// 뷰에서 요청하는 서비스[기능]를 제공
	// 1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 계좌목록 6. 대출
	// 1. 생성 (Create)
	public boolean 생성(String pw, String name, int bnum) {
		// 1. 입력받은 값을 가져옴[인수]
			// 계좌번호 자동생성
		Random random = new Random(); // 4자리 생성
		int 난수 = random.nextInt(10000); // 0~9999 사이
		String 계좌번호 = String.format("%04d", 난수);
		// %d : 정수, %4d 정수 4자리[만일 자릿수 없으면 공백처리]
		// %04d 정수 4자리[만일 자릿수 없으면 0처리]
		
		// 2. 객체화(다수의 변수를 하나의 객체로 만들기)
		if(bnum == 1) {
			Bank temp = new 국민은행("0", pw, name, 0);
		}
		else if(bnum == 2) {
			Bank temp = new 신한은행("0", pw, name, 0);
		}
		else if(bnum == 3) {
			Bank temp = new 하나은행("0", pw, name, 0);
		}
		// 3. 배열에 저장
		int i = 0;
		for(Bank temp2 : Day09_6_은행계좌프로그램.계좌리스트) {
			if(temp2 == null) {
				Day09_6_은행계좌프로그램.계좌리스트[i] = temp2;
				System.out.println("*** 계좌 등록 ***");
				return true;
			}
			i++;
		}
		return false;
	}
	
	// 2. 입금 (Update)
	public boolean 입금 () {
		return false;
	}
	// 3. 출금 (Update)
	public boolean 출금 () {
		return false;
	}
	// 4. 이체 (Update)
	public boolean 이체 () {
		return false;
	}
	// 5. 계좌목록 (Reading)
	public boolean 계좌목록 () {
		return false;
	}
	// 6. 대출
	public boolean 대출 () {
		return false;
	}
}
