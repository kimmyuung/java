package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	// 1. Ķ���� Ŭ������ ���� ��¥/�ð� ��ü ȣ��
	
	System.out.println("���� : "); int year = sc.nextInt();
	System.out.println("�� : "); int month = sc.nextInt();
	�޷�(year, month);
	}

	public static void �޷�(int year, int month) {
		while(true) {
			Calendar calendar = Calendar.getInstance(); // ���� ��¥
			Scanner sc = new Scanner(System.in);
			// �ش� ���� 1���� ���� ã��
				// 1. ����� ���� Ķ���� ����
					calendar.set(year, month-1, 1); // ex) �ۼ��ѿ��� 1�� ��¥ ����
						
					// 2. 3�� 1���� ���� 
					int sweek = calendar.get(Calendar.DAY_OF_WEEK);
						
					int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
					// �ش� ��¥�� �������ϼ��� ����
					
					// 3. ���
			System.out.println("*****" + year + "�� " + month + "�� *****");
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
	
			// ���� �� 1���� ��ġ �տ� ���� ä���
			for(int i = 1; i < sweek ; i ++) {
				// 3��1���� ȭ���� = 3
				System.out.print("\t");
			}
			
			// 1�Ϻ��� ��������¥ ���� ���
			for(int i = 1; i <= eday ; i ++) {
				// ���� üũ
				//if(i == day) System.err.print(i + "\t");
				System.out.print(i + "\t"); // i = �� ���
				// �����(������� 7)���� �ٹٲ� ó��
				if(sweek%7==0) System.out.println(); // ���ϴ������ؾ� ��...
				sweek++; // �Ϸ羿 ���� ����
			}
			
			// ��ư[1. ������ 2. ������]
			try {
				System.out.print("\n[�޴� : 1. ������ 2. ������ 3. �ٽð˻� 4. ����]");
				int ch = sc.nextInt();
				if (ch == 1) {
					month -= 1; if(month == 0) {month = 12; year -= 1;}
				}
				else if (ch == 2) {
					month += 1; if(month == 13) {month = 1; year += 1;}
				}
				else if (ch == 3) {
					System.out.println("���� : "); year = sc.nextInt();
					System.out.println("�� : "); month = sc.nextInt();
				}
				else if (ch == 4) {
					System.out.println("�����մϴ�"); break;// �޼ҵ� ����
				}
				else if (ch < 0) {
					System.out.println("������ �Է��Ͻø� �ȵ˴ϴ�. �ٽ� �Է����ּ���");
				}
				else System.out.println("��ϵ��� ���� �����Դϴ�. �ٽ� �Է����ּ���");
			}catch(Exception e) {System.out.println("�������� �Է��� ���ּ���");}
		}
		
	}
}
