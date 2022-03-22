package Day07_5연습;

public class Member3 {
	// 1-2. member	: 필드(회원번호, 아이디, 비번, 이름, 연락처) 
		 // 메소드(회원가입, 로그인, 아이디 찾기, 비번 찾기, 로그아웃)
		String imem;
		String id;
		String pw;
		String name;
		String phone;
		public Member3(String imem, String id, String pw, String name, String phone) {
			super();
			this.imem = imem;
			this.id = id;
			this.pw = pw;
			this.name = name;
			this.phone = phone;
		}
		Member3 () {}
		
		void 회원가입 () {
			System.out.println("회원가입 페이지");
			System.out.println("아이디 : "); 			String id = 도서대여프로그램연습_3.sc.next();
			System.out.println("비번 : ");			String pw = 도서대여프로그램연습_3.sc.next();
			System.out.println("이름 : ");			String name = 도서대여프로그램연습_3.sc.next();
			System.out.println("핸드폰번호 : ");		String number = 도서대여프로그램연습_3.sc.next();
			int i = 0;
			for(Member3 temp : 도서대여프로그램연습_3.memberlist) {
				if(temp == null) {
					Member3 member = new Member3("i", id, pw, name, number);
					도서대여프로그램연습_3.memberlist[i] = member;
					System.out.println("회원가입이 완료되었습니다.");
					break;
				}
			i++;}
		}
		String 로그인 () {
			System.out.println("로그인 페이지");
			System.out.println("아이디 : "); 			String id2 = 도서대여프로그램연습_3.sc.next();
			System.out.println("비번 : ");			String pw = 도서대여프로그램연습_3.sc.next();
			int i = 0;
			for(Member3 temp : 도서대여프로그램연습_3.memberlist) {
				if(temp != null && 도서대여프로그램연습_3.memberlist[i].id.equals(id2) && 도서대여프로그램연습_3.memberlist[i].pw.equals(pw)) 
				{
				System.out.println("로그인");	return id2;
				}
			i++;}
			return null;
		}
		void 아이디찾기 () {
			System.out.println("아이디 찾기 페이지");
			System.out.println("이름 : ");			String name = 도서대여프로그램연습_3.sc.next();
			System.out.println("핸드폰번호 : ");		String number = 도서대여프로그램연습_3.sc.next();
			int i = 0;
			for(Member3 temp : 도서대여프로그램연습_3.memberlist) {
				if(temp != null && 도서대여프로그램연습_3.memberlist[i].name.equals(name) && 도서대여프로그램연습_3.memberlist[i].phone.equals(number)) 
				{
				System.out.println("아이디  : " + 도서대여프로그램연습_3.memberlist[i].id);	 
				}
			i++;}
		}
		void 비번찾기 () {
			System.out.println("비밀번호 찾기 페이지");
			System.out.println("아이디 : ");	        String id = 도서대여프로그램연습_3.sc.next();
			System.out.println("이름 : ");			String name = 도서대여프로그램연습_3.sc.next();
			System.out.println("핸드폰번호 : ");		String number = 도서대여프로그램연습_3.sc.next();
			int i = 0;
			for(Member3 temp : 도서대여프로그램연습_3.memberlist) {
				if(temp != null && 도서대여프로그램연습_3.memberlist[i].name.equals(name) && 도서대여프로그램연습_3.memberlist[i].phone.equals(number)
						&& 도서대여프로그램연습_3.memberlist[i].id.equals(id)) 
				{
				System.out.println("비밀번호 : " + 도서대여프로그램연습_3.memberlist[i].pw);	 
				}
			i++;}
		}
		void 로그아웃 () {
			System.out.println("로그아웃!");
		}
}
