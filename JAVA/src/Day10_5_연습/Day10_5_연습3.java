package Day10_5_연습;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_연습3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Book> booklist = new ArrayList<Book>();
	
	while(true) {
		System.out.println("1. 등록 2. 목록 3. 삭제 4. 저자 수정");
		int ch = sc.nextInt();
		if(ch == 1) {
			System.out.println("도서 등록 페이지");
			System.out.println("등록할 도서의 이름을 입력하세요");
			String name = sc.next();
			System.out.println("등록할 도서의 저자를 입력하세요");
			String writer = sc.next();
			boolean pass = true;
			for(Book temp : booklist) {
				if(temp.get도서명().equals(name)) {
					System.out.println("도서명이 중복됩니다.");
					pass = false;
				}
			}
			if(pass) {Book book = new Book(name, writer);
			booklist.add(book);}
		}
		else if(ch == 2) {
			for(Book temp : booklist) {
				System.out.println(temp.get도서명() + " " + temp.get저자());
			}
		}
		else if(ch == 3) {
			System.out.println("도서 삭제 페이지");
			System.out.println("삭제할 도서의 이름을 입력하세요");
			String name = sc.next();
			for(Book temp : booklist) {
				if(temp.get도서명().equals(name)) {
					booklist.remove(temp);
				}
			}
		}
		else if(ch == 4) {
			System.out.println("저자 수정 페이지");
			System.out.println("저자를 수정할 도서의 이름을 입력하세요");
			String name = sc.next();
			System.out.println("수정할 도서의 저자를 입력해주세요");
			String writer = sc.next();
			for(Book temp : booklist) {
				if(temp.get도서명().equals(name) ) {
					temp.set저자(writer);
					System.out.println("저자 수정 완료!");
				}
				else System.out.println("저자 수정 실패!");
			}
		}
		else System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요");
	}
}
}
