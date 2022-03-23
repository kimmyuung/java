package Day16;

public class Day16_1 {
public static void main(String[] args) {
	
	
	// 제네릭
	
	// 비제네릭 예1)
	// 1. 박스 객체 생성
	Box box = new Box();
	// 2. 객체내 메소드 호출(인수 : String) : Object 가능
	box.set("홍길동");
	// 3. 객체내 메소드 호출 (반환 : Object)
	String name = (String) box.get();
	
	box.set(new Apple());
	Apple apple = (Apple) box.get();
	
	// 자식객체 -> 부모객체 [ 자동형변환 ]
	// 부모객체 -> 자식객체 [ 자동 X, 강제 O ]
}
}
