package Day10;

public interface GamePad
{
	// 1. ���

	// 2. �߻� �޼ҵ�
	public abstract void AButton();
	public abstract void BButton();
	public abstract void CButton();
	// 3. ����Ʈ �޼ҵ�
	default void gamepadOff() {
		System.out.println("Gamepad off");
	}
	// 4. ���� �޼ҵ�
	static void gamepadCharge() {
		System.out.println("Charge");
	}
}
