package ȸ�������α׷�_Ŭ����;

import java.util.Scanner;

public class ȸ�������α׷�_1 {
	// ȸ���� ���α׷�[Ŭ����]
				// 1. �ʱ�޴� [1. ȸ������ 2. �α��� 3. ���̵� ã�� 4. ��й�ȣ ã��]
				// 1-1. ȸ�����Խ� ���̵�, ��й�ȣ, �̸� �Է¹޾� ����
				// 2. �α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α���ó��
				// 3. ���̵� ã�� => �̸��� ��ȭ��ȣ�� �����ϸ� ���̵� ���
				// 4. ��й�ȣ ã�� => ���̵� + ��ȭ��ȣ�� �����ϸ� ��й�ȣ ���
			
			// �غ� 
			// 0. ȸ�� ���� => ȸ�� Ŭ���� �����
				// 1. �ʵ� -> �ϴ� �̰͸� ���(���̵�, ���, �̸�, ��ȭ��ȣ)
				// 2. ������
				// 3. �޼ҵ�0
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Member[] memberlist = new Member[100];
		
		while(true) {
		System.out.println("ȸ���� ���α׷�");
		System.out.println("[[1. ȸ������ 2. �α��� 3. ���̵� ã�� 4. ��й�ȣ ã�� ]]");
		int select = sc.nextInt();
		if(select == 1) {
			System.out.println("ȸ������ ������");
			System.out.println("Id : "); String id = sc.next();
			System.out.println("pw : "); String pw = sc.next();
			System.out.println("name : "); String name = sc.next();
			System.out.println("phonenumber : "); String number = sc.next();
			int i = 0;
			boolean pass = false;
			Member member = new Member(id, pw, name, number);
			
			for (Member temp : memberlist) {
				if(temp != null && temp.getId().equals(id)) {
					System.out.println("���̵� �ߺ��˴ϴ�. �ٽ� �Է����ּ���.");
					pass = true;
					break;
				}
			}
			for(Member temp : memberlist) {
				if(temp == null) {
					memberlist[i] = member;
					pass = true;
					System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
					break;
					} 
			i++; }
			
			
			if(pass == false) {System.out.println("ȸ�������� �����Ͽ����ϴ�. ó������ �ٽ� ���ּ���");}
		}
		else if(select == 2) {
			System.out.println("�α��� ������");
			System.out.println("Id : "); String id = sc.next();
			System.out.println("pw : "); String pw = sc.next();
			boolean pass = false;
			for (Member temp : memberlist) {
				if(temp != null && temp.getId().equals(id) && temp.getPw().equals(pw)) {
					System.out.println("�α��� ����");
					pass = true;
					break;
				}
			}
			if(pass == false) {System.out.println("�α����� �����Ͽ����ϴ�. �ٽ� �õ����ּ���");}
		}
		else if(select == 3) {
			System.out.println("���̵� ã�� ������");
			System.out.println("name : "); String name = sc.next();
			System.out.println("phone : "); String phone = sc.next();
			boolean pass = false;
			for (Member temp : memberlist) {
				if(temp != null && temp.getName().equals(phone) && temp.getName().equals(name)) {
					System.out.println("���̵� ã�� ����");
					System.out.println(" ���̵� : " + temp.getId());
					pass = true;
					break;
				}
			}
			if(pass == false) {System.out.println("���̵� ã�Ⱑ �����Ͽ����ϴ�. �ٽ� �õ����ּ���");}
		}
		else if(select == 4) {
			System.out.println("��й�ȣ ã�� ������");
			System.out.println("Id : "); String id = sc.next();
			System.out.println("name : "); String name = sc.next();
			System.out.println("phone : "); String phone = sc.next();
			boolean pass = false;
			for (Member temp : memberlist) {
				if(temp != null && temp.getPhone().equals(phone) && temp.getName().equals(name)
						&& temp.getId().equals(id)) {
					System.out.println("��й�ȣ ã�� ����");
					System.out.println(" ��й�ȣ : " + temp.getPw());
					pass = true;
					break;
				}
			}
			if(pass == false) {System.out.println("���̵� ã�Ⱑ �����Ͽ����ϴ�. �ٽ� �õ����ּ���");}
		}
		else {System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
		
		
		}
	}
}
