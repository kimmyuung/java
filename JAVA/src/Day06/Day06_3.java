package Day06;

import java.util.Scanner;

public class Day06_3 { // c  s
	public static void main(String[] args) { // m  s
		// 회원제 프로그램[클래스]
			// 1. 초기메뉴 [1. 회원가입 2. 로그인 3. 아이디 찾기 4. 비밀번호 찾기]
			// 1-1. 회원가입시 아이디, 비밀번호, 이름 입력받아 저장
			// 2. 로그인시 아이디와 비밀번호가 동일하면 로그인처리
			// 3. 아이디 찾기 => 이름과 전화번호가 동일하면 아이디 출력
			// 4. 비밀번호 찾기 => 아이디 + 전화번호가 동일하면 비밀번호 출력
		
		// 준비 
		// 0. 회원 설계 => 회원 클래스 만들기
			// 1. 필드 -> 일단 이것만 사용(아이디, 비번, 이름, 전화번호)
			// 2. 생성자
			// 3. 메소드
		
		// 변수 준비, 배열을 위에 선언하는 이유 : 모든 곳에서 사용하기 때문에
		Scanner scanner = new Scanner(System.in);
		Member[] memberlist = new Member[100]; // 여러개 객체를 저장하는 배열 생성
		// -> Member 클래스로 만들어진 객체(id, pw, name, phone) 100개 저장할 수 있는 배열 선언
		// 만약에 클래스가 없을경우에는 2차원배열 사용해야함
		// String[][] memberlist = new Member[100][4];
		
		while(true) { // w1 s
		System.out.println("[1. 회원가입 2. 로그인 3. 아이디 찾기 4. 비밀번호 찾기]");
		System.out.println(">>>>>>>>>>>>> 선택 : ");
		int select1 = scanner.nextInt();
		
		if(select1 == 1) { // 회원가입 s
			// 1. id, password, name, phone 입력받기
			// 2. 객체 생성
			// 3. 입력받은 변수4개를 객체내 필드에 저장하기
			// 4. 여러개 객체를 저장하는 배열 생성
					
			System.out.println("----------회원가입을 환영합니다.---------------");
			System.out.println("1. 아이디를 입력해주세요");    	String id = scanner.next();
			System.out.println("2. 비밀번호를 입력해주세요");	   	String pw = scanner.next();	 
			System.out.println("3. 이름을 입력해주세요");		String name = scanner.next();
			System.out.println("4. 핸드폰 번호를 입력해주세요");	String phone = scanner.next();
			
			Member member = new Member(); // 2. 객체 생성
			int i = 0;
			
			member.id = id;	// 3. 입력받은 변수 4개를 객체 내 필드에 저장
			member.pw = pw;	
			member.name = name;
			member.phone = phone;
			boolean idcheck = false;	
			// 4. 여러개 객체를 저장하는 배열에 저장 
			// 4-1. 공백 인덱스 찾기[공백이 아닌곳에 저장하면 기존의 데이터를 삭제하고 새로운 데이터가 대입]
			// 4-2. 공백의 인덱스에 객체 저장
			
			// 아이디 중복체크
				// 배열내 객체중 입력한 아이디와 동일한 아이디 찾기
			for(Member temp : memberlist) { // for2 s
				if(temp != null && temp.id.equals(id)) { // if2 s
					System.out.println("아이디가 중복되었습니다.[재입력]");
					idcheck = true; // 중복이면 true로 변경
					break;
						} // if2 e
					} // for2 e
			
			// 아이디 중복이 없을 경우 저장
				
			
			if(idcheck == false) { // idcheck == false s
			for(Member temp : memberlist){ // for1 s = for(int i = 0; i < memberlist.length; i++)
				// // memberlist 배열내 member 객체 하나씩 꺼내와서 temp 저장 반복
				if(temp == null) { // if1 s
				// 2. 공백에 인덱스에 객체 저장
				memberlist[i] = member;
				System.out.println("회원가입 되었습니다.");
				break; // for 나가기[안나가면 모든 공백에 동일한 객체 저장되기 때문]
						} // if1 e
				i++;
					} // for1 e
				} // idcheck == false e
			} // 회원가입 e
		else if(select1 == 2) { // 로그인 s
			System.out.println("----------로그인 페이지------------");
			System.out.println("1. 아이디를 입력해주세요");    	String id2 = scanner.next();
			System.out.println("2. 비밀번호를 입력해주세요");	   	String pw2 = scanner.next();
			boolean logincheck = false;
			
			for(Member temp : memberlist) { // 로그인 성공시 for s
				if(temp != null && temp.equals(id2) && temp.equals(pw2)) 
					{ // if s
					System.err.println("알림)) 로그인 성공");
					logincheck = true; 
					} // if e
				} // 로그인 성공시 for e
			if (logincheck == false) { // 로그인 실패
				System.err.println("알림)) 동일한 회원정보가 없습니다.");
				}
			} // 로그인 e
		else if(select1 == 3) { // 아이디 찾기
			// 1. 이름과 연락처를 입력받는다
			System.out.println("----------아이디 찾기 페이지------------");
			System.out.println("이름 : ");	String name = scanner.next();
			System.out.println("연락처 : "); 	String phone = scanner.next();
			// 2. 배열내 동일한 이름과 연락처가 있는지 확인한다.
			boolean findcheck = false;
			for(Member temp : memberlist) { // for3-1 s
				if(temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {
					System.out.println("알림)) 아이디 찾기 성공");
					System.out.println("회원 ID : " + temp.id);
					findcheck = true; // 기록 찾음
					break;
					}
			} // for3-1  e
				if(findcheck == false) {
					System.out.println("알림)) 동일한 회원정보가 없습니다.");
					}	
				
			// 3. 동일한 객체가 있으면 해당 아이디 출력
			// 4. 없으면 없다고 출력
			
			}
		else if(select1 == 4) { // 비밀번호 찾기 
			System.out.println("----------비밀번호 찾기 페이지------------");
			System.out.println("아이디 : ");	String id = scanner.next();
			System.out.println("이름 : ");	String name = scanner.next();
			System.out.println("연락처 : "); 	String phone = scanner.next();
			boolean pwcheck = false;
			for(Member temp : memberlist) { // for4-1 s
				if(temp != null & temp.id.equals(id) && temp.phone.equals(phone))
					{
					System.out.println("비밀번호 찾기 성공");
					System.out.println("회원 비밀번호 : " + temp.pw);
					pwcheck = true;
					break;
					}	
				} // for4-1 e
			if(pwcheck == false) {
				System.out.println("알림)) 동일한 회원정보가 없습니다.");
				}	
			} // if4 e
		else {System.out.println("알림)) 알 수 없는 번호입니다. [재입력]");}
		
		
		
		} // w1 e
	} // m  e
} // c  e
