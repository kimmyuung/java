package ����;

import java.util.Random;
import java.util.Scanner;

public class ����������_2 {
public static void main(String[] args) {
	int game = 0;
	int pv = 0; int cv = 0;
Scanner scanner = new Scanner(System.in);
	while(true) {
		System.out.println("���������� ������ �����մϴ�.");
		System.out.println("0. ���� 1. ���� 2. �� 3. ����");
		System.out.println("�޴��� �������ּ���.");
		int select = scanner.nextInt();
		Random random = new Random();
		int computer = random.nextInt(3);
		if(select == 0) {
			System.out.println("������ ���̽��ϴ�.");
			game++;
		}
		else if(select ==1) {
			System.out.println("������ ���̽��ϴ�.");
			game++;
		}
		else if(select ==2) {
			System.out.println("���� ���̽��ϴ�.");
			game++;
		}
		else if(select ==3) {
			System.out.println("�� ���� �� : " + (game-1));
			System.out.println("��ǻ���� �¸� Ƚ�� :" + (cv-1));
			System.out.println("������� �¸� Ƚ�� : " + pv);
			if(pv < cv-1) {System.out.println("��ǻ�Ͱ� �¸��Ͽ����ϴ�.");}
			else if(pv == cv-1) {System.out.println("���º��Դϴ�.");;}
			else {System.out.println("����ڰ� �¸��Ͽ����ϴ�.");}
			break;
			
		}
		else {System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
		if (select == 0 && computer == 2 || select == 1 && computer == 0 || select == 2 && computer == 1)
		{System.out.println("�÷��̾ �¸��Ͽ����ϴ�"); pv++;}
		else if (select == 2 && computer == 2 || select == 1 && computer == 1 || select == 0 && computer == 0)
		{System.out.println("���º��Դϴ�."); game++;}
		else System.out.println("��ǻ���� �¸��Դϴ�."); cv++;
		
		
		}
	}
}
