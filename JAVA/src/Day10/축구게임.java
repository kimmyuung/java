package Day10;

public class 축구게임 implements GamePad
{
	@Override
	public void AButton()
	{
		System.out.println("슈팅");
	}
	@Override
	public void BButton()
	{
		System.out.println("방어");
	}@Override
	public void CButton()
	{
		System.out.println("교체");
	}
}
