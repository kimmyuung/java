package Day03;

import java.util.Scanner;

public class Day03_�������� { 			// c  s 
	public static void main(String[] args) 
	{  // m  s
		Scanner scanner = new Scanner(System.in); // �Է� ��ü
		// Ȯ�ι��� 3 
//		int sum = 0;
//		for(int i = 1; i <=100; i++)
//		{ if(i%3==0) 
//		 sum = sum + i;}
//		System.out.printf("%d", sum);
		
		// Ȯ�ι��� 5
//		int a = 0;
//		int b = 0;
//		for(int x = 1; x<=10; x++)
//		{ for(int y = 1; y<=10; y++)
//			if((4*x) + (5*y) == 60)
//				{x = a; 
//				y = b;	}
//		}
		//System.out.printf("(%d, %d)", a, b);
		// Ȯ�ι��� 6
//		for(int i =1; i<=5; i++)
//		{ System.out.print("*"); }
	
		
		
		// Ȯ�ι��� 7
		boolean run = true; // ���࿩�� ����
		int balance = 0; // ���ݾ�
		
		while(run)// while(���ǽ�) -> true�� ���ѹݺ� 
			{ // w  s
			System.out.println("-----------------------------------------");
			System.out.println("1. ���� |\t 2. ��� | \t 3. �ܰ� | \t 4. ����|");
			System.out.println("-----------------------------------------");
			System.out.println("���� > ");
			int select = scanner.nextInt();
			if(select == 1) {
				System.out.println("���ݾ� : "); int income = scanner.nextInt();
				// �Է°��� 1�̸� ���ݾ��� �Է¹���
				balance = income + balance; // balance += income	
				}
			else if(select == 2) {
				System.out.println("��ݾ� : "); int outcome = scanner.nextInt();
				// �Է°��� 2�̸�
				balance = outcome - balance; // balance -= outcome
				if(outcome>balance) {System.out.println("�ܾ׺���"); } // ��ݾ��� ���ݾ׺��� �� ũ�� �ܾ׺���
				else { balance -= outcome;}
			}
			else if(select == 3) // �Է°��� 3�̸�
			{System.out.println("�ܰ� : " + balance);}
			else if(select == 4) break; // �Է°��� 4�̸� while�� Ż��
			else {System.out.println("�˸�) �� �� ���� ��ȣ�Դϴ�.");}
			
			
			
			} // w  e
		System.out.println("���α׷� ����");
	
	} // m  e

} // c  e
