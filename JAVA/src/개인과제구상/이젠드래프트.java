package ���ΰ�������;

import java.util.ArrayList;
import java.util.Scanner;

public class �����巡��Ʈ {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	������Ʈ�ѷ� con = new ������Ʈ�ѷ�();
	con.load();
	while(true) {
		System.out.println("���� �巡��Ʈ�� ���� �� ȯ���մϴ�.");
		System.out.println("���̵��� �������ּ���.");
		System.out.println("1. ���� ����(+5) : ��Լ����� �÷���");
		System.out.println("2. ���� (+3) : ���������� �÷���");
		System.out.println("3. ���� (+1) : ���������� �÷���");
		System.out.println("4. �����(-1) : �輱���� �÷���");
		System.out.println("5. �ſ�����(-3) : �ڹο����� �÷���");
		System.out.println("6. ��(-5) : ���ȣ�� �÷���");
		System.out.println("7. ��������");
		int ch = sc.nextInt();
		if(ch==1) {
			�����巡��Ʈ_�������̽� ���� = new ����("��Լ�", "ĳ��", con.��������, 5);
			����.���弱��();
			
			
		}
		else if(ch==2) {
			�����巡��Ʈ_�������̽� ���� = new ����("������", "����",con.��������, 3 );
			����.���弱��();
			String ���� = con.�����̱�();
			System.out.println(���� + "�� �����ðڽ��ϱ�?");
		}
		else if(ch==3) {
			�����巡��Ʈ_�������̽� ���� = new ����("������", "�о�", con.��������, 1 );
			����.���弱��();
		}
		else if(ch==4) {
			�����巡��Ʈ_�������̽� ���� = new ����("�輱��", "�о�", con.��������, -1);
			����.���弱��();
		}
		else if(ch == 5) {
			�����巡��Ʈ_�������̽� ���� = new ����("�ڹο�", "����", con.��������, -3);
			����.���弱��();
		}
		else if(ch == 6) {
			�����巡��Ʈ_�������̽� ���� = new ����("���ȣ", "X", con.��������, -5);
			����.���弱��();
		}
		else if(ch == 7) {
			System.out.println("������ �����մϴ�. "); break;
		}
		else if(ch == -1) {
			while(true) {
			System.out.println("������ ��带 �����մϴ�.");
			System.out.println("1. ���� ��� 2. ���� ���� 3. ���� ���� 4. ���� ��� 5. ����");
			System.out.println("���� \t �̸� \t Ư�� \t �ó��� \t ȿ��");
			for(���� temp : ������Ʈ�ѷ�.��������Ʈ) {
				System.out.printf("\t %s \t %s \t %s \t\n", temp.get�̸�(), temp.getƯ��(),
						temp.get�ó���() );
			}
			int ch1 = sc.nextInt();
			if(ch1 == 1) {
				System.out.println("������ ����մϴ�.");
				System.out.println("����� ������ �̸��� �Է����ּ���");
				String �̸� = sc.next();
				System.out.println("����� ������ Ư���� �Է����ּ���");
				String Ư�� = sc.next();
				System.out.println("����� ������ �ó����� �Է����ּ���");
				String �ó��� = sc.next();
				boolean result = con.�������(�̸�, Ư��, �ó���, 0);
				if(result) System.out.println("���� ��� ����!");
				else System.out.println("���� ��� ����!");
			}
			else if(ch1 == 2) {
				System.out.println("��ϵ� ������ �����մϴ�.");
				System.out.println("������ȣ \t �̸� \t Ư�� \t �ó��� \t ȿ��");
				for(���� temp : ������Ʈ�ѷ�.��������Ʈ) {
					System.out.printf("\t %d \t %s \t %s \t %s \t \n", temp.�ε���,temp.get�̸�(), temp.getƯ��(),
							temp.get�ó���() );
				}
				System.out.println("������ ������ �̸��� �Է��ϼ���");
				String name = sc.next();
				System.out.println("������ �����մϴ�.");
				System.out.println("�̸� : "); String �̸� = sc.next();
				System.out.println("Ư�� : "); String Ư�� = sc.next();
				System.out.println("�ó��� : " ); String �ó��� = sc.next();
				System.out.println("������ȣ : "); int ������ȣ = sc.nextInt();
				boolean result = con.��������(name, �̸�, Ư��, �ó���, ������ȣ);
				if(result) {System.out.println("���� ���� ����!");}
				else System.out.println("���� ����! ]] ������ �������� �ʽ��ϴ�.");
			}
			else if(ch1 == 3) {
				System.out.println("��ϵ� ������ �����մϴ�.");
				System.out.println("���� \t �̸� \t Ư�� \t �ó��� \t ȿ��");
				for(���� temp : ������Ʈ�ѷ�.��������Ʈ) {
					System.out.printf("\t %s \t %s \t %s \t \n", temp.get�̸�(), temp.getƯ��(),
							temp.get�ó���() );
				}
				System.out.println("������ ������ �̸��� �Է��ϼ���");
				String name = sc.next();
				boolean result = con.��������(name);
				if(result) System.out.println("���� ���� ����!");
				else System.out.println("���� ���� ����!");
			}
			else if(ch1 == 4) {
				System.out.println("���� \t �̸� \t Ư�� \t �ó��� \t ȿ��");
				for(���� temp : ������Ʈ�ѷ�.��������Ʈ) {
					System.out.printf("\t %s \t %s \t %s \t \n", temp.get�̸�(), temp.getƯ��(),
							temp.get�ó���() );
				}
			}
			else if(ch1 == 5) {
				System.out.println("�����ڸ�� ����!"); sc.close();
				break;	}
			}
		}
	}
}
}
