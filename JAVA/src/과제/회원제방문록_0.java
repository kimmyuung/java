package ����;

import java.util.Scanner;

public class ȸ�����湮��_0
{ // cs
	public static void main(String[] args)
	{ // ms
		// ȸ���� �湮�� ���α׷�
		// 1. �ʱ�޴� [ 1. ȸ������ 2. �α��� ]
		// -> 1. ȸ������ ���� -> [ ���̵�, ��й�ȣ, �̸�] �Է� ����
		// -> 2. �α��� [���̵�, ��й�ȣ �����ϸ� �α���ó�� ] -> �ƴϸ� �ٽ�
		// 3. �α��ν� �޴� [1. �湮�� ����, 2. �α׾ƿ�]
		// 3-1. �湮�Ͼ��� [ ����, ����, �ۼ���(�α��εȾ��̵�)]
		// 3-2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
		Scanner sc = new Scanner(System.in); // �Է� ��ü ����
		String[][] memberlist = new String[100][3]; // ȸ�� 100���� ���� �� �ִ� 2���� �迭 ����
		String[][] boardlist = new String[100][3]; // �Խù� 100���� ������ �� �ִ� 2���� �迭 ����

		boolean save = true; // ���̵��ߺ� üũ ������

		while (true)
		{
			System.out.println("1. ȸ������ 2. �α���");
			int ch = sc.nextInt();
			if (ch == 1) // ����ڷκ��� ȸ�������� �Է¹���
			{
				System.out.println("ȸ�������� ȯ��"); // ȸ�������� ���� ���̵�, ���, �̸��� �Է¹���
				System.out.println("Id : ");
				String id = sc.next();
				System.out.println("pw : ");
				String pw = sc.next();
				System.out.println("name : ");
				String name = sc.next();

				for (int i = 0; i < memberlist.length; i++) // ���̵� �ߺ� �˻�
				{ // i�� 0���� ȸ���� �迭�� ����(=100)���� 1������
					if (memberlist[i][0] != null && memberlist[i][0].equals(id))
					{ // ���࿡ ���̵�迭�� ������ �ƴϰ�, �Է¹��� ���̵� ���̵�迭�� �ִٸ�
						System.out.println("���̵� �ֽ��ϴ�."); // ���̵� ���� ���
						save = false; // ���̵� �ߺ�üũ ���з� false ���
						break; // ���̵� �ߺ��� 1�� ã������ �ݺ��� Ż��
					}
				}

				if (save == true) // ���࿡ �ߺ�üũ���� ����ߴٸ�
				{
					for (int i = 0; i < memberlist.length; i++)
					{ // i�� 0���� ȸ���� �迭�� ����(=100)���� 1������
						if (memberlist[i][0] == null) // ���̵� �迭�� ��� �ִٸ�
						{
							memberlist[i][0] = id; // �Է¹��� ���̵� 0�� �迭�� ����
							memberlist[i][1] = pw; // �Է¹��� ��й�ȣ�� 1�� �迭�� ����
							memberlist[i][2] = name; // �Է¹��� �̸��� 2�� �迭�� ����
						}
					}
				}
			} else if (ch == 2) // �α����� �Է� ����
			{
				System.out.println("�α���");
				System.out.println(" id : ");
				String id = sc.next();
				System.out.println(" pw : ");
				String pw = sc.next(); // ���̵�� ��й�ȣ�� �Է�
				boolean logincheck = false; // �α���üũ �������θ� üũ�ϴ� ������ ����
				for (int i = 0; i < memberlist.length; i++) 
				{ // i�� ȸ���� �迭�� ���̱��� 1������
					if (memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw))
					{ // ���࿡ ȸ������ ������ �ƴϰ� �Է¹��� ���̵� ���� �迭�� �Է¹��� ��й�ȣ�� ���� �迭�� �ִٸ�
						System.out.println("�α���"); // �α��� ���� ���
						logincheck = true;  // �α��� ���� ���� ����
						while(true) { // ���ѷ��� : �������� ����ڰ� �α׾ƿ��� �����Ҷ�����
							System.out.println("�湮��");
							System.out.println("��ȣ\t�ۼ���\t����\t");
							for(int j = 0 ; j < boardlist.length; j++) {
								if(boardlist[j][0] != null) { // �Խñ��� ���
									System.out.printf("%d\t%s\t%s\t%s\n", j, boardlist[j][2],boardlist[j][0], boardlist[j][1]); }
								
								}
							System.out.println("\n1. �湮�� ����� 2. �α׾ƿ�"); // �湮���� ����ų� �α׾ƿ��� ���ù���
							int ch1 = sc.nextInt(); // ����ڰ� �Է�
							if(ch1 == 1) { // ����ڰ� �湮�� ����⸦ ����
								System.out.println("�� ����");
								System.out.println("title : "); String title = sc.next();
								System.out.println("context : "); String context = sc.next();
								for(int j = 0; j<boardlist.length; j++) { // j�� 0���� �Խñ۸�� �迭�� ���̱��� 1�� ����
									if(boardlist[j][0] == null ) { // �Խñ۸���� �迭�� ����ִٸ�
										boardlist[j][0] = title; // �Է¹��� ������ �迭�� �������� ����
										boardlist[j][1] = context; // �Է¹��� ������ �迭�� �������� ����
										boardlist[j][2] = id; // �α����� ���̵� �ۼ����� ���̵�� ����
										System.out.println("�湮�� �ۼ� �Ϸ�"); // �湮�� �ۼ��Ϸ�
										break; // �湮���� �ۼ������� �ݺ��� Ż��
									}
								}
							}
							else if(ch1 == 2) {System.out.println("�α׾ƿ�"); break;} // �α׾ƿ��� �Է��ϸ� ���ѷ��� ����
							else {System.out.println("�߸��� ��ȣ�Դϴ�.");} // 1���� 2���� �ƴ� ���ڸ� �Է½�
							if(logincheck == false) { // �α���üũ�� �����ϸ�
								System.out.println("�α��� ����");
								}
							}
						}
					}
				}
			 else {System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ּ���."); } // ȸ�����Ե� �α��ε� �ƴ� ���ڸ� �Է½�
		}

	} // me
} // ce
