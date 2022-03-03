package Day01;

public class Day_2 { // class  start
	
	public static void main(String[] args) {// m s
		
		System.out.print("하고싶은말");   // ; : 코드 단위 종료
		System.out.print(" java 1일차"); // 문자처리 " " 처리
		System.out.print(123);		  // 숫자처리 " " 처리 X
		// 미리 만들어진 예약어(문법)을 제외한 모든 문자는 "" 처리
		// 2. 자동완성 (syso + ctrl + 스페이스바)
		System.out.println("자바는 개체 지향");
		System.out.println("jdk8");
		System.out.println("Hello World!");
		// 3. 형식출력
		// 형식 : %d(정수), %s(문자), %f(실수)
		System.out.printf("%s", "하고싶은말");
		System.out.printf("java %d일차", 1);
		
		// 예제 1 [출석부]
		System.out.println("\n\t\t[[출석부]]");
		System.out.println("---------------------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t4교시\t비고");
		System.out.println("강호동\t출석\t결석\t출석\t출석");
		System.out.println("유재석\t출석\t출석\t출석\t결석");
		System.out.println("---------------------------------------------");
	
		// 예제 2 [ 예제 1 -> printf]
		System.out.printf("\n\t\t %s", "[[출석부]]\n");
		System.out.printf("%s", "---------------------------------------------\n");
		System.out.printf("%s\t%s\t%s\t%s\t%s","이름","1교시","2교시","3교시","4교시","비고");
		System.out.printf("\n%s","강호동\t출석\t결석\t출석\t출석\n");
		System.out.printf("%s","유재석\t출석\t출석\t출석\t결석\n");
		System.out.printf("%s","---------------------------------------------\n");
				
		
		// 문제 1 : 고양이
		System.out.println("\\       /\\");
		System.out.println(" )    (  ')");
		System.out.println("(    /   /");
		System.out.println(" \\//(____)|"); // | : shift + \
		// 문제 2 : 강아지
		
		System.out.println("\n|\\_/|"); // \ 출력시 -> \\
		System.out.println("|q p|");
		System.out.println("( 0 )\"\"\"\"\\"); // " 출력시 -> \"
		System.out.println("|\"^\"'");
		System.out.println("||_/=\\\\___|");		
	
	}// m  e  
	
		
	//1. 출력함수
		// 1. print() : 출력만
		// 2. printf() : 출력에 꾸미기 가능
		// 3. printIn() : 출력 후 줄바꿈하여 출력
	// System : 시스템 클래스 [입출력 관련 만들어진 코드 제공]
		// 1. out : 출력 스트림
		// 2. print : 출력 함수
		// 3. ; : 한줄 코드의 끝을 알림
	// 시스템클래스내  out 이라는 출력스트림 통해 print 함수 사용하여 console에 원하는 값 출력
	// 제어문자 : \n(줄바꿈), \t(행바꿈)
	// 제어문자 출력시 제어문자를 2번 사용해야 함
	// 제어문자 \ 출력 시 : \\ 입력
	// \" : "
}// class end