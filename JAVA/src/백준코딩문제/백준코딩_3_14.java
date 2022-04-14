package 백준코딩문제;

import java.util.Scanner;

public class 백준코딩_3_14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int ch = sc.nextInt();
		int x = (ch / 10) + (ch % 10);
		System.out.println(x);
	}
	
}
