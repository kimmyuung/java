package Day09_6����;

import java.util.Scanner;

public class ����������α׷� {
// 1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���¸��
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	������Ʈ�ѷ� con = new ������Ʈ�ѷ�();
	int i = 0;// index
	int �����ε��� = 0;
	while(true) {
		
	System.out.println("����������α׷�");
	System.out.println("1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���¸�� 6. ���� 7. �α׾ƿ�");
	int ch = sc.nextInt();
	if(ch == 1) {
		String index = i +"";
		System.out.println("������ �̸��� �Է����ּ���");		  	String account = sc.next();
		System.out.println("���� �������� �̸��� �Է����ּ���"); 	String name = sc.next();
		System.out.println("������ ��й�ȣ�� �Է����ּ���");   	String pw = sc.next();
		boolean result = con.���»���(index, account, name, pw, 0);
		System.out.println("������ ������ ���ϴ� ������ �������ּ���");
		System.out.println("1. �������� 2. �������� 3. �ϳ�����");
		int ch1 = sc.nextInt();
		if(result && ch1 == 1) {
			Bank temp = null; // ��ü
			System.out.println("����������� ������ �Ϸ�Ǿ����ϴ�.");
			temp = new ��������(index, account, name, pw, 0);
			i++;
			}
		else if(result && ch1 == 2) {
			Bank temp = null; // ��ü
			System.out.println("����������� ������ �Ϸ�Ǿ����ϴ�.");
			temp = new ��������(index, account, name, pw, 0);
			i++;
			}
		else if(result && ch1 == 3) {
			Bank temp = null; // ��ü
			System.out.println("�ϳ�������� ������ �Ϸ�Ǿ����ϴ�.");
			temp = new �ϳ�����(index, account, name, pw, 0);
			i++;
			}
	}
	else if(ch == 2) {
		System.out.println("���¹�ȣ�� �Է����ּ���"); String bnum = sc.next();
		System.out.println("�Ա��� �ݾ��� �Է����ּ���"); int money = sc.nextInt();
		boolean result = con.�Ա�(bnum, money);
		if(result) System.out.println("�Ա� ����");
		else System.out.println("�Ա� ����!!");
	}
	else if(ch == 3) {
		System.out.println("���¹�ȣ�� �Է����ּ���"); String bnum = sc.next();
		System.out.println("������ ��й�ȣ�� �Է����ּ���"); String pw = sc.next();
		System.out.println("����� �ݾ��� �Է����ּ���"); int money = sc.nextInt();
		boolean result = con.���(bnum, pw, money);
		if(result) System.out.println("��� ����!!");
		else System.out.println("��� ����!");
	}
	else if(ch == 4) {
		System.out.println("��ü�� ���¹�ȣ�� �Է����ּ���"); String bnum = sc.next();
		System.out.println("��ü�� �ݾ��� �Է����ּ���");		int money = sc.nextInt();
		System.out.println("������ ��й�ȣ�� �Է����ּ���");	String pw = sc.next();
		boolean result = con.��ü(bnum, pw, money);
		if(result) System.out.println("��ü ����!!");
		else System.out.println("��ü ����!!");
	}
	else if(ch == 5) {
		con.���¸��();
	}
	else if(ch == 6) {
		System.out.println("�����ڳʿ� ���� �� ȯ���մϴ�.");
		System.out.println("1. ����         2. ��ȯ");
		System.out.println("�޴��� �������ּ���");
		int ch1 = sc.nextInt();
		if(ch1 == 1) {
			System.out.println("�����ǰ�� �������ּ���");
			System.out.println("1. �Ϲݴ���(����3%) 2. ��������(����5%)");
			int ch2 = sc.nextInt();
			if (ch2 == 1) {
				System.out.println("�Ϲ� ����� �ڳ��Դϴ�.");
				System.out.println("������� ������ ���¹�ȣ�� �Է����ּ���");
				String bnum = sc.next();
				System.out.println("��������� �ݾ��� �Է����ּ���");
				int money = sc.nextInt();
				double sumMoney = (int)(money * 0.03) + money;
				boolean result = con.����(bnum, (int)sumMoney, �����ε���);
				if(result)	System.out.println("���� ����!!");
				else System.out.println("���� ����!!");
			}
			else if (ch2 == 2) {
				System.out.println("�Ϲ� ����� �ڳ��Դϴ�.");
				System.out.println("������� ������ ���¹�ȣ�� �Է����ּ���");
				String bnum = sc.next();
				System.out.println("��������� �ݾ��� �Է����ּ���");
				int money = sc.nextInt();
				double sumMoney = (int)(money * 0.05) + money;
				boolean result = con.����(bnum, (int)sumMoney, �����ε���);
				if(result)	System.out.println("���� ����!!");
				else System.out.println("���� ����!!");
			}
		}
		else if(ch1 == 2) {
			System.out.println("��ȯ�ڳʿ� ���Ű� ȯ���մϴ�.");
			System.out.println("��ȯ�Ͻ� ���¹�ȣ�� �Է����ּ���");
			String bnum = sc.next();
			System.out.println("��ȯ�Ͻ� �ݾ��� �Է����ּ���");
			int money = sc.nextInt();
			boolean result = con.��ȯ(bnum, money, �����ε���);
			if(result) System.out.println("��ȯ����!!");
			else System.out.println("��ȯ ����!");
		}
	}
	else if(ch == 7) {
		System.out.println("�α׾ƿ�!!"); break;
	}
		
	}
	
}

}

