package Day01;

 

import java.util.Scanner; // import : 가져오다

public class Day01_4 { // c  s

	public static void main(String[] args) { // m  s
		
		// 예제1 : 이름, 1교시, 2교시, 3교시 출석여부를 입력받아 출력
			// 입력 -> 저장 -> 출력
		// 1. 입력객체 선언[1번만 선언]
		Scanner scanner = new Scanner(System.in);
		// 2. 입력받을 데이터에 대한 안내
		System.out.println(" 이름을 입력하세요 : ");
		// 3. 입력받은 데이터 가져오기
		String 이름 = scanner.next();
		// = : 대입(오른쪽 값이 왼쪽에 저장됨)
		
		// 안내 출력							// 입력받아 다른 객체로 저장
		System.out.println("1교시 : ");  	String 교시1 = scanner.next();
		System.out.println("2교시 : "); 	String 교시2 = scanner.next();
		System.out.println("3교시 : ");  	String 교시3 = scanner.next();
		
		// 4. 출력
		System.out.println("\t\t[[출석부]]");
		System.out.println("---------------------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		System.out.println(이름 + "\t" + 교시1 + "\t" + 교시2 + "\t" + 교시3 );
		// 위에서 선언된 이름은 "" 문자처리 X
		System.out.println("---------------------------------------------");
		
		System.out.printf("%s\t%s\t%s\t%s\t \n", 이름, 교시1, 교시2, 교시3, "");
	}// m  e
	
} // c  e


