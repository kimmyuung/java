package ����;

import java.util.Scanner;

public class �����뿩���α׷�
{
	// ���� �뿩 ���α׷�
	// 1. �迭 ����
	// 1-1. ȸ��[���̵�(�ߺ� X), ��й�ȣ]
	// 1-2. ����[������(�ߺ� X), �����뿩����]
	// 2. �ʱ�޴�
	// 2-1. ȸ������ // 2-2. �α���
	// 2-3. ȸ�����Խ� �ߺ�üũ
	// 3. �α��ν� �޴�
	// 3-1. �����˻� // 3-2. ������� // 3. �����뿩 // 4. �����ݳ� // 5. �α׾ƿ�
	// + �����˻��� �������� ��ġ�ϸ� ������� �����뿩���� ���
	// + ���� ��Ͻ� ��� ������ ���
	// + �����뿩�� �����뿩���ΰ� �����Ҷ� �����뿩 ó��
	// + �����ݳ��� ������ �뿩�� ������ �ݳ� ó��
	// + �α׾ƿ�
	// �α��ν� ���̵� admin�̸� �����ڸ޴�
	// 1. ���� ��� 2. ���� �޴� 3. ��������(����) 4. �α׾ƿ�
	// + ���� ��Ͻ� ������ �Է¹޾� ���� ���ó��
	// + ���� ��Ͻ� ��� ������ ��� // ���������� ������ ������ �Է¹޾� ������ ������ ����(NULL)
	// �α׾ƿ��� �ʱ�޴���
	public static void main(String[] args)
	{
		String[][] memberlist = new String[100][2];
		String[][] booklist = new String[100][2];
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("���� �뿩 ���α׷�");
			System.out.println("1. ȸ�� ���� 2. �α��� 3. �α׾ƿ�");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("ȸ�� ���� ������");
				System.out.println("���̵� : ");     String id = sc.next();
				System.out.println("��й�ȣ : ");   String pw = sc.next();
				boolean idcheck = false;
				for(int i = 0; i < memberlist.length; i++) {
					if(memberlist[i][0] == null && memberlist[i][1] == null) {
						System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
						memberlist[i][0] = id;
						memberlist[i][1] = pw;
						idcheck = true;
						break; }
				for(int j = 0; j < memberlist.length; j++) {
					if(memberlist[j][0] != null && memberlist[j][0].equals(id)) {
						System.err.println("���̵� �ߺ��˴ϴ�. �ٽ� �Է����ּ���.");
						idcheck = false;
						break;
						}
					}
				}
			}
			else if(select == 2) { // else if 2 s
				System.out.println("�α��� �������Դϴ�.");
				System.out.println("���̵� �Է����ּ���");			String id = sc.next();
				System.out.println("��й�ȣ�� �Է����ּ���");	 	String pw = sc.next();
				boolean logincheck = false;
				while(true) {// w2 s
				for(int i = 0; i < memberlist.length; i++) { // for1 s
					if(memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw) ) { // if 1 s
						System.out.println("�α����� �����߽��ϴ�.");
						logincheck = true;
					
					if(logincheck && memberlist[i][0].equals("admin") && memberlist[i][1].equals(pw)) {
						
						System.out.println("������ ���� �α����մϴ�.");
						System.out.println("1. ���� ��� 2. ���� �޴� 3. ��������(����) 4. �α׾ƿ�");
						int select1 = sc.nextInt();
						boolean titlecheck = false;
						if (select1 == 1) {
							System.out.println("������ ����մϴ�.");
							System.out.println("������ ������ �Է����ּ���");  String title = sc.next();
							for(int j = 0; j<booklist.length; j++) {
								if(booklist[j][0] == null) {
								System.out.println("��������� �Ϸ�Ǿ����ϴ�."); 
								booklist[j][0] = title;		booklist[j][1] = "�뿩 ����"; titlecheck = true; break;}
								for(int x = 0; x<booklist.length; x++) {
									if(booklist[j][0] != null && booklist[j][0].equals(title)) {
										System.out.println("������ ������ �ߺ��˴ϴ�. �ٽ� �Է����ּ���");
										titlecheck = false; break;
									}	
								}
							}
						}
						else if (select1 == 2) {
							for(int j = 0; j < booklist.length; j++) {
								if(booklist[j][0] != null) 
									{System.out.println("��������� ����մϴ�."); System.out.print(booklist[j][0] + "\n"); break;}
							}
						}
						else if(select1 == 3) { // ���� ����
							System.out.println("������ �����մϴ�.");
							System.out.println("������ ������ ������ �Է����ּ���"); String title = sc.next();
							for(int j = 0; j<booklist.length; j++) {
								if(booklist[j][0] != null && booklist[j][0].equals(title) && booklist[j][1].equals("�뿩 ����")) 
								{
									System.out.println("������ �����մϴ�.");
									booklist[j][0] = null; 		booklist[j][1] = null; 
									booklist[j-1][0] = null;	booklist[j-1][1] = null;		break;
								}
								else System.out.println("�����Ͻ� ������ �����ϴ�"); break;
								
							}
						}	
						else if(select1 == 4) {System.out.println("�α׾ƿ�!!"); break;}
					}	 
					else if (logincheck) {
						
						System.out.println("ȸ�� �α���");
						System.out.println("1. �����˻� // 2. ������� // 3. �����뿩 // 4. �����ݳ� // 5. �α׾ƿ�");
						int select1 = sc.nextInt();
						if(select1 == 1) {
							System.out.println("������ �˻��մϴ�.");
							System.out.println("�˻��� ������ ������ �Է����ּ���"); String title = sc.next();
							for(int j = 0; j<booklist.length; j++) {
								if(booklist[j][0] != null && booklist[j][0].equals(title)) {
									System.out.println("�˻��� ������ ������ ã�ҽ��ϴ�.");
									System.out.println(title); break;
								}
								else System.out.println("�˻��Ͻ� ������ �����ϴ�"); break;
							}
						}
						else if(select1 == 2) {
							for(int j = 0; j < booklist.length; j++) {
								if(booklist[j][0] != null) System.out.println("��������� ����մϴ�."); System.out.print(booklist[j][0] + "\t");
							}
						}
						else if(select1 == 3) {
							System.out.println("������ �뿩�մϴ�.");
							System.out.println("�뿩�Ͻ� ������ �̸��� �Է��ϼ���."); String title = sc.next();
							for(int j = 0; j<booklist.length; j++) {
								if(booklist[j][0] != null && booklist[j][0].equals(title) && booklist[j][1].equals("�뿩 ����")) {
									System.out.println("���� �뿩�� �Ϸ�Ǿ����ϴ�.");
									booklist[j][1] = "�뿩 ��"; break;
								}
							}
						}
						else if(select1 == 4) {
							System.out.println("������ �ݳ��մϴ�.");
							System.out.println("�ݳ��Ͻ� ������ �̸��� �Է��ϼ���."); String title = sc.next();
							for(int j = 0; j<booklist.length; j++) {
								if(booklist[j][0] != null && booklist[j][0].equals(title) && booklist[j][1].equals("�뿩 ��")) {
									System.out.println("���� �ݳ��� �Ϸ�Ǿ����ϴ�."); booklist[j][1] = "�뿩 ����"; break;
								}
							}
						}
						else if(select1 == 5) {System.out.println("�α׾ƿ�!"); break;}
						else {System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");}
								} 
									
					else {System.out.println("�α��� ���� �ٽ� �Է����ּ���");}
						} // if1 e
					} // for1 e
				} // w2 e
			} // else if 2 e
			
			
			else if(select == 3) {
				System.out.println("�α׾ƿ� �Ǽ̽��ϴ�."); break;
			}
			else {System.out.println("�߸��Է��ϼ̽��ϴ�.");}
			
		} // w1 e
	} // me
}
// ce
