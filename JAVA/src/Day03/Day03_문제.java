package Day03;

import java.util.Scanner;

public class Day03_���� { // c   s
	
	public static void main(String[] args) { // m  s
		// ������ 1: �Է¹��� �� ��ŭ * ���
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����1) ������ :"); int s1 = scanner.nextInt();
		for(int i = 1; i <= s1 ;  i++)
		{ // i�� 1���� �Է¹��� �� ���� i�� 1�� ����
			System.out.print("*");
		}
		// ������ 2 : �Է¹��� �� ��ŭ * ���[5������ �ٹٲ� ó��]
		System.out.println("����2) ������ :"); int s2 = scanner.nextInt();
		for(int i = 1; i <= s2 ; i++)
		{ 
			System.out.print("*");
			if(i%5==0) System.out.println();
		}
		// ������ 3 : �Է¹��� �� ��ŭ ���(�ø�����) -> i= �� + s3 = ��
		System.out.print("����3) �ټ� : "); int line3 = scanner.nextInt();
		for( int i = 1 ; i<=line3 ; i++  ) {
			// * i�� 1���� �Է¹��� �� ������ 1������
			// 1. ����� 
			for( int s = 1 ; s<=i ; s++ ) {
				System.out.print("*");
			}
			// 2. �ٹٲ�ó��
			System.out.println(); // �� �ٲ�
		}
		// ������ 
		// ����ڰ� 3�� �Է������� 
		// i = 1  i<=3 [true] -> i++
			// s = 1	s<=1 [true] -> * -> s++
			// s = 2 	s<=1 [false] -> for2 �ݺ�������
		// �ٹٲ�
		// i = 2  i<=3 [ true ] -> i++
			// s = 1	s<=2 [true] -> * -> s++
			// s = 2 	s<=2 [true] -> * -> s++
			// s = 3 	s<=2 [false] -> for2 �ݺ������� 
		// �ٹٲ�
		// i = 3  i<=3 [ true ] -> i++
			// s = 1	s<=3 [ true ] -> * -> s++
			// s = 2    s<=3 [ true ] -> * -> s++
			// s = 3 	s<=3 [ true ] -> * -> s++
			// s = 4	s<=3 [ false] -> for2 �ݺ�������
		// �ٹٲ�
		// i = 4 	i<=3 [false ] for1 �ݺ�������
			
		// ������ 4 : �Է¹��� �� ��ŭ ���(��������)
		System.out.println("����4) �ټ� : "); int line4 = scanner.nextInt();
		for(int i = 1; i<=line4; i++)
		{
			for(int s = 1; s<=line4-i; s++) // 1. �����
			{ System.out.print("*");						  // s�� 1���� ???? 1�������ϸ鼭 �����
			}// s�� �Է¹����� - ���� �ټ� + 1 : ���� ���
			System.out.println();
		} // 2. i�� 1���� �Է¹��� ������ 1�������ϸ鼭 �ٹٲ�ó��
		
		
		// ������ 5 : �Է¹��� �� ��ŭ ���(3�� �ݴ��) : line(��), s(��), ����(a) �ʿ� -> �Ųٷ� ���� �ؼ� ������� ��� ��
		System.out.println("����5) �ټ� : "); int line5 = scanner.nextInt();
		for(int i = 1; i<=line5; i++) // -> �Է¹��� �� ���� ���
		{	for(int b = 1; b<=line5-i; b++)
			{System.out.print(" ");  }    // �������
				for(int s = 1; s<=i; s++)
					{System.out.print("*");} // ����� : �Է¹�����-�����ټ����� 1������
			
					System.out.println(); // �ٹٲ�
		}
		// ������ 6 : �Է¹��� �� ��ŭ ���(4�� �ݴ��)
		/* *****		i = 1 		b(����) = 0		s(��) = 5 
		//  ****		i = 2		b = 1			s = 4
		 *   *** 		i = 3		b = 2			s = 3
		 *    ** 		i = 4		b = 3			s = 2
		 *     * 		i = 5		b = 4			s = 1
		 *     b�� 1���� (�����ټ� - 1) ���� 1�������Ͽ� ������ ��� -> 1. ���� 2. �� 3. �ٹٲٱ�
		 */
		System.out.println("����6) �ټ� : "); int line6 = scanner.nextInt();
		for(int i = 1; i<=line6; i++)
		{
			for(int b = 1; b<=i-1; b++)
			{ System.out.print(" "); // s�� 1���� ???? 1�������ϸ鼭 �����
			}
			for(int s = 1; s<=line6-i+1; s++)
			{System.out.print("*"); } // ����� : �Է¹�����-�����ټ����� 1������
			
			System.out.println();
		} 
		// ���� 7 :  i=5 ����
		/*				*		i = 1		b = 1 2 3 4		s = 1	
		 * 			   ***  	i = 2		b = 1 2 3		s = 1 2 3
		 * 			  ***** 	i = 3		b = 1 2			s = 1 2 3 4 5
		 * 			 *******	i = 4		b = 1			s = 1 2 3 4 5 6 7
		 * 			*********   i = 5		b = 			s = 1 2 3 4 5 6 7 8 9
		 				-> b�� 1���� �Է¹�����- ���� �ټ��� ����. s�� 2������ -> i*2 = 2*/
		System.out.println("����7) �ټ� : "); int line7 = scanner.nextInt();
		for(int i = 1; i<=line7; i++)
		{
			for(int b = 1; b<=line7-i; b++) {
				System.out.print(" ");
			}
			for(int s = 1; s<=i*2-1; s++)// ���� ������ 1,3,5,7,9 �̹Ƿ� (���� ���� X 2) - 1
			{System.out.print("*");
			}
			System.out.println();
		}
		// ���� 8 :  i=5 ����
				/*				1		i = 1		b = 1 2 3 4		s = 1	
				 * 			   222  	i = 2		b = 1 2 3		s = 1 2 3
				 * 			  33333 	i = 3		b = 1 2			s = 1 2 3 4 5
				 * 			 4444444	i = 4		b = 1			s = 1 2 3 4 5 6 7
				 * 			555555555   i = 5		b = 			s = 1 2 3 4 5 6 7 8 9
				 				-> b�� 1���� �Է¹�����- ���� �ټ��� ����. s�� 2������ -> i*2 = 2*/
				System.out.println("����8) �ټ� : "); int line8 = scanner.nextInt();
				for(int i = 1; i<=line7; i++)
				{
					for(int b = 1; b<=line7-i; b++) {
						System.out.print(" ");
					}
					for(int s = 1; s<=i*2-1; s++)// ���� ������ 1,3,5,7,9 �̹Ƿ� (���� ���� X 2) - 1
					{System.out.printf("%d",i);
					}
					System.out.println();
				}		
			
	} // m  e
} // c   e
