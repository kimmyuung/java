package Day09;

public class Callphone {
	// 1. field
	String model;
	String color;
	
	// 2. constructor
	Callphone() {}
	// 3. method
	void powerOn () { // �μ� x, ��ȯ x
		System.out.println("Power On");
	}
	void powerOff () { // �μ� x, ��ȯ x
		System.out.println("Power Off");
	}
	void bell() { // �μ� x, ��ȯ x
		System.out.println("ring ring~");
	}
	void sendVoice (String message) { // �μ� o, ��ȯ x
		System.out.println("You : " + message);
	}
	void receiveVoice (String message) {
		System.out.println("Telephone : " + message);
	}
	void hangup () {System.out.println("Call end");}
	
}
