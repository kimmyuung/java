package Day08;

public class Borrow {
	String �����̸�;
	int �ݾ�;
	int ����;
	String bid;
	Borrow () {}
	public Borrow(String �����̸�, int �ݾ�, int ����, String bid) {
		this.�����̸� = �����̸�;
		this.�ݾ� = �ݾ�;
		this.���� = ����;
		this.bid = bid;
	}


	void ���� () { // ����Ŭ���� = ����Ŭ���� 
		// 1. �����̸� 2. �ݾ� 3. ���� 4. �������̵�
		// 1. ���¹�ȣ�� �Է¹޴´�.
		// 2. ���ϴ� ��ŭ ������ �޴´�.
		// 3. �ݾװ� ���ڸ� ���ļ� �󸶸� ���ƾ� �ϴ��� ����Ѵ�.
		// 4. �������̵�� ȸ������ �ϸ� �ɵ�??
		Borrow borrow = new Borrow(�����̸�, �ݾ�, ����, bid);
		System.out.println("���� ��ǰ�� �������ּ���");
		System.out.println("1. �Ϲ� ���� 2. ���� ����");
		System.out.println("�Ϲݴ����� ������ 2%, ���� ������ 5%�Դϴ�.");
		int select = Day08_5.scanner.nextInt();
		if(select ==1) {
			System.out.println("������ ���ϴ� �ݾ��� �Է��ϼ���"); borrow.�ݾ� = Day08_5.scanner.nextInt();
			borrow.���� = 2;
			System.out.println("���� ���� :" + borrow.�ݾ�);
			System.out.println("���� ���� :" + borrow.����);
			int ��ȯ = borrow.�ݾ� + (borrow.�ݾ� * borrow.���� / 100);
			System.out.printf("\n�� ��ȯ�ؾ��ϴ� �ݾ� : %d ", ��ȯ );
			System.out.println("���¿� ���� �Ա��մϴ�.");
			int i = 0;
			for(Money temp : Day08_5.account) {
			Day08_5.account[i].�� = Day08_5.account[i].�� + borrow.�ݾ�;
			i++;}
		}
		else if(select ==2) {
			System.out.println("������ ���ϴ� �ݾ��� �Է��ϼ���"); borrow.�ݾ� = Day08_5.scanner.nextInt();
			borrow.���� = 5; 
			System.out.println("���� ���� :" + borrow.�ݾ�);
			System.out.println("���� ���� :" + borrow.����);
			int ��ȯ = borrow.�ݾ� + (borrow.�ݾ� * borrow.���� / 100);
			System.out.printf("\n�� ��ȯ�ؾ��ϴ� �ݾ� : %d ", ��ȯ );
			System.out.println("���¿� ���� �Ա��մϴ�.");
			int i = 0;
			for(Money temp : Day08_5.account) {
				Day08_5.account[i].�� += Day08_5.account[i].�� + borrow.�ݾ�;
				i++;}
		}
		else {System.out.println("�˸�)) �߸��� �����Դϴ�.");}
		
	}
}
