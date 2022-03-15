package Day10;

public class Television implements RemoteControl, Searchable
{ // Ŭ������ implements �������̽���
	// (�����ϴ�)
	private int volume;

	@Override
	public void turnOn()
	{
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff()
	{
		System.out.println("TV�� ���ϴ�.");
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
		System.out.println("���� TV ����" + this.volume);
	}
	@Override
		public void search(String url)
		{
			System.out.println(url + "�� �˻��մϴ�.");
		}
	@Override
		public void setMute(boolean mute) // ����Ʈ �޼ҵ嵵 ������ ����
		{
			RemoteControl.super.setMute(mute);
		}
}
