package 스레드활용과제;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Controller con = new Controller();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("동화책 읽어주는 프로그램");
			System.out.println("읽을 책을 선택해주세요");
			System.out.println("1. 미녀와 야수 2. 개미와 배짱이 3. 종료 ");
			int ch = sc.nextInt();
			if (ch == 1) {
				con.미녀와야수();
			} else if (ch == 2) {
				con.개미와배짱이();
			} else if (ch == 3) {
				System.out.println("종료!");
				break;
			}
		}
	}
}
