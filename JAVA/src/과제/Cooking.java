package 과제;

import java.util.Scanner;

import Day06.Board;

public class Cooking { // cs
	public static void main(String[] args) { // ms
	
		// 라면레시피
		// 초기메뉴   [1. 라면 선택      2. 라면 끓이기]
		// 0. 설계 
		// 라면레시피 클래스를 만들어 넣음(재료 : 라면 1봉, 물, 계란, 파 -> 클래스의 필드
		// 생성자 사용 O
		// 1-1. 사용자로부터 먹는 라면 레시피를 입력받음
		// 1-2. 레시피 등록(라면, 물, 계란, 파)
		// 2. 라면을 끓이기 위한 조리과정 진행
		// 분기 1 : 라면을 끓일 때 스프를 먼저 넣어야 되나 면을 먼저 넣어야 되나
		// 변수 선언
		Scanner scanner = new Scanner(System.in); // 입력 객체 선언
		Ramen[] recipelist = new Ramen[100];
		
		while(true) { // w s
		System.out.println("-------라면 조리---------"); // 초기 메뉴 출력
		System.out.println("나만의 라면 레세피를 등록 후 라면을 맛있게 끓일 레시피를 공유하세요!(1개 기준)");
		System.out.println("라면 종류\t 조리방법 "); // 
		int index = 0; // 인덱스 변수 [반복순서 체크]
		
		// 모든 게시물조회
			for(Ramen temp : recipelist) { // for s
				if(temp != null) { // if s
				System.out.printf("%d  %s\t%s \n", index, temp.ramen, temp.cook);
				} // if e ,
				index++;
			} // for e
		System.out.println("1. 레시피 등록 2. 등록된 레시피 확인 ");
		int select = scanner.nextInt();// 사용자로부터 실행시킬 메뉴를 입력받음
		
		if(select == 1) { // 레시피 등록
			System.out.println("----- 라면 레시피 등록 페이지 -----");
			System.out.println("라면종류 : ");	String ramen = scanner.next();
			System.out.println("추가재료 : ");	String cook = scanner.next();
			
			Ramen recipe = new Ramen(ramen, cook); // 2개 필드를 가지는 생성자 사용
			int i = 0; // 인덱스 변수[반복순서 체크]
			for(Ramen temp : recipelist) { // for2 s
			if(temp == null) { // if2 s -> 빈 공간을 찾으면
				recipelist[i] = recipe; // 해당 인덱스에 새로운 객체 저장
				break; // 한번 저장하면 반복문 종료
				} // if2 e	
				i++; // 인덱스를 1증가시킴
			} // for2 e
		}
		
		else if(select == 2) { // 등록된 레시피 확인
			System.out.println("등록된 라면 레시피를 확인해주세요");
			System.out.println("게시물 번호를 입력해주세요");
			int bno = scanner.nextInt(); // 현 게시물 인덱스번호(=배열내 인덱스 값)
			System.out.printf("추가재료 : %s   라면종류 : %s\n", recipelist[bno].cook, recipelist[bno].ramen);
			
			
		}
		else {System.out.println("알 수 없는 숫자입니다.[재입력]");}
		
		
		}// we
	}// me 
} // c e
