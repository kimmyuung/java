package ����Ÿ��_������;

import java.util.Scanner;

public class ���� {
	public static void main(String[] args) {
		��Ʈ�ѷ� con = new ��Ʈ�ѷ�();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n����Ÿ�� ���α׷�(������)");
			System.out.println("1. ����Ÿ�� ���� 2. ���� 3. ���� 4. ����Ȯ�� 5. ���α׷� ����");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("����Ÿ���� �Ǽ��մϴ�.");
				System.out.println("������ ũ�⸦ �Է����ּ���");
				System.out.println("1���� �������� 5������ �Ǽ��� �����մϴ�.");
				int park = sc.nextInt();
				con.����Ÿ���Ǽ�(park);
				for (int i = 0; i < con.parktower.length; i++) {
					System.out.print(con.parktower[i] + "\t");
					if (i % 5 == 4) {
						System.out.println();
					}
				}
			} else if (ch == 2) {

				System.out.println("������ �����մϴ�.");
				System.out.print("������ȣ�� �Է����ּ��� : "); String Carnum = sc.next();
				for (int i = 1; i <= con.parktower.length; i++) {
					System.out.print("[" + i + "]" + "\t");
					if (i % 5 == 0) {
						System.out.println();
					}
				}
				System.out.println("\n������ ��ġ�� �������ּ���");
				int location = sc.nextInt();
				boolean result = con.����(Carnum, location - 1);
				if (result) {
					for (int i = 0; i < con.parktower.length; i++) {
						System.out.print(con.parktower[i] + "\t");
						if (i % 5 == 4) {
							System.out.println();
						}
					}
					System.out.println("���� �Ϸ�!");
				}
				else System.out.println("[[���� ���� : ���� �ڸ��� ���� �ְų� ������ȣ�� �ߺ��˴ϴ�]]");
			} else if (ch == 3) {
				System.out.println("������ ���� ��ȣ�� �Է��ϼ���"); String carNum = sc.next();
				boolean result = con.����(carNum);
				if(result) {
					System.out.println("������ �����Ͽ����ϴ�.");
					System.out.println("������� : ");
				}
				else System.out.println("[[���� ���� : �ش� ���� ��ȣ�� ������ ���� �������� �ʽ��ϴ�]]");
			} else if (ch == 4) {
				
			} else if (ch == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				break;
			}
		}
	}
}
