package Day10;

public interface RemoteControl
{

// 멤버
	// 1. 상수필드 : 고정된 데이터
	public int Max_VOLUME = 10; // 리모콘의 최대소음
	public int MIN_VOLUME = 0; // 리모콘의 최소소음

	// 2. 추상메소드**(=abstract method) : 선언 O 구현 X
	public void turnOn(); // 메소드의 {}을 생략 -> 구현을 하지 않기 때문, 클래스들이 알아서 구현

	public void turnOff();

	public abstract void setVolume(int volume);

	// 3. 디폴트메소드 : 선언 O 구현 O
	default void setMute(boolean mute)
	{
		if (mute)
		{
			System.out.println("무음 처리");
		} else
		{
			System.out.println("무음 해제");
		}
	}
	// 4. 정적메소드 : 선언 O 구현 O [객체없이 가능]
	static void changeBattery() {
		System.out.println("건전지 교체합니다.");
	}
}
