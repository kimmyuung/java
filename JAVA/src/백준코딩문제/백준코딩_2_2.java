package 백준코딩문제;

import java.util.Scanner;

public class 백준코딩_2_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x의 좌표를 입력하세요");
		int x = sc.nextInt();
		System.out.println("y의 좌표를 입력하세요");
		int y = sc.nextInt();
		sc.close();
		if(x > 0 && y > 0) {
			System.out.println(1);
		}
		else if ( x < 0 && y > 0) {
			System.out.println(2);
		}
		else if ( x < 0 && y < 0) {
			System.out.println(3);
		}
		else if ( x > 0 && y < 0) {
			System.out.println(4);
		}
	}
	
	
}
