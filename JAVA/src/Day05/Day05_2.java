package Day05;

import java.util.Scanner;

public class Day05_2 { // c  s
	public static void main(String[] args) { // m  s
	
	//	ȸ���� �湮�� ���α׷�
		// 1. �ʱ�޴� [ 1. ȸ������ 2. �α��� ]
		// -> 1. ȸ������ ���� -> [ ���̵�, ��й�ȣ, �̸�] �Է� ����
		// -> 2. �α��� [���̵�, ��й�ȣ �����ϸ� �α���ó�� ] -> �ƴϸ� �ٽ�
		// 3. �α��ν� �޴� [1. �湮�� ����, 2. �α׾ƿ�]
			// 3-1. �湮�Ͼ��� [ ����, ����, �ۼ���(�α��εȾ��̵�)]
			// 3-2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
	// [�غ�]
		Scanner scanner = new Scanner(System.in);
		String[][] memberlist = new String[100][3]; 
		// ȸ��100��[id,pw,name] �����ϴ� �迭 ���� => ȸ���� 1�� 1�� = id, 2��= pw, 3��= name
		String[][] boardlist = new String[100][3];
		// �湮�� 100�� [title, contexts, writer] �����ϴ� �迭 => �Խù��� 1��
		boolean save = true;
		
		
		while(true) { // w1  s		(�������� : X)
			System.out.println("---------------------------");
			System.out.println("[ 1. ȸ������ 2. �α��� 3. ����]"); 	int select1 = scanner.nextInt();
			System.out.println("---------------------------");
			if (select1 == 1) { // if1 s
				System.out.println("ȸ�������� ȯ���մϴ�");
				System.out.println("�����Ͻ� ���̵� �Է����ּ���"); String id = scanner.next();
				System.out.println("���̵��� ��й�ȣ�� �Է����ּ���"); String pw = scanner.next();
				System.out.println("�̸��� �Է����ּ���"); String name = scanner.next();
				// ���̵�, ��й�ȣ, �̸��� �Է¹��� -> memberlist 2���� �迭�� ����
				// 1. �� ����[ ���� = 0, ��ü(���ڿ�)=null]�� ã�Ƽ� ���� 
				// [ ���࿡ ����� ������ ȸ�� 100���̻��� ��...]
				// 2. ���̵� �ߺ�üũ[�˻�]
				// 2-1. ���̵� ��ġ���� üũ
				// ���̵� �ߺ�üũ
				for(int j = 0; j<memberlist.length; j++) { // for 1 s
					if(memberlist[j][0] != null && memberlist[j][0].equals(id) ) { // if 2 s
						// 2. �Է¹��� ���� j��° �ε������� ������ ��
						System.err.println(" �˸�)) �̹� �ִ� ���̵� �Դϴ�.[���Է�]");
						save = false; // ����x ȸ������ �Ұ����ϰ� save ������ false�� ����
						break;
					} // if 2 e
				}// for 1 e
				
				// ������ ����
				if(save == true) { // if 3 s �ߺ�üũ�� �������� ���� ȸ������ó��
				for(int i = 0; i<memberlist.length; i++) { // for2 s
					if(memberlist[i][0] == null) { // if 4 s
						// i��° �࿡ id�� ������ = �����
						memberlist[i][0] = id;
						memberlist[i][1] = pw;
						memberlist[i][2] = name; // i��° �� ���� ������ ����
						save = true;
						break; // ���������� �� [1���� �����ؾ� �ϱ� ����]
							} // if 4 e	
						} // for2 e	
				}// if 3 e
			} // if1 e
			else if (select1 == 2) {
				System.out.println("-------------�α��� ������-------------");
				System.out.println("���̵� : "); String id = scanner.next();
				System.out.println("��й�ȣ : "); String pw = scanner.next();
				
				boolean logincheck = false;
				for(int i = 0 ; i<memberlist.length;i++) { // �α��� �ڵ�
				if(memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw))
				// i��° �࿡ id�� i��° �࿡ password�� �Է¹��� ���� equals ������ �α��� ����
					// �� ���̵� ������ �ƴҶ�(null�� equals�� �ȵ� -> null�� ��ü�� �ƴϱ� ����)
					// ��� null�� ==, !=���� ������ ��� ����
					{ System.out.println("�˸�)) �α��� ����");
					
					logincheck = true; // �α��� ���� ����
					////////////////////// �α��� ���� �� ���� ///////////////////////
						while(true) { // �α��ν� ���ѷ���
						System.out.println("----------�湮��---------");
						System.out.println("��ȣ\t�ۼ���\t����\t����");
						for(int j = 0; j<boardlist.length; j++){
							if(boardlist[j][0] != null) { // �Խù� ���� �ε��� ����
							System.out.printf("%d\t%s\t%s\t%s \n", 
									j, 
									boardlist[j][2],
									boardlist[j][0],
									boardlist[j][1]);	}
							}
						System.out.println("\n1. �湮�ϳ���� 2. �α׾ƿ� ����");	int select2 = scanner.nextInt();
							if(select2 == 1) {
								System.out.println("---------------�� ����-------------");
								 System.out.println("title : "); 	String title = scanner.next();
								 System.out.println("content : "); 	String content = scanner.next();
								 // �迭 �� ���� ã�� ����
								 for(int j = 0; j<boardlist.length; j++) {
									 if(boardlist[j][0] == null) { // �迭 �� j��° �ε����� �����̸� ����
										 boardlist[j][0] = title;
										 boardlist[j][1] = content;
										 boardlist[j][2] = id; // �α��ν� ����� id�� ����
										 System.err.println("�湮���� ����Ǿ����ϴ�.");
										 break;
									 }
								 }
							}
						
							////////////////////// �α��� ���� �� ���� ///////////////////////	
							else if(select2 == 2) {
								System.out.println("�˸�]] �α׾ƿ�");
								break; // ���� ����� �ݺ��� Ż��
													}
							else {System.out.println("�˸�]] �� �� ���� ��ȣ�Դϴ�.");}
							}
						} // w2 e
				if(logincheck == false) { 
					System.out.println("�˸�]] ȸ�������� ���ų� �ٸ��ϴ�");
					break;}
				}
			}
			else if(select1 == 3) {break;}
			else System.err.println("�˸�)) �� �� ���� ��ȣ�Դϴ�. �ٽ� �Է����ּ���");
		
		
		
		} // w1  e
		
		
	} // m  e
} // c  e
