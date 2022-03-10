package Day07;

public class Book {
	// 1. 필드
		// ISBN [도서번호 = 식별번호]
		// 도서명, 작가, 도서대여여부, 대여인ID 
	String ISBN;
	String bname;
	String writer;
	boolean rent;
	String rentid;
	// 2. 생성자
	Book() {} // 기본생성자 : 메소드 호출용
	public Book(String iSBN, String bname, String writer, boolean rent, String rentid) {
		ISBN = iSBN;
		this.bname = bname;
		this.writer = writer;
		this.rent = rent;
		this.rentid = rentid;
	}  // 모든 필드를 가진 생성자 : 도서등록시 사용
	
	// 3. 메소드
		// 1. 도서검색
	void 도서검색() {}
		// 2. 도서목록
	void 도서목록() {
		System.out.println("도서목록 페이지");
		System.out.println("ISBN\t 도서명\t 작가\t 대여가능여부");
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp != null) { // 도서가 존재하면
			if(temp.rent) // 도서대여가 가능하면
			System.out.println(temp.ISBN + "\t" + temp.bname + "\t"+ temp.writer +"\t"+ "가능");
			else // 해당 도서대여여부가 false 
			{System.out.println(temp.ISBN + "\t" + temp.bname + "\t"+ temp.writer +"\t"+ "불가능");}
			}
		}
	}
		// 3. 도서대여
	void 도서대여(String loginid) {
		System.out.println("대여할 도서의 ISBN을 입력해주세요");
		String ch = Day07_5_BookApplication.scanner.next();
		for(Book temp : Day07_5_BookApplication.books) {
		if(temp != null && temp.ISBN.equals(ch)) {
			System.out.println("해당 도서 대여합니다.");
			temp.rent = false; // 대여중
			temp.rentid = loginid;// 현재 로그인한 아이디
			return;
		}
		else {System.out.println("알림]] 해당 도서는 대여중입니다."); return;}
		}
		System.out.println("알림]] 동일한 도서 ISBN이 없습니다.");
	}
		// 4. 도서반납
	void 도서반납() {
		
	}
		// 5. 도서등록
	void 도서등록() {
		System.out.println("ISBN를 입력해주세요"); 	String ISBN = Day07_5_BookApplication.scanner.next();
		System.out.println("도서 이름을 입력해주세요"); 		String bname = Day07_5_BookApplication.scanner.next();
		System.out.println("도서 작가를 입력해주세요"); 	String writer = Day07_5_BookApplication.scanner.next();
		Book book = new Book(ISBN , bname, writer, true, null);
		
		// 아이디 중복체크
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp != null && temp.ISBN.equals(ISBN)) {
				// 만약에 공백이 아니면서 배열내 id와 입력받은 id와 동일하면
				System.out.println("현재 사용중인 ISBN 입니다.");
				return; // 아이디가 중복되었기 때문에 실패
			}
				
		}
		int i = 0;
		for(Book temp : Day07_5_BookApplication.books)
			//= for(Member temp : Day07_5_BookApplication.members)
			{
				if(temp == null) {
					Day07_5_BookApplication.books[i] = book;
				return;
				} 
			 i++;	
			}
		return;
	}
		// 6. 도서삭제
	void 도서삭제() {}
}
