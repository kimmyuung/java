package 백준코딩문제;

import java.util.Scanner;

public class 백준코딩_3_2 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Test case : ");
		int test = sc.nextInt();
		
		for(int i = 0; i < test ; i++) {
			System.out.println("Insert X : ");
			int ch = sc.nextInt();
			System.out.println("Insert Y : ");
			int ch1 = sc.nextInt();
			System.out.println((ch) +" + " +(ch1) +" = "+ (ch + ch1));
		}
		sc.close();
}
}
