package 백준코딩문제;

import java.util.Scanner;

public class 백준코딩_3_8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Test Case : ");
	int N = sc.nextInt();
	
	for(int i = 1; i <= N; i++) {
		System.out.println("X : ");		int x = sc.nextInt();
		System.out.println("Y : ");		int y = sc.nextInt();
		System.out.println("Case#" + i + " : " + (x) + " + " + (y) + " = "+ ( x + y ) );
	}
	sc.close();
}
}
