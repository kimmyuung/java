package exam;

import java.util.Scanner;

public class exam_1 { // ce
public static void main(String[] args) { // ms
//	1. ����ǥ�� �׻� ����� �Ǿ� �ֵ��� �մϴ�. [ 10�� ]
//	2. �޴����� 1�� ���ý� �л������� �߰� �մϴ�. [ 5�� ]
//	3. �޴����� 2�� ���ý� �л������� ���� �մϴ�. [ 5�� ]
//	4. �����ʹ� Ű����� �Է¹޾� �迭�� �����մϴ�. [ 5�� ]
//	5. ���� �Է��� 5������ �ϵ�, �ִ� 100�� �� �����ϵ��� �ۼ��մϴ�. [ 5�� ]
//	6. ��ȣ �̸�, ����, ����, ������ �Է��ϰ�, ������ ����� ���Ͽ� ����մϴ�. [ 5�� ]
//	7. ����� �Ҽ��� ���� 2�ڸ������� �մϴ�. [ 5�� ]
//	8. ������ �̿��Ͽ� ������ ���մϴ�. [ 5�� ]
//	9. �Է� ������ ���Ͽ� ���ܹ߻� ��Ȳ�� ���� ó���� �մϴ�. [ 5�� ]
	String[] name = new String [100]; // �л��̸�
	int [][] scores = new int[100][3]; // ��������
	int [] ranks = new int[100]; // ����
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("                    ��      ��      ǥ                    ");
		System.out.println("��ȣ   �̸�    ����   ����   ����   ����   ���    ����");
		
		System.out.println("[1. �л����� ��� 2. �л����� ����");
		int ch = sc.nextInt();
		if(ch == 1) {
			System.out.println("�л������� ����մϴ�.");
			System.out.println("�л� �̸��� �Է��ϼ���"); String sname = sc.next();
			System.out.println("���� ������ �Է��ϼ���"); int kor = sc.nextInt();
			System.out.println("���� ������ �Է��ϼ���"); int math = sc.nextInt();
			System.out.println("���� ������ �Է��ϼ���"); int eng = sc.nextInt();
			for(int i = 0; i < 100; i++) {
				if(name[i] != null) {name[i] = sname;}
				if(scores[i][0] != 0 && scores[i][1] != 0 && scores[i][2] != 0) {
					scores[i][0] = kor;
					scores[i][1] = math;
					scores[i][2] = eng;
					System.out.println("�л������� ��ϵǾ����ϴ�.");
					break;
				}
			}
			
			
		}
		else if(ch==2) {
			
		}
		else {System.out.println("�Է��� �� ���� �����Դϴ�. �ٽ� �Է����ּ���.");}
		
		}
	
	
	
	} // me
} // ce
