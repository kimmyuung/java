package Day09;

public class Day09_4 {
	public static void main(String[] args) {
		// @Override : 재정의
		// 원래 동일 인수의 메소드명 불가능
		// 목적 : 동일한 메소드를 재정의(=수정)
			// 상속 받았더니 메소드가 맘에 안듦
		int r = 10;
		
		Calculator calculator = new Calculator();
		// 슈퍼클래스로 객체 생성
		System.out.println("원 면적 : " + calculator.areaCircle(r));
		System.out.println();
		// 슈퍼클래스로 만든 객체로 메소드 호출
		Computer computer = new Computer();
		// 서브클래스로 객체 생성
		System.out.println("원 면적 : " + computer.areaCircle(r));
		// 서브클래스로 만든 객체로 메소드 호출
		
		// 슈퍼클래스와 서브클래스내 메소드는 다름.
	}
}
