package ����;

import java.util.Scanner;

public class ���ΰ���_�����̴¿ö󰡰�ʹ� {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	System.out.println("�� ���� �����̰� �ִ�. �� �����̴� ���̰� V������ ���� ���븦 �ö� ���̴�.\r\n"
			+ "\r\n"
			+ "�����̴� ���� A���� �ö� �� �ִ�. ������, �㿡 ���� �ڴ� ���� B���� �̲�������. ��, ���� �ö� �Ŀ��� �̲������� �ʴ´�.");
	
	
	
	System.out.println("�����̴� �� ���͸� �ö� �� �ֳ���");
	int up = sc.nextInt();
	
	System.out.println("�����̴� �� ���͸� �̲���������");
	int down = sc.nextInt();
	System.out.println("������ �� ���̸� �Է��ϼ���.");
	int high = sc.nextInt();
	
	System.out.println("�� ����  :" + high );
	System.out.println("�����̰� �ö� �� �ִ� ���� : " + up);
	System.out.println("�����̰� �̲������� ���� : " + down);
	
	int sum = up - down; // �����̰� �Ϸ翡 �ö� �Ÿ�
	int total = high / sum; // �����̰� �ö󰡴µ� �ɸ��� ����
	
	System.out.println("�����̰� �ö󰡴µ� �ɸ��� �ð�" + total + " ��");
	
}
}
