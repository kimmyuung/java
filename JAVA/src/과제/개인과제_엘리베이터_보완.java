package ����;

import java.util.Scanner;

public class ���ΰ���_����������_���� {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("���� ¥�� �ǹ��Դϱ�");
	int floor = sc.nextInt();
	
	
	
	if(floor < 0) {System.out.println("���������ʹ� 2���̻� �����մϴ�. �ٽ� �Է����ּ���");}
	else if(floor > 0 ) {
		System.out.println("���������Ͱ� �ٴϴ� ������ �����Ǿ����ϴ�.");
		System.out.println("������������ �뷮�� �� kg�Դϱ�");
		int kg = sc.nextInt();
		if(kg < 0) {System.out.println("���Դ� �����ϼ� �����ϴ�! �ٽ� �Է����ּ���");}
		else {	
		System.out.println("������������ ���� ������ �Ϸ�Ǿ����ϴ�."); }
		
		
		System.out.println("���������͸� ���ݺ��� �̿밡���մϴ�."); // �� ó���� 1�� �� ���Ĵ� �̿��� ���������� �� ���� ��ġ
		while(true) {
		System.out.println("[[1. ���������� ȣ�� 2. ����");
		int select = sc.nextInt();
		if(select == 1) {
			int last = 1;
			System.out.println("���������͸� ȣ���մϴ�.");
			System.out.println("���� ���� ���� �Է����ּ���");
			int select1 = sc.nextInt();
			if(select1 < floor) System.out.println("����� ���̻��� ���� ������ �����ϴ�.");
			else if(select1 > 0) {
				for(int i = 1 ; i <= floor; i++) {
				System.out.printf("%d��", i); }
				System.out.println("�����߽��ϴ�.");
				last += floor;
			}
			
		}
		else if(select == 2) {System.out.println("���������͸� �����մϴ�."); break;}
		}
		
		
		
		
		
	}
	
	
	}
}
