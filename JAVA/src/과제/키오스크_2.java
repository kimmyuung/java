package ����;

import java.util.Scanner;

public class Ű����ũ_2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int �ݶ����� = 10; int ���̴����� = 10; int ȯŸ���� = 10;
	int �ݶ󱸸ż� = 0; int ���̴ٱ��ż� = 0; int ȯŸ���ż� = 0;
	
	while(true) {
	System.out.println("�޴��� [1. �ݶ�(300) 2. ���̴�(200) 3. ȯŸ(100) 4. ���� 5. ����");
	System.out.println("�ֹ��Ͻ� �޴��� �Է��ϼ���."); int select = scanner.nextInt();
	
	if(select == 1) {
		System.out.println("�ݶ� �ֹ��Ͽ����ϴ�.");
		�ݶ�����--;
		�ݶ󱸸ż�++;
		if(�ݶ����� == 0) {System.out.println("�ݶ���� �����Ǿ����ϴ�. �غ���...");}
	}
	else if(select == 2) {
		System.out.println("ȯŸ�� �ֹ��Ͽ����ϴ�.");
		ȯŸ����--;
		ȯŸ���ż�++;
		if(ȯŸ���� == 0) {System.out.println("ȯŸ��� �����Ǿ����ϴ�. �غ���...");}
	}
	else if(select == 3) {
		System.out.println("���̴ٸ� �ֹ��Ͽ����ϴ�.");
		���̴�����--;
		���̴ٱ��ż�++;
		if(���̴����� == 0) {System.out.println("�ݶ���� �����Ǿ����ϴ�. �غ���...");}
	}
	else if(select == 4) {
		System.out.println("������ �����մϴ�.");
		int �Ѱ����� = (�ݶ󱸸ż� * 300) + (ȯŸ���ż� * 200) + (���̴ٱ��ż� * 100);
		System.out.println("�� �������� : " + �Ѱ����� + "�Դϴ�.");
		System.out.println("1. ���� \t 2. �������"); int select2 = scanner.nextInt();
		if(select2 == 1) {
			System.out.println("�ݾ��� �����Ͽ� �ּ���");
			int ������ = scanner.nextInt();
			if(�Ѱ����� < ������) {
				System.out.println("�ݾ��� �����մϴ� " + (�Ѱ�����-������) + "���� �� �������ּ���.");
			}
			else if(�Ѱ����� >= ������) {
				System.out.println("������ �Ϸ�Ǿ����ϴ�. �ֹ���ȣ : 000");
				System.out.println("�ܵ��� ��ȯ�մϴ�." + (�Ѱ�����-������) + "��");
			}
			else {System.out.println("�ݾ��� �����մϴ�." + (�Ѱ�����-������) + "���� �� �������ּ���.");}
		}
		else if(select2 == 2) {
			System.out.println("������ ��ҵǾ����ϴ�.");
			�ݶ󱸸ż� = 0; �ݶ����� = 10;
			���̴ٱ��ż� = 0; ���̴����� = 10;
			ȯŸ���ż� = 0; ȯŸ���� = 10;
		}
		else {System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
	}
	else if(select == 5) {
		break;
	}
	else {System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
	
	
	
		}
	}
}
