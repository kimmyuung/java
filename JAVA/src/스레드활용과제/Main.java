package ������Ȱ�����;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Controller con = new Controller();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("��ȭå �о��ִ� ���α׷�");
			System.out.println("���� å�� �������ּ���");
			System.out.println("1. �̳�� �߼� 2. ���̿� ��¯�� 3. ���� ");
			int ch = sc.nextInt();
			if (ch == 1) {
				con.�̳�;߼�();
			} else if (ch == 2) {
				con.���̿͹�¯��();
			} else if (ch == 3) {
				System.out.println("����!");
				break;
			}
		}
	}
}
