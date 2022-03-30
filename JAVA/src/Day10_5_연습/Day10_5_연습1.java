package Day10_5_연습;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_연습1 {
	// 1. 리스트[객체] 생성
			
			// 리스트클래스<리스트안에 저장할 클래스명>
			// <클래스> : 해당 클래스의 여러 객체를 리스트에 저장
			// 길이는 가변{기본 : 10}
	//메뉴 : 1. 등록 2. 목록 3. 삭제 4. 저자 수정;
	public static void main(String[] args) {
		ArrayList<Book> booklist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴 1. 등록 2. 목록 3. 삭제 4. 저자 수정");
			int ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("도서 등록 ");
				System.out.println("등록할 도서의 이름"); String name = sc.next();
				System.out.println("등록할 도서의 저자 이름"); String writer = sc.next();
				boolean pass = true;
				for(Book temp : booklist) {
					if(temp.get도서명().equals(name)) {
						System.out.println("도서의 제목이 중복됩니다.");
						pass = false;
					}
				}
				if(pass) {
				Book book = new Book(name, writer);
				booklist.add(book);}
				else System.out.println("도서 등록 실패!");
			}
			else if(ch == 2) {
				for(Book temp : booklist) {
					System.out.println(temp.get도서명() + "\t" +temp.get저자());
				}
			}
			else if(ch == 3) {
				System.out.println("삭제할 도서의 제목을 입력하세요");
				String name = sc.next();
				for(Book temp : booklist) {
					if(temp.get도서명().equals(name)) {
						booklist.remove(temp);
						System.out.println("삭제 성공!");
					}
					else System.out.println("삭제 실패!");
				}
			}
			else if(ch == 4) {
				System.out.println("수정할 도서의 이름을 입력하세요");
				String name = sc.next();
				System.out.println("수정할 도서의 저자의 이름을 입력하세요");
				String writer = sc.next();
				for(Book temp : booklist) {
					if(temp.get도서명().equals(name)) {
						temp.set저자(writer);
						System.out.println("저자 수정 성공!");
					}
				}
			}
			else System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요");
		}
	}
}
