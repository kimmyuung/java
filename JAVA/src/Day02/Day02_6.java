//����15 : ���̸� �Է¹޾� ���̰� 10���̻��̸� �л� , 20���̻��̸� ���� , 40���̻��̸� �߳� ���� ����ϱ�
		
		//����16 : 3���� ������ �Է¹޾� ������������ ���� 
		
		//����17 : 4���� ������ �Է¹޾� ������������ ���� 
		
		// p. 102 Ȯ�ι���
package Day02;

import java.util.Scanner;

public class Day02_6 { // c  s
	public static void main(String[] args) { // m  s
	Scanner scanner = new Scanner(System.in); // ��ü ����
	
	System.out.println("���̸� �Է��ϼ��� : ");
	int age = scanner.nextInt();
	String age_1 = age > 40 ? "�߳�" : age > 20 ? "����" : "�л�"; // ���̰� 40 �ʰ��� �߳�, 20 �ʰ��� ���� ���Ͻ� �л�
	
	System.out.println("����� ���մ�� " + age_1); // ������ ��� 
	
	/*
	 * System.out.println("���ڸ� �Է��ϼ��� : "); int a = scanner.nextInt();
	 * System.out.println("���ڸ� �Է��ϼ��� : "); int b = scanner.nextInt();
	 * System.out.println("���ڸ� �Է��ϼ��� : "); // �������� �Է¹��� int c = scanner.nextInt();
	 * // �������� ������������ ���� int d = a > b ? a : b > c ? b : c; // ���� ū ���� a�� ���� ũ�� int
	 * e = a > b ? b : a > c ? a : c; // �߰� ���� int f = a < b ? a : b < c ? b : c; //
	 * ���� ���� ���� a�� c���� �۴� System.out.printf("������������ �����ϸ� :%d \t %d \t %d", d, e, f);
	 * // a > b ? a : b > c ? b : c -> ���� ū ���ڸ� ã�� �� // // a < b ? b : a < c ? c : a
	 * -> ���� ���� ���ڸ� ã�� ��
	 */	
	// ����4 : 3���� ���� �Է¹޾Ƽ� ��������
				System.out.println("ù° ���ڸ� �Է��ϼ���");
				int ����10 = scanner.nextInt();
				System.out.println("�ι�° ���ڸ� �Է��ϼ���");
				int ����11 = scanner.nextInt();
				System.out.println("����° ���ڸ� �Է��ϼ���");
				int ����12 = scanner.nextInt();
			if (����10 > ����11) { // ���� : �ΰ� ������ ������ ��ȯ
				int temp = ����10; // �ӽú��� = ����1
				����10 = ����11;  // ����1 = ����2
				����11 = temp;   // ����2 = �ӽú���;
			}					
			if (����10 > ����12) {
				int temp = ����10; 	����10 = ����12;	����12 = temp;
			}
			if (����11 > ����12) {
				int temp = ����11; ����11 = ����12; ����12 = temp;
			}
			System.out.printf("�Է��� �� �������� : %d, %d, %d", ����10, ����11, ����12);
			System.out.println("�Է��� �� �������� : " + ����10 + "" + ����11 + "" + ����12);
			// ����5 : 4���� ���� �Է¹޾Ƽ� ��������		> : �������� < : ��������
			
			System.out.println("ù° ���ڸ� �Է��ϼ���");  	int a = scanner.nextInt();
			System.out.println("�ι�° ���ڸ� �Է��ϼ���"); 	int b = scanner.nextInt();
			System.out.println("��° ���ڸ� �Է��ϼ���");		int c = scanner.nextInt();
			System.out.println("��° ���ڸ� �Է��ϼ���");		int d = scanner.nextInt();
			
			int min = a;
			if(a < b) { int temp = a; a = b; b= temp;}
			if(a < c) { int temp = a; a = c; c= temp;}
			if(a < d) { int temp = a; a = d; d= temp;}
			if(b < c) { int temp = b; b = c; c= temp;}
			if(b < d) { int temp = b; b = d; d= temp;}
			if(c < d) { int temp = c; c = d; d= temp;}
			System.out.printf("�Է��� �� �������� : %d, %d, %d, %d",a,b,c,d);
	} // m  e
} // c  e
