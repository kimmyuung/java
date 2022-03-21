package Day06_6;

import java.util.Scanner;

public class 게시판연습_3 {
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
			System.out.println("[[메뉴 1. 글쓰기 2. 글보기 ]]");
			int ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("글쓰기 페이지!");
				System.out.println("title : "); String title = sc.next();
				System.out.println("context : "); String context = sc.next();
				System.out.println("writer : "); String writer = sc.next();
				System.out.println("pw : "); String pw = sc.next();
				int i = 0;
				for(Board temp : boardlist) {
					if(temp == null) {
						Board board = new Board(writer, pw, context, title);
						System.out.println("게시물 등록 끗!!!");
						boardlist[i] = board;
						break;
					}
				i++;}
 			}
			else if(ch == 2) {
				System.out.println("게시물 보기 ");
				System.out.println("볼 게시물의 번호는??(0부터 시작)"); int bnum = sc.nextInt();
				System.out.println("제목 : " + boardlist[bnum].제목);
				System.out.println("내용 : " + boardlist[bnum].내용);
				System.out.println("1. 글 목록 2. 삭제 3. 수정");
				int ch2 = sc.nextInt();
				if(ch2 == 1) {
					int i = 0;
					for(Board temp : boardlist) {
						if(temp != null) {
							System.out.printf("%d \t %s \t %s \t %s \n", i, boardlist[i].제목, boardlist[i].내용,boardlist[i].작성자);
						}
					i++;}
				}
				else if(ch2 == 2) {
					System.out.println("게시물 삭제 페이지");
					System.out.println("게시글의 비밀번호를 입력해주세요"); String pw = sc.next();
					if(boardlist[bnum].비밀번호.equals(pw)) {
						System.out.println("비밀번호 인증 성공");
						System.out.println("게시글 삭제 성공");
						boardlist[bnum] = null;
					}
					for(int i = bnum; i < boardlist.length; i++) {
						boardlist[bnum] = boardlist[bnum+1];
						if(bnum == boardlist.length-1) {
							boardlist[boardlist.length-1] = null;
						}
					}
				}
				else if(ch2 == 3) {
					System.out.println("게시글의 비밀번호를 입력해주세요"); String pw = sc.next();
					if(boardlist[bnum].비밀번호.equals(pw)) {
						System.out.println("비밀번호 인증 성공");
						System.out.println("수정할 제목 : "); String title = sc.next();
						System.out.println("수정할 내용 : "); String context = sc.next();
						boardlist[bnum].제목 = title;
						boardlist[bnum].내용 = context;
						System.out.println("수정된 제목 : " + boardlist[bnum].제목);
						System.out.println("수정된 내용 : " + boardlist[bnum].내용);
					}
				}
			}
			else {System.out.println("숫자 오류!");}
		}
	}
}
