package Day03;

public class Day03_5 { // c  s

	public static void main(String[] args) { // m  s
		// 반복문 1. for 2. while 3. do~while[x]
		// for : 어디서부터 어디까지 몇개씩 증가 / 감소하면서 반복처리
		// 1부터 10까지 1씩 증가하면서 반복처리 => 10번 실행
		// 1부터 10까지 3씩 증가하면서 반복처리 => 4번 실행 (1, 4, 7, 10)
		// 1. 초기값 2. 조건식 3. 증감식
		// 형태
		// for (1.초기값 ; 2.조건식 ; 3.증감식) {
		//		반복실행문;					}
		
		// p.121 예제1
		for(int i = 1; i <= 10; i++) {// int i = 1 : 초기값 선언 // i3++ : i가 3씩 증가
			// i <= 10 : i가 10이하이면 실행 아니면 실행불가, i++(1번 실행 후 1씩 증가)
			System.out.print(i + "");
		} // i = 1 일때 -> i <= 10 [true] 실행문실행 -> 증감식 i = 2 
		  // i = 2 일때 -> i <= 10 [true] 실행문실행 -> 증감식 i = 3
		// ... i=10될때까지 반복 -> 증감식 i = 11이면 반복문 [fasle] 되면서 종료
		
		// p. 122 예제2 : 1부터 100까지 누적합 출력
		int sum = 0;
		for(int i = 1; i<=100; i++) {
		sum += i;	//(=sum = sum + i;)
		}
		System.out.println("\n1~100까지의 누적합 결과 :" + sum);
		
		// 에제3 : 1부터 100까지 7배수의 누적합계
		int sum2 = 0;
		for(int i = 1; i <= 100; i = i+7)//i += 7)-> i가 7씩 증가
			{ sum2 += i; //(sum = sum + i;)}
		System.out.println("1~100까지 7배수 누적합 결과 : " + sum2);
			}
		
		int sum3 = 0;
		for(int i = 1; i<=100; i++)
		{
		{if(i%7 == 0) sum3 += i;//sum3 = i + sum3; 
		}
		}
		System.out.println("1~100까지 7배수 누적합 결과 : " + sum3);
		
	// 예제4 : 2단 구구단 만들기
		for(int 곱 = 1; 곱<=9; 곱++) {
			int i = 2;
	//System.out.println(i * 곱); 
	System.out.println("2 X " + 곱 + " = " + (2*곱));
	System.out.printf("\t2 X %d = %d\n", 곱, (2*곱));
		}
	
	// for문의 중첩 : for1() {for2() { for3() { } } }
    // 예제 : 1단-9단 구구단 만들기 [단 = 변수, 곱 = 변수]
		// 단 : 1부터 9까지 1씩 증가 -> 9번 , 곱 : 1부터 9까지 1씩 증가 -> 9번
		// 단 1번 실행시 곱 9번 실행 => 총 실행 횟수는 81번
		for(int 단 = 1 ; 단 <= 9; 단++) {
			System.out.printf("---------%d단--------\n", 단);
			// for 중첩
			for(int 곱 = 1; 곱 <=9; 곱++) {
				System.out.printf(" %d * %d = %d \n", 단, 곱, 단*곱);
			}
		}
		
		
		
		} // m  e
		
} // c  e
