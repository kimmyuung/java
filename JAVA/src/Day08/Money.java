package Day08;

import java.util.Random;

public class Money {
	// 1. �ʵ�
	int ���¹�ȣ; // 
	String �����̸� = "����";
	String ��������; // �Է¹޾ƾߵ�
	String �����̸�; // ȸ�������� name
	int ��;
	// 2. ������ : 
	Money(int ���¹�ȣ, String �����̸�, String ��������, String �����̸�, int ��) 
	{
		this.���¹�ȣ = ���¹�ȣ;
		this.�����̸� = �����̸�;
		this.�������� = ��������;
		this.�����̸� = �����̸�;
		this.�� = ��;
	}
	Money() {}
	// 3. �޼ҵ� : ���� ����, �Ա�, ���, ��ü, ����
	void ���»��� () {
		
		System.out.println("���� ������ �����մϴ�");
		System.out.println("����� ���� : 1  ���� ���� : 2");
		Money money = new Money(���¹�ȣ, �����̸�, ��������, �����̸�, ��);
		int select1 = Day08_5.scanner.nextInt();
		if(select1 == 1) {
			System.out.println("����� ���¸� �����մϴ�.");
			System.out.println("���������� �Է����ּ���");
			//String ��������1 = scanner.next();
			int  i =0;
			for(Money temp : Day08_5.account) {
				if(temp==null) {
					System.err.println("���°��� �Ϸ�");
					Day08_5.account[i]= money;	
					return;
				}
				i++;
			}
			System.out.println("���»��� �Ϸ�");
			System.out.printf("\n���¹�ȣ  : %d", money.���¹�ȣ);	
		if(select1 == 2) {
			System.out.println("���¸� �����մϴ�.");
			System.out.println("���������� �Է����ּ���");
			String ��������2 = Day08_5.scanner.next();
			for(Money temp : Day08_5.account) {
				if(temp==null) {
					System.err.println("���°��� �Ϸ�");
					Day08_5.account[i]= money;
					return;
				}
				i++;
				}
			}
		}
		System.out.println("���»��� �Ϸ�");
		System.out.printf("\n���¹�ȣ  : %d", money.���¹�ȣ);
		
	}
	void �Ա� () {
		System.out.println("�Ա��� �����մϴ�");
		int income = Day08_5.scanner.nextInt();
		System.out.println("��й�ȣ�� �Է����ּ���");
		String pw = Day08_5.scanner.next();
		for(Member temp : Day08_5.members) {
			if(temp!=null && temp.password.equals(pw)) {
				System.out.println("��й�ȣ�� ��ġ�մϴ�.");
				for(Money i : Day08_5.account) {
					if(temp!=null) {
					System.out.println("�ԱݵǾ����ϴ�." + income);
					 i.�� += income;
					return;}
				}
			}
			else {System.out.println("��й�ȣ ����");}
		}
	}
	void ��� () {
		System.out.println("����� �����մϴ�");
		int outcome = Day08_5.scanner.nextInt();
		System.out.println("��й�ȣ�� �Է����ּ���");
		String pw = Day08_5.scanner.next();
		for(Member temp : Day08_5.members) {
			if(temp!=null && temp.password.equals(pw)) {
				System.out.println("��й�ȣ�� ��ġ�մϴ�.");
				for(Money temp2 : Day08_5.account) {
					System.out.println("��ݵǾ����ϴ�." + outcome);
					outcome -= temp2.��;
					break;}
			}
			else {System.out.println("��й�ȣ ����");}
		}
	}
	void ���� () {
		
	}
	
}
