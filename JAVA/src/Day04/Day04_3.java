package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 { // c  s
public static void main(String[] args) { // m  s
	
	
	// ���������� ����
	// 1. ����ڿ��� ����[0] ����[1] ��[2] ����[3] �߿� �Է¹���
	// 2. ��ǻ�� �����߻�[0-2]
	// 3. ����ڿ� ��ǻ�� �� �¸��� �Ǵ�
	// 4. 3�� �����ϱ� ������ ���� ����
	// 5. 3�� ���ý� -> �� ���Ӽ�, ���� �¸���(��ǻ�� : ����, ����� : ���� �̱�) ���
	// -> ���� : ����� 1��, ��ǻ�� 1��, �������������� ���� Ƚ��, ���� �¸�, �÷��̾� �¸� ��, ��ǻ�� �¸� �� 
	// �غ�(����)
	int player; // ����ڰ� ������ ��
	int computer; // ��ǻ�Ͱ� ������ ������ ��
	int game = 0; // �� ���� ��
	int pv = 0; int cv = 0;// �÷��̾� �¸� ��, ��ǻ�� �¸� ��
	Scanner scanner = new Scanner(System.in); // ��ü ����
	
	// ���α׷� ���� [���ѷ��� ���� ���� : 3�� �Է½� ����(break;)
	while(true) { // w  s
		System.out.println("----------���� ���� �� ����----------");
		System.out.println("����(0)  ����(1)  ��(2)  ����(3) ����");
		player = scanner.nextInt(); // �Է��� �� ����
		System.out.println("�÷��̾ ���� : "); // �÷��̾ �� �� ���
		
		Random random = new Random(); // ���� ��ü ����
		// random.nextInt() : int�� ǥ���� �� �ִ� ������ ���� �߻�
		// random.nextInt(��) : 0 ~ ��-1 ���� ������ ���� �߻�
			// ex) random.nextInt(10) : 0 ~ 9 �� ���� �߻�
			// ex) random.nextInt(11) + 10 : 10 ~ 20 �� ���� �߻�
			// random.nextInt(��) + ���۹�ȣ : 0 ~ �� ������ ������ ���� �߻�
		computer = random.nextInt(3); // ������ ����(int��)�� ��������
		System.out.println("��ǻ�Ͱ� �� �� : " + computer);
		
				
		if(player == 3) {
		 System.out.println("------- ���� ��� -------");
		 System.out.printf("�÷��̾� �¸� �� : %d	��ǻ�� �¸� �� : %d		", pv,cv);
		 System.out.printf("\n  �� ���� �� : %d ", game);
		if(cv == pv) {System.out.println("�����ϴ�.");}
		else if(cv > pv) {System.out.printf("\n�� ���� �� : %d �����¸��� : ��ǻ��", game);}
		else {System.out.printf("\n�� ���� �� : %d �����¸��� : �÷��̾�", game);}
		break;
		
		}
		else {System.out.println("����) �ٽ��Է����ּ���");}
		game++; // ���� �� ����
		
		// �¸��� �Ǵ�
		if(player == 0 && computer == 2 || player == 1 && computer == 0 || player == 2 && computer == 1) 
			{ 
			// �÷��̾� �¸� ����� �� : 0 -> 2 // 1 -> 0 // 2 -> 1
			System.out.println("�÷��̾ �̰���ϴ�.");
			pv++; 
			} 
			
		else if(player == 2 && computer == 2 || player == 1 && computer == 1 || player == 0 && computer == 0)  
			{ // ���� �� 
				System.out.println("�����ϴ�.");	
				
			}
		else { // �÷��̾� �й� �Ǵ�
			System.out.println("��ǻ�Ͱ� �¸��Ͽ����ϴ�.");
			cv++; 
			}
	
		} // w  e
	
	
	} // m  e
} // c  e
