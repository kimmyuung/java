package Day15;

public class Day15_5 {
public static void main(String[] args) {
	// 동기화
	// 멀티스레드 사용시 동기화 선택
	// 여러개 스레드 동일한 메소드 호출
	// 동시다발적으로 하나의 메소드 호출
	
	// 예1 ) 동기화가 없을경우 예
		// 2개의 스레드가 동일한 메소드 호출
	// 1. 계산기 객체 생성
	Calculator calculator = new Calculator();
	// 2. user1 객체생성
	User1 user1 = new User1();
	user1.setCalculator(calculator);
	user1.start();
	// 3. user2 객체생성
	User2 user2 = new User2();
	user2.setCalculator(calculator);
	user2.start();
}
}
