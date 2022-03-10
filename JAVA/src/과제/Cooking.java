package 과제;

import java.util.Scanner;

import Day06.Board;

public class Cooking { // cs
	public static void main(String[] args) { // ms
	
		// 라면레시피
		// 초기메뉴   [1. 레시피보기      2. 라면 끓이기]
		// 0. 설계 
		// 1-1. 사용자로부터 먹는 라면 레시피를 보고 라면을 끓이는 것을 입력받음
		// 1-2. 중간 중간 확인을 위해 if문 사용
		// 2. 라면을 끓이기 위한 조리과정 진행
		// 변수 선언
		Scanner scanner = new Scanner(System.in); // 입력 객체 선언
		
		while(true) { // w s
		System.out.println("-------라면 조리---------(1인분 기준)"); // 초기 메뉴 출력
		System.out.println("라면 종류 선택하고 조리방법을 배워보자 "); // 
		System.out.print("1. 레시피 보기 2. 조리 시작하기");
		int select = scanner.nextInt();
		Ramen ramen = new Ramen();
		
		if(select ==1) { // if 1 s
			System.out.println("라면 레시피를 봅니다.");
			System.out.println("태진아 우유라면의 조리를 시작합니다");
			System.out.println("준비물 : 라면, 김치, 콜라, 우유");
			System.out.println("준비가되었으면 \"시작\"을 입력해주세요");
			String select2 = scanner.next();
			if (select2.equals(" \"시작\" ")) { // if 2 s
				System.out.println("조리를 시작합니다");
				System.out.println("1. 우유와 콜라를 각각의 냄비에 넣고 끓입니다.");
				System.out.println("우유와 콜라가 다 끓었으면 2를 입력해주세요.");
				int select3 = scanner.nextInt();
					if(select3 == 2) { // if 3 s
					System.out.println("2. 콜라가 김이 빠질 때까지 기다리면서 우유 속에 김치와 라면을 넣고 끓인다.");
					System.out.println("우유와 라면이 끓고 나면 3을 입력해주세요");
					int select4 = scanner.nextInt();
						if (select4 == 3) { // if 4 s
						System.out.println("3. 우유 라면이 끓고 나면 식은 콜라를 부어 섞어 준다");
						System.out.println("조리 끝!!!!!");
					} // if 4 e
						else {System.out.println("오류]] 다시 입력해주세요");}
				} // if 3 e
			} // if 2 e

		else if(select == 2) {
			System.out.println("레시피를 보지 않고 조리를 시작합니다.");
			System.out.println("1. 준비한 냄비에 물을 넣어주세요."); }
			System.out.println("물이 끓으면 2를 입력해주세요.");
			int select2_1 = scanner.nextInt();
			if(select2_1 == 2) {
				System.out.println("물이 끓었으면 건더기와 스프를 넣어주세요.");
				System.out.println("넣고 3분 뒤 라면을 드시면 조리 완성!!!");
			}
			else {System.out.println("오류]] 다시 입력해주세요");}
		} // if1 e
		
		else System.out.println("잘못된 번호를 입력했습니다. [재입력]");
		
		
		
		
		}// we
	}// me 
} // c e
