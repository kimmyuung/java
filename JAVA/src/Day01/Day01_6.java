package Day01;

import java.util.Scanner;

//  작성자, 내용, 날짜
public class Day01_6 { //  c  s

	public static void main(String[] args) { // m  s
		
	// 1. 객체 선언
	Scanner	scanner = new Scanner(System.in);
	// 2. 입력 대상 안내				3. 데이터를 다른 곳에 저장
	System.out.print("작성자 : "); 	String writer = scanner.next();
	System.out.print("내용 : "); 	String context = scanner.next();
	System.out.print("날짜 : ");	String date = scanner.next();
	// 4. 데이터 출력
	System.out.println("---------------방문록----------------");
	System.out.println("|순번|\t|작성자|\t|내용|\t|날짜|");
	System.out.println("|1 |\t|" + writer + "|\t|" + context + "|\t|" + date + "|");
	
	} // m  e
	
} // c  epackage Day01;


