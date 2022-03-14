package Day09;

public class Day09_5 {
public static void main(String[] args) {
	
	Car mycar = new Car();
	
	for(int i = 1; i <= 5; i++) {
		int problemLocation = mycar.run(); 
		// 자동차 회전 메소드 호출
		// 펑크난 위치 
	switch(problemLocation) {
	case 1 : 
		System.out.println("앞왼쪽 한국타이어 교체");
		mycar.frontLeftTire = new HankookTire(15, "앞왼쪽");
		// 슈퍼클래스 객체명 = new 서브클래스(); 
		// 상속을 받으면 가능!!!
		break;
	case 2 : 
		System.out.println("앞오른쪽 한국타이어 교체");
		mycar.frontRightTire = new KumhoTire(13, "앞오른쪽");
		// 슈퍼클래스 객체명 = new 서브클래스();
		break;
	case 3 : 
		System.out.println("뒤왼쪽 한국타이어 교체");
		mycar.backLeftTire = new HankookTire(14, "뒤왼쪽");
		// 슈퍼클래스 객체명 = new 서브클래스();
		break;
	case 4 : 
		System.out.println("뒤오른쪽 한국타이어 교체");
		mycar.backRightTire = new KumhoTire(17, "뒤오른쪽");
		// 슈퍼클래스 객체명 = new 서브클래스();
		break;
	// 동시에 도는 것이 아니기때문에 마지막 바퀴가 펑크가 잘 안남!
			}
	System.out.println("---------------");
		}	
	}
}
