package Day05;

import java.util.Scanner;

public class Day05_4
{ // c s
	public static void main(String[] args)
	{ // m s
		// 도서 대여 프로그램
		// 1. 입출력 2. 변수/자료형/연산 3. 제어/반복 4. 배열

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

		// 준비
		Scanner scanner = new Scanner(System.in);
		String[][] memberlist = new String[100][2]; // 회원
		String[] booklist = new String[100]; // 도서 -> 도서명

		while (true)
		{// w1 s
			System.out.println("-------------------------");
			System.out.println("1. 회원가입\t 2. 로그인");
			System.out.println("-------------------------");
			int select1 = scanner.nextInt();
			if (select1 == 1)
			{ // if1 s
				boolean check = true;
				System.out.println("회원가입을 환영합니다");
				System.out.println("가입하실 아이디를 입력해주세요");
				String id = scanner.next();
				System.out.println("아이디의 비밀번호를 입력해주세요");
				String pw = scanner.next();
				for (int i = 0; i < memberlist.length; i++)
				{// for1 s
					if (memberlist[i][0] == null)
					{ // if2 s
						// i번째 행에 id가 없으면 = 빈공간
						memberlist[i][0] = id;
						memberlist[i][1] = pw; // i번째 각 열에 데이터 저장
						check = true;
						break; // 저장했으면 끝 [1번만 저장해야 하기 때문]
					} // if2 e

					// 아이디 중복체크
					for (int j = 0; j < memberlist.length; j++)
					{ // for 2 s
						if (memberlist[j][0] != null && memberlist[j][0].equals(id))
						{ // if 2 s
							// 2. 입력받은 값과 j번째 인덱스값과 같은지 비교
							System.err.println(" 알림)) 이미 있는 아이디 입니다.[재입력]");
							check = false; // 저장x 회원가입 불가능하게 save 변수를 false로 변경
							break;
						} // if 2 e
					} // for 2 e
				} // for 1 e
			} // if1 e
				// 아이디 비번 맞는지 여부 체크

			// 로그인 페이지
			else if (select1 == 2)
			{// if2 s
				System.out.println("-------------로그인 페이지-------------");
				System.out.println("아이디 : ");
				String id = scanner.next();
				System.out.println("비밀번호 : ");
				String pw = scanner.next();

				boolean logincheck = false;
				for (int i = 0; i < memberlist.length; i++)
				{ // 로그인 for 1 s
					if (memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][1].equals(pw))
					{
						System.out.println("알림)) 로그인 성공");
						logincheck = true;
					} // if2 e
					else
					{
						System.out.println("알림)) 아이디 혹은 비밀번호 오류 ");
					}
					// 로그인 성공시 페이지
					if (memberlist[i][0] != null && memberlist[i][0].equals("admin") && memberlist[i][1].equals(pw))
						while (true)
						{ // w3 s 관리자 모드 로그인시
							System.out.println("-------------관리자 페이지-------------");
							System.out.println("1. 도서 등록\t 2. 도서 메뉴 \t3. 도서 삭제\t 4. 로그아웃");
							System.out.println(">>>>>>>>> 선택 : ");
							int 관리자선택 = scanner.nextInt();
							if (관리자선택 == 1)
							{ // 도서 등록
								boolean bookcheck = true;
								System.out.println("-------------도서 등록-------------");
								System.out.println("등록할 도서명을 입력해주세요");
								String 도서명 = scanner.next();

								for (int j = 0; j < booklist.length; j++)
								{// for1 s
									if (booklist[j] == null)
									{ // if2 s
										// i번째 행에 id가 없으면 = 빈공간
										booklist[j] = 도서명;
										bookcheck = true;
										break; // 저장했으면 끝 [1번만 저장해야 하기 때문]
									} // if2 e

									for (int x = 0; x < booklist.length; x++)
									{ // for 2 s
										if (booklist[x] != null && booklist[x].equals(도서명))
										{ // if 3 s
											// 2. 입력받은 값과 j번째 인덱스값과 같은지 비교
											System.err.println(" 알림)) 이미 있는 도서 입니다.[재입력]");
											bookcheck = false; // 저장x
											break;
										} // if 3 e
									} // for 2 e
								} // for 1 e
							}

							else if (관리자선택 == 2)
							{ // 도서 메뉴
								for (int j = 0; j < booklist.length; j++)
								{
									if (booklist[j] != null)
										System.out.printf("등록된 도서 목록 : %s\n", booklist[j]);
								}
							} else if (관리자선택 == 3)
							{ // 도서 삭제

							} else if (관리자선택 == 4)
							{ // 로그아웃
								break;
							} else
								System.out.println("잘못된 숫자입니다. 다시 입력해주세요");
						} // w3 e 관리자 모드 로그아웃
					else
						while (true)
						{ // w2 s
							System.out.println("-------------로그인 페이지-------------");
							System.out.println("1. 도서 검색\t 2. 도서 목록 \t3. 도서 대여\t 4. 도서 반납\t 5. 로그아웃");
							int select2 = scanner.nextInt();
							if (select1 == 1)
							{ // 도서 검색
								System.out.println("------도서를 검색합니다------");
								System.out.println("검색할 도서명 : ");
								String title1 = scanner.next(); // 사용자

								for (int j = 0; j < booklist.length; j++)
								{
									if (booklist[j] != null && booklist[j].equals(title1))

									{
										System.out.println("검색한 도서" + booklist[j] + "가 존재합니다.");
									}
								}
							}

							else if (select2 == 2)
							{ // 도서 목록 출력
								System.out.println("------도서 목록------");
								for (int j = 0; j < booklist.length; j++)
								{
									if (booklist[j] != null)
									{
										System.out.printf("도서 번호 : %d 도서명 : %s\n", j, booklist[i]);
									}
								}
							} else if (select2 == 3)
							{ // 도서 대여
								System.out.println("------도서 대여------");
								System.out.println("대여할 도서명을 입력하세요 : ");
								String title2 = scanner.next(); // 대여할 도서명
								for (int j = 0; j < booklist.length; j++)
								{ // 도서 대여 가능
									if (booklist[j] == null)
									{
										System.out.println("도서가 대여되었습니다.");
									}
									if (booklist[j] != null)
									{
										System.out.println("도서가 대여가 불가능합니다.");
									}
								}
							} else if (select2 == 4)
							{ // 도서 반납
								System.out.println("------도서 반납------");
								System.out.println("반납할 도서명을 입력하세요 : ");
								String title3 = scanner.next();
								for (int j = 0; j < booklist.length; j++)
								{
									if (booklist[j] != null && booklist[j].equals(title3))
									{
										System.out.println("도서가 반납되었습니다");
									}
								}
							} else if (select2 == 5)
							{ // 로그 아웃
								break;
							}

							else
								System.out.println("잘못된 숫자입니다. 다시 입력해주세요");
						} // w2 e
				} // 로그인 for e
			} // if 2 e
			else
				System.out.println("잘못된 숫자입니다. 다시 입력해주세요");
		} // w1 e
	} // m e
} // c e
