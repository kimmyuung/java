package 백준코딩문제;

import java.util.Scanner;

public class 백준코딩_3_7 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("덧셈을 반복할 횟수를 입력하세요");
	int ch = sc.nextInt();
	for(int i = 1; i <= ch; i++) {
		System.out.println("숫자를 입력하세요"); int ch2 = sc.nextInt();
		System.out.println("숫자를 입력하세요"); int ch3 = sc.nextInt();
		System.out.println("Case#" + i + ": " + (ch2 + ch3));
	}
	sc.close();
}
}
