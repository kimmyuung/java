package Day07;

public class Day07_2 { // cs
	public static void main(String[] args) { // ms
		Car mycar = new Car(); // 객체선언(빈생성자 = 기본생성자)
		
		// 메소드 호출 
		mycar.setGas(5);
		
		
		if(mycar.isLeftGas()) {
					System.out.println("출발합니다.");
					mycar.run();
		}
		
		if(mycar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다");
		} else System.out.println("gas를 주입하세요");
	} // me
} // ce
