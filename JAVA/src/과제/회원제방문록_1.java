package 과제;

import java.util.Scanner;

public class 회원제방문록_1
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
		String[][] memberlist = new String[100][3];
		String[][] boardlist = new String[100][3];
		boolean save = true;
		
		while(true) { // w1 s
			System.out.println("[1. 회원가입 2. 로그인 ]");
			int ch = sc.nextInt();
			if(ch==1) {
				System.out.println("회원가입을 시행합니다.");
				System.out.println("Id : "); String id = sc.next();
				System.out.println("pw : "); String pw = sc.next();
				System.out.println("name : "); String name = sc.next();
				
				for(int i = 0; i < memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						System.out.println("아이디가 중복됩니다. 다시 입력해주세요");
						save = false;
						break;
					}
				}
				for(int i = 0; i < memberlist.length; i++) {
					if(memberlist[i][0] == null) {
						memberlist[i][0] = id;
						memberlist[i][1] = pw;
						memberlist[i][2] = name;
						System.out.println("회원가입이 완료되었습니다.");
						break;
					}
				}
			}
			else if(ch==2) {
				System.out.println("로그인 페이지");
				System.out.println("id : "); String id = sc.next();
				System.out.println("pw : "); String pw = sc.next();
				boolean logincheck = false;
				for(int i = 0; i < memberlist.length; i++) {
					if(memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw))
					{
						System.out.println("로그인 성공하셨습니다.");
						logincheck = true;
						while(true) {
						System.out.println("[1. 방문록 남기기 2. 로그아웃]");
						int ch1 = sc.nextInt();
						if(ch1 == 1) {
							System.out.println("방문록 남기기 페이지 : ");
							System.out.println(" title : ");	String title = sc.next();
							System.out.println(" context : ");  String context = sc.next();
							for(int j = 0; j<boardlist.length; j++) {
								if(boardlist[j][0] == null) {
									boardlist[j][0] = title;
									boardlist[j][1] = context;
									boardlist[j][2] = id;
									System.out.println("방문록 남기기 성공");break;
								}
							}
							for(int j = 0; j<boardlist.length; j++) {
								if(boardlist[j][0] != null)
								System.out.printf("\n %d \t %s \t %s \t %s", j, boardlist[j][0], boardlist[j][1], boardlist[j][2]);
								}
							
						}
						else if(ch1 == 2) {System.out.println("로그아웃"); break;}
						else {System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요.");}
						}
					}
				}
				if(logincheck == false) {System.out.println("잘못된 회원정보를 입력하셨습니다. 다시 입력해주세요");}
			}
			else {System.out.println("잘못된 숫자입니다. 다시 입력해주세요.");}
		} // w1 e
	} // me
} // ce
