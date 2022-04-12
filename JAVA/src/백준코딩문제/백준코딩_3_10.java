package 백준코딩문제;

import java.util.Scanner;

public class 백준코딩_3_10 { // 3-9의 반대
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
