package 과제;

import java.util.Scanner;

public class 회원제방문록_0
{ // cs
	public static void main(String[] args)
	{ // ms
		// 회원제 방문록 프로그램
		// 1. 초기메뉴 [ 1. 회원가입 2. 로그인 ]
		// -> 1. 회원가입 선택 -> [ 아이디, 비밀번호, 이름] 입력 받음
		// -> 2. 로그인 [아이디, 비밀번호 동일하면 로그인처리 ] -> 아니면 다시
		// 3. 로그인시 메뉴 [1. 방문록 쓰기, 2. 로그아웃]
		// 3-1. 방문록쓰기 [ 제목, 내용, 작성자(로그인된아이디)]
		// 3-2. 로그아웃 [ 초기메뉴로 돌아가기 ]
		Scanner sc = new Scanner(System.in); // 입력 객체 선언
		String[][] memberlist = new String[100][3]; // 회원 100명을 받을 수 있는 2차원 배열 선언
		String[][] boardlist = new String[100][3]; // 게시물 100개를 저장할 수 있는 2차원 배열 선언

		boolean save = true; // 아이디중복 체크 논리변수

		while (true)
		{
			System.out.println("1. 회원가입 2. 로그인");
			int ch = sc.nextInt();
			if (ch == 1) // 사용자로부터 회원가입을 입력받음
			{
				System.out.println("회원가입을 환영"); // 회원가입을 위해 아이디, 비번, 이름을 입력받음
				System.out.println("Id : ");
				String id = sc.next();
				System.out.println("pw : ");
				String pw = sc.next();
				System.out.println("name : ");
				String name = sc.next();

				for (int i = 0; i < memberlist.length; i++) // 아이디 중복 검사
				{ // i는 0부터 회원록 배열의 길이(=100)까지 1씩증가
					if (memberlist[i][0] != null && memberlist[i][0].equals(id))
					{ // 만약에 아이디배열이 공백이 아니고, 입력받은 아이디가 아이디배열에 있다면
						System.out.println("아이디가 있습니다."); // 아이디 있음 출력
						save = false; // 아이디 중복체크 실패로 false 출력
						break; // 아이디 중복을 1번 찾았으면 반복문 탈출
					}
				}

				if (save == true) // 만약에 중복체크에서 통과했다면
				{
					for (int i = 0; i < memberlist.length; i++)
					{ // i는 0부터 회원록 배열의 길이(=100)까지 1씩증가
						if (memberlist[i][0] == null) // 아이디 배열이 비어 있다면
						{
							memberlist[i][0] = id; // 입력받은 아이디를 0열 배열에 저장
							memberlist[i][1] = pw; // 입력받은 비밀번호를 1열 배열에 저장
							memberlist[i][2] = name; // 입력받은 이름을 2열 배열에 저장
						}
					}
				}
			} else if (ch == 2) // 로그인을 입력 받음
			{
				System.out.println("로그인");
				System.out.println(" id : ");
				String id = sc.next();
				System.out.println(" pw : ");
				String pw = sc.next(); // 아이디와 비밀번호를 입력
				boolean logincheck = false; // 로그인체크 성공여부를 체크하는 논리변수 설정
				for (int i = 0; i < memberlist.length; i++) 
				{ // i는 회원록 배열의 길이까지 1씩증가
					if (memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw))
					{ // 만약에 회원록이 공백이 아니고 입력받은 아이디를 가진 배열과 입력받은 비밀번호를 가진 배열이 있다면
						System.out.println("로그인"); // 로그인 성공 출력
						logincheck = true;  // 로그인 변수 성공 설정
						while(true) { // 무한루프 : 종료조건 사용자가 로그아웃을 선택할때까지
							System.out.println("방문록");
							System.out.println("번호\t작성자\t제목\t");
							for(int j = 0 ; j < boardlist.length; j++) {
								if(boardlist[j][0] != null) { // 게시글을 출력
									System.out.printf("%d\t%s\t%s\t%s\n", j, boardlist[j][2],boardlist[j][0], boardlist[j][1]); }
								
								}
							System.out.println("\n1. 방문록 남기기 2. 로그아웃"); // 방문록을 남기거나 로그아웃을 선택받음
							int ch1 = sc.nextInt(); // 사용자가 입력
							if(ch1 == 1) { // 사용자가 방문록 남기기를 선택
								System.out.println("글 쓰기");
								System.out.println("title : "); String title = sc.next();
								System.out.println("context : "); String context = sc.next();
								for(int j = 0; j<boardlist.length; j++) { // j는 0부터 게시글목록 배열의 길이까지 1씩 증가
									if(boardlist[j][0] == null ) { // 게시글목록의 배열이 비어있다면
										boardlist[j][0] = title; // 입력받은 제목을 배열의 제목으로 대입
										boardlist[j][1] = context; // 입력받은 내용을 배열의 내용으로 대입
										boardlist[j][2] = id; // 로그인한 아이디를 작성글의 아이디로 저장
										System.out.println("방문록 작성 완료"); // 방문록 작성완료
										break; // 방문록을 작성했으면 반복문 탈출
									}
								}
							}
							else if(ch1 == 2) {System.out.println("로그아웃"); break;} // 로그아웃을 입력하면 무한루프 종료
							else {System.out.println("잘못된 번호입니다.");} // 1번도 2번도 아닌 숫자를 입력시
							if(logincheck == false) { // 로그인체크가 실패하면
								System.out.println("로그인 실패");
								}
							}
						}
					}
				}
			 else {System.out.println("잘못된 숫자입니다. 다시 입력해주세요."); } // 회원가입도 로그인도 아닌 숫자를 입력시
		}

	} // me
} // ce
