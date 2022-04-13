package 백준코딩문제;

import java.util.Scanner;

public class 백준코딩_3_13 {
public static void main(String[] args) {
	// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) { // hasNextInt() 의 경우 입력값이 정수일경우 true를 반환하며 
			//정수가 아닐경우 바로 예외를 던지며 더이상의 입력을 받지 않고 
			//hasNextInt()에서 false를 반환하면서 반복문이 종료
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(x+y);
		if(x==0 && y ==0) {sc.close(); break;}
		}
}
}
