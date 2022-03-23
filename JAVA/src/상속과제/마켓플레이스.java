package 상속과제;

import java.util.ArrayList;
import java.util.Scanner;

public class 마켓플레이스 {
	static ArrayList<Market> memberlist = new ArrayList<Market>(); // 정적변수로 회원 리스트를 선언
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); // 입력 객체 선언
	Market market = new Market(); // Market의 객체 선언
	try {
	while(true) {
	System.out.println("마켓 관리에 오신걸 환영합니다."); 
	System.out.println("1. 회원 가입 "); // 마켓 관리
	int ch = sc.nextInt();
	if(ch == 1) {
		System.out.println("회원가입 페이지");
		System.out.println("회원가입을 원하는 마켓을 선택해 주세요");
		System.out.println("1. 롯데마트 \t 2. 이마트");
		int ch1 = sc.nextInt();
		if(ch1 == 1) { // 롯데마트의 회원 가입
			
			System.out.println("롯데마트 아이디");		String id = sc.next();
			System.out.println("롯데마트 비밀번호");		String pw = sc.next();
			System.out.println("롯데마트 핸드폰번호");	String number = sc.next();
			
			market.lottemarket = new 롯데마트(id, pw, number); // 슈퍼클래스 객체를 서브클래스로 활용
		}
		else if(ch1 == 2) {
			
			System.out.println("이마트 아이디");		String id = sc.next();
			System.out.println("이마트 비밀번호");		String pw = sc.next();
			System.out.println("이마트 핸드폰번호");		String number = sc.next();
			
			market.emarket = new 이마트(id, pw, number); // 슈퍼 클래스 객체를 서브클래스로 활용
		}
	}
	}
	}catch(Exception e) {System.out.println("문자열을 입력하셨습니다. 다시 입력해주세요");}
}
}
