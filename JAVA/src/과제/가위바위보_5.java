package ����;

import java.util.Random;
import java.util.Scanner;

public class ����������_5 {
public static void main(String[] args) {
	
	int game = 0; int cv = 0; int pv = 0;
	Scanner scanner = new Scanner(System.in);
	while(true) {
	
		System.out.println("���������� ������ �����մϴ�.");
		System.out.println("1. ���� 2. ���� 3. �� 4. ����");
		System.out.println("������ ���ϴ� �޴��� �Է��Ͽ� �ּ���.");
		int select = scanner.nextInt();
		if(select == 1) {
			System.out.println("�÷��̾�� ������ ���ϴ�.");
		}
		else if(select == 2) {
			System.out.println("�÷��̾�� ������ ���ϴ�.");
		}
		else if(select == 3) {
			System.out.println("�÷��̾�� ���� ���ϴ�.");
		}
		else if(select == 4) {
			System.out.println("�� ���� �� : " + game);
			System.out.println("�÷��̾ �̱� Ƚ�� : " + pv);
			System.out.println("��ǻ�Ͱ� �̱� Ƚ�� : " + cv);
			if (pv > cv) {System.out.println("�÷��̾��� ���� �¸��Դϴ�.");}
			else if(pv == cv) {System.out.println("���º� �Դϴ�.");}
			else {System.out.println("��ǻ���� ���� �¸��Դϴ�.");}
			break;
		}
		else {System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
		Random random = new Random();
		int com = random.nextInt(3)+1;
		if(select == 1 && com == 3|| select == 2 && com == 1 || select == 3 && com == 2)
		{System.out.println("�÷��̾��� �¸��Դϴ�."); game++; pv++;}
		else if(select == 1 && com == 1|| select == 2 && com == 2 || select == 3 && com == 3)
		{System.out.println("���º��Դϴ�."); game++; }
		else {System.out.println("��ǻ���� �¸��Դϴ�."); game++; cv++;}
		}	
	}
}
