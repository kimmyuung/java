package �����ڵ�����;

import java.util.Scanner;

public class �����ڵ�_3_10 { // 3-9�� �ݴ�
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int star = sc.nextInt();
	sc.close();
	for(int i = 0; i < star; i++) {
		for(int j = 0; j < star-i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
