package Day09;

import java.util.Scanner;

public class Day09_6_����������α׷� {
public static Bank[] ���¸���Ʈ = new Bank[100];
public static void main(String[] args) {
	������Ʈ�ѷ� ��Ʈ�ѷ� = new ������Ʈ�ѷ�();
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("------ ���� �ý���");
		System.out.println("1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���¸��");
		int select = sc.nextInt();
	if (select == 1) {
		System.out.println("+++ ���µ�� ������ +++");
		System.out.println("��й�ȣ : "); String pw = sc.next(); 
		System.out.println("������ : ");  String name = sc.next();
		System.out.println("���༱�� <1. ���� 2. ���� 3. �ϳ� >"); int bnum = sc.nextInt();
		// ��Ʈ�ѷ� ���� 
		// �ٸ� Ŭ������ ��� ȣ�� ���
		// 1. ��ü ����(new)�ؼ� �޼ҵ� ȣ��
		// 2. static �޼Ҵ� ��ü ���� ȣ�� ����
		String result = ��Ʈ�ѷ�.���»���(pw, name, 0);
			// �޼ҵ� ��ȯ ���� = ���¹�ȣ Ȥ�� null
			// �޼ҵ� ���� �� �޽��� ���
		if(result != null) {System.out.println("** ���� ���� **");}
		else {System.out.println("�ý��� ����");}
	}
	else if(select == 2) {
		System.out.println("+++ �Ա� ������ +++");
		System.out.println("���¹�ȣ : "); String ���¹�ȣ = sc.next();
		System.out.println("�Աݾ� : "); int �Աݾ� = sc.nextInt();
		��Ʈ�ѷ�.�Ա�(���¹�ȣ, �Աݾ�);
		boolean result = ��Ʈ�ѷ�.�Ա�(���¹�ȣ, �Աݾ�);
		if(result) {
			System.out.println("�Ա� ����");
		}
		else {
			System.out.println("�Ա� ����");
		}
	}
	else if(select == 3) {
		System.out.println("+++ ��� ������ +++");
		System.out.println("���¹�ȣ : "); String ���¹�ȣ = sc.next();
		System.out.println("��й�ȣ : "); String ��й�ȣ = sc.next();
		System.out.println("��ݾ� : "); int ��ݾ� = sc.nextInt();
	��Ʈ�ѷ�.���(���¹�ȣ, ��й�ȣ, ��ݾ�);
	int result = ��Ʈ�ѷ�.���(���¹�ȣ, ��й�ȣ, ��ݾ�);
	if (result == 1) {
		System.out.println("�ܾ� ����");
	}
	else if(result == 2) {
		System.out.println("��� ����");
	} 
	else if(result == 3) {
		System.out.println("�ùٸ� ������ �ƴմϴ�");
	}
	
	
	}
	else if(select == 4) {
		System.out.println("+++ ������ü ������ +++");
		System.out.println("������ ����� ���¹�ȣ�� �Է��ϼ���"); 
		String ���¹�ȣ = sc.next();
		System.out.println("��й�ȣ�� �Է��ϼ���"); 
		String ��й�ȣ = sc.next();
		System.out.println("��ü�ݾ��� �Է��ϼ���"); 
		int ��ü�ݾ� = sc.nextInt();
		System.out.println("�޴� ����� ���¸� �Է��ϼ���"); 
		String �޴°��� = sc.next();
		��Ʈ�ѷ�.��ü(���¹�ȣ, ��й�ȣ, ��ü�ݾ�, �޴°���);
		int result = ��Ʈ�ѷ�.��ü(���¹�ȣ, ��й�ȣ, ��ü�ݾ�, �޴°���);
		if(result ==1) {
			System.out.println("�ܾ� ����");
		}
		else if(result == 2) {
			System.out.println("��ü ����");
		}
		else if(result == 3) {
			System.out.println("�޴� ���� ������ �����ϴ�.");
		}
		else if(result == 4) {
			System.out.println("������ ���� ������ �����ϴ�.");
		}
	}
	else if(select == 5) {
		System.out.println("+++ ���¸�� ������ +++");
		System.out.println("������ : "); String name = sc.next();
		Bank[] �����¸�� = ��Ʈ�ѷ�.���¸��(name);
		System.out.println("�˻��Ͻ� ������ ���� ���¸��");
		int i = 0;
		for(Bank temp : �����¸��) {
			if(temp != null)
			System.out.println(i + "�� ���¸�� : " + temp.getName());
			i++;
		}
	}
	else {System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���");}
	}
	
	// ����������α׷� [ ��� ]
	// ����(����Ŭ����) ���
	// 1.���»��� 2.�Ա� 3.��� 4.��ü 5.�����¸�� 6.����  
	// ��������, ��������, �ϳ�����(����Ŭ����)
	}
	// ��
	
}
