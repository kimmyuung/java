package Day06_6;

import java.util.Scanner;

public class �Խ��ǿ���_3 {
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
			System.out.println("[[�޴� 1. �۾��� 2. �ۺ��� ]]");
			int ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("�۾��� ������!");
				System.out.println("title : "); String title = sc.next();
				System.out.println("context : "); String context = sc.next();
				System.out.println("writer : "); String writer = sc.next();
				System.out.println("pw : "); String pw = sc.next();
				int i = 0;
				for(Board temp : boardlist) {
					if(temp == null) {
						Board board = new Board(writer, pw, context, title);
						System.out.println("�Խù� ��� ��!!!");
						boardlist[i] = board;
						break;
					}
				i++;}
 			}
			else if(ch == 2) {
				System.out.println("�Խù� ���� ");
				System.out.println("�� �Խù��� ��ȣ��??(0���� ����)"); int bnum = sc.nextInt();
				System.out.println("���� : " + boardlist[bnum].����);
				System.out.println("���� : " + boardlist[bnum].����);
				System.out.println("1. �� ��� 2. ���� 3. ����");
				int ch2 = sc.nextInt();
				if(ch2 == 1) {
					int i = 0;
					for(Board temp : boardlist) {
						if(temp != null) {
							System.out.printf("%d \t %s \t %s \t %s \n", i, boardlist[i].����, boardlist[i].����,boardlist[i].�ۼ���);
						}
					i++;}
				}
				else if(ch2 == 2) {
					System.out.println("�Խù� ���� ������");
					System.out.println("�Խñ��� ��й�ȣ�� �Է����ּ���"); String pw = sc.next();
					if(boardlist[bnum].��й�ȣ.equals(pw)) {
						System.out.println("��й�ȣ ���� ����");
						System.out.println("�Խñ� ���� ����");
						boardlist[bnum] = null;
					}
					for(int i = bnum; i < boardlist.length; i++) {
						boardlist[bnum] = boardlist[bnum+1];
						if(bnum == boardlist.length-1) {
							boardlist[boardlist.length-1] = null;
						}
					}
				}
				else if(ch2 == 3) {
					System.out.println("�Խñ��� ��й�ȣ�� �Է����ּ���"); String pw = sc.next();
					if(boardlist[bnum].��й�ȣ.equals(pw)) {
						System.out.println("��й�ȣ ���� ����");
						System.out.println("������ ���� : "); String title = sc.next();
						System.out.println("������ ���� : "); String context = sc.next();
						boardlist[bnum].���� = title;
						boardlist[bnum].���� = context;
						System.out.println("������ ���� : " + boardlist[bnum].����);
						System.out.println("������ ���� : " + boardlist[bnum].����);
					}
				}
			}
			else {System.out.println("���� ����!");}
		}
	}
}
