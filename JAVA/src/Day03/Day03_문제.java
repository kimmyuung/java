package Day03;

import java.util.Scanner;

public class Day03_문제 { // c   s
	
	public static void main(String[] args) { // m  s
		// 별문제 1: 입력받은 수 만큼 * 출력
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문제1) 별개수 :"); int s1 = scanner.nextInt();
		for(int i = 1; i <= s1 ;  i++)
		{ // i는 1부터 입력받은 수 까지 i는 1씩 증가
			System.out.print("*");
		}
		// 별문제 2 : 입력받은 수 만큼 * 출력[5개마다 줄바꿈 처리]
		System.out.println("문제2) 별개수 :"); int s2 = scanner.nextInt();
		for(int i = 1; i <= s2 ; i++)
		{ 
			System.out.print("*");
			if(i%5==0) System.out.println();
		}
		// 별문제 3 : 입력받은 줄 만큼 출력(올림차순) -> i= 줄 + s3 = 별
		System.out.print("문제3) 줄수 : "); int line3 = scanner.nextInt();
		for( int i = 1 ; i<=line3 ; i++  ) {
			// * i는 1부터 입력받은 줄 수까지 1씩증가
			// 1. 별찍기 
			for( int s = 1 ; s<=i ; s++ ) {
				System.out.print("*");
			}
			// 2. 줄바꿈처리
			System.out.println(); // 줄 바꿈
		}
		// 순서도 
		// 사용자가 3을 입력했을때 
		// i = 1  i<=3 [true] -> i++
			// s = 1	s<=1 [true] -> * -> s++
			// s = 2 	s<=1 [false] -> for2 반복문종료
		// 줄바꿈
		// i = 2  i<=3 [ true ] -> i++
			// s = 1	s<=2 [true] -> * -> s++
			// s = 2 	s<=2 [true] -> * -> s++
			// s = 3 	s<=2 [false] -> for2 반복문종료 
		// 줄바꿈
		// i = 3  i<=3 [ true ] -> i++
			// s = 1	s<=3 [ true ] -> * -> s++
			// s = 2    s<=3 [ true ] -> * -> s++
			// s = 3 	s<=3 [ true ] -> * -> s++
			// s = 4	s<=3 [ false] -> for2 반복문종료
		// 줄바꿈
		// i = 4 	i<=3 [false ] for1 반복문종료
			
		// 별문제 4 : 입력받은 줄 만큼 출력(내림차순)
		System.out.println("문제4) 줄수 : "); int line4 = scanner.nextInt();
		for(int i = 1; i<=line4; i++)
		{
			for(int s = 1; s<=line4-i; s++) // 1. 별찍기
			{ System.out.print("*");						  // s는 1부터 ???? 1씩증가하면서 별출력
			}// s는 입력받은수 - 현재 줄수 + 1 : 별을 출력
			System.out.println();
		} // 2. i는 1부터 입력받은 수까지 1씩증가하면서 줄바꿈처리
		
		
		// 별문제 5 : 입력받은 줄 만큼 출력(3의 반대로) : line(줄), s(별), 공백(a) 필요 -> 거꾸러 가야 해서 공백부터 출력 필
		System.out.println("문제5) 줄수 : "); int line5 = scanner.nextInt();
		for(int i = 1; i<=line5; i++) // -> 입력받은 줄 수를 출력
		{	for(int b = 1; b<=line5-i; b++)
			{System.out.print(" ");  }    // 공백찍기
				for(int s = 1; s<=i; s++)
					{System.out.print("*");} // 별찍기 : 입력받은수-현재줄수까지 1씩증가
			
					System.out.println(); // 줄바꿈
		}
		// 별문제 6 : 입력받은 줄 만큼 출력(4의 반대로)
		/* *****		i = 1 		b(공백) = 0		s(별) = 5 
		//  ****		i = 2		b = 1			s = 4
		 *   *** 		i = 3		b = 2			s = 3
		 *    ** 		i = 4		b = 3			s = 2
		 *     * 		i = 5		b = 4			s = 1
		 *     b는 1부터 (현재줄수 - 1) 까지 1씩증가하여 공백을 출력 -> 1. 공백 2. 별 3. 줄바꾸기
		 */
		System.out.println("문제6) 줄수 : "); int line6 = scanner.nextInt();
		for(int i = 1; i<=line6; i++)
		{
			for(int b = 1; b<=i-1; b++)
			{ System.out.print(" "); // s는 1부터 ???? 1씩증가하면서 별출력
			}
			for(int s = 1; s<=line6-i+1; s++)
			{System.out.print("*"); } // 별찍기 : 입력받은수-현재줄수까지 1씩증가
			
			System.out.println();
		} 
		// 문제 7 :  i=5 기준
		/*				*		i = 1		b = 1 2 3 4		s = 1	
		 * 			   ***  	i = 2		b = 1 2 3		s = 1 2 3
		 * 			  ***** 	i = 3		b = 1 2			s = 1 2 3 4 5
		 * 			 *******	i = 4		b = 1			s = 1 2 3 4 5 6 7
		 * 			*********   i = 5		b = 			s = 1 2 3 4 5 6 7 8 9
		 				-> b는 1부터 입력받은수- 현재 줄수로 만듦. s는 2씩증가 -> i*2 = 2*/
		System.out.println("문제7) 줄수 : "); int line7 = scanner.nextInt();
		for(int i = 1; i<=line7; i++)
		{
			for(int b = 1; b<=line7-i; b++) {
				System.out.print(" ");
			}
			for(int s = 1; s<=i*2-1; s++)// 별의 갯수가 1,3,5,7,9 이므로 (별의 개수 X 2) - 1
			{System.out.print("*");
			}
			System.out.println();
		}
		// 문제 8 :  i=5 기준
				/*				1		i = 1		b = 1 2 3 4		s = 1	
				 * 			   222  	i = 2		b = 1 2 3		s = 1 2 3
				 * 			  33333 	i = 3		b = 1 2			s = 1 2 3 4 5
				 * 			 4444444	i = 4		b = 1			s = 1 2 3 4 5 6 7
				 * 			555555555   i = 5		b = 			s = 1 2 3 4 5 6 7 8 9
				 				-> b는 1부터 입력받은수- 현재 줄수로 만듦. s는 2씩증가 -> i*2 = 2*/
				System.out.println("문제8) 줄수 : "); int line8 = scanner.nextInt();
				for(int i = 1; i<=line7; i++)
				{
					for(int b = 1; b<=line7-i; b++) {
						System.out.print(" ");
					}
					for(int s = 1; s<=i*2-1; s++)// 별의 갯수가 1,3,5,7,9 이므로 (별의 개수 X 2) - 1
					{System.out.printf("%d",i);
					}
					System.out.println();
				}		
			
	} // m  e
} // c   e
