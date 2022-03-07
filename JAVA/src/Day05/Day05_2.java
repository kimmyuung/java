package Day05;

import java.util.Scanner;

public class Day05_2 { // c  s
	public static void main(String[] args) { // m  s
	
	//	회원제 방문록 프로그램
		// 1. 초기메뉴 [ 1. 회원가입 2. 로그인 ]
		// -> 1. 회원가입 선택 -> [ 아이디, 비밀번호, 이름] 입력 받음
		// -> 2. 로그인 [아이디, 비밀번호 동일하면 로그인처리 ] -> 아니면 다시
		// 3. 로그인시 메뉴 [1. 방문록 쓰기, 2. 로그아웃]
			// 3-1. 방문록쓰기 [ 제목, 내용, 작성자(로그인된아이디)]
			// 3-2. 로그아웃 [ 초기메뉴로 돌아가기 ]
	// [준비]
		Scanner scanner = new Scanner(System.in);
		String[][] memberlist = new String[100][3]; 
		// 회원100명[id,pw,name] 저장하는 배열 선언 => 회원당 1행 1열 = id, 2열= pw, 3열= name
		String[][] boardlist = new String[100][3];
		// 방문록 100개 [title, contexts, writer] 저장하는 배열 => 게시물당 1행
		boolean save = true;
		
		
		while(true) { // w1  s		(종료조건 : X)
			System.out.println("---------------------------");
			System.out.println("[ 1. 회원가입 2. 로그인 3. 종료]"); 	int select1 = scanner.nextInt();
			System.out.println("---------------------------");
			if (select1 == 1) { // if1 s
				System.out.println("회원가입을 환영합니다");
				System.out.println("가입하실 아이디를 입력해주세요"); String id = scanner.next();
				System.out.println("아이디의 비밀번호를 입력해주세요"); String pw = scanner.next();
				System.out.println("이름을 입력해주세요"); String name = scanner.next();
				// 아이디, 비밀번호, 이름을 입력받음 -> memberlist 2차원 배열에 저장
				// 1. 빈 공간[ 정수 = 0, 객체(문자열)=null]을 찾아서 저장 
				// [ 만약에 빈공간 없으면 회원 100명이상인 것...]
				// 2. 아이디 중복체크[검색]
				// 2-1. 아이디가 겹치는지 체크
				// 아이디 중복체크
				for(int j = 0; j<memberlist.length; j++) { // for 1 s
					if(memberlist[j][0] != null && memberlist[j][0].equals(id) ) { // if 2 s
						// 2. 입력받은 값과 j번째 인덱스값과 같은지 비교
						System.err.println(" 알림)) 이미 있는 아이디 입니다.[재입력]");
						save = false; // 저장x 회원가입 불가능하게 save 변수를 false로 변경
						break;
					} // if 2 e
				}// for 1 e
				
				// 데이터 저장
				if(save == true) { // if 3 s 중복체크가 성공했을 때만 회원가입처리
				for(int i = 0; i<memberlist.length; i++) { // for2 s
					if(memberlist[i][0] == null) { // if 4 s
						// i번째 행에 id가 없으면 = 빈공간
						memberlist[i][0] = id;
						memberlist[i][1] = pw;
						memberlist[i][2] = name; // i번째 각 열에 데이터 저장
						save = true;
						break; // 저장했으면 끝 [1번만 저장해야 하기 때문]
							} // if 4 e	
						} // for2 e	
				}// if 3 e
			} // if1 e
			else if (select1 == 2) {
				System.out.println("-------------로그인 페이지-------------");
				System.out.println("아이디 : "); String id = scanner.next();
				System.out.println("비밀번호 : "); String pw = scanner.next();
				
				boolean logincheck = false;
				for(int i = 0 ; i<memberlist.length;i++) { // 로그인 코드
				if(memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw))
				// i번째 행에 id와 i번째 행에 password가 입력받은 값과 equals 같으면 로그인 성공
					// 단 아이디가 공백이 아닐때(null은 equals가 안됨 -> null은 객체가 아니기 때문)
					// 대신 null은 ==, !=등의 연산자 사용 가능
					{ System.out.println("알림)) 로그인 성공");
					
					logincheck = true; // 로그인 성공 저장
					////////////////////// 로그인 성공 시 실행 ///////////////////////
						while(true) { // 로그인시 무한루프
						System.out.println("----------방문록---------");
						System.out.println("번호\t작성자\t제목\t내용");
						for(int j = 0; j<boardlist.length; j++){
							if(boardlist[j][0] != null) { // 게시물 없는 인덱스 제외
							System.out.printf("%d\t%s\t%s\t%s \n", 
									j, 
									boardlist[j][2],
									boardlist[j][0],
									boardlist[j][1]);	}
							}
						System.out.println("\n1. 방문록남기기 2. 로그아웃 선택");	int select2 = scanner.nextInt();
							if(select2 == 1) {
								System.out.println("---------------글 쓰기-------------");
								 System.out.println("title : "); 	String title = scanner.next();
								 System.out.println("content : "); 	String content = scanner.next();
								 // 배열 내 공백 찾아 저장
								 for(int j = 0; j<boardlist.length; j++) {
									 if(boardlist[j][0] == null) { // 배열 내 j번째 인덱스가 공백이면 저장
										 boardlist[j][0] = title;
										 boardlist[j][1] = content;
										 boardlist[j][2] = id; // 로그인시 사용한 id를 대입
										 System.err.println("방문록이 저장되었습니다.");
										 break;
									 }
								 }
							}
						
							////////////////////// 로그인 성공 시 실행 ///////////////////////	
							else if(select2 == 2) {
								System.out.println("알림]] 로그아웃");
								break; // 가장 가까운 반복문 탈출
													}
							else {System.out.println("알림]] 알 수 없는 번호입니다.");}
							}
						} // w2 e
				if(logincheck == false) { 
					System.out.println("알림]] 회원정보가 없거나 다릅니다");
					break;}
				}
			}
			else if(select1 == 3) {break;}
			else System.err.println("알림)) 알 수 없는 번호입니다. 다시 입력해주세요");
		
		
		
		} // w1  e
		
		
	} // m  e
} // c  e
