package Day07;

public class Car {
	// 클래스 선언
	
	// 1. 필드
	int gas;
	// 2. 생성자
	
	// 3. 메소드
	// 가스를 외부로부터 받아서 내부에 gas 저장
	void setGas(int gas) { // 인수 O, 반환 X
		this.gas = gas;// 리턴 x, 메소드명(인수1) {내부변수 = 외부변수}
	}// 내부변수와 외부변수 -> this.필드명 : 내부(현클래스 파일)변수
	
	boolean isLeftGas() {
		if(gas == 0 ) {
			System.out.println("gas가 없습니다.");
			return false; // 내부변수에 gas가 0이면 false 반환
		}
		else {System.out.println("gas가 있습니다");
			  return true;} // 내부변수에 gas가 0이면 false 반환
	}
	
	void run() { // gas 0일때까지 실행하는데 실행할때마다 가스 1씩 감소
		// gas가 0이면 함수 종료
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량" + gas + ")");
				gas--;
			}
			else {System.out.println("멈춥니다.(gas잔량" + gas + ")");
			return;}//(=break;), run 메소드 실행 종료
			// return = 함수 종료[탈출]
		}
		
	}
	
	
}
