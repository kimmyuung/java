package ����;

import java.util.Scanner;

public class Updown { // c s
	public static void main(String[] args) { // m s

	// ����������
	// ���� : ����ڷκ��� ���� �Է¹޾Ƽ� ���������� �̵� 
	// ���� �̵� 
	// �Ʒ��� �̵�  
	Scanner scanner = new Scanner(System.in); // �Է°�ü ����
	while(true) { // ���ѷ��� �������� : X /// w s
	System.out.println("------- ���������� --------"); // ���������� ���
	System.out.println("1��   2��   3��   4��   5��");
	System.out.println("------------------------");
	System.out.println(">> ���� ����ڰ� �ִ� �� ���� : ");
	int select = scanner.nextInt(); // ���� ����ڰ� �ִ� ���� �Է¹���
	
	if(select == 1) { // 1�� s
		System.out.printf("���� %d���� �ֽ��ϴ�.\n", select);
		System.out.println("�������� ���⸦ ���Ͻʴϱ�");
		int select2 = scanner.nextInt();
		if(select2 == 1) { System.out.println("�˸�)) 1���� ���� ���Դϴ�."); }
		// 1���� ������
		else if(select2 == 2) { // 1������ 2������ ���� ���
			System.out.println("2������ �̵��մϴ�");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("2���� �����߽��ϴ�.");
		} // 1������ 2������ ���� ��� e
		
		else if(select2 == 3) { // 1������ 3������ ���� ���
			System.out.println("3������ �̵��մϴ�");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("3���� �����߽��ϴ�.");
		}
		
		else if(select2 == 4) { // 1������ 4������ ���� ���
			System.out.println("4������ �̵��մϴ�");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("4���� �����߽��ϴ�.");
		}
		
		else if(select2 == 5) { // 1������ 5������ ���� ���
			System.out.println("5������ �̵��մϴ�");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("5���� �����߽��ϴ�.");
		}
	} // 1�� e
	else if(select == 2) { // 2�� s
		System.out.printf("���� %d���� �ֽ��ϴ�.\n", select);
		System.out.println("�������� ���⸦ ���Ͻʴϱ�");
		int select2 = scanner.nextInt();
		if(select2 == 1) { // 2������ 1������ ���� ���
			System.out.println("1������ �̵��մϴ�");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("1���� �����߽��ϴ�.");
		} // 2������ 1������ ���� ��� e
		
		else if(select2 == 2) { System.out.println("�˸�)) 2���� ���� ���Դϴ�."); }
		// 2���� ������
		else if(select2 == 3) { // 2������ 3������ ���� ���
			System.out.println("3������ �̵��մϴ�");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("3���� �����߽��ϴ�.");
		}
		
		else if(select2 == 4) { // 2������ 4������ ���� ���
			System.out.println("4������ �̵��մϴ�");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("4���� �����߽��ϴ�.");
		}
		
		else if(select2 == 5) { // 2������ 5������ ���� ���
			System.out.println("5������ �̵��մϴ�");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("5���� �����߽��ϴ�.");
		}
	} // 2�� e
	
	else if(select == 3) { // 3��
		System.out.printf("���� %d���� �ֽ��ϴ�.\n", select);
		System.out.println("�������� ���⸦ ���Ͻʴϱ�");
		int select2 = scanner.nextInt();
		if (select2 ==1 ) { // 3������ 1������ ���� ���
			System.out.println("1������ �̵��մϴ�");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("1���� �����߽��ϴ�.");
		}
		else if(select2 == 2) { // 3������ 2������ ���� ���
			System.out.println("2������ �̵��մϴ�");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("2���� �����߽��ϴ�.");
		}
		else if(select2 == 3) {System.out.println("�˸�)) 3���� ���� ���Դϴ�.");}
		else if(select2 == 4) { // 3������ 4������ ���� ���
			System.out.println("4������ �̵��մϴ�");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("4���� �����߽��ϴ�.");
		}
		else if(select2 == 5) { // 3������ 5������ ���� ���
			System.out.println("5������ �̵��մϴ�");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("5���� �����߽��ϴ�.");
		}
	}
	else if(select == 4) {
		System.out.printf("���� %d���� �ֽ��ϴ�.\n", select);
		System.out.println("�������� ���⸦ ���Ͻʴϱ�");
		int select2 = scanner.nextInt();
		if(select2 == 1) {
			System.out.println("1������ �̵��մϴ�");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("1���� �����߽��ϴ�.");
		}
		else if(select2 == 2) {
			System.out.println("2������ �̵��մϴ�");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("2���� �����߽��ϴ�.");
		}
		else if(select2 == 3) {
			System.out.println("3������ �̵��մϴ�");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("3���� �����߽��ϴ�.");
		}
		else if(select2 == 4) {System.out.println("�˸�)) 4���� ���� ���Դϴ�.");}	
		else if(select2 == 5) {
			System.out.println("5������ �̵��մϴ�");
			for(int i = 1; i<select2; i++) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("5���� �����߽��ϴ�.");
		}
		
	}
	else if(select == 5) {
		System.out.printf("���� %d���� �ֽ��ϴ�.\n", select);
		System.out.println("�������� ���⸦ ���Ͻʴϱ�");
		int select2 = scanner.nextInt();
		if(select2 == 1) {
			System.out.println("1������ �̵��մϴ�");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("1���� �����߽��ϴ�.");
		}
		else if(select2 == 2) {
			System.out.println("2������ �̵��մϴ�");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("2���� �����߽��ϴ�.");
		}
		else if(select == 3) {
			System.out.println("3������ �̵��մϴ�");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("3���� �����߽��ϴ�.");
		}
		else if(select == 4) {
			System.out.println("4������ �̵��մϴ�");
			for(int i = 1; i<select2; i--) { // f s
				 System.out.printf("%d\n", i);
			} // f e
			System.out.println("4���� �����߽��ϴ�.");
		}
		else if(select2 ==5) {System.out.println("�˸�)) 5���� ���� ���Դϴ�.");}
	}
	else System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. [���Է�]");	
		} // w e
	} // m e
} // c e
