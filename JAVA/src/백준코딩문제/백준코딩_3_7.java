package �����ڵ�����;

import java.util.Scanner;

public class �����ڵ�_3_7 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("������ �ݺ��� Ƚ���� �Է��ϼ���");
	int ch = sc.nextInt();
	for(int i = 1; i <= ch; i++) {
		System.out.println("���ڸ� �Է��ϼ���"); int ch2 = sc.nextInt();
		System.out.println("���ڸ� �Է��ϼ���"); int ch3 = sc.nextInt();
		System.out.println("Case#" + i + ": " + (ch2 + ch3));
	}
	sc.close();
}
}
