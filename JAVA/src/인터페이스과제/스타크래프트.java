package �������̽�����;

import java.util.ArrayList;
import java.util.Scanner;

public class ��Ÿũ����Ʈ {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	�������̽�_��Ÿ ���� = new ����();
	�������̽�_��Ÿ �׶� = new �׶�();
	�������̽�_��Ÿ �����佺 = new �����佺();
	int sum = 0;
	int sum1 = 0;
	while(true) {
		System.out.println("��Ÿũ����Ʈ!!!!!");
		System.out.println("1. ai ���� 2. ����");
		int ch = sc.nextInt();
		if(ch ==1) {
			System.out.println("������ �������ּ���");
			System.out.println("1. �����佺 2. ���� 3. �׶�");
			int ch1 = sc.nextInt();
			if(ch1 == 1) {
				�����佺.��������();
				System.out.println("������ ���۵Ǿ����ϴ�.");
				
				while(true) {
				System.out.println("1. �ڿ�ä�� 2. ���ֻ��� 3. ��������");
				int ch2 = sc.nextInt();
				if(ch2 == 1) {
					int �̳׶��� = �����佺.�ڿ�ä��(sum);
					int ������ = �����佺.����ä��(sum1);
					sum += �̳׶���;
					sum1 += ������;		
					System.out.println("�̳׶� : " + �̳׶���);
					System.out.println("���� : " + ������);
				}
				else if(ch2 == 2) {
					System.out.println("������ �����մϴ�.");
					System.out.println("���� ����");
					System.out.println("1. ����");
					boolean result = �����佺.���ֻ���(sum, sum1);
					if(result) {System.out.println("���� 1�Ⱑ ����!");
					sum -= sum - 200; sum1 -= sum1-200;}
					else System.out.println("�ڿ��� �����մϴ�.");
				}
				else if(ch2 == 3) {
					System.out.println("������ �����մϴ�.");
					break;
				}
				else {
					System.out.println("�߸��� ����Դϴ�. �ٽ� �������ּ���");
				}
				}
			}
			else if(ch1 == 2) {
				����.��������();
				System.out.println("������ ���۵Ǿ����ϴ�.");
				while(true) {
					
					System.out.println("1. �ڿ�ä�� 2. ���ֻ��� 3. ��������");
					int ch2 = sc.nextInt();
					if(ch2 == 1) {
						int �̳׶��� = ����.�ڿ�ä��(sum);
						int ������ = ����.����ä��(sum1);
						sum += �̳׶���;
						sum1 += ������;		
						System.out.println("�̳׶� : " + �̳׶���);
						System.out.println("���� : " + ������);
					}
					else if(ch2 == 2) {
						System.out.println("������ �����մϴ�.");
						System.out.println("���� ����");
						System.out.println("1. ���۸�");
						boolean result = ����.���ֻ���(sum, sum1);
						if(result) {System.out.println("���۸� 2�Ⱑ ����!");
						sum -= sum - 100; sum1 -= sum1-100;}
						else System.out.println("�ڿ��� �����մϴ�.");
					}
					else if(ch2 == 3) {
						System.out.println("������ �����մϴ�.");
						break;
					}
					else {
						System.out.println("�߸��� ����Դϴ�. �ٽ� �������ּ���");
					}
					}
			}
			else if(ch1 == 3) {
				�׶�.��������();
				System.out.println("������ ���۵Ǿ����ϴ�.");
				while(true) {
					
					System.out.println("1. �ڿ�ä�� 2. ���ֻ��� 3. ��������");
					int ch2 = sc.nextInt();
					if(ch2 == 1) {
						int �̳׶��� = �׶�.�ڿ�ä��(sum);
						int ������ = �׶�.����ä��(sum1);
						sum += �̳׶���;
						sum1 += ������;		
						System.out.println("�̳׶� : " + �̳׶���);
						System.out.println("���� : " + ������);
					}
					else if(ch2 == 2) {
						System.out.println("������ �����մϴ�.");
						System.out.println("���� ����");
						System.out.println("1. ����");
						boolean result = �׶�.���ֻ���(sum, sum1);
						if(result) {System.out.println("���� 1�Ⱑ ����!"); 
						sum -= sum - 150; sum1 -= sum1-150;}
						else System.out.println("�ڿ��� �����մϴ�.");
					}
					else if(ch2 == 3) {
						System.out.println("������ �����մϴ�.");
						break;
					}
					else {
						System.out.println("�߸��� ����Դϴ�. �ٽ� �������ּ���");
					}
					}
			}
			else {System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
		}
		else if(ch == 2) {
			System.out.println("������ �����մϴ�.");
			break;
		}
		
	}
}
}
