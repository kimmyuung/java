package Day04;

import java.util.Scanner;

public class Day04_1 { // c  s
	public static void main(String[] args) { // m  s
		// ��� : if, switch
		// �ݺ��� : for, while
			// 1. �ʱⰪ 2. ���ǽ� 3. ������ 4. ���๮
		// while ���� [���ѷ����� ���� ���]
		// 1. �ʱⰪ
		// while(2. ���ǽ�) {
		//				4. ���๮;
		//	 			3. ������;
		//					}
		// for ��1)
		for(int i= 1; i<= 10; i++) { // f  s
			// i�� 1���� 10���ϱ��� 1�� �����ϸ鼭 ���๮ �ݺ�ó�� 
			System.out.print(i + " ");
			} // f  e
		// while ��1
		int i = 1; // �ʱⰪ
		while(i<=10) { // ���ǽ�, w  s
			System.out.print(i + " "); // ���๮
			i++; // ������
		} // w e
		
		// for ��2) 1-100 �����հ�
		int sum = 0;
		for(int x = 1; x <=100; x++) 
		{ sum += x;} // sum = sum + x;}
		
		System.out.println(sum);
		
		// while ��2) 1-100 �����հ�
		int sum2 = 0;
		int i2 = 1; // �ʱⰪ
		while(i2<=100) { // ���ǽ� [true�� ���� false�� ���� X)
			sum2 += i2; // ���๮
			i2++; // ������ -> ������ ���ѷ����� ������ ��
		}
		System.out.println(sum2);
		
		// while ��3) ���ѷ���(24�ð� ���α׷� ���� ���� �ʿ�)
		while(true) { // ���ǽ��� true -> ���� // true ��� -> ���ѷ���
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int exit = scanner.nextInt();
		if(exit == 3) break;
		// break ���� ���� ����� �ݺ����� ������ ��(if ����)
		}
		
	} // m  e
} // c  e





