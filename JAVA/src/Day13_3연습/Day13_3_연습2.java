package Day13_3����;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_����2 {
// �޷����α׷�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : "); int year = sc.nextInt();
		System.out.println("�� : "); int month = sc.nextInt();
		�޷�(year, month);
		sc.close();
		
	}
	
	public static void �޷�(int year, int month) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(year, month-1, 1);
		
		int sweek = calendar.get(Calendar.DAY_OF_WEEK);
		int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		for(int i = 1; i < sweek; i++) {
			System.out.print("\t");
		}
		
		for(int i = 1; i < eday; i++) {
			System.out.print(i + "\t");
			if(sweek % 7 == 0) System.out.println();
			sweek++;
		}
		System.out.println("�޴�[[1. ������ 2. ������ 3. �ٽ� �˻� 4. ����]]");
		int ch = sc.nextInt();
		if(ch == 1) {
			month -= 1; if(month == 0) {year -= 1; month = 12;}
		}
		else if(ch == 2) {
			month += 1; if(month == 13) {year += 1; month = 1;}
		}
		else if(ch == 3) {
			System.out.println("�˻��� ������ �Է����ּ���"); year = sc.nextInt();
			System.out.println("�˻��� ��¥�� �Է����ּ���"); month = sc.nextInt();
		}
		else if(ch == 4) {
			System.out.println("���α׷� ����!");  sc.close();
			break;
		}
		}
		}
	}

