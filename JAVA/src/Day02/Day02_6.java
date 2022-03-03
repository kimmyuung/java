//문제15 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
		
		//문제16 : 3개의 정수를 입력받아 오름차순으로 정렬 
		
		//문제17 : 4개의 정수를 입력받아 내림차순으로 정렬 
		
		// p. 102 확인문제
package Day02;

import java.util.Scanner;

public class Day02_6 { // c  s
	public static void main(String[] args) { // m  s
	Scanner scanner = new Scanner(System.in); // 객체 선언
	
	System.out.println("나이를 입력하세요 : ");
	int age = scanner.nextInt();
	String age_1 = age > 40 ? "중년" : age > 20 ? "성인" : "학생"; // 나이가 40 초과시 중년, 20 초과면 성인 이하시 학생
	
	System.out.println("당신의 나잇대는 " + age_1); // 데이터 출력 
	
	/*
	 * System.out.println("숫자를 입력하세요 : "); int a = scanner.nextInt();
	 * System.out.println("숫자를 입력하세요 : "); int b = scanner.nextInt();
	 * System.out.println("숫자를 입력하세요 : "); // 정수들을 입력받음 int c = scanner.nextInt();
	 * // 정수들을 오름차순으로 정렬 int d = a > b ? a : b > c ? b : c; // 가장 큰 숫자 a는 제일 크다 int
	 * e = a > b ? b : a > c ? a : c; // 중간 숫자 int f = a < b ? a : b < c ? b : c; //
	 * 가장 작은 숫자 a는 c보다 작다 System.out.printf("오름차순으로 정렬하면 :%d \t %d \t %d", d, e, f);
	 * // a > b ? a : b > c ? b : c -> 제일 큰 숫자를 찾는 식 // // a < b ? b : a < c ? c : a
	 * -> 제일 작은 숫자를 찾는 식
	 */	
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
	} // m  e
} // c  e
