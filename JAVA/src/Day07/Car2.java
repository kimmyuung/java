package Day07;

public class Car2 {
	// 클래스 선언
	
	// 1. 필드
	int speed;
	// 2. 생성자
	
	// 3. 메소드
	// 현재 필드값을 반환해주는 메소드
	int getspeed() { // 인수 x, 반환 o
		return speed;
	}
	// 출력 메소드
	void keyTurnon() { // 인수 x, 반환 x
		System.out.println("키를 돌립니다");
	}
	// 스피드 증가 메소드
	void run() { // 인수 x, 반환 x
		for(int i = 10; i <= 50; i+=10) {
			speed = i; // i는 10부터 50까지 10씩증가하며 반복 -> 5회
			System.out.println("달립니다.(시속 : " + speed + "km/h");
		}
	}
	
}
