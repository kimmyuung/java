package Day06_6;

import java.util.Scanner;

public class 게시판연습_4 {
	// 게시판[클래스]
		// 0. 게시물 설계 -> 클래스 선언 
		// 작성자, 비밀번호, 제목, 내용(클래스의 필드)
		// 생성자 : 사용 O
		// 1. 첫화면 [ 모든 게시물 출력 ]
		// 2. 메뉴 [1. 글쓰기 2. 글보기 ]
			// 1-1. 글쓰기 시 : 작성자, 비밀번호, 제목, 내용 
			// -> 객체화
			// 2-1. 글보기 : 해당 글번호 출력(인덱스) -> 배열에 저장되는 순서
					// -> 해당 글번호 입력받아 해당 글 상세페이지 출력
			// . 글보기 메뉴 : 1. 목록보기 2. 삭제 3. 수정
			// 2-2 삭제시 : 비밀번호 입력받아 동일하면 삭제
			// 2-3 수정시 : 작성자 비밀번호 입력받아 동일하면 제목만 내용만 수정
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board[] boardlist = new Board[100];
		while(true) {
		System.out.println("커뮤니티 페이지");
		System.out.println("[[1. 글 쓰기 2. 글 보기]]");
		int ch = sc.nextInt();
		if(ch == 1) {
			System.out.println("글 쓰기 페이지");
			System.out.println("Title : "); String title = sc.next();
			System.out.println("Context : "); String context = sc.next();
			System.out.println("Writer : "); String writer = sc.next();
			System.out.println("Password : ");  String pw = sc.next();
			int i = 0;
			for(Board temp : boardlist) {
				if(temp == null) {
					System.out.println("게시물 등록 완료");
					Board board = new Board(writer, pw, context, title);
					boardlist[i] = board;
					break;
				}
			i++;}
		}	
		else if (ch == 2) {
			System.out.println("게시물 보기 페이지");
			System.out.println("볼 게시물 번호(0번부터 시작)"); int bnum = sc.nextInt();
			if(boardlist[bnum] != null) {
				System.out.println("게시물을 찾았습니다.");
				System.out.println(boardlist[bnum].제목);
				System.out.println(boardlist[bnum].내용);
				System.out.println("1. 게시물 목록 보기 2. 삭제 3. 수정");
				int ch1 = sc.nextInt();
				
				if(ch1 == 1) {
					int i = 0;
					for(Board temp : boardlist) {
						if(temp != null) {
					System.out.printf("게시물번호 : %d \t제목 : %s\t 내용 : %s\t 작성자 : %s\n"
							,i,boardlist[i].제목,boardlist[i].내용,boardlist[i].작성자);} i++; }
				}
				else if(ch1 == 2) {
					System.out.println("게시물 삭제 페이지");
					System.out.println("게시물의 비밀번호를 입력 : "); String pw = sc.next();
					if(boardlist[bnum].비밀번호.equals(pw)) {
						System.out.println("게시물 삭제 성공!");
						boardlist[bnum] = null;
					}
					for(int i = bnum; i < boardlist.length; i++) {
						boardlist[bnum] = boardlist[bnum+1];
						if(bnum == boardlist.length-1) {
							boardlist[boardlist.length-1] = null;
						}
						
					}
				}
				else if(ch1 == 3) {
					System.out.println("게시물 수정 페이지");
					System.out.println("게시물의 비밀번호를 입력 : "); String pw = sc.next();
					if(boardlist[bnum].비밀번호.equals(pw)) {
						System.out.println("비밀번호 인증 성공");
						System.out.println("수정할 게시물의 제목 : "); String title = sc.next();
						System.out.println("수정할 게시물의 내용 : "); String context = sc.next();
						boardlist[bnum].제목 = title;
						boardlist[bnum].내용 = context;
						System.out.println("수정 성공!!");
					}
				}
				else System.out.println("숫자 오류!");
			}
		}
		else System.out.println("숫자를 잘못입력");
		
		}
	}
}
