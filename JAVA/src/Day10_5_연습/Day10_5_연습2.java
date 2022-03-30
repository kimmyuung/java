package Day10_5_연습;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_연습2 {
	// 리스트클래스<리스트안에 저장할 클래스명>
				// <클래스> : 해당 클래스의 여러 객체를 리스트에 저장
				// 길이는 가변{기본 : 10}
		//메뉴 : 1. 등록 2. 목록 3. 삭제 4. 저자 수정
	public static void main(String[] args) {
		ArrayList<Book> booklist = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 등록 2. 목록 3. 삭제 4. 저자 수정");
			System.out.println(">> 선택 : ");
			int ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("등록할 책의 이름을 입력하세요");
				String name = sc.next();
				System.out.println("등록할 책의 저자를 입력하세요");
				String writer = sc.next();
				boolean pass = false;
				for(Book temp : booklist) {
					if(temp.get도서명().equals(name)) {
						System.out.println("도서명이 중복됩니다.");
						pass = false;
					}
				}
				if(pass) {
					Book book = new Book(name, writer);
					booklist.add(book);
				}
			}
			else if(ch == 2) {
				for(Book temp : booklist) {
					System.out.println(temp.get도서명() + temp.get저자());
				}
			}
			else if(ch == 3) {
				System.out.println("삭제할 도서명을 입력하세요");
				String name = sc.next();
				for(Book temp : booklist) {
					if(temp.get도서명().equals(name)) {
						booklist.remove(temp);
					}
				}
			}
			else if(ch == 4) {
				System.out.println("수정할 저자명을 입력하세요");
				String writer = sc.next();
				for(Book temp : booklist) {
					if(temp.get저자().equals(writer)) {
						temp.set저자(writer);
						System.out.println("수정 완료!");
					}
				}
			}
		}
	}
}
