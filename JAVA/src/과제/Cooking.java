package ����;

import java.util.Scanner;

import Day06.Board;

public class Cooking { // cs
	public static void main(String[] args) { // ms
	
		// ��鷹����
		// �ʱ�޴�   [1. ��� ����      2. ��� ���̱�]
		// 0. ���� 
		// ��鷹���� Ŭ������ ����� ����(��� : ��� 1��, ��, ���, �� -> Ŭ������ �ʵ�
		// ������ ��� O
		// 1-1. ����ڷκ��� �Դ� ��� �����Ǹ� �Է¹���
		// 1-2. ������ ���(���, ��, ���, ��)
		// 2. ����� ���̱� ���� �������� ����
		// �б� 1 : ����� ���� �� ������ ���� �־�� �ǳ� ���� ���� �־�� �ǳ�
		// ���� ����
		Scanner scanner = new Scanner(System.in); // �Է� ��ü ����
		Ramen[] recipelist = new Ramen[100];
		
		while(true) { // w s
		System.out.println("-------��� ����---------"); // �ʱ� �޴� ���
		System.out.println("������ ��� �����Ǹ� ��� �� ����� ���ְ� ���� �����Ǹ� �����ϼ���!(1�� ����)");
		System.out.println("��� ����\t ������� "); // 
		int index = 0; // �ε��� ���� [�ݺ����� üũ]
		
		// ��� �Խù���ȸ
			for(Ramen temp : recipelist) { // for s
				if(temp != null) { // if s
				System.out.printf("%d  %s\t%s \n", index, temp.ramen, temp.cook);
				} // if e ,
				index++;
			} // for e
		System.out.println("1. ������ ��� 2. ��ϵ� ������ Ȯ�� ");
		int select = scanner.nextInt();// ����ڷκ��� �����ų �޴��� �Է¹���
		
		if(select == 1) { // ������ ���
			System.out.println("----- ��� ������ ��� ������ -----");
			System.out.println("������� : ");	String ramen = scanner.next();
			System.out.println("�߰���� : ");	String cook = scanner.next();
			
			Ramen recipe = new Ramen(ramen, cook); // 2�� �ʵ带 ������ ������ ���
			int i = 0; // �ε��� ����[�ݺ����� üũ]
			for(Ramen temp : recipelist) { // for2 s
			if(temp == null) { // if2 s -> �� ������ ã����
				recipelist[i] = recipe; // �ش� �ε����� ���ο� ��ü ����
				break; // �ѹ� �����ϸ� �ݺ��� ����
				} // if2 e	
				i++; // �ε����� 1������Ŵ
			} // for2 e
		}
		
		else if(select == 2) { // ��ϵ� ������ Ȯ��
			System.out.println("��ϵ� ��� �����Ǹ� Ȯ�����ּ���");
			System.out.println("�Խù� ��ȣ�� �Է����ּ���");
			int bno = scanner.nextInt(); // �� �Խù� �ε�����ȣ(=�迭�� �ε��� ��)
			System.out.printf("�߰���� : %s   ������� : %s\n", recipelist[bno].cook, recipelist[bno].ramen);
			
			
		}
		else {System.out.println("�� �� ���� �����Դϴ�.[���Է�]");}
		
		
		}// we
	}// me 
} // c e
