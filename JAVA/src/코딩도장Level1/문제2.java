package �ڵ�����Level1;

import java.util.Scanner;

public class ����2 { // c  s
	public static void main(String[] args) { // m  s
//  ����2
//	A���� �Խ��� ���α׷��� �ۼ��ϰ� �ִ�.
//	A���� �Խù��� �� �Ǽ��� �� �������� ������ �Խù����� �Է����� �־��� �� 
		// �� ���������� �����ϴ� ���α׷��� �ʿ��ϴٰ� �Ѵ�.
//	�Է� : �ѰǼ�(m), ���������� ������ �Խù���(n) (�� n�� 1���� ũ�ų� ����. n >= 1)
//	��� : ����������
//	A���� �ʿ��� ���α׷��� �ۼ��Ͻÿ�.
//	��) ���α׷� ���� �� ������ ���� ������� ���;� ��.
//      m	n	���
//		0	1	0
//		1	1	1
//		2	1	2
//		1	10	1
//		10	10	1
//		11	10	2
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Խù��� �� �Ǽ��� �Է��ϼ���.");
		int m = scanner.nextInt(); // �Խ��� �� �Ǽ�
		System.out.println("�� �������� ������ �Խù� ���� �Է��ϼ���");
		int n = scanner.nextInt(); // �� �������� ������ �Խù� ��
		if( n < 1 ) {System.out.println("�˸�)) �������� �̻� ����ؾ� �մϴ�.");
			if( m % n == 0 ) {
			System.out.println(m/n);
			}
		else { System.out.println(m/n + 1);}
			}
		
		
		
		
	}
} // c e
