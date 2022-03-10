package Day07;

public class Day07_1 { // cs
	public static void main(String[] args) { // ms
		
		// 객체지향 프로그램 : 부품들 조립하여 완성된 제품
		// 메소드(=함수) : 1. main 메소드
		// 메소드 호출 예시 : print(), printIn(), .equals(), nextInt()...
			//
	    // 메소드 선언 : 리턴값, 메소드명, 매개값, 실행부
		// 1. 인수 O 반환 O : 함수로 들어오는 값 O // 함수로 나가는 값 O
		// 1. 인수 O 반환 X : 함수로 들어오는 값 O // 함수로 나가는 값 X
		// 1. 인수 X 반환 O : 함수로 들어오는 값 X // 함수로 나가는 값 O
		// 1. 인수 X 반환 X : 함수로 들어오는 값 X // 함수로 나가는 값 X
		
		// 1. 함수 사용 목적 : 코드 재활용 + 인수에 따른 결과값 서로 다름
		// -> 100줄이 넘는 코드를 작성하기 보다는 한번 코드를 작성하고 그를 메소드화하여 호출하는것이 효율적
		// 2. 메소드 호출 방법
			// 1. 메소드가 존재하는 클래스의 객체 필요
			// 2. 객체명.메소드명() : ex) scanner.nextInt();
			// . : 접근연산자(필드나 메소드 호출시 사용)
		// 1. 객체 선언
			Calculator myCalc = new Calculator();
			// 클래스명 객체명(이름) = 메모리할당 생성자;
		// 2. 메소드 호출
			myCalc.powerOn();
		// 3. 메소드 호출 [인수 2개]
			int result1 = myCalc.plus(5, 6);
			// 메소드에 5와 6을 전달 후에 11이라는 결과값을 받아서 변수에 저장
			System.out.println("result1 : "+ result1);
			// 5 = int x, 6 = int y
			
			byte x = 10;
			byte y = 4;
			double result2 = myCalc.divide(x, y);
			System.out.println("result2 : "+ result2);
			
			myCalc.powerOff();
	} // me
} // ce 
