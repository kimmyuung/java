package ����;

import java.util.Scanner;

public class ȸ�����湮��_2
{
//	ȸ���� �湮�� ���α׷�
		// 1. �ʱ�޴� [ 1. ȸ������ 2. �α��� ]
		// -> 1. ȸ������ ���� -> [ ���̵�, ��й�ȣ, �̸�] �Է� ����
		// -> 2. �α��� [���̵�, ��й�ȣ �����ϸ� �α���ó�� ] -> �ƴϸ� �ٽ�
		// 3. �α��ν� �޴� [1. �湮�� ����, 2. �α׾ƿ�]
			// 3-1. �湮�Ͼ��� [ ����, ����, �ۼ���(�α��εȾ��̵�)]
			// 3-2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
	public static void main(String[] args)
	{ // ms
		Scanner sc = new Scanner(System.in);
		String[][] members = new String [100][3];
		String[][] boards = new String[100][3];
		boolean save = true;
		
		while(true) {
			System.out.println("�湮�� ����� ���α׷�");
			System.out.println("[1. ȸ������ 2. �α��� 3. �α׾ƿ�]"); int ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("ȸ�������� ȯ���մϴ�.");
				System.out.println("Id : "); String id = sc.next();
				System.out.println("Pw : "); String pw = sc.next();
				System.out.println("name : "); String name = sc.next();
				for(int i = 0 ; i < members.length; i ++) {
					if(members[i][0] != null && members[i][0].equals(id)) {
						System.out.println("���̵� �ߺ��˴ϴ�. �ٽ� ���̵� �Է����ּ���");
						save= false; break;
					}
				}
				for(int i = 0; i < members.length; i++) {
					if(members[i][0] == null) {
						members[i][0] = id;
						members[i][1] = pw;
						members[i][2] = name;
						System.out.println("ȸ�������� ȯ���մϴ�.");
						save = true; break;
					}
				}
			}
			else if(ch == 2) {
				System.out.println("�α��� ������");
				System.out.println("Id : "); String id = sc.next();
				System.out.println("pw : "); String pw = sc.next();
				boolean logincheck = false;
				for(int i = 0; i < members.length; i++) {
					if(members[i][0] != null && members[i][0].equals(id) && members[i][1].equals(pw)) {
						System.out.println("�α��� ����");
						logincheck = true;
						while(true) {
						System.out.println("[1. �湮�� ����� 2. �α׾ƿ� ]"); int ch1 = sc.nextInt();
						if(ch1 == 1) {
							System.out.println("�湮�� ����� �������Դϴ�.");
							
							System.out.println("�湮���� ���� : "); String title = sc.next();
							System.out.println("�湮���� ���� : "); String context = sc.next();
							for(int j = 0; j < boards.length; j++) {
								if(boards[j][0] == null) {
									boards[j][0] = title;
									boards[j][1] = context;
									boards[j][2] = id;
									System.out.println("�湮�� �ۼ��� �Ϸ�Ǿ����ϴ�.");
									break;
								}
								if(boards[j][0] != null) {System.out.printf("\n%d \t %s \t %s", j, boards[j][0], boards[j][1], boards[j][2]);}
							}
							
						}
						else if (ch1 == 2) {System.out.println("�α׾ƿ�"); break;}
						else {System.out.println("��ϵ��� ���� �����Դϴ�. �ٽ� �Է����ּ���");}
						}
					}
				}
			if(logincheck == false) {System.out.println("��ϵ� ȸ�������� �����ϴ�. �ٽ� �Է����ּ���.");}
			}
			else if(ch == 3) {System.out.println("����"); break;}
			else {System.out.println("�� �� ���� �����Դϴ�. �ٽ� �Է����ּ���.");}
			
		} // w1 e
	} // me
} // ce
