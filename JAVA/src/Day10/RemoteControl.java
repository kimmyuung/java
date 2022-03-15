package Day10;

public interface RemoteControl
{

// ���
	// 1. ����ʵ� : ������ ������
	public int Max_VOLUME = 10; // �������� �ִ����
	public int MIN_VOLUME = 0; // �������� �ּҼ���

	// 2. �߻�޼ҵ�**(=abstract method) : ���� O ���� X
	public void turnOn(); // �޼ҵ��� {}�� ���� -> ������ ���� �ʱ� ����, Ŭ�������� �˾Ƽ� ����

	public void turnOff();

	public abstract void setVolume(int volume);

	// 3. ����Ʈ�޼ҵ� : ���� O ���� O
	default void setMute(boolean mute)
	{
		if (mute)
		{
			System.out.println("���� ó��");
		} else
		{
			System.out.println("���� ����");
		}
	}
	// 4. �����޼ҵ� : ���� O ���� O [��ü���� ����]
	static void changeBattery() {
		System.out.println("������ ��ü�մϴ�.");
	}
}
