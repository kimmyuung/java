package ���ΰ�������;

import java.util.Random;
import java.util.Scanner;

public class ����_���� { // cs
public static void main(String[] args)
{ // ms
	// �غ�
	Scanner sc = new Scanner(System.in);
	int [] playercard = new int[11];
	int [] dealercard = new int[11];
	int pv = 0;		int cv = 0;		int game = 0;
	int player = 0;
	int dealer = 0;
	try { // t s
	
	System.out.println("���� ������ �����մϴ�.");
	System.out.println("[[�޴� 1. ���� 2. ����]]");
	int select = sc.nextInt();
	
	if(select == 1) { // if1 s
		while(true) {
		Random random = new Random();
		
		boolean cardcheck = false;
		System.out.println("��������� �����մϴ�.");
		System.out.println("1. ī��̱� 2. �������");
		int select1 = sc.nextInt();
		if (select1 == 1) {
			for(int i = 0; i<playercard.length; i++) {
				if(playercard[i] == 0)
				System.out.println("ī�带 �̽��ϴ�.");
				playercard[i] = random.nextInt(10)+1; // 1-11������ ������
				System.out.println("�÷��̾ ���� ī�� : " + playercard[i]);
				cardcheck = true;
				player += playercard[i];
				break;	
			}
		}
		for(int i = 0; i < dealercard.length; i++) {
			if(dealercard[i] == 0) {
				System.out.println("������ ī�带 �̽��ϴ�.");
				dealercard[i] = random.nextInt(10)+1;
				System.out.println("������ ���� ī�� : " + dealercard[i]);
				cardcheck = true;
				dealer += dealercard[i];
				break;
			}
		}
		
				System.out.println("�÷��̾ ���� ī���� �� : " + player);
				System.out.println("�÷��̾ ���� ī���� �� : " + dealer);
			
		if (player > 21) {System.out.println("�÷��̾� ����Ʈ~ �÷��̾ �й��Ͽ����ϴ�."); cv++; game++; }
		if (dealer > 21) {System.out.println("���� ����Ʈ~ ������ �й��Ͽ����ϴ�."); pv++; game++; }
		
		else if(select1 == 2) {
			System.out.println("�� ���� �� : " + game);
			System.out.println("�÷��̾� �¸� �� : " + pv);
			System.out.println("���� ���� �� : " + cv);
		}
			
		} // if1 e	
	}
	else if(select == 2) {
		
	}
	
	
	
	}catch(Exception e) {System.out.println("���ڸ� �Է��ϼ̽��ϴ�. ������ ����� ���ּ���.");} //t c e
} // me
}
// ce
