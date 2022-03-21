package 개인과제구상;

import java.util.Scanner;

public class 조별과제1_메인 {
public static void main(String[] args) {
	// 0. 변수 준비
	Scanner scanner = new Scanner(System.in);
	
	try { // 예외처리
	while(true) {
	System.out.println("주차타워 관리 프로그램");
	System.out.println("[[1. 주차 2. 출차 3. 매출보기]]");
	int select = scanner.nextInt();
	if (select == 1) {
		
	}	
	else if(select == 2) {
		
	}
	else if(select == 3) {
		
	}
	else if(select < 0) {
		System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");
	}
	else {System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");}
	} // we 
	}catch(Exception e) {System.out.println("문자를 입력하셨습니다. 다시 입력해주세요");} // tc e
}
}
