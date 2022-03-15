package Day10;

public class Television implements RemoteControl
{ // 클래스명 implements 인터페이스명
	// (구현하다)
	private int volume;

	@Override
	public void turnOn()
	{
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff()
	{
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume)
	{
		if (volume > RemoteControl.Max_VOLUME)
		{
			this.volume = RemoteControl.Max_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME)
		{
			this.volume = RemoteControl.MIN_VOLUME;
		} else
		{
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨" + this.volume);
	}

}
