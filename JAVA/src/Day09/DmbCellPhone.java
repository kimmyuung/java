package Day09;

public class DmbCellPhone extends Callphone{
// ����Ŭ������ ����Ŭ���� ���� -> extends ����Ŭ����
	// ����Ŭ������ ����Ŭ������ ��� ��� ����
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
