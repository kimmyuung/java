package ����;

import java.util.Scanner;

public class ȸ�����湮��_1
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
		String[][] memberlist = new String[100][3];
		String[][] boardlist = new String[100][3];
		boolean save = true;
		
		while(true) { // w1 s
			System.out.println("[1. ȸ������ 2. �α��� ]");
			int ch = sc.nextInt();
			if(ch==1) {
				System.out.println("ȸ�������� �����մϴ�.");
				System.out.println("Id : "); String id = sc.next();
				System.out.println("pw : "); String pw = sc.next();
				System.out.println("name : "); String name = sc.next();
				
				for(int i = 0; i < memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						System.out.println("���̵� �ߺ��˴ϴ�. �ٽ� �Է����ּ���");
						save = false;
						break;
					}
				}
				for(int i = 0; i < memberlist.length; i++) {
					if(memberlist[i][0] == null) {
						memberlist[i][0] = id;
						memberlist[i][1] = pw;
						memberlist[i][2] = name;
						System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
						break;
					}
				}
			}
			else if(ch==2) {
				System.out.println("�α��� ������");
				System.out.println("id : "); String id = sc.next();
				System.out.println("pw : "); String pw = sc.next();
				boolean logincheck = false;
				for(int i = 0; i < memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw))
					{
						System.out.println("�α��� �����ϼ̽��ϴ�.");
						logincheck = true;
						while(true) {
						System.out.println("[1. �湮�� ����� 2. �α׾ƿ�]");
						int ch1 = sc.nextInt();
						if(ch1 == 1) {
							System.out.println("�湮�� ����� ������ : ");
							System.out.println(" title : ");	String title = sc.next();
							System.out.println(" context : ");  String context = sc.next();
							for(int j = 0; j<boardlist.length; j++) {
								if(boardlist[j][0] == null) {
									boardlist[j][0] = title;
									boardlist[j][1] = context;
									boardlist[j][2] = id;
									System.out.println("�湮�� ����� ����");break;
								}
							}
							for(int j = 0; j<boardlist.length; j++) {
								if(boardlist[j][0] != null)
								System.out.printf("\n %d \t %s \t %s \t %s", j, boardlist[j][0], boardlist[j][1], boardlist[j][2]);
								}
							
						}
						else if(ch1 == 2) {System.out.println("�α׾ƿ�"); break;}
						else {System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");}
						}
					}
				}
				if(logincheck == false) {System.out.println("�߸��� ȸ�������� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
			}
			else {System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���.");}
		} // w1 e
	} // me
} // ce
