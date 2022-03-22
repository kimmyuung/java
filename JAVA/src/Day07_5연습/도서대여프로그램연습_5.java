package Day07_5연습;

import java.util.Scanner;

public class 도서대여프로그램연습_5 {
	static Book5[] booklist = new Book5[100];
	static Member5[] memberlist = new Member5[100];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		도서대여프로그램연습_5 app = new 도서대여프로그램연습_5();
		app.menu();
	}
	void menu() {
		while(true) {
		System.out.println("도서대여프로그램 ");
		System.out.println("1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기 5. 로그아웃");
		int ch = sc.nextInt();
		Member5 member = new Member5();
		Book5 book = new Book5();
		if(ch == 1) {
			member.회원가입();
		}
		else if(ch==2) {
			String result = member.로그인();
			if (result.equals("admin")) {
				System.out.println("[1. 도서등록 2. 도서목록 3. 도서삭제 4. 순위(=베스트셀러) 5. 로그아웃]");
				int ch1 = sc.nextInt();
				if(ch1 ==1 ) {
					book.도서등록();
				}
				else if(ch1 == 2) {
					book.도서목록();
				}
				else if(ch1 == 3) {
					book.도서삭제();
				}
				else if(ch1 == 4) {
					book.도서순위();
				}
				else if(ch1 == 5) {member.로그아웃(); break;}
			}
			else {
				System.out.println("[1. 도서검색 2. 도서목록 3. 도서대여 4. 도서반납 5. 로그아웃]");
				int ch2 = sc.nextInt();
				if(ch2 == 1) {
					book.도서검색();
				}
				else if(ch2 == 2) {
					book.도서목록();
				}
				else if(ch2 == 3) {
					book.도서대여();
				}
				else if(ch2 == 4) {
					book.도서반납();
				}
				else if(ch2 == 5) {member.로그아웃(); break;}
				}
		}
		else if(ch==3) {
			member.아이디찾기();
		}
		else if(ch==4) {
			member.비번찾기();
		}
		else if(ch==5) {member.로그아웃(); break;}
		else {System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");}
		}
	}
}
