package Day13_3����;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_����3 {
	// �޷����α׷�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // �Է°�ü ����
		System.out.println("�˻��� ������ �Է��ϼ���"); int year = sc.nextInt(); // ����ڷκ��� ������ �Է¹���
		System.out.println("�˻��� ���� �Է��ϼ���"); int month = sc.nextInt(); // ����ڷκ��� ���� �Է¹���
		�޷�(year, month); // ������ �μ��� �Ͽ� �޷� �޼ҵ� ����
		sc.close(); // �Է°�ü ����
	}
	public static void �޷�(int year, int month) {
		while(true) {// ���ѷ��� �������� : ���α׷� �����
			Scanner sc = new Scanner(System.in); // �Է°�ü ����
			Calendar calendar = Calendar.getInstance(); // ������ ��¥�� ��ü�� ����
			calendar.set(year, month-1, 1); // ����� ���� �޷�(1�� ����)
			// month���� 1�� �� ���� : ��ǻ�ʹ� 0���� �����ϹǷ� �����ÿ� �����ֱ� ����
			int sweek = calendar.get(Calendar.DAY_OF_WEEK); // �ۼ��� ���� 1���� ��ġ�� �˱� ����
			int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // �޷��� �ִ� �������� ����
			System.out.println("*****" + year + "�� " + month + "�� *****"); 
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			for(int i = 1; i < sweek; i++) { // �ָ� ���� ����
				System.out.print("\t"); // 
			}
			for(int i = 1; i <= eday; i++) { // �� ����
				System.out.print(i + "\t"); // ���� ����ϰ� ��
				if(sweek % 7 ==0) System.out.println(); // 7���� �Ǹ� �ٹٲ�
				sweek++; // �Ϸ羿 ���� ����
			}
			
			System.out.println("\n[[�޴� 1. ���� �� 2. ���� �� 3. �ٽ� �˻� 4. ����]]");
			int ch = sc.nextInt();
			if(ch == 1) { // �� 1����, ���� 0�̵Ǹ� ������ 1�����ϰ� ���� 12���� ��
				month -= 1; if(month == 0) {year-=1; month = 12;}
			}
			else if(ch == 2) { // �� 1����, ���� 13�� �Ǹ� ���� 1�����ϰ� ���� 1���� ��
				month += 1; if(month == 13) {year += 1; month = 1;}
			}
			else if(ch == 3) { // �ٽ� ����ڷκ��� �˻��� ������ �Է¹���
				System.out.print("�˻��� ����"); year = sc.nextInt();
				System.out.print("�˻��� ��"); month = sc.nextInt();
			}
			else if(ch == 4) {
				System.out.println("����!");
				sc.close();
				break;
			}
		}
	}
}
