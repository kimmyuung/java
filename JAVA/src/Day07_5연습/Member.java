package Day07_5연습;

public class Member {
	// 1-2. member	: 필드(회원번호, 아이디, 비번, 이름, 연락처) 
	 // 메소드(회원가입, 로그인, 아이디 찾기, 비번 찾기, 로그아웃)
	// 1. field
	int inum;
	String id;
	String pw;
	String name;
	String phone;
	// 2. constructor
	public Member(int inum, String id, String pw, String name, String phone) {
		super();
		this.inum = inum;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	public Member() {}
	// 3. method
	void 회원가입 () {
		System.out.println("회원가입 페이지 ");	
		System.out.println("아이디 : ");			String id = 도서대여프로그램연습_1.sc.next();
		System.out.println("비밀번호 : ");			String pw = 도서대여프로그램연습_1.sc.next();
		System.out.println("이름 : ");			String name = 도서대여프로그램연습_1.sc.next();
		System.out.println("전화번호 : ");			String phone = 도서대여프로그램연습_1.sc.next();
		int i = 0;
		for(Member temp : 도서대여프로그램연습_1.memberlist) {
			if(temp == null) {
				Member member = new Member(i, id, pw, name, phone);
				도서대여프로그램연습_1.memberlist[i] = member;
				System.out.println("회원가입 완료");
			}
		i++;}
	}
	
	String 로그인 () {
		System.out.println("로그인 페이지");
		System.out.println("아이디를 입력하세요");		String id = 도서대여프로그램연습_1.sc.next();
		System.out.println("비밀번호를 입력하세요");		String pw = 도서대여프로그램연습_1.sc.next();
		int i = 0;
		for(Member temp : 도서대여프로그램연습_1.memberlist) {
			if(temp != null && 도서대여프로그램연습_1.memberlist[i].id.equals(id) && 도서대여프로그램연습_1.memberlist[i].pw.equals(pw)) 
			{
			System.out.println("로그인 성공");	return id; // 아이디가 관리자인지 아닌지 확인하기 위해 아이디 반환
			}
		i++;}
	return null;
	}
	void 아이디찾기() {
		System.out.println("아이디찾기 페이지");
		System.out.println("이름을 입력하세요");			String name = 도서대여프로그램연습_1.sc.next();
		System.out.println("전화번호를 입력하세요");		String phone = 도서대여프로그램연습_1.sc.next();
		int i = 0;
		for(Member temp : 도서대여프로그램연습_1.memberlist) {
			if(temp != null && 도서대여프로그램연습_1.memberlist[i].name.equals(name) && 도서대여프로그램연습_1.memberlist[i].phone.equals(phone)) {
				System.out.println("아이디 찾기 성공");
				System.out.println("아이디 : " + 도서대여프로그램연습_1.memberlist[i].id);
			}
		}
	}
	void 비번찾기() {
		System.out.println("비밀번호찾기 페이지");
		System.out.println("아이디를 입력하세요");			String id = 도서대여프로그램연습_1.sc.next();
		System.out.println("이름를 입력하세요");		String name = 도서대여프로그램연습_1.sc.next();
		int i = 0;
		for(Member temp : 도서대여프로그램연습_1.memberlist) {
			if(temp != null && 도서대여프로그램연습_1.memberlist[i].name.equals(name) && 도서대여프로그램연습_1.memberlist[i].id.equals(id)) {
				System.out.println("비밀번호 찾기 성공");
				System.out.println("비밀번호 : " + 도서대여프로그램연습_1.memberlist[i].pw);
			}
		}
	}
	void 로그아웃() {
		System.out.println("로그아웃");
	}
}
