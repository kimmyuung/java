package ���ΰ�������;

import java.util.ArrayList;
import java.util.Scanner;

public class ����_����ver2 {
// Ŭ����(ī��) : ī�幮��(���̾�, ��Ʈ, Ŭ�ι�, �����̵�), ��ī��Ʈ, 

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		����_��Ʈ�ѷ� con = new ����_��Ʈ�ѷ�();
		int game = 0;
		int pv = 0;
		int dv = 0;
		try {
		while(true) {
			System.out.println("���� ����");
			System.out.println("1. ���� ���� 2. ��� ����");
			int ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("������ �����մϴ�.");
				System.out.println("1. ī�� �̱� 2. ���� ���");
				int ch1 = sc.nextInt();
				if(ch1 == 1) {
					System.out.println("������ �غ����Դϴ�.");
					System.out.println("ī�带 �̽��ϴ�.");
					con.���ӽ���();
				}
				else if(ch1 == 2) {
					System.out.println("���� ����� ���ϴ�.");
					con.���Ӱ������();
				}
			}
			else if(ch == 2) {
				con.�������();
			}
			else if(ch < 0) {
				System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
			else {System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
				
		}
		}catch(Exception e) {System.out.println("�����ڿ��� �������ּ���");}
	}
}
