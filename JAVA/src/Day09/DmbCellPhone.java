package Day09;

public class DmbCellPhone extends Callphone{
// 서브클래스가 슈퍼클래스 선택 -> extends 슈퍼클래스
	// 서브클래스가 슈퍼클래스내 멤버 사용 가능
	// 1. field
	int channel;
	// 2. constructor
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	// method
	void turnOnDmb () {
		System.out.println("Channel : " + channel + "watch dmb channel");
	}
	void changeChanneDmb(int channel) {
		this.channel = channel;
		System.out.println("Channel : " + channel + "change the channel");
	}
	void turnOffDmb () {
		System.out.println("Turn off Dmb");
	}
}
