package ����;

import java.util.Random;
import java.util.Scanner;

public class ����������_3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int cv = 0; int pv = 0; int game = 0;
	while(true) {
	System.out.println("���������� ������ �����մϴ�.");
	System.out.println("0. ����   1. ����  2. ��  3. ����");
	System.out.println("���Ͻô� �޴��� �����Ͽ� �ּ���");
	int select = scanner.nextInt();
	if(select == 0) {
		System.out.println("������ ���ϴ�"); 
	}
	else if(select == 1) {
		System.out.println("������ ���ϴ�"); 
	}
	else if(select == 2) {
		System.out.println("���� ���ϴ�"); 
	}
	else if(select == 3) {
		System.out.println("�� ���� �� : " + game);
		System.out.println("�÷��̾ �̱� ���� �� : " + pv);
		System.out.println("��ǻ�Ͱ� �̱� ���� �� " + cv);
		if(pv > cv) {System.out.println("�÷��̾��� �¸��Դϴ�.");}
		else if(pv == cv) System.out.println("���º��Դϴ�.");
		else System.out.println("��ǻ���� �¸��Դϴ�.");
		break;
	}
	else {System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��Ͽ� �ּ���.");}
	
	Random random = new Random();
	int computer = random.nextInt(3);
	
	if(select==0 && computer == 2 || select == 1 && computer == 0 || select == 2 && computer == 1) {
		System.out.println("�÷��̾��� �¸��Դϴ�."); game++; pv++;
	}
	else if (select==0 && computer == 0 || select == 1 && computer == 1 || select == 2 && computer == 2) {
		System.out.println("���º��Դϴ�."); game++;
	}
	else {System.out.println("��ǻ���� �¸��Դϴ�."); cv++; game++;}
	
	
		}
	}
}
