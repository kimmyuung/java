package �����ڵ�����;

import java.util.Scanner;

public class �����ڵ�_2_5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("ù��° �ֻ��� ���� : "); int ch1 = sc.nextInt();
	System.out.println("�ι�° �ֻ��� ���� : "); int ch2 = sc.nextInt();
	System.out.println("����° �ֻ��� ���� : "); int ch3 = sc.nextInt();
	
	if(ch1 > 6 || ch2 > 6 || ch3 > 6) {
		System.out.println("�ֻ����� 6������ ���ڸ��� ���� �� �ֽ��ϴ�. �ٽ� �Է����ּ���");
	}
	else if(ch1 < 0 || ch2 < 0 || ch3 < 0) {
		System.out.println("�ֻ����� 0������ ���ڸ� ������ �ʽ��ϴ�. �ٽ� �Է����ּ���");
	}
	else if(ch1 == ch2 && ch2 == ch3 ) { // ������ ��� ��ġ
		int money = 10000 + (ch1 * 1000);
		System.out.println(money);
	}
	 // �ֻ��� 2�� ��ġ
	else if(ch1 == ch2) {
		int money = 1000 + (ch1 * 100);
		System.out.println(money);	
		}
	else if(ch1 == ch3) {
			int money = 1000 + (ch1 * 100);
			System.out.println(money);
		}
	else if(ch2 == ch3) {
		int money = 1000 + (ch2 * 100);
		System.out.println(money);
	}	
	
	else if(ch1 != ch2 && ch2 != ch3)  { // �ֻ��� ���� ��ġ ����
		if(ch1 > ch2) {
			int money = 100 * ch1;
			System.out.println(money);
		}
		else if (ch2 > ch3) {
			int money = 100 * ch2;
			System.out.println(money);
		}
		else if(ch1 > ch3) {
			int money = 100 * ch1;
			System.out.println(money);
		}
		else {
			int money = 100 * ch3; 
			System.out.println(money);
			}
	}
}
}
