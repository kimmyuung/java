package ����;

import java.util.Scanner;

public class Ű����ũ_3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int �ݶ󱸸ż� = 0; int ȯŸ���ż�= 0; int ���̴ٱ��ż� = 0;
	int �ݶ����� = 10; int ȯŸ����= 10; int ���̴����� = 10;
	while(true) {
	System.out.println("�޴��� [1. �ݶ�(300) 2. ȯŸ(200) 3. ���̴�(100) 4. ���� 5. �α׾ƿ�");
	System.out.println("���Ÿ� ���Ͻô� �޴��� �Է����ּ���.");
	int select = scanner.nextInt();
	if(select == 1) {
		System.out.println("�ݶ� �����ϼ̽��ϴ�.");
		�ݶ󱸸ż�++;
		�ݶ�����--;
		if(�ݶ����� == 0) {System.out.println("�ݶ� ��� �����Ǿ����ϴ�. ���԰� ��ٷ��ּ���");}
	}
	else if(select == 2) {
		System.out.println("ȯŸ�� �����ϼ̽��ϴ�.");
		ȯŸ���ż�++;
		ȯŸ����--;
		if(ȯŸ���� == 0) {System.out.println("ȯŸ ��� �����Ǿ����ϴ�. ���԰� ��ٷ��ּ���");}
	}
	else if(select == 3) {
		System.out.println("���̴ٸ� �����ϼ̽��ϴ�.");
		���̴ٱ��ż�++;
		���̴�����--;
		if(���̴����� == 0) {System.out.println("���̴� ��� �����Ǿ����ϴ�. ���԰� ��ٷ��ּ���");}
	}
	else if(select == 4) {
		System.out.println("������ �����մϴ�.");
		int sum = (�ݶ󱸸ż� * 300) + (ȯŸ���ż� * 200) + (���̴ٱ��ż� * 100);
		System.out.println("�� ������ : " + sum);
		System.out.println("1. ���� \t 2. �������"); int select1 = scanner.nextInt();
		if(select1 == 1) {
			System.out.println("�������� �Է����ּ���"); int ������ = scanner.nextInt();
			if(������ >= sum) {
				System.out.println("������ �Ϸ�Ǿ����ϴ�. �ֹ���ȣ : 000");
				System.out.println("�ܵ��� ��ȯ�մϴ�" + (������-sum) + "���� �޾��ּ���");
			}
			else {System.out.println("�ݾ��� " + (sum-������) + "�� �� �������ּ���");}
		}
		else if(select1 == 2) {
			System.out.println("������ ����մϴ�");
			sum = 0;
			�ݶ󱸸ż� = 0; ȯŸ���ż�= 0; ���̴ٱ��ż� = 0;
			�ݶ����� = 10;  ȯŸ����= 10; ���̴����� = 10;
		}
		else {System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
		
	}
	else if(select == 5) {break;}
	else {System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
		}
	}
}
