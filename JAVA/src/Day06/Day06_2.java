package Day06;

public class Day06_2 { // c  s

	public static void main(String[] args) { // m  s
		
		Car mycar = new Car(); // <--------- 설계도 없으면 선언불가
		// 1. Car : 정의된 클래스명
		// 2. mycar : 객체이름 [아무거나]
		// 3. new : 메모리 할당 연산자
		// 4. Car() : 생성자????
		
		// 2. 객체내 필드 호출 [. : 접근연산자(객체내 멤버접근)]
		System.out.println("제작회사 	: " + mycar.company);
		System.out.println("모델명 	: " + mycar.model);
		System.out.println("색깔 	: " + mycar.color);
		System.out.println("최고속도	: " + mycar.maxspeed);
		System.out.println("현재속도 	: " + mycar.speed);
		// mycar 객체내 필드 접근
		// mycar(객체명).멤버이름 -> 멤버 호출
		
		// 객체 내 필드값 변경
		mycar.speed = 60;
		// mycar 객체내 speed 필드 호출하여 60이라는 데이터를 대입
		System.out.println("수정된 속도 : " + mycar.speed);
		
		// 새로운 자동차 객체 생성
		Car yourcar = new Car();
		System.out.println("2번 자동차 : " + yourcar.speed);
	
	
	} // m  e
} // c  e
