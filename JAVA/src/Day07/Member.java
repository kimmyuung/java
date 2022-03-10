package Day07;

public class Member {
		// 1. 필드 : 회원번호, 아이디, 비밀번호, 이름, 연락처
	int mno;
	String id;
	String pw;
	String name;
	String phone;
		// 2. 생성자 : 임의
	public Member () {}
	// 메소드호출용 객체생성시
	public Member (int mno, String id, String pw, String name, String phone) {
		
		this.mno = mno;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	} // 모든 필드를 받는 생성자 : 회원가입용 객체생성시

	// 3. 메소드 : 회원가입, 로그인, 아이디찾기, 비번찾기, 회원탈퇴
	boolean join(){ // 가입성공 True. 가입실패 False
		System.out.println("----- 회원 가입 페이지 -----");
		System.out.println("아이디를 입력해주세요"); 		String id = Day07_5_BookApplication.scanner.next();
		// 아이디 중복체크
				for(Member temp : Day07_5_BookApplication.members) {
					if(temp != null && temp.id.equals(id)) {
						// 만약에 공백이 아니면서 배열내 id와 입력받은 id와 동일하면
						System.out.println("현재 사용중인 아이디 입니다.");
						return false; // 아이디가 중복되었기 때문에 실패
					}
						
				}
		System.out.println("비밀번호를 입력해주세요"); 	String pw = Day07_5_BookApplication.scanner.next();
		System.out.println("이름을 입력해주세요"); 		String name = Day07_5_BookApplication.scanner.next();
		System.out.println("핸드폰번호를 입력해주세요"); 	String phone = Day07_5_BookApplication.scanner.next();
		// *scanner 객체가 다른 클래스내 static 선언되어 있음 * 클래스명.필드명.함수명();
		Member member = new Member(mno ,id, pw, name, phone);
		// 모든 필드 받는 생성자로 객체 생성
		
		// 회원번호 자동주입 [마지막번호에 + 1, 가장 최근에 가입한 회원의 번호 +1]
		int bno = 0; // 회원번호 저장하는 변수
		int index = 0;
		for(Member temp : Day07_5_BookApplication.members) {
			 if(temp == null) { // NULL 찾기[null 찾았을 때 null-1 하면 마지막회원
				 if(index ==0) {bno = 1; break;}// 첫번째 인덱스가 NULL => 첫 회원 -> 첫회원번호1번 부여
				bno = Day07_5_BookApplication.members[index-1].mno + 1; 
				     // null 앞 [마지막회원] 번호에 +1
					 break;		 
			 }
			 index++;
			}	
		
		for(int i = 0; i < Day07_5_BookApplication.members.length; i++)
		//= for(Member temp : Day07_5_BookApplication.members)
		{
			if(member == null) {
				Day07_5_BookApplication.members[i] = member;
				return true;
			} 
		}
		return false; // 회원가입 실패
	}
	String login() { // 성공시 성공한 아이디반환, 실패시 NULL
		System.out.println("----- 로그인 페이지 -----");
		System.out.println("아이디를 입력하세요 : "); String id = Day07_5_BookApplication.scanner.next(); 
		System.out.println("비밀번호를 입력하세요 : ");String pw = Day07_5_BookApplication.scanner.next();
		for(Member temp : Day07_5_BookApplication.members ) {
		if(temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {
			System.out.println("로그인 성공");
			System.out.println("[1. 도서검색 2. 도서목록 3. 도서대여 4. 도서반납 5. 로그아웃]");
			return temp.id;
			}
		}
		return null; // 실패시 null 반환
	}
	void idcheck() {
		System.out.println("----- 아이디 찾기 페이지 -----");
		System.out.println("가입하실 때 쓴 이름은 무엇입니까?"); String name = Day07_5_BookApplication.scanner.next();
		System.out.println("가입하실 때 쓴 폰번호는 무엇입니까?"); String phone = Day07_5_BookApplication.scanner.next();
		for(Member temp : Day07_5_BookApplication.members) {
			if(temp != null && temp.name.equals(name) && temp.phone.equals(phone))
			{
				System.out.println("아이디 찾기 성공 --> 아이디 : " + temp.id);
				return; // 동일한 값을 찾았으면 해당 메소드 종료
			}
			
		}
		System.out.println("알림)) 동일한 회원정보가 없습니다.");
	}
	void pwcheck() {
		System.out.println("----- 비밀번호 찾기 페이지 -----");
		System.out.println("가입하실 때 쓴 아이디는 무엇입니까"); String id = Day07_5_BookApplication.scanner.next();
		System.out.println("가입하실 때 쓴 이름은 무엇입니까?"); String name = Day07_5_BookApplication.scanner.next();
		System.out.println("가입하실 때 쓴 폰번호는 무엇입니까?"); String phone = Day07_5_BookApplication.scanner.next();
		for(Member temp : Day07_5_BookApplication.members) {
			if(temp != null && temp.id.equals(id)&& temp.name.equals(name) && temp.phone.equals(phone))
			{
				System.out.println("비밀번호 찾기 성공 --> 아이디 : " + temp.pw);
				return;
			}
			
		}
		System.out.println("알림)) 동일한 회원정보가 없습니다.");
	}
	// 회원탈퇴 메소드
	// 회원수정 메소드
	
	
}	
