package Day06;

import java.util.Scanner;

public class Day06_3 { // c  s
	public static void main(String[] args) { // m  s
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
			// 3. �޼ҵ�
		
		// ���� �غ�, �迭�� ���� �����ϴ� ���� : ��� ������ ����ϱ� ������
		Scanner scanner = new Scanner(System.in);
		Member[] memberlist = new Member[100]; // ������ ��ü�� �����ϴ� �迭 ����
		// -> Member Ŭ������ ������� ��ü(id, pw, name, phone) 100�� ������ �� �ִ� �迭 ����
		// ���࿡ Ŭ������ ������쿡�� 2�����迭 ����ؾ���
		// String[][] memberlist = new Member[100][4];
		
		while(true) { // w1 s
		System.out.println("[1. ȸ������ 2. �α��� 3. ���̵� ã�� 4. ��й�ȣ ã��]");
		System.out.println(">>>>>>>>>>>>> ���� : ");
		int select1 = scanner.nextInt();
		
		if(select1 == 1) { // ȸ������ s
			// 1. id, password, name, phone �Է¹ޱ�
			// 2. ��ü ����
			// 3. �Է¹��� ����4���� ��ü�� �ʵ忡 �����ϱ�
			// 4. ������ ��ü�� �����ϴ� �迭 ����
					
			System.out.println("----------ȸ�������� ȯ���մϴ�.---------------");
			System.out.println("1. ���̵� �Է����ּ���");    	String id = scanner.next();
			System.out.println("2. ��й�ȣ�� �Է����ּ���");	   	String pw = scanner.next();	 
			System.out.println("3. �̸��� �Է����ּ���");		String name = scanner.next();
			System.out.println("4. �ڵ��� ��ȣ�� �Է����ּ���");	String phone = scanner.next();
			
			Member member = new Member(); // 2. ��ü ����
			int i = 0;
			
			member.id = id;	// 3. �Է¹��� ���� 4���� ��ü �� �ʵ忡 ����
			member.pw = pw;	
			member.name = name;
			member.phone = phone;
			boolean idcheck = false;	
			// 4. ������ ��ü�� �����ϴ� �迭�� ���� 
			// 4-1. ���� �ε��� ã��[������ �ƴѰ��� �����ϸ� ������ �����͸� �����ϰ� ���ο� �����Ͱ� ����]
			// 4-2. ������ �ε����� ��ü ����
			
			// ���̵� �ߺ�üũ
				// �迭�� ��ü�� �Է��� ���̵�� ������ ���̵� ã��
			for(Member temp : memberlist) { // for2 s
				if(temp != null && temp.id.equals(id)) { // if2 s
					System.out.println("���̵� �ߺ��Ǿ����ϴ�.[���Է�]");
					idcheck = true; // �ߺ��̸� true�� ����
					break;
						} // if2 e
					} // for2 e
			
			// ���̵� �ߺ��� ���� ��� ����
				
			
			if(idcheck == false) { // idcheck == false s
			for(Member temp : memberlist){ // for1 s = for(int i = 0; i < memberlist.length; i++)
				// // memberlist �迭�� member ��ü �ϳ��� �����ͼ� temp ���� �ݺ�
				if(temp == null) { // if1 s
				// 2. ���鿡 �ε����� ��ü ����
				memberlist[i] = member;
				System.out.println("ȸ������ �Ǿ����ϴ�.");
				break; // for ������[�ȳ����� ��� ���鿡 ������ ��ü ����Ǳ� ����]
						} // if1 e
				i++;
					} // for1 e
				} // idcheck == false e
			} // ȸ������ e
		else if(select1 == 2) { // �α��� s
			System.out.println("----------�α��� ������------------");
			System.out.println("1. ���̵� �Է����ּ���");    	String id2 = scanner.next();
			System.out.println("2. ��й�ȣ�� �Է����ּ���");	   	String pw2 = scanner.next();
			boolean logincheck = false;
			
			for(Member temp : memberlist) { // �α��� ������ for s
				if(temp != null && temp.equals(id2) && temp.equals(pw2)) 
					{ // if s
					System.err.println("�˸�)) �α��� ����");
					logincheck = true; 
					} // if e
				} // �α��� ������ for e
			if (logincheck == false) { // �α��� ����
				System.err.println("�˸�)) ������ ȸ�������� �����ϴ�.");
				}
			} // �α��� e
		else if(select1 == 3) { // ���̵� ã��
			// 1. �̸��� ����ó�� �Է¹޴´�
			System.out.println("----------���̵� ã�� ������------------");
			System.out.println("�̸� : ");	String name = scanner.next();
			System.out.println("����ó : "); 	String phone = scanner.next();
			// 2. �迭�� ������ �̸��� ����ó�� �ִ��� Ȯ���Ѵ�.
			boolean findcheck = false;
			for(Member temp : memberlist) { // for3-1 s
				if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {
					System.out.println("�˸�)) ���̵� ã�� ����");
					System.out.println("ȸ�� ID : " + temp.id);
					findcheck = true; // ��� ã��
					break;
					}
			} // for3-1  e
				if(findcheck == false) {
					System.out.println("�˸�)) ������ ȸ�������� �����ϴ�.");
					}	
				
			// 3. ������ ��ü�� ������ �ش� ���̵� ���
			// 4. ������ ���ٰ� ���
			
			}
		else if(select1 == 4) { // ��й�ȣ ã�� 
			System.out.println("----------��й�ȣ ã�� ������------------");
			System.out.println("���̵� : ");	String id = scanner.next();
			System.out.println("�̸� : ");	String name = scanner.next();
			System.out.println("����ó : "); 	String phone = scanner.next();
			boolean pwcheck = false;
			for(Member temp : memberlist) { // for4-1 s
				if(temp != null & temp.id.equals(id) && temp.phone.equals(phone))
					{
					System.out.println("��й�ȣ ã�� ����");
					System.out.println("ȸ�� ��й�ȣ : " + temp.pw);
					pwcheck = true;
					break;
					}	
				} // for4-1 e
			if(pwcheck == false) {
				System.out.println("�˸�)) ������ ȸ�������� �����ϴ�.");
				}	
			} // if4 e
		else {System.out.println("�˸�)) �� �� ���� ��ȣ�Դϴ�. [���Է�]");}
		
		
		
		} // w1 e
	} // m  e
} // c  e
