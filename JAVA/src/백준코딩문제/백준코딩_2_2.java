package �����ڵ�����;

import java.util.Scanner;

public class �����ڵ�_2_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x�� ��ǥ�� �Է��ϼ���");
		int x = sc.nextInt();
		System.out.println("y�� ��ǥ�� �Է��ϼ���");
		int y = sc.nextInt();
		sc.close();
		if(x > 0 && y > 0) {
			System.out.println(1);
		}
		else if ( x < 0 && y > 0) {
			System.out.println(2);
		}
		else if ( x < 0 && y < 0) {
			System.out.println(3);
		}
		else if ( x > 0 && y < 0) {
			System.out.println(4);
		}
	}
	
	
}
