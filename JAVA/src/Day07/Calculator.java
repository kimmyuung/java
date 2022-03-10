package Day07;

public class Calculator {
 // 클래스 선언
	
	// 1. 필드
	// 2. 생성자 : 만약 생성자 선언 없으면 기본생성자가 자동 추가
	// 기본생성자 : 매개변수(인수)가 없음. -> Calculator();

	// 3. 메소드
		// 1. 리턴타입 : void(= 함수가 종료되면서 나가는 데이터가 없다)
		// 2. 메소드 이름 : powerOn
		// 3. (매개변수[인수]) : 함수로 들어오는 데이터들
		// 4. {실행 코드} : 함수 실행부
	void powerOn() {// method s
		// powerOn : 인수도 없음(), 반환도 없음(void)
		System.out.println("전원을 킵니다.");
	} // method e
	
	int plus(int x, int y) { // 인수 O, 반환 O
		int result = x + y;
		return result;
	}
	// int : 리턴타입[함수가 종료되면서 int형 데이터가 반환]
	// plus : 메소드이름[아무거나]
	// (int x, int y) : 함수 호출시 함수로 들어오는 x와 y는 int형으로 받음
	//					= int형 2개 매개변수 받기
	// return result : 리턴 데이터 값
		// 리턴타입이 int 이기때문에 return에는 무조건 int형 데이터가 입력받고 출력되어야 함
	// { 실행부 } : 
	double divide(int x, int y) { // 인수 O, 반환 O
		double result = (double)x / (double)y;
		// (자료형) 변수명 : 강제형변환
			// int 형 변수 -> double 변경 
				// 나누기 후 소수점이 있을 수도 있기 때문
		return result; // 결과값 -----> 메소드 호출한 곳으로 이동
	}
	void powerOff() {// method s
		// powerOff : 인수도 없음(), 반환도 없음(void)
		System.out.println("전원을 끕니다.");	
	} // method e
	
	
	
}
