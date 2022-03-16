package Day11;

public class Day11_1
{
// p. 386 Ȯ�ι���
	// 1. 3 [ �������̽��� ��� : 1. ����ʵ� 2. �߻�޼ҵ� 3. ����Ʈ�޼ҵ� 4. �����޼ҵ� ]
	// 2. 4 [ �������̽� ���� = ������ü ]
	// ������ü = Ŭ������ implements(=����)�� ��ü
	// 3.
	private static void printSound(Soundable soundable)
	{
		// ���������� ���� ��ȯŸ�� �޼ҵ�� (�μ� [����, �迭, ��ü, �������̽�]
		System.out.println(soundable.sound());
	}

	public static void main(String[] args)
	{
		// 3 ����
		System.out.println(new Cat());
		System.out.println(new Dog());

		Soundable soundable = new Cat();
		Soundable[] soundables = new Cat[100];
		Soundable soundabled = new Dog();

		// 4 ����
		dbWork(new Oracle());
		dbWork(new MysqlDao());

		// 5 �͸�ü[�������̽��� ���� ����]
		// ������ü : �������̽� ��ü�� = new Ŭ������();
		// �͸�ü : �������̽� ��ü�� = new �������̽�({����})
		Action action = new Action()
		{
			@Override
			public void work() 
			{
				System.out.println("���縦 �մϴ�,");
			} // �͸�ü�� ���� ������ �����ݷ��� �ٿ��� ��
		};
		action.work();
	}
	
	// 4.
	// Dao : �����ͺ��̽� ���� ��ü
	// Dto : �����ͺ��̽� �̵� ��ü
	private static void dbWork(DataAccessObject dao)
	{
		// ���������� ���� ��ȯŸ�� �޼ҵ�� (�μ� [����, �迭, ��ü, �������̽�]
	}
}
