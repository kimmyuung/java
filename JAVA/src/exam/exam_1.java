package exam;

import java.util.Scanner;

public class exam_1
{
// ����ǥ ���
	// �ʱ�޴� [1. �л����� ��� 2. �л����� ����]
	// �Է¹޴� �� : �̸� , ����, ����, ����
	// ���� �Է��� 5������ �ϵ� 100����� �����ϵ��� �ۼ�
	// ����� �Ҽ��� ����2�ڸ�����
	// ������� ���
public static void main(String[] args)
{
	String [] �л��̸� = new String[100];
	int [][] ���� = new int[100][3];
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println(" ----- �л� ������ ----- ");
		System.out.println("[1. �л����� ��� 2. �л����� ����"); 
		
		int ch = sc.nextInt();
	if(ch == 1) {
		System.out.println("�л� �̸��� �Է��ϼ���."); String name = sc.next();
		System.out.println("���� ������ �Է��ϼ���"); int kor = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���"); int math = sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���"); int eng = sc.nextInt();
		for(int i = 0; i<�л��̸�.length; i++) {
			if(�л��̸�[i] == null) {
				System.out.println("�л� �̸� ��� ����");
				�л��̸�[i] = name; 
				break;
				}
		}
		for(int i = 0; i<����.length; i++) {
			if(����[i][0] == 0) {
				����[i][0] = kor;
				����[i][1] = math;
				����[i][2] = eng;
				System.out.println("������� ����");
				break;
			}
		}
		System.out.print("�̸�\t ����\t ����\t ����\t ����\t ���\t ����\t \n");
		
	}
	else if(ch == 2) {
		System.out.println("������ �л��� �̸��� �Է��ϼ���"); String name = sc.next();
		for(int i = 0 ; i<�л��̸�.length; i++) {
			if(�л��̸�[i] != null && �л��̸�[i].equals(�л��̸�)) {
				�л��̸�[i] = null; ����[i][0] -= 0; ����[i][1] -= 0; ����[i][2] -= 0;
				break;
			}
		}	
	}
	else {System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");}
	for(int i = 0; i<����.length; i++) {
		if(����[i][0] != 0 && �л��̸�[i] != null) {
			int sum = ����[i][0] + ����[i][1] + ����[i][2];
			double avg = ����[i][0] + ����[i][1]+ ����[i][2];
			System.out.println(�л��̸�[i] + "\t" + ����[i][0] + "\t" + ����[i][1] + "\t" + ����[i][2] 
					+ "\t" + sum + "\t" + avg + "\t");
		}
	}	
	}
}	
	
}
