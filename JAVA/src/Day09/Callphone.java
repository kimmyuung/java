package Day09;

public class Callphone {
	// 1. field
	String model;
	String color;
	
	// 2. constructor
	Callphone() {}
	// 3. method
	void powerOn () { // 인수 x, 반환 x
		System.out.println("Power On");
	}
	void powerOff () { // 인수 x, 반환 x
		System.out.println("Power Off");
	}
	void bell() { // 인수 x, 반환 x
		System.out.println("ring ring~");
	}
	void sendVoice (String message) { // 인수 o, 반환 x
		System.out.println("You : " + message);
	}
	void receiveVoice (String message) {
		System.out.println("Telephone : " + message);
	}
	void hangup () {System.out.println("Call end");}
	
}
