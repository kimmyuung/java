package Day09;

public class Car {
// 1. field[ 변수, 객체, 정적변수 ]
	Tire frontLeftTire = new Tire(6, "앞왼쪽");
	Tire frontRightTire = new Tire(2, "앞오른쪽");
	Tire backLeftTire = new Tire(3, "뒤왼쪽");
	Tire backRightTire = new Tire(4, "뒤오른쪽");
// 클래스명 객체명 = new 생성자(타이어수명, 타이어위치);
// 2. constructor

// 3. method
	int run () { // 자동차 회전(모든 타이어객체가 1회씩 회전)
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false) {
			stop(); return 1;
		}
		if(frontRightTire.roll() == false) {
			stop(); return 2;
		}
		if(backLeftTire.roll() == false) {
			stop(); return 3;
		}
		if(backRightTire.roll() == false) {
			stop(); return 4;
		}
	return 0;
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
		
}
