package ����;

import java.util.Random;
import java.util.Scanner;

public class ���������� {
public static void main(String[] args) {
	
	int game = 0; int pv = 0; int cv = 0; 
	while(true) {
	System.out.println("���������� ������ �����մϴ�.");
	System.out.println("1. ���� 2. ���� 3. �� 4. ����");
	Scanner scanner = new Scanner(System.in);
	int select = scanner.nextInt();
	Random random = new Random();
	int computer = scanner.nextInt(3)+1; //
	System.out.println("��ǻ�Ͱ� �� ������������ : " + computer);
	
	if(select == 1) {
		System.out.println("������ ���ϴ�.");
		game++;
	}
	else if(select == 2) {
		System.out.println("������ ���ϴ�.");
		game++;
	}
	else if(select == 3) {
		System.out.println("���� ���ϴ�");
		game++;
	}
	else if(select == 4) {
		System.out.println("�� ���� Ƚ�� : " + game);
		System.out.println("����ڰ� �̱� Ƚ�� : " + pv);
		System.out.println("��ǻ�Ͱ� �̱� Ƚ�� : " + cv);
		if(cv < pv) {System.out.println("����ڰ� �¸��Ͽ����ϴ�.");}
		else if(cv == pv) {System.out.println("���º��Դϴ�.");}
		else System.out.println("��ǻ���� �¸��Դϴ�.");
	}
	else {System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
	
	
	
	if( select ==1 && computer == 3 || select == 2 && computer == 1 || select == 3 && computer == 2)
	{System.out.println("�÷��̾ �¸��Ͽ����ϴ�."); pv++;}
	else if(select ==1 && computer ==1 || select ==2 && computer ==2 || select == 3 && computer == 3)
	{System.out.println("���º��Դϴ�."); game++;}
	else {System.out.println("��ǻ���� �¸��Դϴ�. "); cv++;}
	
		}
	}
}
