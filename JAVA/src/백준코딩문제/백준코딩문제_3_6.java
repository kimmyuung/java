package �����ڵ�����;

import java.util.Scanner;

public class �����ڵ�����_3_6 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("���ڸ� �Է����ּ���");
	int ch = sc.nextInt();
	sc.close();
	
//	for(int i = 0 ; i <= ch+i; i++) {
//		System.out.println(ch);
//		ch--;
//		if(ch ==0) break;
//	}
	for(int i = ch ; i > 0; i--) {
		System.out.println(i);
	}
}
}
