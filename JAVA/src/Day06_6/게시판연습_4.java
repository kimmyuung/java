package Day06_6;

import java.util.Scanner;

public class �Խ��ǿ���_4 {
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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board[] boardlist = new Board[100];
		while(true) {
		System.out.println("Ŀ�´�Ƽ ������");
		System.out.println("[[1. �� ���� 2. �� ����]]");
		int ch = sc.nextInt();
		if(ch == 1) {
			System.out.println("�� ���� ������");
			System.out.println("Title : "); String title = sc.next();
			System.out.println("Context : "); String context = sc.next();
			System.out.println("Writer : "); String writer = sc.next();
			System.out.println("Password : ");  String pw = sc.next();
			int i = 0;
			for(Board temp : boardlist) {
				if(temp == null) {
					System.out.println("�Խù� ��� �Ϸ�");
					Board board = new Board(writer, pw, context, title);
					boardlist[i] = board;
					break;
				}
			i++;}
		}	
		else if (ch == 2) {
			System.out.println("�Խù� ���� ������");
			System.out.println("�� �Խù� ��ȣ(0������ ����)"); int bnum = sc.nextInt();
			if(boardlist[bnum] != null) {
				System.out.println("�Խù��� ã�ҽ��ϴ�.");
				System.out.println(boardlist[bnum].����);
				System.out.println(boardlist[bnum].����);
				System.out.println("1. �Խù� ��� ���� 2. ���� 3. ����");
				int ch1 = sc.nextInt();
				
				if(ch1 == 1) {
					int i = 0;
					for(Board temp : boardlist) {
						if(temp != null) {
					System.out.printf("�Խù���ȣ : %d \t���� : %s\t ���� : %s\t �ۼ��� : %s\n"
							,i,boardlist[i].����,boardlist[i].����,boardlist[i].�ۼ���);} i++; }
				}
				else if(ch1 == 2) {
					System.out.println("�Խù� ���� ������");
					System.out.println("�Խù��� ��й�ȣ�� �Է� : "); String pw = sc.next();
					if(boardlist[bnum].��й�ȣ.equals(pw)) {
						System.out.println("�Խù� ���� ����!");
						boardlist[bnum] = null;
					}
					for(int i = bnum; i < boardlist.length; i++) {
						boardlist[bnum] = boardlist[bnum+1];
						if(bnum == boardlist.length-1) {
							boardlist[boardlist.length-1] = null;
						}
						
					}
				}
				else if(ch1 == 3) {
					System.out.println("�Խù� ���� ������");
					System.out.println("�Խù��� ��й�ȣ�� �Է� : "); String pw = sc.next();
					if(boardlist[bnum].��й�ȣ.equals(pw)) {
						System.out.println("��й�ȣ ���� ����");
						System.out.println("������ �Խù��� ���� : "); String title = sc.next();
						System.out.println("������ �Խù��� ���� : "); String context = sc.next();
						boardlist[bnum].���� = title;
						boardlist[bnum].���� = context;
						System.out.println("���� ����!!");
					}
				}
				else System.out.println("���� ����!");
			}
		}
		else System.out.println("���ڸ� �߸��Է�");
		
		}
	}
}
