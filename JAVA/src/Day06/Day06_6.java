package Day06;

import java.util.Scanner;

public class Day06_6 { // cs
	public static void main(String[] args) { // ms
		// �Խ���[Ŭ����]
		// 0. �Խù� ���� -> Ŭ���� ���� 
		// �ۼ���, ��й�ȣ, ����, ����(Ŭ������ �ʵ�)
		// ������ : ��� O
		// 1. ùȭ�� [ ��� �Խù� ��� ]
		// 2. �޴� [1. �۾��� 2. �ۺ��� ]
			// 1-1. �۾��� �� : �ۼ���, ��й�ȣ, ����, ���� 
			// -> ��üȭ
			// 2-1. �ۺ��� : �ش� �۹�ȣ ���(�ε���) -> �迭�� ����Ǵ� ����
					// -> �ش� �۹�ȣ �Է¹޾� �ش� �� �������� ���
			// . �ۺ��� �޴� : 1. ��Ϻ��� 2. ���� 3. ����
			// 2-2 ������ : ��й�ȣ �Է¹޾� �����ϸ� ����
			// 2-3 ������ : �ۼ��� ��й�ȣ �Է¹޾� �����ϸ� ���� ���븸 ����
		// �غ� [���{}�� ���Ǵ� ���� ����]
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100]; // ���� ��ü�� 100�� ������ �� �ִ� 1���� �迭 ����
		
		// ���α׷� ����
		while(true) { // w s [���� = X]
		
		System.out.println("----- Ŀ�´�Ƽ -----");
		System.out.printf("%s\t%s\t%s \n", "��ȣ", "����", "����");
		int index = 0; // �ε��� ���� [�ݺ����� üũ]
		// ��� �Խù���ȸ
			for(Board board : boardlist) { // for s
				if(board != null) { // if s
				System.out.printf("%d\t%s\t%s \n", index, board.context, board.title);
				} // if e , %����s : ���ڸ�ŭ �ڸ� ����[���࿡ �ش� ������
				index++;
			} // for e
			
		// �۾���� �ۺ��� �޴�
		System.out.println("\n1. �۾���	2. �ۺ���");
		System.out.println("------------------------");
		int select = scanner.nextInt();
		if (select == 1) { // 1. �۾��� if1 s
			// 1. 4�� ������ �Է¹���
			System.out.println("----- �� ���� ������ -----");
			System.out.println("���� : ");	String title = scanner.next();
			System.out.println("���� : ");	String context = scanner.next();
			System.out.println("�ۼ��� : ");	String writer = scanner.next();
			System.out.println("��й�ȣ : ");	String pw = scanner.next();
			// 2. 4�� ������ ��üȭ
			Board board = new Board(title, context, writer, pw);
						// 4�� �ʵ带 ���� ������ ���
			// 3. �迭�� ������� ã�Ƽ� ������� ��ü����
				int i = 0;
				for( Board temp : boardlist) { // for2 s
				if(temp == null) { // if2 s -> �� ������ ã����
					boardlist[i] = board; // �ش� �ε����� ���ο� ��ü ����
					break; // �ѹ� �����ϸ� �ݺ��� ����
					} // if2 e	
					i++;
				} // for2 e
			} // if1 e
		else if(select == 2) { // 2-1. �ۺ��� : �ش� �۹�ȣ ���(�ε���) -> �迭�� ����Ǵ� ����
								// -> �ش� �۹�ȣ �Է¹޾� �ش� �� �������� ���
								// . �ۺ��� �޴� : 1. ��Ϻ��� 2. ���� 3. ����
								// 2-2 ������ : ��й�ȣ �Է¹޾� �����ϸ� ����
								// 2-3 ������ : �ۼ��� ��й�ȣ �Է¹޾� �����ϸ� ���� ���븸 ����
			System.out.println("�Խù� ��ȣ�� �Է����ּ���");
			int bno = scanner.nextInt(); // �� �Խù� �ε�����ȣ(=�迭�� �ε��� ��)
			System.out.printf("�ۼ��� : %s   ���� : %s\n", boardlist[bno].writer, boardlist[bno].title);
			System.out.printf("���� : %s\n" ,boardlist[bno].context);
			// �ݺ��� ��� ���� X -> �������ġ[�ε���] �Է� �޾ұ� ������ -> �Է¹��� �ε��� ��ġ�� ��ü ���
			System.out.println("------ �ۺ��� �޴� -----");
			System.out.println("1. ��Ϻ���(�ڷΰ���) 2. ���� 3. ����");
			System.out.println("-----> ���� : ");
			int select2 = scanner.nextInt();
			if(select2 == 1) { // if 1 s // ���� �ݺ����� ���� ������ �ƹ��͵� �ۼ����� �ʾƵ� �ڷ� ���� ��
				int index2 = 0;
				for(Board board : boardlist) { // for s
					if(board != null) { // if2 s
					System.out.printf("%d\t%s\t%s \n", index2, board.context, board.title);
					break;
					} // if2 e
				} // for e	
				index2++;
			
			} // select2 == 1 e
			
			if(select2 == 2) { // ����
				System.out.println("�˸�)) �� �Խù� ��й�ȣ : "); String pw = scanner.next();
				// �ݺ��� ��� X -> ������ �ε��� ��ġ�� �Է¹޾ұ� ���� [�˻� X]
				if(boardlist[bno].pw.equals(pw)) { // �Խù� ��ü�� ��й�ȣ == �Է��� ��й�ȣ, if 1 s
					System.out.println("�˸�)) ���� ����");
					boardlist[bno] = null; // �ش� �Խù��� null ���� // ���� ó��. 
					for(int i = bno; i<=boardlist.length; i++) 
						// �˻��� �ٹ��� �ε������� �������ε������� 1������
					{ // for s
						boardlist[bno] = boardlist[bno+1]; // ������ �Խù� ���� �Խù�
						// �����Ŀ� ������ �ε��� �ڷ� ��ĭ�� ������ �̵�
						// ���࿡ �ش� �ڵ� ���� ��� �迭�� ���̻��̿� ���� �߻�
						// *���� 2�� �ε��� ������ : 2��->3�� ~~ 99�� -> 100���ε��� ������(�迭���̰� 100�̶�) : null ���
						if(bno == boardlist.length-1) boardlist[boardlist.length-1] = null; 		
						// bno �������ε��� �̸� �������ε������� null ����
						// ������ �ε����� �ƴϸ� �ε��� ����
						} // for e
							} // if 1 e
				else { System.out.println("�˸�)) ��й�ȣ�� �ٸ��ϴ� [��������]"); }
				} // ���� e
			
			if(select2 == 3) { // ���� s
				System.out.println("�˸�)) �� �Խù� ��й�ȣ : "); String pw = scanner.next();
				if(boardlist[bno].pw.equals(pw)) { // �Խù� ��ü�� ��й�ȣ == �Է��� ��й�ȣ
					// �ش� �Խù��� ����� ������ ���� �Է¹޾� �� �Խù� ��ü �� ����� ���뿡 ����
					System.out.println("������ ������ �Է��ϼ���");
					boardlist[bno].title = scanner.next(); 
					System.out.println("�����Ͽ� �ø� �Խñ��� �Է����ּ���");
					boardlist[bno].context = scanner.next(); 
					System.out.println("�˸�)) ������ �����Ǿ����ϴ�.");
					// �ش� �Խù��� null ���� // ���� ó��
							}
				else { System.out.println("�˸�)) ��й�ȣ�� �ٸ��ϴ� [��������]"); }
			
						} // ���� e 
			else {System.out.println("�� �� ���� ��ȣ �Դϴ� [���Է�]");}
					
			} // �ۺ��� e
		else System.err.println("�˸�)) �� �� ���� ��ȣ�Դϴ�.");
		} // w e
	} // me	
}// ce
