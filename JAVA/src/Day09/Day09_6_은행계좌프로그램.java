package Day09;

import java.util.Scanner;

public class Day09_6_����������α׷� {
public static Bank[] ���¸���Ʈ = new Bank[100];
public static void main(String[] args) {
	
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
		������Ʈ�ѷ� ��Ʈ�ѷ� = new ������Ʈ�ѷ�();
		Boolean result = ��Ʈ�ѷ�.����(pw, name, bnum);
				
		if(result) {System.out.println("** ���� ���� **");}
		else {System.out.println("�ý��� ����");}
	}
	else if(select == 2) {
		System.out.println("+++ �Ա� ������ +++");
	}
	else if(select == 3) {
		System.out.println("+++ ��� ������ +++");
	}
	else if(select == 4) {
		System.out.println("+++ ������ü ������ +++");
	}
	else if(select == 5) {
		System.out.println("+++ ���¸�� ������ +++");
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
