package Day08_5����;

import java.util.Scanner;
//ȸ���ֿ���: 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
//�����ֿ���:  1.���»��� 2.�Ա� 3.��� 4.��ü 5.���� 6.���¸��
public class Controleer {

	static Money[] moneylist = new Money[100];
	static Member[] memberlist = new Member[100];
	static Borrow[] borrowlist = new Borrow[100];
	static Scanner sc = new Scanner(System.in);
	
	boolean ȸ������ () {
		System.out.println("ȸ������ ������");
		System.out.println("Id : ");			String id = sc.next();	
		System.out.println("Pw : ");			String pw = sc.next();
		System.out.println("Name : ");			String name = sc.next();
		System.out.println("Phonenumber : ");	String number = sc.next();
		int i = 0;
		boolean pass = false;
		for(Member temp : memberlist) {
			if(temp != null && memberlist[i].getId().equals(id)) {
				System.out.println("���̵� �ߺ��˴ϴ�. �ٽ� �Է����ּ���");
				pass = true;
			}
		}
		if(pass == false) {
		for(Member temp : memberlist) {
			if(temp == null) {
				Member member = new Member(id, pw, name, number);
				memberlist[i] = member;
				return true;
					}
			i++;}	
			}
	return false;}
	boolean �α��� () {
		System.out.println("�α��� ������");
		System.out.println("Id : ");			String id = sc.next();	
		System.out.println("Pw : ");			String pw = sc.next();
		int i = 0;
		for(Member temp : memberlist) {
			if(temp != null && memberlist[i].getId().equals(id) && memberlist[i].getPw().equals(pw)) 
			{
				 return true;
			}
			i++;}
		return false;
	}
	boolean ���̵�ã�� () {
		System.out.println("���̵� ã�� ������");
		System.out.println("Name : ");			String name = sc.next();
		System.out.println("Phonenumber : ");	String number = sc.next();
		int i = 0;
		for(Member temp : memberlist) {
			if(temp != null && memberlist[i].getName().equals(name) && memberlist[i].getPhone().equals(number)) 
			{
				return true;
			}
			i++;}
		return false;
	}
	boolean ��й�ȣã�� () {
		System.out.println("��й�ȣ ã�� ������");
		System.out.println("Id : ");	        String id = sc.next();
		System.out.println("Name : ");			String name = sc.next();
		System.out.println("Phonenumber : ");	String number = sc.next();
		int i = 0;
		for(Member temp : memberlist) {
			if(temp != null && memberlist[i].getName().equals(name) && 
					memberlist[i].getPhone().equals(number) && memberlist[i].getId().equals(id) )
			{
				return true;
			}
		i++;}
		return false;
	}
	boolean ���»��� () {
		System.out.println("���»��� ������");
		System.out.println("�����̸� : ");			String id = sc.next();
		System.out.println("���º�й�ȣ : ");		String pw = sc.next();
		int i = 0;
		for(Money temp : moneylist) {
			if(moneylist[i] == null) {
				Money money = new Money(id, pw, 0);
				moneylist[i] = money;
				return true;
			}
		i++;}
	return false;}
	boolean �Ա� (int money) {
		int i = 0;
		for(Money temp : moneylist) {
			if(moneylist[i] == null) {
				moneylist[i].setMoney(money); 
				return true;
			}
		i++;}
		return false;
	}
	boolean ��� (int money) {
		int i = 0;
		for(Money temp : moneylist) {
			if(moneylist[i] != null && moneylist[i].getMoney() >= money) {
				moneylist[i].setMoney(moneylist[i].getMoney() - money); 
				return true;
			}
		i++;}
		return false;
	}
	boolean ��ü (String name, String pw, int money) {
		
		for(int i = 0; i < moneylist.length; i++) {
			for(int j = 0; j < moneylist.length; j++) {
				if(moneylist[i] != null && moneylist[j] != null && moneylist[j].getAccount().equals(name) 
						&& moneylist[i].getPw().equals(pw)) {
					moneylist[i].setMoney(moneylist[i].getMoney() - money);
					moneylist[j].setMoney(moneylist[j].getMoney() + money);
					return true;
				}
			}
		}
		return false;
	}
	public boolean ���� (int money) {
		int i = 0;
		for(Money temp : moneylist) {
			if(moneylist[i] == null) {
				moneylist[i].setMoney(moneylist[i].getMoney() + money); 
				return true;
			}
		i++;}
		return false;
	}
	void ���¸�� () {
		System.out.println("���¸���� ����մϴ�.");
		int i = 0;
		for(Money temp : moneylist) {
			if(moneylist[i] != null) {
				System.out.printf("���� : %s \t  �ܾ� : %d", moneylist[i].account, moneylist[i].getMoney());
				break;
			}
		i++;}
	}
	
	
}
