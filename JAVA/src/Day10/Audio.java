package Day10;

public class Audio implements RemoteControl
{
	private int volume;

	@Override
	public void turnOn()
	{
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff()
	{
		System.out.println("Audio¸¦ ²ü´Ï´Ù.");
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
		System.out.println("ÇöÀç ¿Àµð¿À º¼·ý : " + this.volume);
	}

}
