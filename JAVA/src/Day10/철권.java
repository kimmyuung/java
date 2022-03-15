package Day10;

public class 철권 implements GamePad
{
	@Override
	public void AButton()
	{
		System.out.println("공격");
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
