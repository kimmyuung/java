package 개인과제구상;

import java.util.Scanner;

public class 이젠드래프트_메인 {// c s

	public static void main(String[] args) { // m s
		이젠드래프트_컨트롤러 con = new 이젠드래프트_컨트롤러();
		Scanner sc = new Scanner(System.in);
		con.게임점수load();
		con.팀원로드();
		while (true) { // w s
			System.out.println("이젠드래프트에 오신 걸 환영합니다.");
			System.out.println("1. 게임 설명 2. 게임 시작 3. 명예의 전당 4. 게임 종료 ");
			System.out.println("메뉴 선택 >> ");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("이젠 드래프트는 랜덤으로 있는 팀원들 중 누가 가장 높은 점수를 얻었는지 경쟁하는 게임입니다");
				System.out.println("플레이어는 컴퓨터와 더불어 누가 점수가 더 높았는지 겨루게 됩니다.");
				System.out.println("각 팀원들의 시너지와 특성을 잘 보고 선택해주세요");
				System.out.println("한 조당 최대 조원은 4명까지 입니다.");
			} else if (ch == 2) {
				System.out.println("게임을 시작합니다. ");
				System.out.println("난이도를 선택해주세요");
				System.out.println("1. 매우 쉬움 : +5점을 얻고 시작합니다.");
				System.out.println("2. 쉬움 : +3점을 얻고 시작합니다.");
				System.out.println("3. 보통 : +1점을 얻고 시작합니다.");
				System.out.println("4. 조금 어려움 : -1점을 얻고 시작합니다.");
				System.out.println("5. 어려움 : -3점을 얻고 시작합니다.");
				System.out.println("6. 매우어려움 : -5점을 얻고 시작합니다.");
				int ch2 = sc.nextInt();
				if(ch2 == 1) {
					System.out.println("매우 쉬움 난이도로 게임을 시작합니다.");
					while(true) {
						System.out.println("[[게임 메뉴 1. 조원 뽑기 2. 조원 확인 3. 게임 종료 ]]");
						System.out.print("\n 메뉴선택 >>");
						int ch3 = sc.nextInt();
						if(ch3 == 1) {
							for(int i = 0; i < 4; i++) {
							String select = con.팀원뽑기();
							System.out.println(select + "을 팀으로 뽑으시겠습니까?");
							System.out.println("1. 예 2. 아니오");
							String team = sc.next();
							if(team.equals("1") || team.equals("예")) {
								for(팀원 temp : con.팀원리스트)
									if(temp.get팀원이름().equals(select)) {
								con.팀원선택(select, temp.get팀원특성(), temp.get팀원시너지());
								}
							}
							else if(team.equals("2") || team.equals("아니오")) {
								select = con.팀원뽑기();
							}
						}
						
						con.시너지판단();
						con.효과판단();
						}
						else if(ch3 == 2) {
							for(팀원 temp : con.팀원선택리스트) {
								System.out.println(temp);
							}
						}
						else if(ch3 == 3) {
							System.out.println("게임을 종료합니다.");
							break;
						}
						else {System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");}
					}
				}
				else if(ch2 == 2) {
					System.out.println("쉬움 난이도로 게임을 시작합니다.");
					while(true) {
						System.out.println("[[게임 메뉴 1. 조원 뽑기 2. 조원 확인 3. 게임 종료 ]]");
						System.out.print("\n 메뉴선택 >>");
						int ch3 = sc.nextInt();
						if(ch3 == 1) {
							for(int i = 0; i < 5; i++) {
							String select = con.팀원뽑기();
							System.out.println(select + "을 팀으로 뽑으시겠습니까?");
							System.out.println("1. 예 2. 아니오");
							String team = sc.next();
							if(team.equals("1") || team.equals("예")) {
								for(팀원 temp : con.팀원리스트)
									if(temp.get팀원이름().equals(select)) {
								con.팀원선택(select, temp.get팀원특성(), temp.get팀원시너지());
								}
							}
							else if(team.equals("2") || team.equals("아니오")) {
								// 뒤로가기는 따로 안해도될듯??
							}
						}
						
						int 시너지점수 = con.시너지판단();
						int 효과점수 = con.효과판단();
						int 게임점수 = 시너지점수 + 효과점수;
						System.out.println("당신의 점수는 : " + 게임점수 +" 점 입니다.");
						
						}
						else if(ch3 == 2) {
							for(팀원 temp : con.팀원선택리스트) {
								System.out.println(temp);
							}
						}
						else if(ch3 == 3) {
							System.out.println("게임을 종료합니다.");
							break;
						}
						else {System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");}
					}
				}
				else if(ch2 == 3) {
					System.out.println("보통 난이도로 게임을 시작합니다.");
					while(true) {
						System.out.println("[[게임 메뉴 1. 조원 뽑기 2. 조원 확인 3. 게임 종료 ]]");
						System.out.print("\n 메뉴선택 >>");
						int ch3 = sc.nextInt();
						if(ch3 == 1) {
							for(int i = 0; i < 4; i++) {
							String select = con.팀원뽑기();
							System.out.println(select + "을 팀으로 뽑으시겠습니까?");
							System.out.println("1. 예 2. 아니오");
							String team = sc.next();
							if(team.equals("1") || team.equals("예")) {
								for(팀원 temp : con.팀원리스트)
									if(temp.get팀원이름().equals(select)) {
								con.팀원선택(select, temp.get팀원특성(), temp.get팀원시너지());
								}
							}
							else if(team.equals("2") || team.equals("아니오")) {
								select = con.팀원뽑기();
							}
						}
						
						con.시너지판단();
						con.효과판단();
						}
						else if(ch3 == 2) {
							for(팀원 temp : con.팀원선택리스트) {
								System.out.println(temp);
							}
						}
						else if(ch3 == 3) {
							System.out.println("게임을 종료합니다.");
							break;
						}
						else {System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");}
					}
				}
				else if(ch2 == 4) {
					System.out.println("조금 어려움 난이도로 게임을 시작합니다.");
					while(true) {
						System.out.println("[[게임 메뉴 1. 조원 뽑기 2. 조원 확인 3. 게임 종료 ]]");
						System.out.print("\n 메뉴선택 >>");
						int ch3 = sc.nextInt();
						if(ch3 == 1) {
							for(int i = 0; i < 4; i++) {
							String select = con.팀원뽑기();
							System.out.println(select + "을 팀으로 뽑으시겠습니까?");
							System.out.println("1. 예 2. 아니오");
							String team = sc.next();
							if(team.equals("1") || team.equals("예")) {
								for(팀원 temp : con.팀원리스트)
									if(temp.get팀원이름().equals(select)) {
								con.팀원선택(select, temp.get팀원특성(), temp.get팀원시너지());
								}
							}
							else if(team.equals("2") || team.equals("아니오")) {
								select = con.팀원뽑기();
							}
						}
						
						con.시너지판단();
						con.효과판단();
						}
						else if(ch3 == 2) {
							for(팀원 temp : con.팀원선택리스트) {
								System.out.println(temp);
							}
						}
						else if(ch3 == 3) {
							System.out.println("게임을 종료합니다.");
							break;
						}
						else {System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");}
					}
				}
				else if(ch2 == 5) {
					System.out.println("어려움 난이도로 게임을 시작합니다.");
					while(true) {
						System.out.println("[[게임 메뉴 1. 조원 뽑기 2. 조원 확인 3. 게임 종료 ]]");
						System.out.print("\n 메뉴선택 >>");
						int ch3 = sc.nextInt();
						if(ch3 == 1) {
							for(int i = 0; i < 4; i++) {
							String select = con.팀원뽑기();
							System.out.println(select + "을 팀으로 뽑으시겠습니까?");
							System.out.println("1. 예 2. 아니오");
							String team = sc.next();
							if(team.equals("1") || team.equals("예")) {
								for(팀원 temp : con.팀원리스트)
									if(temp.get팀원이름().equals(select)) {
								con.팀원선택(select, temp.get팀원특성(), temp.get팀원시너지());
								}
							}
							else if(team.equals("2") || team.equals("아니오")) {
								select = con.팀원뽑기();
							}
						}
						
						con.시너지판단();
						con.효과판단();
						}
						else if(ch3 == 2) {
							for(팀원 temp : con.팀원선택리스트) {
								System.out.println(temp);
							}
						}
						else if(ch3 == 3) {
							System.out.println("게임을 종료합니다.");
							break;
						}
						else {System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");}
					}
				}
				else if(ch2 == 6) {
					System.out.println("매우 어려움 난이도로 게임을 시작합니다.");
					while(true) {
						System.out.println("[[게임 메뉴 1. 조원 뽑기 2. 조원 확인 3. 게임 종료 ]]");
						System.out.print("\n 메뉴선택 >>");
						int ch3 = sc.nextInt();
						if(ch3 == 1) {
							for(int i = 0; i < 4; i++) {
							String select = con.팀원뽑기();
							System.out.println(select + "을 팀으로 뽑으시겠습니까?");
							System.out.println("1. 예 2. 아니오");
							String team = sc.next();
							if(team.equals("1") || team.equals("예")) {
								for(팀원 temp : con.팀원리스트)
									if(temp.get팀원이름().equals(select)) {
								con.팀원선택(select, temp.get팀원특성(), temp.get팀원시너지());
								}
							}
							else if(team.equals("2") || team.equals("아니오")) {
								select = con.팀원뽑기();
							}
						}
						
						con.시너지판단();
						con.효과판단();
						}
						else if(ch3 == 2) {
							for(팀원 temp : con.팀원선택리스트) {
								System.out.println(temp);
							}
						}
						else if(ch3 == 3) {
							System.out.println("게임을 종료합니다.");
							break;
						}
						else {System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");}
					}
				}
				else System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요.");
				
			} else if (ch == 3) {
				System.out.println("명예의 전당입니다.");
				System.out.println("게임을 플레이 하던 중 가장 높은 점수를 기록한 사람을 볼 수 있습니다.");
				System.out.println("단 명예의 전당에 오를 수 있는 건 매우 어려움 난이도를 플레이한 사람만 점수가 기록됩니다");
				System.out.println("랭킹을 확인할 수 있습니다.");
				// 점수리스트 반복문 이용하여 출력
			} else if (ch == 4) {
				System.out.println("게임을 종료합니다.");
				sc.close();
				break;
			}
			else if(ch == -1) {
				while(true) {
				System.out.println("관리자 모드를 실행합니다.");
				System.out.println("[[메뉴 1. 팀원 등록 2. 팀원 편집 3. 팀원 목록 확인 4. 팀원 삭제 5. 나가기]]");
				int ch1 = sc.nextInt();
				if(ch1 == 1) {
					
					System.out.println("팀원의 이름을 입력해주세요"); String name = sc.next();
					for(String temp : con.팀원시너지) {
						System.out.print(temp + "\t");
					}
					System.out.println("\n시너지를 선택해주세요");
					String combie = sc.next();
					
					for(String temp : con.팀원특성) {
						System.out.print(temp + "\t");
					}
					System.out.println("\n특성을 선택해주세요");
					String skill = sc.next();
					boolean result = con.팀원등록(name, skill, combie);
					if(result) System.out.println("팀원 등록 성공!");
					else System.out.println("팀원 등록 실패!");
				}
				else if(ch1 == 2) {
					System.out.println("수정할 팀원의 이름을 입력하세요");
					String name = sc.next();
					for(String temp : con.팀원특성) {
						System.out.print(temp + "\t");
					}
					System.out.println("\n수정할 팀원의 특성을 선택해주세요");
					String skill = sc.next();
					for(String temp : con.팀원시너지) {
						System.out.print(temp + "\t");
					}
					System.out.println("수정할 팀원의 시너지를 입력하세요");
					String combie = sc.next();
					boolean result = con.팀원편집(name, skill, combie);
					if(result) System.out.println("팀원 편집 성공!");
					else System.out.println("팀원 편집 실패!");
				}
				else if(ch1 == 3) {
					for(팀원 temp : con.팀원리스트) {
						System.out.print((temp.get팀원번호()+1) + "\t" +temp.get팀원이름()+ "\t" + temp.get팀원특성()+ "\t" + temp.get팀원시너지() + "\n");
					}
				}
				else if(ch1 == 4) {
					System.out.println("삭제할 팀원의 이름을 입력하세요");
					String name = sc.next();
					boolean result = con.팀원삭제(name);
					if(result) System.out.println("팀원 삭제 성공");
					else System.out.println("삭제 실패!");
				}
				else if(ch1 == 5) {
					System.out.println("관리자모드를 나갑니다."); break;
				}
				}
			}
		} // we
	} // me
} // ce
