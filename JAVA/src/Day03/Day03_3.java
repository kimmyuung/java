package Day03;

import java.util.Scanner;

public class Day03_3 { // c  s
	public static void main(String[] args) { // m  s
		
		Scanner scanner = new Scanner(System.in);
		
		// ����6 ������ �Է¹޾� ������ 90�� �̻��̸� �հ� �ƴϸ� ����
		System.out.println("������ �Է��ϼ���");
		int ����6 = scanner.nextInt(); 	String ����6_1;
		if(����6>=90) {����6_1 = "�հ�";}
		else {����6_1 = "���հ�";}
		System.out.println("����� ���� ����� : " + ����6_1);
		
		// ����7 ������ �Է¹޾� ���� 90�� �̻��̸� A��� 80�� �̻�� B��� 70�� �̻�� C��� �� �� �����
		System.out.println("������ �Է��ϼ���");
		int ����7 = scanner.nextInt(); 	String ����7_1;
		if(����7>=90) {����7_1 = "A���";}
		else if(����7>=80) {����7_1 = "B���";}
		else if(����7>=70) {����7_1 = "C���";}
		else {����7_1 = "�����";}
		
		System.out.println("����� ���� ����� :" + ����7_1);
		
		
 		// ����8 �α���������
		// [�Է����� : ���̵�, ��й�ȣ] : ���̵�(admin)��й�ȣ(1234) ���� �� �� ����
		System.out.println("���̵� �Է��ϼ���");		String id = scanner.next();
		// char  �ڷ��� [���� 1�� ����], �ڷ������� ���ڿ� ���� �Ұ��� -> String Ŭ���� ���, char �迭/����Ʈ ���
		System.out.println("��й�ȣ�� �Է��ϼ���");		int pw = scanner.nextInt();
		boolean login = false; // 1��Ʈ true or false �Ǻ�
		if(id.equals("admin")) 
			// �Է��� ���̵�  admin �̸�
			// Ŭ���� ����ϴ� ��ü�� ������ ��� �Ұ� -> �޼ҵ�
			// ���ڿ�1.equals(���ڿ�2)
			{
				if(pw == 1234) { 
					System.out.println("�α��� ����"); 
					login = true; // ���̵�, �н����尡 ��� �����ϸ� ������ ����
					}
			
		else 	{
			System.out.println("���̵� Ʋ�Ƚ��ϴ�");	}} // �Է��� ���̵� admin�� �ƴϸ�
		else 	{ // �Է��� ��й�ȣ�� 1234�� �ƴϸ�
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");	}
		if(login == false) System.out.println("�α��� ����"); // �α��� ���� ������ false�� ���
		// System.out.println("�α��� ����"); -> �ۼ��� ���� �߻� (��й�ȣ�� �¾Ƶ� �α��� �������� �߻�)
		// ��ü�� ����(>=, <=, ==..)�� �Ұ��� 
		//-> �⺻�ڷ����� ������ ���������� ��ü�� ��޵Ǵ� ���ڿ��� ������ �Ұ����ϱ� ������ ��ü �񱷽� .equals���
		
		
		// ����9 �Է�(����,����,����, �Է¹ޱ�) 
		//-> ����� 90�� �̻��̸鼭 ������ �� �ϳ��� 100���� ���񺰿�� ���
		//-> ����� 80�� �̻��̸鼭 ������ �� �ϳ��� 90�� �̻�� ���� ��� ���
		// + �� �� �����
		System.out.println("���������� �Է��ϼ���");		int lan = scanner.nextInt();
		System.out.println("���������� �Է��ϼ���");		int math = scanner.nextInt();
		System.out.println("���������� �Է��ϼ���");		int eng = scanner.nextInt();
		int avg = (lan + math + eng) / 3; // �����͵��� �Է¹ް� �������� ����� ����
		
		if(avg >= 90) { 
			if(lan==100) System.out.println("���� ���"); // ����� 90 �̻��̸鼭 ���� ������ 100���Ͻ� ������ ���
			if(math==100) System.out.println("���� ���");
			if(eng==100) System.out.println("���� ���");
		}
		else if(avg >= 80) {
			if(lan >= 90) System.out.println("���� ���"); // ����� 80 �̻��̸鼭 ���� ������ 90�� �̻��Ͻ� ������� ���
			if(math >= 90) System.out.println("���� ���");
			if(eng >= 90) System.out.println("���� ���");
		}
		else System.out.println("�����"); // �׿� ����� ���
	} // m  e
} // c  e
