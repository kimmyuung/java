package Day08;

import java.util.Random;

public class Money {
	// 1. �ʵ�
	int ���¹�ȣ; // 
	String �����̸� = "����";
	String ��������; // �Է¹޾ƾߵ�
	String �����̸�; // ȸ�������� name
	int ��;
	String ���º��;
	// 2. ������ : 
	Money(int ���¹�ȣ, String �����̸�, String ��������, String �����̸�, int ��, String ���º��) 
	{
		this.���¹�ȣ = ���¹�ȣ;
		this.�����̸� = �����̸�;
		this.�������� = ��������;
		this.�����̸� = �����̸�;
		this.�� = ��;
		this.���º�� = ���º��;
	}
	Money() {}
	// 3. �޼ҵ� : ���� ����, �Ա�, ���, ��ü, ����
	void ���»��� () {
		
		System.out.println("���� ������ �����մϴ�");
		System.out.println("����� ���� : 1  ���� ���� : 2");
		Money money = new Money(���¹�ȣ, �����̸�, ��������, �����̸�, ��, ���º��);
		int select1 = Day08_5.scanner.nextInt();
		if(select1 == 1) {
			System.out.println("����� ���¸� �����մϴ�.");
			int  i =0;
			for(Money temp : Day08_5.account) {
				if(temp==null) {
					System.err.println("���°��� �Ϸ�");
					System.out.println("���� ��й�ȣ ����"); String pw = Day08_5.scanner.next();
					Day08_5.account[i]= money;	money.���º�� = pw; 	
					System.out.println("���� ȸ������ ���� ���� : " + money.���¹�ȣ);
					System.out.println("���� ȸ������ ���� ��й�ȣ : " + money.���º��);
					return;
				}
				i++;
			}
			System.out.println("���»��� �Ϸ�");
			System.out.printf("\n���¹�ȣ  : %d", Day08_5.account[i].���¹�ȣ);	
		if(select1 == 2) {
			System.out.println("���¸� �����մϴ�.");
			System.out.println("���������� �Է����ּ���");
			for(Money temp : Day08_5.account) {
				if(temp==null) {
					System.err.println("���°��� �Ϸ�");
					System.out.println("���� ��й�ȣ ����"); String pw = Day08_5.scanner.next();
					Day08_5.account[i]= money; money.���º�� = pw; 
					System.out.println("���� ȸ������ ���� ���� : " + money.���¹�ȣ);
					System.out.println("���� ȸ������ ���� ��й�ȣ : " + money.���º��);
					return;
				}
				i++;
				}
			
			}
		}
		System.out.println("���»��� �Ϸ�");
		System.out.printf("\n���¹�ȣ  : %d", money.���¹�ȣ);
		return;
	}
	void �Ա� () {
		boolean pwcheck = false;
		System.out.println("�Ա��� �����մϴ�");
		int income = Day08_5.scanner.nextInt();
		System.out.println("��й�ȣ�� �Է����ּ���");
		String pw = Day08_5.scanner.next();
		int i = 0;
		// �ε���
		for(Money temp : Day08_5.account) {
			if(temp !=null && temp.���º��.equals(pw)) {
				System.out.println("��й�ȣ�� ��ġ�մϴ�.");
			
			System.out.println("�ԱݵǾ����ϴ�." + income);
					Day08_5.account[i].�� += income;
					 return;
					 
		}	
			
			else {System.out.println("��й�ȣ ����");}
			i++;
		}
	}
	void ��� () {
		boolean pwcheck = false;
		System.out.println("����� �ݾ��� �Է��մϴ�");
		int outcome = Day08_5.scanner.nextInt();
		System.out.println("��й�ȣ�� �Է����ּ���");
		int pw = Day08_5.scanner.nextInt();
		int i = 0;
		// �ε���
		for(Money temp : Day08_5.account) {
			if(temp !=null && temp.���º��.equals(pw)) {
			System.out.println("��й�ȣ�� ��ġ�մϴ�.");
			if(temp != null && Day08_5.account[i].�� > outcome) 
			{
			System.out.println("��ݵǾ����ϴ�." + outcome);
				Day08_5.account[i].�� -= outcome;
				 return; }
			else {System.out.println("�ܾ��� �����մϴ�");}
					 
		}	
			
			else {System.out.println("��й�ȣ ����");}
			i++;
		}
	}
	void ��ü (){
		// 1. ���¹�ȣ�� �Է¹޴´� . ���¹�ȣ�� account�� �ִ�.
		// 2. ��ü�� �ݾ��� �Է��Ѵ�. 
		// 3. ��ü�� ���¸� �Է��Ѵ�. + (��й�ȣ Ȯ��)
		// 4. ��й�ȣ Ȯ�� �� �ݾ��� ��ü�Ѵ�.
		int index = 0;
		System.out.println("���¹�ȣ�� �Է��ϼ���."); int bnum = Day08_5.scanner.nextInt();
		System.out.println("��ü�� �ݾ��� �Է��ϼ���"); int money = Day08_5.scanner.nextInt();
		System.out.println("��ü�� ���¸� �Է��ϼ���"); int bid = Day08_5.scanner.nextInt();
		System.out.println("���� ��й�ȣ�� �Է��ϼ���"); String pw = Day08_5.scanner.next();
		for(Money temp : Day08_5.account) {
			if(temp !=null && temp.���º��.equals("pw")) {
				System.out.println("��й�ȣ�� ��ġ�մϴ�.");
			}
		for(Money temp2 : Day08_5.account) { // ������ ���¹�ȣ�� �����ϴ��� Ȯ��
			if( temp2 != null && Day08_5.account[index].���¹�ȣ == bnum) { // ���¹�ȣ�� �����ϸ�
				System.out.println("������ü�� �Ϸ�Ǿ����ϴ�.");
				Day08_5.account[bnum].�� =  Day08_5.account[index].�� + money;
			}
			
		}
		index++;
	}
	
}}
