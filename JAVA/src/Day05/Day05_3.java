package Day05;

import java.util.Scanner;

public class Day05_3 { // c  s
public static void main(String[] args) { // m  s
	
	// p. 181
	// �迭 = {1��}, {2��}, {3��} => 3 // { 78 83 93 87 88} => 5
	// 7.
	int max = 0;
	int[] array = {1, 5, 3, 8, 2}; // �迭�� ����� �ʱ�ȭ
	
	for(int i = 0; i<array.length; i++) {
		if(max <array[i] ) 
			max = array[i]; // max���� i��° �ε����� ���� �� ũ�� max�� i��° �� ����
		
		}
	System.out.println("max : " + max);
	
	// 8.
	int [][] array1 = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
	int sum = 0;
	double avg = 0.0;
	int count = 0; // ������ ���� [ĭ ����]
	
	// Ǯ�� (2���� �迭�� ��� ������ ȣ��)
	for(int i = 0; i < array1.length; i++) { 
		// ���� 0���� �����[3]�̸����� 1������
		for(int j = 0; j<array1[i].length; j++) 
			{ // ���� 0���� �迭�� ������ [2, 3, 5] �̸����� 1������
			sum += array1[i][j]; // �� ����
			}
		count += array1[i].length; // �������� �����հ�
		}
	avg = (double)sum / count;
	
	System.out.println(" sum : " + sum);
	System.out.println(" avg : " + avg);
	
	// 9.
	boolean run = true;
	int studentnum = 0; // �л� �� ����
	int[] scores = null; // ���� �迭 ���� -> �޸� �Ҵ� X
	Scanner scanner = new Scanner(System.in);
		while(run) { // w1  s
			System.out.println("-----------------------------------------------------");
			System.out.println("1. �л���\t 2. �����Է� \t 3. ��������Ʈ \t 4. �м�\t 5. ����");
			System.out.println("-----------------------------------------------------");
			System.out.println(">>>>>>> ���� : "); int select1 = scanner.nextInt();
			
			if(select1 == 1) { // �л� �� �Է�
			System.out.println("�л� ���� �Է����ּ���");
			studentnum = scanner.nextInt(); 
			// �Է¹��� �� ��ŭ �л� ���� �迭�� �����ؾ� �� = �Է¹��� �л��� ��ŭ �迭���̸� �����ؾ� ��
			scores = new int[studentnum];
			System.out.println("�л� �� : " + studentnum);
			}
			else if(select1 == 2) { // ���� �Է�
				for(int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d] : ", i);
					scores[i] = scanner.nextInt(); // �Է¹޾� i��° �ε����� ����
				}	
			}
			else if(select1 == 3) { // ���� ���
				for(int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d] : %d\n", i, scores[i]); // i��° �ε��� ���
				}
			}	
			else if(select1 == 4) { // ���� �м�
				int highscore = 0;
				int sum1 = 0;
				double avg1 = 0.0;
				for(int i = 0; i<scores.length; i++) {
					// �ְ����� ���ϱ�
					if(max < scores[i]) max = scores[i]; // i��° �ε����� ������ ����
					// ������� ���ϱ�
					sum1 += scores[i];	
				}
				avg = sum1 / scores.length;
				System.out.println("�ְ� ���� : " + highscore);
				System.out.println("��� ���� : " + avg1);
				
			}
			else if(select1 == 5) {
				run = false; // = break;
			}
			else System.out.println("�˸�)) �� �� ���� ��ȣ�Դϴ�. ���Է��� ���ּ���");
		} // w1 e
	
	} // m  e 
} // c  e
