package 과제;

import java.util.Scanner;

public class 회원제방문록_4
{
//	회원제 방문록 프로그램
		// 1. 초기메뉴 [ 1. 회원가입 2. 로그인 ]
		// -> 1. 회원가입 선택 -> [ 아이디, 비밀번호, 이름] 입력 받음
		// -> 2. 로그인 [아이디, 비밀번호 동일하면 로그인처리 ] -> 아니면 다시
		// 3. 로그인시 메뉴 [1. 방문록 쓰기, 2. 로그아웃]
			// 3-1. 방문록쓰기 [ 제목, 내용, 작성자(로그인된아이디)]
			// 3-2. 로그아웃 [ 초기메뉴로 돌아가기 ]
	public static void main(String[] args)
	{ // ms
		Scanner sc = new Scanner(System.in);
		String[][] members = new String[100][3];
		String[][] boards = new String[100][3];
		
		while(true) {
			System.out.println("회원제 방문록 프로그램");
			System.out.println("[1. 회원가입 2. 로그인 3. 종료]"); int ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("회원가입을 환영합니다.");
				System.out.println("id : "); String id = sc.next();
				System.out.println("pw : "); String pw = sc.next();
				System.out.println("name : "); String name = sc.next();
				boolean idcheck = true;
				for(int i = 0 ; i< members.length; i++) {
					if(members[i][0] != null && members[i][0].equals(id)) {
						System.out.println("동일한 아이디가 있습니다. 다른 아이디를 입력해주세요.");
						idcheck = false; break;
					}
				}
				for(int i = 0; i < members.length; i++) {
					if(members[i][0] == null) {
						System.out.println("회원가입을 환영합니다.");
						members[i][0] = id;
						members[i][1] = pw;
						members[i][2] = name;
						System.out.println("회원가입을 환영합니다.");
						break;
					}
				}
			}
			else if(ch == 2) {
				System.out.println("로그인 페이지");
				System.out.println("id : "); String id = sc.next();
				System.out.println("pw : "); String pw = sc.next();
				boolean logincheck = false;
				for(int i = 0; i< members.length; i++) {
					if(members[i][0] !=null && members[i][0].equals(id)&& members[i][1].equals(pw)) {
						System.out.println("로그인 성공");
						while(true) {
							System.out.println("방문록 남기기 페이지");
							System.out.println("1. 방문록 남기기 2. 로그아웃"); int ch1 = sc.nextInt();
							if(ch1 == 1) {
								System.out.println("방문록의 제목 : "); String title = sc.next();
								System.out.println("방문록의 내용 : "); String content = sc.next();
								for(int j = 0; j<boards.length; j++) {
									if(boards[j][0] == null) {
										boards[j][0] = title;
										boards[j][1] = content;
										boards[j][2] = id;
										System.out.println("방문록 남기기 성공");
										break;
									}
								}
								for(int j = 0; j<boards.length; j++) {
									if(boards[j][0] != null) {
										System.out.printf("\n%d \t %s \t %s \t %s\n",j,boards[j][0],boards[j][1],boards[j][2]);
									}
								}
							}
							else if (ch1 == 2) {System.out.println("로그아웃"); break; }
							else {System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요.");}
						}
					}
				}
				if(logincheck == false) {System.out.println("등록된 회원정보가 없습니다.");}
			}
			else if(ch == 3) {System.out.println("프로그램 종료"); break;}
			else {System.out.println("잘못된 숫자를 입력했습니다. 다시 입력해주세요.");}
		}
	} // me
} // ce
