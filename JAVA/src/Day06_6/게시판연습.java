package Day06_6;

import java.util.Scanner;

public class �Խ��ǿ��� {
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
			int i = 0;
			System.out.println(" ----- Ŀ�´�Ƽ ----- ");
			for(Board temp : boardlist) {
				if(temp != null) {System.out.printf("�Խù���ȣ %d \t���� : %s\t ���� : %s\t �ۼ��� : %s"
						, i, boardlist[i].����, boardlist[i].����, boardlist[i].�ۼ��� );}
				}i++;
			System.out.println("1. �۾��� 2. �ۺ���");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("�۾��� ������");	
				System.out.println("���� : ");		String title = sc.next();
				System.out.println("���� : ");		String content = sc.next();
				System.out.println("��й�ȣ : ");		String pw = sc.next();
				System.out.println("�ۼ��� : ");		String writer = sc.next();
				Board board = new Board(writer, pw, content, title);
				System.out.println("�۾��Ⱑ �Ϸ�Ǿ����ϴ�.");
				int index = 0;
				for(Board temp : boardlist) {
					if(temp == null) {boardlist[index] = board; break;}
					index++;	}
			}
			else if (ch == 2) {
				System.out.println("�� ���� ������");
				System.out.println("�Խù� ��ȣ�� �Է����ּ���.(0���� �����մϴ�");
				int ch2 = sc.nextInt();
				System.out.printf("�ۼ��� : %s   ���� : %s\n", boardlist[ch2].�ۼ���, boardlist[ch2].����);
				System.out.printf("���� : %s\n" ,boardlist[ch2].����);
				System.out.println("1. ��Ϻ��� 2. ���� 3. ����");
				int ch3 = sc.nextInt();
				if(ch3 == 1) {
					int j = 0;
					for(Board temp : boardlist) {
						if(temp != null) {System.out.printf("�Խù���ȣ %d \t���� : %s\t ���� : %s\t �ۼ��� : %s"
								, j, boardlist[j].����, boardlist[j].����, boardlist[j].�ۼ��� );}
						}j++;
				}
				else if(ch3 == 2) {
					System.out.println("�Խù� ���� ������");
					System.out.println("�� �Խù��� ��й�ȣ�� �Է����ּ���."); String pw = sc.next();
						if(boardlist[ch2].��й�ȣ.equals(pw)) {
							System.out.println("��й�ȣ ���� ����");
							System.out.println("�� �Խù��� �����մϴ�.");
							boardlist[ch2].���� = null;
							boardlist[ch2].��й�ȣ = null;
							boardlist[ch2].�ۼ��� = null;
							boardlist[ch2].���� = null;
						}
						else System.out.println("��й�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
					for(int j = ch2; j< boardlist.length; j++) {
						boardlist[ch2] = boardlist[ch2+1];
						if(ch2 == boardlist.length) {
							boardlist[boardlist.length-1] = null;
						}
					}
					
				}
				else if(ch3 == 3) {
					System.out.println("�Խù� ���� ������");
					System.out.println("�� �Խù��� ��й�ȣ�� �Է����ּ���."); String pw = sc.next();
					for(Board temp : boardlist) {
						if(temp != null && boardlist[ch2].��й�ȣ.equals(pw)) {
							System.out.println("��й�ȣ ���� ����");
							System.out.println("������ ������ �Է��ϼ���"); String title = sc.next();
							System.out.println("������ ������ �Է��ϼ���"); String context = sc.next();
							boardlist[ch2].���� = context;
							boardlist[ch2].���� = title;
						}
						else System.out.println("��й�ȣ�� �߸� �Է��ϼ̽��ϴ�.");}
				}
				else {System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");}
				
			}
			else System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
		}
	}
}
