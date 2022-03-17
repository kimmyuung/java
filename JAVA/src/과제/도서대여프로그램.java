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
		String[][] memberlist = new String[100][2];
		String[][] booklist = new String[100][2];
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("도서 대여 프로그램");
			System.out.println("1. 회원 가입 2. 로그인 3. 로그아웃");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("회원 가입 페이지");
				System.out.println("아이디 : ");     String id = sc.next();
				System.out.println("비밀번호 : ");   String pw = sc.next();
				boolean idcheck = false;
				for(int i = 0; i < memberlist.length; i++) {
					if(memberlist[i][0] == null && memberlist[i][1] == null) {
						System.out.println("회원가입이 완료되었습니다.");
						memberlist[i][0] = id;
						memberlist[i][1] = pw;
						idcheck = true;
						break; }
				for(int j = 0; j < memberlist.length; j++) {
					if(memberlist[j][0] != null && memberlist[j][0].equals(id)) {
						System.err.println("아이디가 중복됩니다. 다시 입력해주세요.");
						idcheck = false;
						break;
						}
					}
				}
			}
			else if(select == 2) { // else if 2 s
				System.out.println("로그인 페이지입니다.");
				System.out.println("아이디를 입력해주세요");			String id = sc.next();
				System.out.println("비밀번호를 입력해주세요");	 	String pw = sc.next();
				boolean logincheck = false;
				while(true) {// w2 s
				for(int i = 0; i < memberlist.length; i++) { // for1 s
					if(memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw) ) { // if 1 s
						System.out.println("로그인이 성공했습니다.");
						logincheck = true;
					
					if(logincheck && memberlist[i][0].equals("admin") && memberlist[i][1].equals(pw)) {
						
						System.out.println("관리자 모드로 로그인합니다.");
						System.out.println("1. 도서 등록 2. 도서 메뉴 3. 도서삭제(도전) 4. 로그아웃");
						int select1 = sc.nextInt();
						boolean titlecheck = false;
						if (select1 == 1) {
							System.out.println("도서를 등록합니다.");
							System.out.println("도서의 제목을 입력해주세요");  String title = sc.next();
							for(int j = 0; j<booklist.length; j++) {
								if(booklist[j][0] == null) {
								System.out.println("도서등록이 완료되었습니다."); 
								booklist[j][0] = title;		booklist[j][1] = "대여 가능"; titlecheck = true; break;}
								for(int x = 0; x<booklist.length; x++) {
									if(booklist[j][0] != null && booklist[j][0].equals(title)) {
										System.out.println("도서의 제목이 중복됩니다. 다시 입력해주세요");
										titlecheck = false; break;
									}	
								}
							}
						}
						else if (select1 == 2) {
							for(int j = 0; j < booklist.length; j++) {
								if(booklist[j][0] != null) 
									{System.out.println("도서목록을 출력합니다."); System.out.print(booklist[j][0] + "\n"); break;}
							}
						}
						else if(select1 == 3) { // 도서 삭제
							System.out.println("도서를 삭제합니다.");
							System.out.println("삭제할 도서의 제목을 입력해주세요"); String title = sc.next();
							for(int j = 0; j<booklist.length; j++) {
								if(booklist[j][0] != null && booklist[j][0].equals(title) && booklist[j][1].equals("대여 가능")) 
								{
									System.out.println("도서를 삭제합니다.");
									booklist[j][0] = null; 		booklist[j][1] = null; 
									booklist[j-1][0] = null;	booklist[j-1][1] = null;		break;
								}
								else System.out.println("삭제하실 도서가 없습니다"); break;
								
							}
						}	
						else if(select1 == 4) {System.out.println("로그아웃!!"); break;}
					}	 
					else if (logincheck) {
						
						System.out.println("회원 로그인");
						System.out.println("1. 도서검색 // 2. 도서목록 // 3. 도서대여 // 4. 도서반납 // 5. 로그아웃");
						int select1 = sc.nextInt();
						if(select1 == 1) {
							System.out.println("도서를 검색합니다.");
							System.out.println("검색할 도서의 제목을 입력해주세요"); String title = sc.next();
							for(int j = 0; j<booklist.length; j++) {
								if(booklist[j][0] != null && booklist[j][0].equals(title)) {
									System.out.println("검색한 도서의 제목을 찾았습니다.");
									System.out.println(title); break;
								}
								else System.out.println("검색하신 도서가 없습니다"); break;
							}
						}
						else if(select1 == 2) {
							for(int j = 0; j < booklist.length; j++) {
								if(booklist[j][0] != null) System.out.println("도서목록을 출력합니다."); System.out.print(booklist[j][0] + "\t");
							}
						}
						else if(select1 == 3) {
							System.out.println("도서를 대여합니다.");
							System.out.println("대여하실 도서의 이름을 입력하세요."); String title = sc.next();
							for(int j = 0; j<booklist.length; j++) {
								if(booklist[j][0] != null && booklist[j][0].equals(title) && booklist[j][1].equals("대여 가능")) {
									System.out.println("도서 대여가 완료되었습니다.");
									booklist[j][1] = "대여 중"; break;
								}
							}
						}
						else if(select1 == 4) {
							System.out.println("도서를 반납합니다.");
							System.out.println("반납하실 도서의 이름을 입력하세요."); String title = sc.next();
							for(int j = 0; j<booklist.length; j++) {
								if(booklist[j][0] != null && booklist[j][0].equals(title) && booklist[j][1].equals("대여 중")) {
									System.out.println("도서 반납이 완료되었습니다."); booklist[j][1] = "대여 가능"; break;
								}
							}
						}
						else if(select1 == 5) {System.out.println("로그아웃!"); break;}
						else {System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");}
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
