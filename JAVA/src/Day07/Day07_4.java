package Day07;

public class Day07_4 {
public static void main(String[] args) {
	
	// 1. ***** 객체 선언 ******
	Car2 mycar = new Car2();
	
	mycar.keyTurnon(); // 2. 자동차 시동 걸기 인수x,반환x
	
	mycar.run(); // 3. 자동차 전진 인수x,반환x
	
	int speed = mycar.getspeed(); // 4. 차의 현재 속도 확인
	System.out.println("현재 속도 : " + speed + "km/h");
	
	
	}
}
