package Day03;

import java.util.Scanner;

public class Day03_2 { // c  s
	public static void main(String[] args) { // m  s
	// ����1 : 2���� ������ �Է¹޾Ƽ� �� ū �� ���
		
		Scanner scanner = new Scanner(System.in); // { } �� 1���� ����!
		
		System.out.println("���ڸ� �Է��ϼ���");
		int ����1 = scanner.nextInt(); // int�� ���� ���� �ϰ� �Է¹��� ���� ������ �����ͼ� ����
		System.out.println("���ڸ� �Է��ϼ���");
		int ����2 = scanner.nextInt();
		
		if (����1 > ����2) 			System.out.println("�� �� �� ū���� " + ����1 + "�Դϴ�");
		// ���࿡ �Է¹��� ����1������ ����2���� ũ�� ���� �ƴϸ� ���� ����
		else if(����1 < ����2)			System.out.println("�� �� �� ū���� " + ����2 + "�Դϴ�");
		// �������� ����1������ ����2 ���� ������ ���� �ƴϸ� �׿�
		else 						System.out.println("����");
		// ������ �׿� ����	
		
	// ����2 : 3���� ������ �Է¹޾Ƽ� ���� ū�� ���	
		System.out.println("ù ���ڸ� �Է��ϼ���");
		int ����2_1 = scanner.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int ����2_2 = scanner.nextInt();
		System.out.println("����° ���ڸ� �Է��ϼ���");
		int ����2_3 = scanner.nextInt();
		int max = ����2_1; // ���� ū ���� �ӽ÷� �����ϴ� ����
		if(max < ����2_2) // ���࿡ max���� ����2_2���� �� ũ�� ��ü
			{ int temp = ����2_2;
			  ����2_2 = max;
			  max = temp;
			}	
		if (max < ����2_3) {max = ����2_3;} // ���࿡ max���� ����2_3���� �� ũ�� ��ü
		System.out.println("���� ū�� :"  + max);
		
		// ����3 : 4���� ������ �Է¹޾Ƽ� ���� ū�� ���
		System.out.println("ù ���ڸ� �Է��ϼ���");
		int ����6 = scanner.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int ����7 = scanner.nextInt();
		System.out.println("����° ���ڸ� �Է��ϼ���");
		int ����8 = scanner.nextInt();
		System.out.println("�׹�° ���ڸ� �Է��ϼ���");
		int ����9 = scanner.nextInt();
		
		int max2 = ����6;
			if (max2 < ����7) {max2 = ����7;}
			if (max2 < ����8) {max2 = ����8;}
			if (max2 < ����9) {max2 = ����9;}
			System.out.println("���� ū�� : " + max2);
				
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
		// ���� 5-1 : 4���� ���� �Է¹޾� �ø�����
		
		System.out.println("ù° ���ڸ� �Է��ϼ���");  	int e = scanner.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���"); 	int f = scanner.nextInt();
		System.out.println("��° ���ڸ� �Է��ϼ���");		int g = scanner.nextInt();
		System.out.println("��° ���ڸ� �Է��ϼ���");		int h = scanner.nextInt();
		
		int max3 = e;
		if(e > f) { int temp = e; e = f; f= temp;}
		if(e > g) { int temp = e; e = g; g= temp;}
		if(e > h) { int temp = e; e = h; h= temp;}
		if(f > g) { int temp = f; f = g; g= temp;}
		if(f > h) { int temp = f; f = h; h= temp;}
		if(g > h) { int temp = g; g = h; h= temp;}
		System.out.printf("�Է��� �� �������� : %d, %d, %d, %d",e,f,g,h);
	}	// m   e
} // c  e
