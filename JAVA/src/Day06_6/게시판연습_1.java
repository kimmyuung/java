package Day06_6;

import java.util.Scanner;

public class �Խ��ǿ���_1 {
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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board[] boardlist = new Board[100];
		
		while(true) {
			System.out.println(" ----- �Խ��� ���α׷� ----- ");
			System.out.println("1. �۾���   2. �ۺ���");
			int ch = sc.nextInt();
			
			if(ch==1) {
				System.out.println("�۾��� ������");
				System.out.println("1. title : "); String title = sc.next();
				System.out.println("2. context : "); String context =sc.next();
				System.out.println("3. pw : "); String pw = sc.next();
				System.out.println("4. writer : "); String writer = sc.next();
				int index = 0;
				Board board = new Board(writer, pw, context, title);
				for(Board temp : boardlist) {
					if(temp == null) {
						System.out.println("�Խù� ����� �Ϸ�Ǿ����ϴ�");
						boardlist[index] = board;
						break;
					}
				}
			}
			else if(ch==2) {
				System.out.println("�Խù� ���� ������");
				System.out.println("���� �Խù� ��ȣ�� �Է����ֻ�"); int bnum = sc.nextInt();
				if(boardlist[bnum] != null) {
					System.out.println("�Խù� ���� :" + boardlist[bnum].����);
					System.out.println("�Խù� ���� : " + boardlist[bnum].����);
					System.out.println("�Խù� �ۼ��� : " + boardlist[bnum].�ۼ���);
					System.out.println("�Խù� ���� ������");
					System.out.println("1. ��Ϻ��� 2. ���� 3. ����");
					int ch2 = sc.nextInt();
					if (ch2 == 1) {
						int i = 0;
						for(Board temp : boardlist) {
							if(temp != null) {
								System.out.printf("�Խù���ȣ : %d \t ���� : %s\t ���� : %s\t �ۼ��� : %s"
										,i,boardlist[i].����,boardlist[i].����,boardlist[i].�ۼ���);
							}
						i++;}
					}
					else if (ch2 == 2) {
						System.out.println("�Խù� ���� ��������");
						System.out.println("�� �Խù��� �ۼ��Ҷ� ���� ��й�ȣ�� �Է��آa");
						String pw = sc.next();
						if(boardlist[ch2].��й�ȣ.equals(pw)) {
							System.out.println("�Խù� ������ �����߾�");
							boardlist[ch2] = null;
						}
						for(int i = ch2; i < boardlist.length; i++) {
							boardlist[ch2] = boardlist[ch2+1];
							if(ch2 == boardlist.length-1) {
								boardlist[boardlist.length-1] = null;
							}
						}
					}
					else if (ch2 == 3) {
						System.out.println("�Խù� ���� ��������");
						System.out.println("�� �Խù��� �ۼ��Ҷ� ���� ��й�ȣ�� �Է��آa");
						String pw = sc.next();
						if(boardlist[ch2].��й�ȣ.equals(pw)) {
							System.out.println("��й�ȣ ������ �����߾�");
							System.out.println("������ ������ �Է��آa"); String title = sc.next();
							System.out.println("������ ������ �Է��آa"); String context = sc.next();
							boardlist[ch2].���� = title;
							boardlist[ch2].���� = context;
							System.out.println("������ ������ �����ٰ�");
							System.out.println(boardlist[ch2].����);
							System.out.println(boardlist[ch2].����);
						}
					}
					else {System.out.println("���ڸ� �߸� �Է��޾�, �ٽ� �Է��آa");}
				}
			}
			else {System.out.println("���ڸ� �߸� �Է��߽���, �ٽ� �Է����ֱ� �ٶ���");}
			
			
		}
	}
}
