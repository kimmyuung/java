package 백준코딩문제;

import java.util.Scanner;

public class 백준코딩_3_1 {
public static void main(String[] args) {
// 구구단 출력	
	Scanner sc = new Scanner(System.in);
	System.out.println("몇단을 출력할 것인지 입력하세요");
	int ch = sc.nextInt();
	
	for(int i = 1 ; i < 10; i++) {
		System.out.println((ch) +" * "+ (i)+ " = " +(ch*i));
	}
}
}
