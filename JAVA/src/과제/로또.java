package ����;

import java.util.Random;
import java.util.Scanner;

public class �ζ� {
public static void main(String[] args) {
	
	// �غ�
			int[] ����ڹ�ȣ = new int[6]; // ����ڰ� ������ ��ȣ ��� 
			int[] ��÷��ȣ = new int[6];	// ��ǻ�Ͱ� ���� ��ȣ ���
			Scanner scanner = new Scanner(System.in);
			
			// 1. ����ڿ��� �Է¹ޱ� 
			for( int i = 0 ; i<6 ; i++ ) {
				// i�� 0���� 5���� 1�������ݺ� => 6ȸ�ݺ�
				System.out.print(" 1~45 ���� �Է� : "); 
				int ��ȣ = scanner.nextInt(); // ����ڷκ��� �ζ� ��ȣ�� �Է¹���
				
				boolean ��� = true; // ���� �Ǵ� ���� ����
				
				// ����1 : ��ȿ���˻� 
				if( ��ȣ < 1 || ��ȣ > 45 ) { // 1���� �۰ų� 45���� ũ�� �����Ҽ� ���� ��ȣ�Է½� ���Է� 
					System.out.println(" �˸�)) �����Ҽ� ���� ��ȣ �Դϴ�.[���Է�] ");
					i--; // ���� i�� �����Է�x
					��� = false; // ���� x 
				}// if end 
				
				// ����2 : �ߺ�üũ 
				for( int j = 0 ; j<6 ; j++ ) {
					if( ��ȣ == ����ڹ�ȣ[j] ) {
						// 2. �Է¹��� ���� j��° �ε������� ������ ��
						System.out.println(" �˸�)) �̹� ������ ��ȣ �Դϴ�.[���Է�]");
						i--; // ���� i�� �����Է�x
						��� = false; // ����x
					} // if end 
				} // for2 end 
				// �����Է�[����� true] �̸� �迭�� �����ϱ� 
				if( ��� == true) ����ڹ�ȣ[i] = ��ȣ;
				
			} // for end 
			
			System.out.print("\n����ڰ� ������ ��ȣ : ");
			// * ����� �迭�� ��� �ε��� ��� 
			for( int temp : ����ڹ�ȣ ) {
				System.out.print( temp +"\t");
			}
			
			// 2. ��ǻ�Ͱ� �������� 
			for( int i =0 ; i<6 ; i++) {
				Random random = new Random(); // 1. ������ü
				int ��÷ = random.nextInt(45)+1; // 2. ������ int������ 1~45 ���� ���� ��������
				// ����1 : �ߺ�üũ
				boolean ��� = true;
				for( int temp : ��÷��ȣ ) {
					if( ��÷ == temp ) {
						i--; // �ߺ��� ������� ���� i ����
						��� = false; // ���� x 
					}
				}
				if( ��� ) ��÷��ȣ[i] = ��÷;
			}
			System.out.print("\n \t��÷��ȣ\t: ");
			// * �迭�� ��� �ε��� ��� 
			for( int temp : ��÷��ȣ ) {
				System.out.print( temp +"\t");
			}
			
			int �����Ѽ� =0;

			
			// ���2 
			for( int �񱳱��� : ����ڹ�ȣ ) {
				// ����ڹ�ȣ �迭�� �ϳ��� �񱳱��� ���� 
				for( int �񱳴�� : ��÷��ȣ ) {
					// ��÷��ȣ �迭�� �ϳ��� �񱳴�� ����
					if( �񱳱��� == �񱳴��) �����Ѽ�++;
					// ���࿡ �񱳱��ذ� �񱳴���� �����ϸ� �����Ѽ� 1����
				}
			}
			
			System.out.println(" \n������ �� : " + �����Ѽ� );
		}	
	}


