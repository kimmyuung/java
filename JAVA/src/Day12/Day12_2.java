package Day12;

public class Day12_2
{
	public static void main(String[] args)
	{
		// p. 499 String �޼ҵ�
		// charAt() : ���ڿ����� Ư������ ���� 
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		
		switch(sex) { // switch ��� [ switch(�˻���) {case}
		case 1 : 
		case 3 : System.out.println("����"); break;
		case 2 :
		case 4 : System.out.println("����"); break;
		}
		
		// p. 501 equals() : ���ڿ� ��
			// �⺻�ڷ��� ����ϴ� ������ ������ ��밡�� [ == ]
			// ������ ����ϴ� ������ ������ ���Ұ��� [ equals ]
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö"; // ��ü�� new �����ڰ� �ʼ������� String Ŭ������ �ڵ���ü ����
		
		// ���ڿ� ��
		if(strVar1 == strVar2) { // ���ڿ��� == �Ұ�, ==�� �밳 �޸��ּҸ� ���ϴ� ������� ó���ǹǷ� ���ڿ��� ó���� �ȵ�
			System.out.println("���� String ��ü�� ����");
		} else System.out.println("�ٸ� String ��ü�� ����");
		if(strVar1.equals(strVar2)) System.out.println("���� ���ڿ��� ����");
		else System.out.println("�ٸ� ���ڿ��� ����");
	}

}
