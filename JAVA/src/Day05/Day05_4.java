package Day05;

import java.util.Scanner;

public class Day05_4 { // c  s
	public static void main(String[] args) { // m  s
	// ���� �뿩 ���α׷�
	// 1. ����� 2. ����/�ڷ���/���� 3. ����/�ݺ� 4. �迭
		
		// 1. �迭 ����
		// 1-1. ȸ��[���̵�(�ߺ� X), ��й�ȣ]
		// 1-2. ����[������(�ߺ� X), �����뿩����]
		// 2. �ʱ�޴�
		// 2-1. ȸ������ // 2-2. �α���
		// 2-3. ȸ�����Խ� �ߺ�üũ
		// 3. �α��ν� �޴�
		// 3-1. �����˻� // 3-2. ������� // 3. �����뿩 // 4. �����ݳ� // 5. �α׾ƿ�
		// + �����˻��� �������� ��ġ�ϸ� ������� ����
		// + ���� ��Ͻ� ��� ������ ���
		// + �����뿩�� �����뿩���ΰ� �����Ҷ� �����뿩 ó��
		// + �����ݳ��� ������ �뿩�� ������ �ݳ� ó��
		// + �α׾ƿ�
		// �α��ν� ���̵� admin�̸� �����ڸ޴�
		// 1. ���� ��� 2. ���� �޴� 3. ��������(����) 4. �α׾ƿ�
		// + ���� ��Ͻ� ������ �Է¹޾� ���� ���ó��
		// + ���� ��Ͻ� ��� ������ ��� // ���������� ������ ������ �Է¹޾� ������ ������ ����(NULL)
		// �α׾ƿ��� �ʱ�޴���
		
		// �غ�
		Scanner scanner = new Scanner(System.in);
		String[][] memberlist = new String[100][2]; // ȸ��
		String[] booklist = new String[100]; // ����
		
		while(true) {// w1 s
			System.out.println("-------------------------");
			System.out.println("1. ȸ������\t 2. �α���");
			System.out.println("-------------------------");
			int select1 = scanner.nextInt();
			if(select1 == 1) { // if1 s
				boolean check = true;
				System.out.println("ȸ�������� ȯ���մϴ�");
				System.out.println("�����Ͻ� ���̵� �Է����ּ���"); String id = scanner.next();
				System.out.println("���̵��� ��й�ȣ�� �Է����ּ���"); String pw = scanner.next();
				for(int i = 0; i < memberlist.length; i++) {// for1 s
					if(memberlist[i][0] == null) { // if2 s
						// i��° �࿡ id�� ������ = �����
						memberlist[i][0] = id;
						memberlist[i][1] = pw; // i��° �� ���� ������ ����
						check = true;
						break; // ���������� �� [1���� �����ؾ� �ϱ� ����]
							}  // if2 e
				
				// ���̵� �ߺ�üũ
				for(int j = 0; j<memberlist.length; j++) { // for 2 s
					if(memberlist[j][0] != null && memberlist[j][0].equals(id) ) { // if 2 s
						// 2. �Է¹��� ���� j��° �ε������� ������ ��
						System.err.println(" �˸�)) �̹� �ִ� ���̵� �Դϴ�.[���Է�]");
						check = false; // ����x ȸ������ �Ұ����ϰ� save ������ false�� ����
						break;
						} // if 2 e
					}// for 2 e
				}// for 1 e
			} // if1 e
			
			// �α��� ������
			else if(select1 ==2) {// if2 s
				System.out.println("-------------�α��� ������-------------");
				System.out.println("���̵� : "); String id = scanner.next();
				System.out.println("��й�ȣ : "); String pw = scanner.next();
				
				boolean logincheck = false;
				for(int i = 0 ; i<memberlist.length;i++) { // �α��� for 1 s
				if(memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw))
					{ System.out.println("�˸�)) �α��� ����");
					logincheck = true; } // if2 e
				// �α��� ������ ������
					while(true) {
						System.out.println("-------------�α��� ������-------------");
						System.out.println("1. ���� ���\t 2. ���� ��� \t3. ���� ����\t 4. �α׾ƿ�");
						int select2 = scanner.nextInt();
						if (select2 == 1) {
							System.out.println("------������ ����մϴ�------");
							System.out.println("������ ���� : ");
							String title = scanner.next();
							for(int j = 0; j < booklist.length; j++) {
								title = booklist[j];
							}
						}
						else if (select2 == 2) {
							System.out.println("------���� ���------");
							for(int j = 0; j < booklist.length; j++) {
								System.out.printf("���� ��ȣ : %d ������ : %s", j, booklist[i]);
							}
						}
						else if (select2 == 3) {
							
						}
						else if (select2 == 4) {
							break;	
						}
						
						else System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���");
								}
				} // �α��� for e
				
				
				
				
			}
			else System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���");
		} // w1 e
	} // m  e
} // c e
