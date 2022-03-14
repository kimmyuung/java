package Day09;

public class Day09_2 {
public static void main(String[] args) {
	
	// 상속 : 부모에게 물려받는 것 --> 부모 클래스의 멤버를 자식 클래스에게 물려주는 것
		// 현실 : 부모 ---> 자식 // 프로그래밍 : 자식 ---> 부모 선택
	// = 설계도를 연장(extends) --> 목적 : 코드의 중복을 줄여 빠른 설계
		// ex) 핸드폰 제조회사 설립 --> 핸드폰의 기본 설계(=부모클래스) 
								 // ---> 기본 설계(기존 있던 코드) + 핸드폰만의 특징 => 자식클래스
	// 서브클래스로 객체 생성
	DmbCellPhone dmb = new DmbCellPhone("자바폰", "검정", 10);
	
	// 서브 클래스로 만들어진 객체로 슈퍼클래스(1개)내 멤버[필드] 접근
	System.out.println("Model : " + dmb.model);
	System.out.println("Color : " + dmb.color);
	// 서브 클래스로 만들어진 객체로 본인 멤버 접근
	System.out.println("Channel : " + dmb.channel);
	
	// 서브클래스로 만들어진 객체로 슈퍼클래스내 멤버[메소드] 접근
	dmb.powerOn(); // 슈퍼클래스내 선언된 메소드(호출 가능)
	dmb.bell();
	dmb.sendVoice("Hello");
	dmb.receiveVoice("Ah~ Hi. Nice to meet you.");
	dmb.hangup();
	// 서브클래스로 만들어진 객체로 본인 멤버접근
	dmb.turnOnDmb();
	dmb.changeChanneDmb(12);
	dmb.turnOffDmb();
	
	}
}
