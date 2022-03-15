import java.util.ArrayList;
import java.util.Scanner;

import Day10.Book;

public class Day10_5_도서관리_리스트버전
{
	public static void main(String[] args)
	{
		// 1. 리스트[객체] 생성
		ArrayList< Book > booklist = new ArrayList<>();
		// 리스트클래스<리스트안에 저장할 클래스명>
		// <클래스> : 해당 클래스의 여러 객체를 리스트에 저장
		// 길이는 가변{기본 : 10}
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("1. 등록 2. 목록 3. 삭제 4. 수정");
			int ch = sc.nextInt();
			if(ch == 1) {
				// 1. 입력받기
				System.out.println("도서명 : "); String name = sc.next();
				System.out.println("저자 : "); String writer = sc.next();
				
				// 2. 객체화[ 여러개 변수 ----> 1개 객체]
				Book book = new Book(name, writer);
				
				// 3. 배열저장 [공백 찾아서 ] vs 리스트 [ 공백찾기 x]
				booklist.add(book); // 리스트에 저장
				// ??? -> .add라는 메소드는 마지막 인덱스에 자동적으로 객체가 추가, 그러나 중복제거는 안됨
			}
			else if (ch == 2) {
				// 1. 배열[null 제외] vs 리스트
				System.out.println("도서명 \t 저자");
				for(Book book : booklist) {
				System.out.println(book.get도서명() + "\t" + book.get저자() );}
			}
			else if (ch == 3) {}
			else if (ch == 4) {}
		}
	}
}
