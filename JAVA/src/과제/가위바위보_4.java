package ����;

import java.util.Random;
import java.util.Scanner;

public class ����������_4 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int game = 0; int cv = 0; int pv =  0;
	while(true) {
	System.out.println("���������� ������ �����մϴ�");
	System.out.println("0. ���� 1. ���� 2. �� 3. ����");
	int select = scanner.nextInt();
	if(select == 0) {
		System.out.println("����ڴ� ������ ���ϴ�.");
	}
	else if(select == 1) {
		System.out.println("����ڴ� ������ ���ϴ�.");
	}
	else if(select == 2) {
		System.out.println("����ڴ� ���� ���ϴ�.");
	}
	else if(select == 3) {
		System.out.println("�� ���� �� : " + game);
		System.out.println("�÷��̾ �̱� Ƚ�� : " + pv);
		System.out.println("��ǻ�Ͱ� �̱� Ƚ�� : " + cv);
		if(pv > cv)  {System.out.println("�÷��̾��� ���� �¸��Դϴ�.");}
		else if(pv == cv) {System.out.println("���º� �Դϴ�.");}
		else {System.out.println("��ǻ���� ���� �¸��Դϴ�.");}
		break;
	}
	else System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��Ͽ� �ּ���.");
	Random random = new Random();
	int com = random.nextInt(3);
	
	if (select == 0 && com == 2 || select == 1 && com == 0 || select == 2 && com == 1)
	{System.out.println("�÷��̾��� �¸��Դϴ�."); pv++; game++;}
	else if (select == 0 && com == 0 || select == 1 && com == 1 || select == 2 && com == 2)
	{System.out.println("�÷��̾��� �¸��Դϴ�."); game++;}
	else {System.out.println("��ǻ���� �¸��Դϴ�."); cv++; game++;}
		}
	}
}
