package Day10;

public class Book
{

	// 1. �ʵ�
	private String ������;
	private String ����;
	// 2. ������
	public Book () {}
	public Book(String ������, String ����)
	{
		this.������ = ������;
		this.���� = ����;
	}

	// 3. �޼ҵ�
	public String get������()
	{
		return ������;
	}
	public void set������(String ������)
	{
		this.������ = ������;
	}
	public String get����()
	{
		return ����;
	}
	public void set����(String ����)
	{
		this.���� = ����;
	}
}
