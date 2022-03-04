package Day04;

import java.util.Scanner;

public class Day04_1 { // c  s
	public static void main(String[] args) { // m  s
		// 제어문 : if, switch
		// 반복문 : for, while
			// 1. 초기값 2. 조건식 3. 증감식 4. 실행문
		// while 형태 [무한루프때 많이 사용]
		// 1. 초기값
		// while(2. 조건식) {
		//				4. 실행문;
		//	 			3. 증감식;
		//					}
		// for 예1)
		for(int i= 1; i<= 10; i++) { // f  s
			// i는 1부터 10이하까지 1씩 증가하면서 실행문 반복처리 
			System.out.print(i + " ");
			} // f  e
		// while 예1
		int i = 1; // 초기값
		while(i<=10) { // 조건식, w  s
			System.out.print(i + " "); // 실행문
			i++; // 증감식
		} // w e
		
		// for 예2) 1-100 누적합계
		int sum = 0;
		for(int x = 1; x <=100; x++) 
		{ sum += x;} // sum = sum + x;}
		
		System.out.println(sum);
		
		// while 예2) 1-100 누적합계
		int sum2 = 0;
		int i2 = 1; // 초기값
		while(i2<=100) { // 조건식 [true면 실행 false면 실행 X)
			sum2 += i2; // 실행문
			i2++; // 증감식 -> 없으면 무한루프에 빠지게 됨
		}
		System.out.println(sum2);
		
		// while 예3) 무한루프(24시간 프로그램 실행 위해 필요)
		while(true) { // 조건식이 true -> 실행 // true 상수 -> 무한루프
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int exit = scanner.nextInt();
		if(exit == 3) break;
		// break 기준 가장 가까운 반복문을 나오게 됨(if 제외)
		}
		
	} // m  e
} // c  e





