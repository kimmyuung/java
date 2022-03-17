package 과제;

import java.util.Scanner;

public class 도서대여프로그램
{
	// 도서 대여 프로그램
	// 1. 배열 변수
	// 1-1. 회원[아이디(중복 X), 비밀번호]
	// 1-2. 도서[도서명(중복 X), 도서대여여부]
	// 2. 초기메뉴
	// 2-1. 회원가입 // 2-2. 로그인
	// 2-3. 회원가입시 중복체크
	// 3. 로그인시 메뉴
	// 3-1. 도서검색 // 3-2. 도서목록 // 3. 도서대여 // 4. 도서반납 // 5. 로그아웃
	// + 도서검색시 도서명이 일치하면 도서명과 도서대여여부 출력
	// + 도서 목록시 모든 도서명 출력
	// + 도서대여시 도서대여여부가 가능할때 도서대여 처리
	// + 도서반납시 본인이 대여한 도서만 반납 처리
	// + 로그아웃
	// 로그인시 아이디가 admin이면 관리자메뉴
	// 1. 도서 등록 2. 도서 메뉴 3. 도서삭제(도전) 4. 로그아웃
	// + 도서 등록시 도서명 입력받아 도서 등록처리
	// + 도서 목록시 모든 도서명 출력 // 도서삭제시 삭제할 도서명 입력받아 동일한 도서명 삭제(NULL)
	// 로그아웃시 초기메뉴로
	public static void main(String[] args)
	{
		String[][] memberlist = new String[100][2]; // 회원들의 리스트로 배열로 저장(아이디, 비번) 
		String[][] booklist = new String[100][2]; // 책들의 제목과 대여여부를 배열로 저장
		Scanner sc = new Scanner(System.in); // 입력객체 선언
		while(true) { // 무한루프 종료조건 : 로그아웃을 누를시
			System.out.println("도서 대여 프로그램"); 
			System.out.println("1. 회원 가입 2. 로그인 3. 로그아웃");
			int select = sc.nextInt();
			if(select == 1) { // 회원가입 시작
				System.out.println("회원 가입 페이지");
				System.out.println("아이디 : ");     String id = sc.next();
				System.out.println("비밀번호 : ");   String pw = sc.next(); // 사용자로부터 아이디와 비밀번호를 입력받음
				boolean idcheck = false; // 논리변수 설정
				for(int i = 0; i < memberlist.length; i++) { // i는 0부터 회원들의 배열들의 길이까지 1씩 증가
					if(memberlist[i][0] == null && memberlist[i][1] == null) { // 회원들의 배열의 값이 초기값이라면
						System.out.println("회원가입이 완료되었습니다.");
						memberlist[i][0] = id;
						memberlist[i][1] = pw;
						idcheck = true; // 받은 아이디와 비밀번호를 저장하고 회원가입 완료 출력
						break; }
				for(int j = 0; j < memberlist.length; j++) { // 유효성검사
					if(memberlist[j][0] != null && memberlist[j][0].equals(id)) {
						System.err.println("아이디가 중복됩니다. 다시 입력해주세요."); // 아이디 중복시 출력
						idcheck = false;
						break;
						}
					}
				}
			}
			else if(select == 2) { // else if 2 s, 로그인 선택
				System.out.println("로그인 페이지입니다."); // 사용자로부터 아이디와 패스워드를 입력받음
				System.out.println("아이디를 입력해주세요");			String id = sc.next();
				System.out.println("비밀번호를 입력해주세요");	 	String pw = sc.next(); 
				boolean logincheck = false; // 로그인 체크 논리 변수
				while(true) {// w2 s
				for(int i = 0; i < memberlist.length; i++) { // for1 s
					if(memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw) ) { // if 1 s
						System.out.println("로그인이 성공했습니다."); // 입력받은 아이디와 비밀번호가 배열에 있는 아이디와 비밀번호와 일치하면
						logincheck = true; // 로그인 성공했기때문에 로그인 체크를 성공으로 변경
					
					if(logincheck && memberlist[i][0].equals("admin") && memberlist[i][1].equals(pw)) {
						// 아이디가 admin이라면 관리자 모드로 로그인
						System.out.println("관리자 모드로 로그인합니다.");
						System.out.println("1. 도서 등록 2. 도서 메뉴 3. 도서삭제(도전) 4. 로그아웃");
						int select1 = sc.nextInt();
						boolean titlecheck = false;
						if (select1 == 1) { // 도서 등록
							System.out.println("도서를 등록합니다.");
							System.out.println("도서의 제목을 입력해주세요");  String title = sc.next();
							for(int j = 0; j<booklist.length; j++) { // 도서의 제목을 입력받고 배열에 저장
								if(booklist[j][0] == null) {
								System.out.println("도서등록이 완료되었습니다."); 
								booklist[j][0] = title;		booklist[j][1] = "대여 가능"; titlecheck = true; break;}
								for(int x = 0; x<booklist.length; x++) {
									if(booklist[j][0] != null && booklist[j][0].equals(title)) { // 도서 제목 유효성 검사
										System.out.println("도서의 제목이 중복됩니다. 다시 입력해주세요");
										titlecheck = false; break;
									}	
								}
							}
						}
						else if (select1 == 2) { // 도서 목록 출력
							for(int j = 0; j < booklist.length; j++) {
								if(booklist[j][0] != null) 
									{System.out.println("도서목록을 출력합니다."); System.out.print(booklist[j][0] + "\n"); break;}
							}
						}
						else if(select1 == 3) { // 도서 삭제
							System.out.println("도서를 삭제합니다.");
							System.out.println("삭제할 도서의 제목을 입력해주세요"); String title = sc.next(); // 삭제할 도서의 제목을 입력받음
							for(int j = 0; j<booklist.length; j++) {
								if(booklist[j][0] != null && booklist[j][0].equals(title) && booklist[j][1].equals("대여 가능")) 
								{
									System.out.println("도서를 삭제합니다."); // 도서삭제
									booklist[j][0] = null; 		booklist[j][1] = null; // 도서의 값을 초기값으로 되돌림
									break;
								}
								else System.out.println("삭제하실 도서가 없습니다"); break;
								
							}
						}	
						else if(select1 == 4) {System.out.println("로그아웃!!"); break;} // 관리자모드 로그아웃
					}	 
					else if (logincheck) { // 아이디가 admin이 아니면 일반회원으로 로그인
						
						System.out.println("회원 로그인");
						System.out.println("1. 도서검색 // 2. 도서목록 // 3. 도서대여 // 4. 도서반납 // 5. 로그아웃");
						int select1 = sc.nextInt();
						if(select1 == 1) { // 도서 검색
							System.out.println("도서를 검색합니다.");
							System.out.println("검색할 도서의 제목을 입력해주세요"); String title = sc.next(); 
							for(int j = 0; j<booklist.length; j++) {
								if(booklist[j][0] != null && booklist[j][0].equals(title)) { // 입력받은 제목과 맞는 도서가 책리스트에 있다면
									System.out.println("검색한 도서의 제목을 찾았습니다.");
									System.out.println(title); break; // 책 제목 출력
								}
								else System.out.println("검색하신 도서가 없습니다"); break;
							}
						}
						else if(select1 == 2) { // 도서목록 출력
							for(int j = 0; j < booklist.length; j++) {
								if(booklist[j][0] != null) System.out.println("도서목록을 출력합니다."); System.out.print(booklist[j][0] + "\t");
							}
						}
						else if(select1 == 3) { // 도서 대여
							System.out.println("도서를 대여합니다.");
							System.out.println("대여하실 도서의 이름을 입력하세요."); String title = sc.next();
							for(int j = 0; j<booklist.length; j++) {
								if(booklist[j][0] != null && booklist[j][0].equals(title) && booklist[j][1].equals("대여 가능")) {
									System.out.println("도서 대여가 완료되었습니다.");
									booklist[j][1] = "대여 중"; break; // 도서가 대여되면 도서의 여부를 대여중으로 변경
								}
							}
						}
						else if(select1 == 4) {
							System.out.println("도서를 반납합니다."); // 도서를 반납
							System.out.println("반납하실 도서의 이름을 입력하세요."); String title = sc.next();
							for(int j = 0; j<booklist.length; j++) { // 입력받은 도서의 제목이 대여중이고 책리스트에 있다면 도서 반납 완료
								if(booklist[j][0] != null && booklist[j][0].equals(title) && booklist[j][1].equals("대여 중")) {
									System.out.println("도서 반납이 완료되었습니다."); booklist[j][1] = "대여 가능"; break;
								}
							}
						}
						else if(select1 == 5) {System.out.println("로그아웃!"); break;} // 일반회원 로그아웃
						else {System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");} // 숫자를 잘못입력했을시
								} 
									
					else {System.out.println("로그인 실패 다시 입력해주세요");}
						} // if1 e
					} // for1 e
				} // w2 e
			} // else if 2 e
			
			
			else if(select == 3) {
				System.out.println("로그아웃 되셨습니다."); break;
			}
			else {System.out.println("잘못입력하셨습니다.");}
			
		} // w1 e
	} // me
}
// ce
