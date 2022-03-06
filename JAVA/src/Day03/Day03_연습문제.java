package Day03;

import java.util.Scanner;

public class Day03_연습문제 { 			// c  s 
	public static void main(String[] args) 
	{  // m  s
		Scanner scanner = new Scanner(System.in); // 입력 객체
		// 확인문제 3 
//		int sum = 0;
//		for(int i = 1; i <=100; i++)
//		{ if(i%3==0) 
//		 sum = sum + i;}
//		System.out.printf("%d", sum);
		
		// 확인문제 5
//		int a = 0;
//		int b = 0;
//		for(int x = 1; x<=10; x++)
//		{ for(int y = 1; y<=10; y++)
//			if((4*x) + (5*y) == 60)
//				{x = a; 
//				y = b;	}
//		}
		//System.out.printf("(%d, %d)", a, b);
		// 확인문제 6
//		for(int i =1; i<=5; i++)
//		{ System.out.print("*"); }
	
		
		
		// 확인문제 7
		boolean run = true; // 실행여부 변수
		int balance = 0; // 예금액
		
		while(run)// while(조건식) -> true시 무한반복 
			{ // w  s
			System.out.println("-----------------------------------------");
			System.out.println("1. 예금 |\t 2. 출금 | \t 3. 잔고 | \t 4. 종료|");
			System.out.println("-----------------------------------------");
			System.out.println("선택 > ");
			int select = scanner.nextInt();
			if(select == 1) {
				System.out.println("예금액 : "); int income = scanner.nextInt();
				// 입력값이 1이면 예금액을 입력받음
				balance = income + balance; // balance += income	
				}
			else if(select == 2) {
				System.out.println("출금액 : "); int outcome = scanner.nextInt();
				// 입력값이 2이면
				balance = outcome - balance; // balance -= outcome
				if(outcome>balance) {System.out.println("잔액부족"); } // 출금액이 예금액보다 더 크면 잔액부족
				else { balance -= outcome;}
			}
			else if(select == 3) // 입력값이 3이면
			{System.out.println("잔고 : " + balance);}
			else if(select == 4) break; // 입력값이 4이면 while문 탈출
			else {System.out.println("알림) 알 수 없는 번호입니다.");}
			
			
			
			} // w  e
		System.out.println("프로그램 종료");
	
	} // m  e

} // c  e
