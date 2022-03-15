package Day10;

public interface GamePad
{
	// 1. 상수

	// 2. 추상 메소드
	public abstract void AButton();
	public abstract void BButton();
	public abstract void CButton();
	// 3. 디폴트 메소드
	default void gamepadOff() {
		System.out.println("Gamepad off");
	}
	// 4. 정적 메소드
	static void gamepadCharge() {
		System.out.println("Charge");
	}
}
