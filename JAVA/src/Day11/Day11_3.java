package Day11;

public class Day11_3
{ // cs
	public static void findclass() throws Exception
	{
		// 1. ���� ������ [�޼ҵ��() throws ����Ŭ������
		Class clazz = Class.forName("java.lang.String2");
//		try
//		{ // ���ܰ� �߻��� �� ���� �ڵ�(���࿹��) Ȥ�� �Ϲݿ���(������)
//			Class class1 = Class.forName("java.lang.String2"); 
//								// Ŭ����ã�� �޼ҵ�
//		} catch (Exception e) // ���ܰ� �߻��ϸ� ����Ǵ� �ڵ�
//		{	// Exception : ����Ŭ������ ����Ŭ���� �̹Ƿ� ��� ���� ���� ����
//			System.out.println(e);
//		}
	}
	public static void withdraw(int money) throws Exception {
		if(20000 < money) {
			throw new Exception("�ܰ����");
		}
	}
	public static void main(String[] args) 
	{ // ms
		// ���ܴ�����
		// ���� : ��� �޼ҵ忡�� try{}catch(){} ��� ������ �ϳ� ���� ���� �ڵ尡 ����
		// -> �Ѱ����� ���� �̵�
		try {findclass(); // ȣ���� ������ try, catch ���� ���� �ذ�
		} catch(Exception e) {  }
		
		try {withdraw(30000);}
		catch(Exception e) { System.out.println(e); }

	} // me
} // ce
