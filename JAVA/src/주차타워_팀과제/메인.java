package ����Ÿ��_������;

import java.util.ArrayList;
import java.util.Scanner;

public class ���� {
	public static void main(String[] args) {
		��Ʈ�ѷ� con = new ��Ʈ�ѷ�();
		Scanner sc = new Scanner(System.in);
		con.�������Ϸε�();
		while (true) {
			System.out.println("\n����Ÿ�� ���α׷�(������)");
			System.out.println("1. ����Ÿ�� ���� 2. ���� 3. ���� 4. ����Ȯ�� 5. ���α׷� ����");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("����Ÿ���� �Ǽ��մϴ�.");
				System.out.println("������ ũ�⸦ �Է����ּ���");
				System.out.println("1���� �������� 5������ �Ǽ��� �����մϴ�.");
				int park = sc.nextInt();
				con.����Ÿ���Ǽ�(park);
				for (int i = 0; i < con.parktower.length; i++) {
					System.out.print(con.parktower[i] + "\t");
					if (i % 5 == 4) {
						System.out.println();
					}
				}
			} else if (ch == 2) {

				System.out.println("������ �����մϴ�.");
				System.out.print("������ȣ�� �Է����ּ��� : "); String Carnum = sc.next();
				for (int i = 1; i <= con.parktower.length; i++) {
					System.out.print("[" + i + "]" + "\t");
					if (i % 5 == 0) {
						System.out.println();
					}
				}
				System.out.println("\n������ ��ġ�� �������ּ���");
				int location = sc.nextInt();
				boolean result = con.����(Carnum, location - 1);
				if (result) {
					for (int i = 0; i < con.parktower.length; i++) {
						System.out.print(con.parktower[i] + "\t");
						if (i % 5 == 4) {
							System.out.println();
						}
					}
					System.out.println("���� �Ϸ�!");
				}
				else System.out.println("[[���� ���� : ���� �ڸ��� ���� �ְų� ������ȣ�� �ߺ��˴ϴ�]]");
			} else if (ch == 3) {
				System.out.println("������ ���� ��ȣ�� �Է��ϼ���"); String carNum = sc.next();
				boolean result = con.����(carNum);
				if(result) {
					System.out.println("������ �����Ͽ����ϴ�.");
					int ������� = con.���();
					System.out.println("���ݾ� : " + �������);
					System.out.print("\n�ݾ��� �������ּ��� : ");
					int �����ݾ� = sc.nextInt();
					if(������� > �����ݾ�) {
						System.out.println("���� �����մϴ�. " + (�������-�����ݾ�) + "���� �� �������ּ���");
						int �����ݾ� = sc.nextInt();
						if(�����ݾ� + �����ݾ� < �����ݾ�) {System.out.println("���� �� �־��ּ���");}
						else System.out.println("���� �Ǿ����ϴ�.");
					}
					else if(������� < �����ݾ�) {System.out.println("���� �Ǿ����ϴ�. " + (�����ݾ�-�������) + "���� ��ȯ�մϴ�.");}
					else if(������� == �����ݾ�) {System.out.println("���� �Ǿ����ϴ�.");}
					con.����ݴ���(�������);
					
				}
				else System.out.println("[[���� ���� : �ش� ���� ��ȣ�� ������ ���� �������� �ʽ��ϴ�]]");
			} else if (ch == 4) {
				
				
				boolean isInputRight = true;	// ����ڰ� �����Ѵ�� ���� �Է��ߴ��� ����ϴ� �÷���. true : �������
				System.out.printf("�˻��� ������ ������ �Է��ϼ���.\n�Է¿���) 2022�� : 22\n�Է°��ɿ��� : 20~22\n�Է� >");
				int year = sc.nextInt();
				System.out.printf("%2d�⿡�� �˻��� ���� ������ �Է��ϼ���.\n�Է¿���)03�� : 3\n�Է� >",year);
				int month = sc.nextInt();
				System.out.print("���ı����� ���ÿ�\n1. ���� | 2. �ݾ�\n���� >");
				int sortBy = sc.nextInt();
				System.out.println("=====================================");
				
				if(sortBy<1 || sortBy>2 ) {	// ���� ���ı����� 1���̳� 2���� �ƴѰ� ����
					System.out.println("���� ���� �ȿ� �ִ°� ����ּ���...");
					isInputRight=false;
				}else if(month<1 || month>12) {	// �˻� ���� 1~12�� ������ �Է��ϸ�
					System.out.println("���� 1������ 12�������� �־��ּ���...");
					isInputRight=false;
				}else if(year<20 || year>22) {
					System.out.println("�Է³⵵�� Ȯ���ϼ���.\n�Է°��ɿ��� : 20~22��");
					isInputRight=false;
				}
				
				if(isInputRight==true) {	
					ArrayList<����> �˻������¿븮��Ʈ =  new ArrayList<>(con.�������(year, month, sortBy));
					if(�˻������¿븮��Ʈ.size()==0)	// ���� ���Ϲ��� ����Ʈ�� �ϰ͵� ��������
						System.out.println("�Է��� �Ⱓ���� ������ �����ϴ�.");
					int sum=0;
					for(���� tmp : �˻������¿븮��Ʈ) {
							System.out.printf("%d�� %2d�� %3s ���� : %s��\n", year, month, tmp.get��¥(), tmp.get����ݾ�());
							sum += tmp.get����ݾ�();
					}
					System.out.printf("\n%d�� %2d���� ����� �հ�� %5d�� �Դϴ�.\n",year,month,sum);
					System.out.println("=====================================");
				}
				
			} else if (ch == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				break;
			}
		}
	}
}
