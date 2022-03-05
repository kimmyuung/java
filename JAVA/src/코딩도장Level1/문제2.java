package 코딩도장Level1;

import java.util.Scanner;

public class 문제2 { // c  s
	public static void main(String[] args) { // m  s
//  문제2
//	A씨는 게시판 프로그램을 작성하고 있다.
//	A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 
		// 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.
//	입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
//	출력 : 총페이지수
//	A씨가 필요한 프로그램을 작성하시오.
//	예) 프로그램 수행 시 다음과 같은 결과값이 나와야 함.
//      m	n	출력
//		0	1	0
//		1	1	1
//		2	1	2
//		1	10	1
//		10	10	1
//		11	10	2
		Scanner scanner = new Scanner(System.in);
		System.out.println("게시물의 총 건수를 입력하세요.");
		int m = scanner.nextInt(); // 게시판 총 건수
		System.out.println("한 페이지에 보여줄 게시물 수를 입력하세요");
		int n = scanner.nextInt(); // 한 페이지에 보여줄 게시물 수
		if( n < 1 ) {System.out.println("알림)) 한페이지 이상 출력해야 합니다.");
			if( m % n == 0 ) {
			System.out.println(m/n);
			}
		else { System.out.println(m/n + 1);}
			}
		
		
		
		
	}
} // c e
