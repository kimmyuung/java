package ����;

import java.util.Scanner;

public class Ű����ũ_5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int �ݶ󱸸ż� = 0; int ȯŸ���ż� = 0; int ���̴ٱ��ż� = 0;
	int �ݶ����� = 10; int ȯŸ���� = 10; int ���̴����� = 10;
	while(true) {
	System.out.println("�޴��� [1. �ݶ�(300) 2. ȯŸ(200) 3. ���̴�(100) 4. ���� 5. ����");
	System.out.println("���Ͻô� �޴��� �Է����ּ���");
	int select = scanner.nextInt();
	if(select == 1) {
		System.out.println("�ݶ� �����մϴ�.");
		�ݶ󱸸ż�++;
		�ݶ�����--;
		if(�ݶ����� == 0) {System.out.println("��� �����Ǿ����ϴ�. ���԰� ��ٷ��ּ���");}
	}
	else if(select == 2) {
		System.out.println("ȯŸ�� �����մϴ�.");
		ȯŸ���ż�++;
		ȯŸ����--;
		if(ȯŸ���� == 0) {System.out.println("��� �����Ǿ����ϴ�. ���԰� ��ٷ��ּ���");}
	}
	else if(select == 3) {
		System.out.println("���̴ٸ� �����մϴ�.");
		���̴ٱ��ż�++;
		���̴�����--;
		if(���̴����� == 0) {System.out.println("��� �����Ǿ����ϴ�. ���԰� ��ٷ��ּ���");}
	}
	else if(select == 4) {
		System.out.println("������ �����մϴ�.");
		int �Ѱ����� = (�ݶ󱸸ż� * 300) + (ȯŸ���ż� * 200) + (���̴ٱ��ż� * 100);
		System.out.println("�� �������� " + �Ѱ����� + "�� �Դϴ�.");
		System.out.println("1. ���� \t 2. �������");
		int select1 = scanner.nextInt();
		if(select1 == 1) {
			System.out.println("�����ݾ��� �������ּ���");
			int ������ = scanner.nextInt();
			if(�Ѱ����� <= ������) {
				System.out.println("������ �Ϸ�Ǿ����ϴ�. �ֹ���ȣ : 000");
				System.out.println("�ܵ��� ��ȯ�մϴ� : " + (�Ѱ�����-������) + "��");
			}
			else {System.out.println("�������� �����մϴ� " + (�Ѱ�����-������) + "�� ��ŭ �� �������ּ���");}
		}
		else if(select1 == 2) {
			System.out.println("������ ����մϴ�.");
			�ݶ󱸸ż� = 0 ; ���̴ٱ��ż� = 0; ȯŸ���ż� = 0;
			�ݶ����� = 10; ���̴����� = 10; ȯŸ���� = 10;
		}
		else {System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
	}
	else if(select == 5) {break;}
	else {System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
	
	
	}
}
}
