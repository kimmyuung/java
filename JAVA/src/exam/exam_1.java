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
	int [] ranks = new int[100]; // ����
	int[] kor = new int[name.length];
	int[] eng = new int[name.length];
	int[] mat = new int[name.length];
	int[] tot = new int[name.length];
	double[] avg = new double[name.length];
	int[] rank = new int[name.length];
	Scanner sc = new Scanner(System.in);
	while(true) { // w1 s
		System.out.println("��      ��      ǥ");
		System.out.println("��ȣ   �̸�    ����   ����   ����   ����   ���    ����");
		for(int i=0; i<name.length; i++) {
			if(name[i] != null && kor[i] != 0)
			System.out.print("�� ȣ : " + i);	
			System.out.print("�� �� : " + name[i] + " | ");
			System.out.print("�� �� : " + tot[i] + "�� | ");
			
			System.out.printf("�� �� : %.2f�� | ", avg[i]);
			System.out.print("�� �� : " + rank[i] + "��");
			System.out.println();
			break;
		}
		System.out.println("[1. �л����� ��� 2. �л����� ����");
		int ch = sc.nextInt();
		if(ch == 1) {
			for(int i=0; i<name.length; i++) {
				//// �̸��� �� ������ ���� �迭�� ���� ////
				System.out.print("�л� �̸� �Է� : ");
				name[i] = sc.next();
				
				System.out.print("���� ���� �Է� : ");
				kor[i] = sc.nextInt();
				
				System.out.print("���� ���� �Է� : ");
				eng[i] = sc.nextInt();
				
				System.out.print("���� ���� �Է� : ");
				mat[i] = sc.nextInt();
				
				System.out.println("**********************");
				
				//// ������ ��հ� ���� ���ϱ� ////
				// ����
				tot[i] = kor[i] + eng[i] + mat[i];
				// ���
				avg[i] = tot[i] / 3.0;
				
				// ����
				// ��� �л��� ������ 1���̶�� �����Ѵ�.
				rank[i] = 1; break;
			} // ����
			for(int i=0; i<rank.length; i++) {
				for(int j=0; j<rank.length; j++) {
					if(tot[i] < tot[j]) {
						// ������ ���� ������� ������ �� ����� 1++
						rank[i]++; 
					}
				}
			}
				
				
		// ���
		
			}
		else if(ch==2) {		}	
		else {System.out.println("�Է��� �� ���� �����Դϴ�. �ٽ� �Է����ּ���.");}	
		
		
		
		
} // w1 e
} // me
} // ce
