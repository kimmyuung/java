package ����;

import java.util.Scanner;

import Day06.Board;

public class Cooking { // cs
	public static void main(String[] args) { // ms
	
		// ��鷹����
		// �ʱ�޴�   [1. �����Ǻ���      2. ��� ���̱�]
		// 0. ���� 
		// 1-1. ����ڷκ��� �Դ� ��� �����Ǹ� ���� ����� ���̴� ���� �Է¹���
		// 1-2. �߰� �߰� Ȯ���� ���� if�� ���
		// 2. ����� ���̱� ���� �������� ����
		// ���� ����
		Scanner scanner = new Scanner(System.in); // �Է� ��ü ����
		
		while(true) { // w s
		System.out.println("-------��� ����---------(1�κ� ����)"); // �ʱ� �޴� ���
		System.out.println("��� ���� �����ϰ� ��������� ������� "); // 
		System.out.print("1. ������ ���� 2. ���� �����ϱ�");
		int select = scanner.nextInt();
		Ramen ramen = new Ramen();
		
		if(select ==1) { // if 1 s
			System.out.println("��� �����Ǹ� ���ϴ�.");
			System.out.println("������ ��������� ������ �����մϴ�");
			System.out.println("�غ� : ���, ��ġ, �ݶ�, ����");
			System.out.println("�غ񰡵Ǿ����� \"����\"�� �Է����ּ���");
			String select2 = scanner.next();
			if (select2.equals(" \"����\" ")) { // if 2 s
				System.out.println("������ �����մϴ�");
				System.out.println("1. ������ �ݶ� ������ ���� �ְ� ���Դϴ�.");
				System.out.println("������ �ݶ� �� �������� 2�� �Է����ּ���.");
				int select3 = scanner.nextInt();
					if(select3 == 2) { // if 3 s
					System.out.println("2. �ݶ� ���� ���� ������ ��ٸ��鼭 ���� �ӿ� ��ġ�� ����� �ְ� ���δ�.");
					System.out.println("������ ����� ���� ���� 3�� �Է����ּ���");
					int select4 = scanner.nextInt();
						if (select4 == 3) { // if 4 s
						System.out.println("3. ���� ����� ���� ���� ���� �ݶ� �ξ� ���� �ش�");
						System.out.println("���� ��!!!!!");
					} // if 4 e
						else {System.out.println("����]] �ٽ� �Է����ּ���");}
				} // if 3 e
			} // if 2 e

		else if(select == 2) {
			System.out.println("�����Ǹ� ���� �ʰ� ������ �����մϴ�.");
			System.out.println("1. �غ��� ���� ���� �־��ּ���."); }
			System.out.println("���� ������ 2�� �Է����ּ���.");
			int select2_1 = scanner.nextInt();
			if(select2_1 == 2) {
				System.out.println("���� �������� �Ǵ���� ������ �־��ּ���.");
				System.out.println("�ְ� 3�� �� ����� ��ø� ���� �ϼ�!!!");
			}
			else {System.out.println("����]] �ٽ� �Է����ּ���");}
		} // if1 e
		
		else System.out.println("�߸��� ��ȣ�� �Է��߽��ϴ�. [���Է�]");
		
		
		
		
		}// we
	}// me 
} // c e
