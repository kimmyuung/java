package Day07_5연습;

public class Book5 {
	String ISBN;
	String bname;
	String writer;
	String borrow;
	
	Book5() {}
	public Book5(String iSBN, String bname, String writer, String borrow) {
		super();
		ISBN = iSBN;
		this.bname = bname;
		this.writer = writer;
		this.borrow = borrow;
	}
	void 도서검색() {
		System.out.println("도서검색 페이지");
		System.out.println("도서명 : ");			String bname = 도서대여프로그램연습_5.sc.next();
		System.out.println("저자 : ");			String writer = 도서대여프로그램연습_5.sc.next();
		int i = 0;
		for(Book2 temp : 도서대여프로그램연습_5.booklist) {
			if(temp != null && 도서대여프로그램연습_5.booklist[i].bname.equals(bname)) {
				System.out.println("찾으시는 도서명을 가진 서적이 검색되었습니다");
				System.out.println(도서대여프로그램연습_5.booklist[i].bname + "\t" + 도서대여프로그램연습_5.booklist[i].borrow);
			}
		i++;}
	}
	void 도서목록() {
		int i = 0;
		for(Book2 temp : 도서대여프로그램연습_5.booklist) {
			if(temp != null && 도서대여프로그램연습_5.booklist[i].bname.equals(bname)) {
				System.out.println("도서 목록");
				System.out.printf("ISBN : %s \t 도서명 : %s \t 저자 : %s \t 대여여부 : %s \n"
						, 도서대여프로그램연습_5.booklist[i].ISBN,도서대여프로그램연습_5.booklist[i].bname
						, 도서대여프로그램연습_5.booklist[i].writer, 도서대여프로그램연습_5.booklist[i].borrow);
			}
		i++;}
	}
	void 도서반납() {
		System.out.println("도서반납 페이지");
		System.out.println("도서명 : ");			String bname = 도서대여프로그램연습_5.sc.next();
		int i = 0;
		for(Book2 temp : 도서대여프로그램연습_5.booklist) {
			if(temp != null && 도서대여프로그램연습_5.booklist[i].bname.equals(bname) && 
					도서대여프로그램연습_5.booklist[i].borrow.equals("대여 중")) {
				System.out.println("도서를 반납합니다.");
				도서대여프로그램연습_5.booklist[i].borrow = "대여 가능";
			}
		i++;}
	}
	void 도서등록() {
		System.out.println("도서등록 페이지");
		System.out.println("ISBN : "); 			String isbn = 도서대여프로그램연습_5.sc.next();
		System.out.println("도서명 : ");			String bname = 도서대여프로그램연습_5.sc.next();
		System.out.println("저자 : ");			String writer = 도서대여프로그램연습_5.sc.next();
		int i = 0;
		for(Book2 temp : 도서대여프로그램연습_5.booklist) {
			if(temp == null) {
				Book2 book = new Book2(isbn, bname, writer, "대여 가능");
				도서대여프로그램연습_5.booklist[i] = book;
				System.out.println("도서 등록 완료");
				break;
			}
		i++;}
	}
	void 도서대여() {
		System.out.println("도서대여 페이지");
		System.out.println("도서명 : ");			String bname = 도서대여프로그램연습_3.sc.next();
		int i = 0;
		for(Book2 temp : 도서대여프로그램연습_5.booklist) {
			if(temp != null && 도서대여프로그램연습_5.booklist[i].bname.equals(bname) && 
					도서대여프로그램연습_5.booklist[i].borrow.equals("대여 가능")) {
				System.out.println("도서를 대여합니다.");
				도서대여프로그램연습_5.booklist[i].borrow = "대여 중";
			}
		i++;}
	}
	void 도서삭제() {
		System.out.println("도서삭제 페이지");
		System.out.println("ISBN : "); 			String isbn = 도서대여프로그램연습_3.sc.next();
		System.out.println("도서명 : ");			String bname = 도서대여프로그램연습_3.sc.next();
		int i = 0;
		for(Book2 temp : 도서대여프로그램연습_5.booklist) {
			if(temp != null && 도서대여프로그램연습_5.booklist[i].ISBN.equals(isbn) && 
					도서대여프로그램연습_5.booklist[i].bname.equals(bname)) {
				도서대여프로그램연습_5.booklist[i] = null;
				System.out.println("도서를 삭제하였습니다.");
				}
			}
	}
	void 도서순위() {
		
	}
}
