package ���ΰ�������;

public class ���ӱ� {
public static void main(String[] args) {
	���ӱ���Ʈ�ѷ� con = new ���ӱ���Ʈ�ѷ�();
	try {
	while(true)
	{
		System.out.println("------ �̴� ���� õ�� ------");
		System.out.println("���ϴ� ������ ���ڸ� �Է����ּ���");
		System.out.println("1. ƽ���� 2. ���شٿ� 3. ���� 4. �뷡���߱� 5. ���ھ߱�");
		System.out.println("������ ���� >>>> ");
		int select = con.sc.nextInt();
		if(select == 1) {
			System.out.println("ƽ���� ���ӿ� ���Ű� ȯ���մϴ�.");
			con.ƽ����();
		}
		else if(select == 2) {
			con.���شٿ�();
		}
		else if(select == 3) {
			con.����();
		}
		else if(select == 4) {
			con.�뷡���߱�();
		}
		else if(select == 5) {
			con.���ھ߱�();
		}
	}
	}catch(Exception e) {System.out.println("���ڿ��� �Է��ϼ̽��ϴ�. �ٽ� �������ּ���");}
	}
}
