package ��Ӱ���;

import java.util.ArrayList;
import java.util.Scanner;

public class �����÷��̽� {
	static ArrayList<Market> memberlist = new ArrayList<Market>(); // ���������� ȸ�� ����Ʈ�� ����
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); // �Է� ��ü ����
	Market market = new Market(); // Market�� ��ü ����
	try {
	while(true) {
	System.out.println("���� ������ ���Ű� ȯ���մϴ�."); 
	System.out.println("1. ȸ�� ���� "); // ���� ����
	int ch = sc.nextInt();
	if(ch == 1) {
		System.out.println("ȸ������ ������");
		System.out.println("ȸ�������� ���ϴ� ������ ������ �ּ���");
		System.out.println("1. �Ե���Ʈ \t 2. �̸�Ʈ");
		int ch1 = sc.nextInt();
		if(ch1 == 1) { // �Ե���Ʈ�� ȸ�� ����
			
			System.out.println("�Ե���Ʈ ���̵�");		String id = sc.next();
			System.out.println("�Ե���Ʈ ��й�ȣ");		String pw = sc.next();
			System.out.println("�Ե���Ʈ �ڵ�����ȣ");	String number = sc.next();
			
			market.lottemarket = new �Ե���Ʈ(id, pw, number); // ����Ŭ���� ��ü�� ����Ŭ������ Ȱ��
		}
		else if(ch1 == 2) {
			
			System.out.println("�̸�Ʈ ���̵�");		String id = sc.next();
			System.out.println("�̸�Ʈ ��й�ȣ");		String pw = sc.next();
			System.out.println("�̸�Ʈ �ڵ�����ȣ");		String number = sc.next();
			
			market.emarket = new �̸�Ʈ(id, pw, number); // ���� Ŭ���� ��ü�� ����Ŭ������ Ȱ��
		}
	}
	}
	}catch(Exception e) {System.out.println("���ڿ��� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
}
}
