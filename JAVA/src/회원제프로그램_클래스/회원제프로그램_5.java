package ȸ�������α׷�_Ŭ����;

import java.util.Scanner;

public class ȸ�������α׷�_5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Member[] memberlist = new Member[100];
	
	while(true) {
	System.out.println("ȸ�������α׷�");
	System.out.println("[[1. ȸ������ 2. �α��� 3. ���̵� ã�� 4. ��й�ȣã��]]");
	System.out.println("�Է� : >>>>>"); int select = sc.nextInt();
	
	if(select == 1) {
		System.out.println("ȸ������ ������");
		System.out.println("Id : "); String id = sc.next();
		System.out.println("pw : "); String pw = sc.next();
		System.out.println("name : "); String name = sc.next();
		System.out.println("phone number : "); String phone = sc.next();
		boolean pass = false;
		int i = 0;
		for(Member temp : memberlist) {
			if(temp != null && temp.getId().equals(id)) {
				System.out.println("���̵� �ߺ��˴ϴ�.");
				pass = true;
				break;
			}
		}
 		if(pass == false) {
		for(Member temp : memberlist) {
			if(temp == null) {
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
				Member member = new Member(id, pw, name, phone);
				pass = true;
				memberlist[i] = member;
				break;
			}
		i++;	
		} }
	}
	else if (select == 2) {
		System.out.println("�α��� ������");
		System.out.println(" Id : "); String id = sc.next();
		System.out.println(" pw : "); String pw = sc.next();
		boolean logincheck = false;
		for(Member temp : memberlist) {
			if(temp != null && temp.getId().equals(id) && temp.getPw().equals(pw)) {
				System.out.println("�α��εǾ����ϴ�.");
				logincheck = true;
				break;
			}
		}
		if(logincheck == false) {System.out.println("ȸ�������� �߸��Է��ϼ̴ϴ�. �ٽ� �Է����ּ���");}
	}
	else if (select == 3) {
		System.out.println("���̵� ã�� ������");
		System.out.println(" name : ");			String name = sc.next();
		System.out.println(" phone number : "); String number = sc.next();
		boolean idcheck = false;
		for(Member temp : memberlist) {
			if(temp != null && temp.getName().equals(name) && temp.getPhone().equals(number)) {
				System.out.println("���̵� ã�ҽ��ϴ�.");
				System.out.println("���̵� : " + temp.getId());
				idcheck = true;
				break;
			}
		}
		if(idcheck == false) {System.out.println("ã���� ȸ�������� ���� ȸ���� �����ϴ�.");}
	}
	else if (select == 4) {
		System.out.println("��й�ȣ ã�� ������");
		System.out.println(" name : ");			String name = sc.next();
		System.out.println(" id : "); 			String id = sc.next();
		System.out.println(" phone : ");	    String phone = sc.next();
		boolean passcheck = false;
		for(Member temp : memberlist) {
			if(temp != null && temp.getName().equals(name) && temp.getId().equals(id) && temp.getPhone().equals(phone)) {
				System.out.println("��й�ȣ�� ã�ҽ��ϴ�.");
				System.out.println("��й�ȣ : " + temp.getPw());
				passcheck = true;
				break;
			}
		}
		if(passcheck == false) {System.out.println("ã���� ȸ�������� ���� ȸ���� �����ϴ�.");}
	}
	else {System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
	
	}
}
}
