package exam;

import java.util.Scanner;

public class exam_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л� ���� �Է��ϼ���. : ");
		
		// 1. �л� �̸�, ���� ����, ���� ����, ���� ����
		//    ����, ���, ����, ���� �迭�� �ʿ��ϴ�.
		String[] name = new String[sc.nextInt()];
		System.out.println("**********************");
		int[] kor = new int[name.length];
		int[] eng = new int[name.length];
		int[] mat = new int[name.length];
		int[] tot = new int[name.length];
		double[] avg = new double[name.length];
		int[] rank = new int[name.length];
		
		// 2. �л� ����ŭ �̸�, ��������, ��������, ����������
		//    Ű����� �Է��� �޾Ƽ� ������ �迭�� ������ �� ����.
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
			rank[i] = 1;
		}
		
		// ���� 
		for(int i=0; i<rank.length; i++) {
			for(int j=0; j<rank.length; j++) {
				if(tot[i] < tot[j]) {
					// ������ ���� ������� ������ �� ����� 1++
					rank[i]++; 
				}
			}
		}
		
		// ���
		for(int i=0; i<name.length; i++) {
			System.out.println("===============================================================");
			System.out.print("�� �� : " + name[i] + " | ");
			System.out.print("�� �� : " + tot[i] + "�� | ");
			System.out.printf("�� �� : %.2f�� | ", avg[i]);
			System.out.print("�� �� : " + rank[i] + "��");
			System.out.println();
		}
		
		sc.close();

	}
}