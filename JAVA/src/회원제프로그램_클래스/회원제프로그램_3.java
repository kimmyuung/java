package ȸ�������α׷�_Ŭ����;

import java.util.Scanner;

public class ȸ�������α׷�_3 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	Member[] memberlist = new Member[100];
	
	while(true) {
	System.out.println("ȸ�������α׷�");
	System.out.println("1. ȸ������ 2. �α��� 3. ���̵� ã�� 4. ��й�ȣ ã��");
	System.out.println("���� :    "); int ch = sc.nextInt();
	
	if(ch==1) {
		System.out.println("ȸ������ ������");
		System.out.println(" id : ");	String id = sc.next();
		System.out.println(" pw : "); 	String pw = sc.next();
		System.out.println(" name : "); String name = sc.next();
		System.out.println("phone : "); String number = sc.next();
		boolean pass = false;
		int i = 0;
		for(Member temp : memberlist) {
			if(temp != null && temp.getId().equals(id)) {
				System.out.println("���̵� �ߺ��˴ϴ�.");
				pass = true;
				break;
			}
		}
		if(pass = false) {
		for(Member temp : memberlist) {
			if(temp == null) {
			Member member = new Member(id, pw, name, number);
			memberlist[i] = member;
			System.out.println("ȸ������ �Ϸ�");
			break;
			}
		i++;}
		}
	}
	else if(ch==2) {
		System.out.println("�α��� ������");
		System.out.println(" id : ");	String id = sc.next();
		System.out.println(" pw : "); 	String pw = sc.next();
		boolean logincheck = false;
		for(Member temp : memberlist) {
			if(temp != null && temp.getId().equals(id) && temp.getPw().equals(pw)) {
				System.out.println("�α��� ����!!");
				logincheck = true; break;
			}
		}
		
	}
	else if(ch==3) {
		System.out.println("���̵� ã�� ������ ");
		System.out.println(" name : ");	String name = sc.next();
		System.out.println(" phonenumber : "); 	String phone = sc.next();
		for(Member temp : memberlist) {
			if(temp != null && temp.getName().equals(name) && temp.getPhone().equals(phone)) {
				System.out.println("���̵� ã�� ����!!");
				System.out.println("���̵� : " + temp.getId()); break;
			}
		}
	}
	else if(ch==4) {
		System.out.println("��й�ȣ ã�� ������ ");
		System.out.println(" name : ");	String name = sc.next();
		System.out.println(" phonenumber : "); 	String phone = sc.next();
		for(Member temp : memberlist) {
			if(temp != null && temp.getName().equals(name) && temp.getPhone().equals(phone)) {
				System.out.println("��й�ȣ ã�� ����!!");
				System.out.println("��й�ȣ : " + temp.getPw()); break;
			}
		}
	}
	else {System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
	
	}
}
}
