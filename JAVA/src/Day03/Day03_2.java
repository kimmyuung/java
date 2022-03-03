package Day03;

import java.util.Scanner;

public class Day03_2 { // c  s
	public static void main(String[] args) { // m  s
	// 문제1 : 2개의 정수를 입력받아서 더 큰 수 출력
		
		Scanner scanner = new Scanner(System.in); // { } 당 1번만 선언!
		
		System.out.println("숫자를 입력하세요");
		int 정수1 = scanner.nextInt(); // int형 변수 선언 하고 입력받은 값을 정수로 가져와서 대입
		System.out.println("숫자를 입력하세요");
		int 정수2 = scanner.nextInt();
		
		if (정수1 > 정수2) 			System.out.println("둘 중 더 큰수는 " + 정수1 + "입니다");
		// 만약에 입력받은 정수1변수가 정수2보다 크면 실행 아니면 다음 조건
		else if(정수1 < 정수2)			System.out.println("둘 중 더 큰수는 " + 정수2 + "입니다");
		// 다음조건 정수1변수가 정수2 보다 작으면 실행 아니면 그외
		else 						System.out.println("같다");
		// 나머지 그외 실행	
		
	// 문제2 : 3개의 정수를 입력받아서 가장 큰수 출력	
		System.out.println("첫 숫자를 입력하세요");
		int 문제2_1 = scanner.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int 문제2_2 = scanner.nextInt();
		System.out.println("세번째 숫자를 입력하세요");
		int 문제2_3 = scanner.nextInt();
		int max = 문제2_1; // 가장 큰 수를 임시로 저장하는 역할
		if(max < 문제2_2) // 만약에 max보다 문제2_2보다 더 크면 교체
			{ int temp = 문제2_2;
			  문제2_2 = max;
			  max = temp;
			}	
		if (max < 문제2_3) {max = 문제2_3;} // 만약에 max보다 문제2_3보다 더 크면 교체
		System.out.println("가장 큰수 :"  + max);
		
		// 문제3 : 4개의 정수를 입력받아서 가장 큰수 출력
		System.out.println("첫 숫자를 입력하세요");
		int 정수6 = scanner.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int 정수7 = scanner.nextInt();
		System.out.println("세번째 숫자를 입력하세요");
		int 정수8 = scanner.nextInt();
		System.out.println("네번째 숫자를 입력하세요");
		int 정수9 = scanner.nextInt();
		
		int max2 = 정수6;
			if (max2 < 정수7) {max2 = 정수7;}
			if (max2 < 정수8) {max2 = 정수8;}
			if (max2 < 정수9) {max2 = 정수9;}
			System.out.println("가장 큰수 : " + max2);
				
		// 문제4 : 3개의 정수 입력받아서 오름차순
			System.out.println("첫째 숫자를 입력하세요");
			int 정수10 = scanner.nextInt();
			System.out.println("두번째 숫자를 입력하세요");
			int 정수11 = scanner.nextInt();
			System.out.println("세번째 숫자를 입력하세요");
			int 정수12 = scanner.nextInt();
		if (정수10 > 정수11) { // 스왑 : 두개 변수에 데이터 교환
			int temp = 정수10; // 임시변수 = 변수1
			정수10 = 정수11;  // 변수1 = 변수2
			정수11 = temp;   // 변수2 = 임시변수;
		}					
		if (정수10 > 정수12) {
			int temp = 정수10; 	정수10 = 정수12;	정수12 = temp;
		}
		if (정수11 > 정수12) {
			int temp = 정수11; 정수11 = 정수12; 정수12 = temp;
		}
		System.out.printf("입력한 값 오른차순 : %d, %d, %d", 정수10, 정수11, 정수12);
		System.out.println("입력한 값 오른차순 : " + 정수10 + "" + 정수11 + "" + 정수12);
		// 문제5 : 4개의 정수 입력받아서 내림차순		> : 오름차순 < : 내림차순
		
		System.out.println("첫째 숫자를 입력하세요");  	int a = scanner.nextInt();
		System.out.println("두번째 숫자를 입력하세요"); 	int b = scanner.nextInt();
		System.out.println("셋째 숫자를 입력하세요");		int c = scanner.nextInt();
		System.out.println("넷째 숫자를 입력하세요");		int d = scanner.nextInt();
		
		int min = a;
		if(a < b) { int temp = a; a = b; b= temp;}
		if(a < c) { int temp = a; a = c; c= temp;}
		if(a < d) { int temp = a; a = d; d= temp;}
		if(b < c) { int temp = b; b = c; c= temp;}
		if(b < d) { int temp = b; b = d; d= temp;}
		if(c < d) { int temp = c; c = d; d= temp;}
		System.out.printf("입력한 값 내림차순 : %d, %d, %d, %d",a,b,c,d);
		// 문제 5-1 : 4개의 정수 입력받아 올림차순
		
		System.out.println("첫째 숫자를 입력하세요");  	int e = scanner.nextInt();
		System.out.println("두번째 숫자를 입력하세요"); 	int f = scanner.nextInt();
		System.out.println("셋째 숫자를 입력하세요");		int g = scanner.nextInt();
		System.out.println("넷째 숫자를 입력하세요");		int h = scanner.nextInt();
		
		int max3 = e;
		if(e > f) { int temp = e; e = f; f= temp;}
		if(e > g) { int temp = e; e = g; g= temp;}
		if(e > h) { int temp = e; e = h; h= temp;}
		if(f > g) { int temp = f; f = g; g= temp;}
		if(f > h) { int temp = f; f = h; h= temp;}
		if(g > h) { int temp = g; g = h; h= temp;}
		System.out.printf("입력한 값 내림차순 : %d, %d, %d, %d",e,f,g,h);
	}	// m   e
} // c  e
