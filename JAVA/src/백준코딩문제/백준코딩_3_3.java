package �����ڵ�����;

import java.util.Scanner;

public class �����ڵ�_3_3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("��� ���ڱ����� ���� ���ұ?");
	int ch = sc.nextInt();
	int sum = 0;
	for(int i = 1; i <= ch; i++) {
		sum += i;
	}
	System.out.println(sum);
}
}
