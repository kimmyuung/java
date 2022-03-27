package 개인과제구상;

import java.util.ArrayList;
import java.util.Scanner;

public class 게임_블랙잭ver2 {
// 클래스(카드) : 카드문양(다이아, 하트, 클로버, 스페이드), 덱카운트, 

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		블랙잭_컨트롤러 con = new 블랙잭_컨트롤러();
		int game = 0;
		int pv = 0;
		int dv = 0;
		try {
		while(true) {
			System.out.println("블랙잭 게임");
			System.out.println("1. 게임 시작 2. 결과 보기");
			int ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("게임을 시작합니다.");
				System.out.println("1. 카드 뽑기 2. 게임 결과");
				int ch1 = sc.nextInt();
				if(ch1 == 1) {
					System.out.println("게임을 준비중입니다.");
					System.out.println("카드를 뽑습니다.");
					con.게임시작();
				}
				else if(ch1 == 2) {
					System.out.println("게임 결과를 봅니다.");
					con.게임결과보기();
				}
			}
			else if(ch == 2) {
				con.결과보기();
			}
			else if(ch < 0) {
				System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요");
			}
			else {System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요");}
				
		}
		}catch(Exception e) {System.out.println("관리자에게 문의해주세요");}
	}
}
