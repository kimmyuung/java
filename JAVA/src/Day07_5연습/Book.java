package Day07_5연습;

public class Book {
	// 1-1. book	: 필드(도서코드(ISBN), 도서명, 저자, 도서대여여부, 대여회원) 
	//	메소드(도서 검색, 도서 목록, 도서 대여, 도서 반납, 관리자)) 도서 등록, 도서 삭제)
	// 1. field
	String ISBN;
	String bname;
	String writer;
	String borrow;
	
	
	// 2. constructor
	public Book() {}
	
	public Book(String iSBN, String bname, String writer) {
		super();
		ISBN = iSBN;
		this.bname = bname;
		this.writer = writer;
	}

	public Book(String iSBN, String bname, String writer, String borrow) {
		super();
		ISBN = iSBN;
		this.bname = bname;
		this.writer = writer;
		this.borrow = borrow;
		
	}
	// 3. method
	void 도서대여() {
		System.out.println("도서 대여 페이지");
		System.out.println("대여할 도서의 이름을 입력해주세요");  String bname = 도서대여프로그램연습_1.sc.next();
		int i = 0;
		for(Book temp : 도서대여프로그램연습_1.booklist) {
			if(temp != null && 도서대여프로그램연습_1.booklist[i].bname.equals(bname) && 도서대여프로그램연습_1.booklist[i].borrow.equals("대여 가능")) {
				System.out.printf("도서를 대여합니다.");
				도서대여프로그램연습_1.booklist[i].borrow = "대여 중";	
				break;
			}
		i++;}	
		
	}
	void 도서검색() {
		System.out.println("도서 검색 페이지");
		System.out.println("검색할 도서의 ISBN을 입력해주세요"); String isbn = 도서대여프로그램연습_1.sc.next();
		System.out.println("검색할 도서의 이름을 입력해주세요");  String bname = 도서대여프로그램연습_1.sc.next();
		int i = 0;
		for(Book temp : 도서대여프로그램연습_1.booklist) {
			if(temp != null) {
				System.out.printf("검색할 도서를 찾았습니다." + 도서대여프로그램연습_1.booklist[i].ISBN 
						+ 도서대여프로그램연습_1.booklist[i].bname);
						break;
			}
		i++;}	
	}
	void 도서목록() { // 도서목록을 보는 메소드
		System.out.println("도서 목록 페이지");
		int i = 0;
		for(Book temp : 도서대여프로그램연습_1.booklist) {// 도서 목록 출력
			if(temp != null) { // 도서리스트가 null이 아니라면 도서목록 출력
				System.out.printf("ISBN : %s \t 책 제목 : \t 저자 : %s \t 대여여부 : %s \n"
						, 도서대여프로그램연습_1.booklist[i].ISBN, 도서대여프로그램연습_1.booklist[i].bname,
						도서대여프로그램연습_1.booklist[i].writer, 도서대여프로그램연습_1.booklist[i].borrow);
			}
		i++;}	
				
	}
	void 도서반납() {
		System.out.println("도서 반납 페이지"); // 도서 반납
		System.out.println("반납할 도서의 이름을 입력해주세요");  String bname = 도서대여프로그램연습_1.sc.next();
		int i = 0;
		for(Book temp : 도서대여프로그램연습_1.booklist) {
			if(temp != null && 도서대여프로그램연습_1.booklist[i].bname.equals(bname) && 도서대여프로그램연습_1.booklist[i].borrow.equals("대여 중")) {
				System.out.printf("도서를 반납합니다.");
				도서대여프로그램연습_1.booklist[i].borrow = "대여 가능";	
				break;
			}
		i++;}	
	}
	void 도서등록() { // 도서 등록 페이지
		System.out.println("도서 등록 페이지"); // 도서 등록을 위해 ISBN, 도서명, 저자를 입력받음
		System.out.println("ISBN : ");		String isbn = 도서대여프로그램연습_1.sc.next();
		System.out.println("도서명 : ");		String bname = 도서대여프로그램연습_1.sc.next();
		System.out.println("저자 : ");		String writer = 도서대여프로그램연습_1.sc.next();
		int i = 0;
		for(Book temp : 도서대여프로그램연습_1.booklist) { 
			if(temp == null) {
				Book book = new Book(isbn, bname, writer, "대여 가능"); // 객체로 선언
				도서대여프로그램연습_1.booklist[i] = book; // 객체 book을 booklist배열에 넣음
				System.out.println("도서등록이 완료되었습니다."); // 도서등록완료
				break;
			}
		i++;}
	}
	void 도서삭제() { // 도서 삭제
		System.out.println("삭제할 도서 제목을 입력해주세요"); String bname = 도서대여프로그램연습_1.sc.next();
		int i = 0; // 삭제할 도서 제목을 입력받음
		for(Book temp : 도서대여프로그램연습_1.booklist) { // 도서리스트가 공백이아니고 입력받은 도서제목과 배열안의 도서제목이 같다면
			if(temp != null && 도서대여프로그램연습_1.booklist[i].bname.equals(bname)) {
						도서대여프로그램연습_1.booklist[i] = null; // 도서 삭제
			}
		i++;}	
	}
	void 도서순위() {}
}
