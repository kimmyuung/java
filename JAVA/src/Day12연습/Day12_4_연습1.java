package Day12����;

import java.util.Random;
import java.util.Scanner;

public class Day12_4_����1 {
	// ������ȣ �й� ���α׷�
		// ���� 
			// 1. ���� 0000~9999[4�ڸ� ����] ������ ���� 10�� �����ؼ� �迭�� ���� 
			// 2. ��� ���� ��ȣ�� �迭�� ���� 
			// 3. ���ڸ� ��ȣ�� Ȧ/¦ ����
			// 4. ���� ��¥���� ��ȣ�� Ȧ�� ���� �迭�� ����  
			// 5. ���� ��¥���� ��ȣ�� ¦�� ���� �迭�� ���� 
			// 6. Ȧ������ �迭 ��� // ¦������ �迭 ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] carlist = new String[10];
		String[] oddlist = new String[10];
		String[] evenlist = new String[10];
		
		while(true) {
			System.out.println("������ ���� ���α׷�");
			System.out.println("1. ���� ����");
			int ch = sc.nextInt();
			for( String temp : carlist  ) {
				if( temp != null ) {
					if( Integer.parseInt(temp) % 2 == 0 ) { // ��%2==0 �������� 0�̸� ¦�� 
						System.out.print( temp+"[¦]  " );
					}else {			// ��%2 == 1 �������� 1�̸� Ȧ�� 
						System.out.print( temp+"[Ȧ]  " );
					}
				}
			}
			if(ch == 1) {
				Random random = new Random();
				int carnum = random.nextInt(10000);
				String park = String.format("%04d", carnum);
				boolean save = false;
				
				for(int i = 0 ; i<carlist.length ; i++) {
					if(carlist[i] == null) {
						carlist[i] = park;
						save = true;
						break;
					}
				}
				if(save == true) {
					if(Integer.parseInt(park) % 2 == 0) { // ����! carnum�� ���� �� �ȵǳ���?? 4�ڸ��� �ƴ� ���� �������� �� �� �ֱ� ����
						for( int i = 0 ; i<evenlist.length ; i++) {
							if( evenlist[i] == null ) { evenlist[i] = park; break; }
						}
					}else {		// ��%2 == 1 �������� 1�̸� Ȧ�� 
							for( int i = 0 ; i<oddlist.length ; i++) {
								if( oddlist[i] == null ) { oddlist[i] = park; break; }
							}
						}
					}
				if( save == false )System.err.println(" ���� [ ���� �Ұ� ] ");
				}
				
			}
		}
	}

