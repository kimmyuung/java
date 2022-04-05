package 개인과제구상;

import java.util.ArrayList;
import java.util.Scanner;

public class 이젠드래프트 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	게임컨트롤러 con = new 게임컨트롤러();
	con.load();
	while(true) {
		System.out.println("이젠 드래프트에 오신 걸 환영합니다.");
		System.out.println("난이도를 선택해주세요.");
		System.out.println("1. 아주 쉬움(+5) : 김규석으로 플레이");
		System.out.println("2. 쉬움 (+3) : 김지웅으로 플레이");
		System.out.println("3. 보통 (+1) : 김진혁으로 플레이");
		System.out.println("4. 어려움(-1) : 김선제로 플레이");
		System.out.println("5. 매우어려움(-3) : 박민욱으로 플레이");
		System.out.println("6. 헬(-5) : 김명호로 플레이");
		System.out.println("7. 게임종료");
		int ch = sc.nextInt();
		if(ch==1) {
			이젠드래프트_인터페이스 팀장 = new 팀장("김규석", "캐리", con.뽑은팀원, 5);
			팀장.팀장선택();
			
			
		}
		else if(ch==2) {
			이젠드래프트_인터페이스 팀장 = new 팀장("김지웅", "만능",con.뽑은팀원, 3 );
			팀장.팀장선택();
			String 팀원 = con.조원뽑기();
			System.out.println(팀원 + "을 뽑으시겠습니까?");
		}
		else if(ch==3) {
			이젠드래프트_인터페이스 팀장 = new 팀장("김진혁", "분업", con.뽑은팀원, 1 );
			팀장.팀장선택();
		}
		else if(ch==4) {
			이젠드래프트_인터페이스 팀장 = new 팀장("김선제", "분업", con.뽑은팀원, -1);
			팀장.팀장선택();
		}
		else if(ch == 5) {
			이젠드래프트_인터페이스 팀장 = new 팀장("박민욱", "소통", con.뽑은팀원, -3);
			팀장.팀장선택();
		}
		else if(ch == 6) {
			이젠드래프트_인터페이스 팀장 = new 팀장("김명호", "X", con.뽑은팀원, -5);
			팀장.팀장선택();
		}
		else if(ch == 7) {
			System.out.println("게임을 종료합니다. "); break;
		}
		else if(ch == -1) {
			while(true) {
			System.out.println("관리자 모드를 실행합니다.");
			System.out.println("1. 팀원 등록 2. 팀원 편집 3. 팀원 삭제 4. 팀원 목록 5. 종료");
			System.out.println("팀원 \t 이름 \t 특성 \t 시너지 \t 효과");
			for(팀원 temp : 게임컨트롤러.팀원리스트) {
				System.out.printf("\t %s \t %s \t %s \t\n", temp.get이름(), temp.get특성(),
						temp.get시너지() );
			}
			int ch1 = sc.nextInt();
			if(ch1 == 1) {
				System.out.println("팀원을 등록합니다.");
				System.out.println("등록할 팀원의 이름을 입력해주세요");
				String 이름 = sc.next();
				System.out.println("등록할 팀원의 특성을 입력해주세요");
				String 특성 = sc.next();
				System.out.println("등록할 팀원의 시너지를 입력해주세요");
				String 시너지 = sc.next();
				boolean result = con.팀원등록(이름, 특성, 시너지, 0);
				if(result) System.out.println("팀원 등록 성공!");
				else System.out.println("팀원 등록 실패!");
			}
			else if(ch1 == 2) {
				System.out.println("등록된 팀원을 편집합니다.");
				System.out.println("팀원번호 \t 이름 \t 특성 \t 시너지 \t 효과");
				for(팀원 temp : 게임컨트롤러.팀원리스트) {
					System.out.printf("\t %d \t %s \t %s \t %s \t \n", temp.인덱스,temp.get이름(), temp.get특성(),
							temp.get시너지() );
				}
				System.out.println("편집할 팀원의 이름을 입력하세요");
				String name = sc.next();
				System.out.println("편집을 시작합니다.");
				System.out.println("이름 : "); String 이름 = sc.next();
				System.out.println("특성 : "); String 특성 = sc.next();
				System.out.println("시너지 : " ); String 시너지 = sc.next();
				System.out.println("팀원번호 : "); int 팀원번호 = sc.nextInt();
				boolean result = con.팀원편집(name, 이름, 특성, 시너지, 팀원번호);
				if(result) {System.out.println("팀원 편집 성공!");}
				else System.out.println("편집 실패! ]] 팀원이 존재하지 않습니다.");
			}
			else if(ch1 == 3) {
				System.out.println("등록된 팀원을 삭제합니다.");
				System.out.println("팀원 \t 이름 \t 특성 \t 시너지 \t 효과");
				for(팀원 temp : 게임컨트롤러.팀원리스트) {
					System.out.printf("\t %s \t %s \t %s \t \n", temp.get이름(), temp.get특성(),
							temp.get시너지() );
				}
				System.out.println("삭제할 팀원의 이름을 입력하세요");
				String name = sc.next();
				boolean result = con.팀원삭제(name);
				if(result) System.out.println("팀원 삭제 성공!");
				else System.out.println("팀원 삭제 실패!");
			}
			else if(ch1 == 4) {
				System.out.println("팀원 \t 이름 \t 특성 \t 시너지 \t 효과");
				for(팀원 temp : 게임컨트롤러.팀원리스트) {
					System.out.printf("\t %s \t %s \t %s \t \n", temp.get이름(), temp.get특성(),
							temp.get시너지() );
				}
			}
			else if(ch1 == 5) {
				System.out.println("관리자모드 종료!"); sc.close();
				break;	}
			}
		}
	}
}
}
