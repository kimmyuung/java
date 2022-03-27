package 백준코딩문제;

import java.util.Scanner;

public class 백준코딩_2_5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("첫번째 주사위 숫자 : "); int ch1 = sc.nextInt();
	System.out.println("두번째 주사위 숫자 : "); int ch2 = sc.nextInt();
	System.out.println("세번째 주사위 숫자 : "); int ch3 = sc.nextInt();
	
	if(ch1 > 6 || ch2 > 6 || ch3 > 6) {
		System.out.println("주사위는 6까지의 숫자만을 가질 수 있습니다. 다시 입력해주세요");
	}
	else if(ch1 < 0 || ch2 < 0 || ch3 < 0) {
		System.out.println("주사위는 0이하의 숫자를 가지지 않습니다. 다시 입력해주세요");
	}
	else if(ch1 == ch2 && ch2 == ch3 ) { // 눈금이 모두 일치
		int money = 10000 + (ch1 * 1000);
		System.out.println(money);
	}
	 // 주사위 2개 일치
	else if(ch1 == ch2) {
		int money = 1000 + (ch1 * 100);
		System.out.println(money);	
		}
	else if(ch1 == ch3) {
			int money = 1000 + (ch1 * 100);
			System.out.println(money);
		}
	else if(ch2 == ch3) {
		int money = 1000 + (ch2 * 100);
		System.out.println(money);
	}	
	
	else if(ch1 != ch2 && ch2 != ch3)  { // 주사위 눈금 일치 없음
		if(ch1 > ch2) {
			int money = 100 * ch1;
			System.out.println(money);
		}
		else if (ch2 > ch3) {
			int money = 100 * ch2;
			System.out.println(money);
		}
		else if(ch1 > ch3) {
			int money = 100 * ch1;
			System.out.println(money);
		}
		else {
			int money = 100 * ch3; 
			System.out.println(money);
			}
	}
}
}
