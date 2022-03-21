package Day06_6;

import java.util.Scanner;

public class 게시판연습_1 {
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
			// 준비 [모든{}에 사용되는 변수 선언]
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board[] boardlist = new Board[100];
		
		while(true) {
			System.out.println(" ----- 게시판 프로그램 ----- ");
			System.out.println("1. 글쓰기   2. 글보기");
			int ch = sc.nextInt();
			
			if(ch==1) {
				System.out.println("글쓰기 페이지");
				System.out.println("1. title : "); String title = sc.next();
				System.out.println("2. context : "); String context =sc.next();
				System.out.println("3. pw : "); String pw = sc.next();
				System.out.println("4. writer : "); String writer = sc.next();
				int index = 0;
				Board board = new Board(writer, pw, context, title);
				for(Board temp : boardlist) {
					if(temp == null) {
						System.out.println("게시물 등록이 완료되었습니다");
						boardlist[index] = board;
						break;
					}
				}
			}
			else if(ch==2) {
				System.out.println("게시물 보기 페이지");
				System.out.println("보실 게시물 번호를 입력해주삼"); int bnum = sc.nextInt();
				if(boardlist[bnum] != null) {
					System.out.println("게시물 제목 :" + boardlist[bnum].제목);
					System.out.println("게시물 내용 : " + boardlist[bnum].내용);
					System.out.println("게시물 작성자 : " + boardlist[bnum].작성자);
					System.out.println("게시물 보기 페이지");
					System.out.println("1. 목록보기 2. 삭제 3. 수정");
					int ch2 = sc.nextInt();
					if (ch2 == 1) {
						int i = 0;
						for(Board temp : boardlist) {
							if(temp != null) {
								System.out.printf("게시물번호 : %d \t 제목 : %s\t 내용 : %s\t 작성자 : %s"
										,i,boardlist[i].제목,boardlist[i].내용,boardlist[i].작성자);
							}
						i++;}
					}
					else if (ch2 == 2) {
						System.out.println("게시물 삭제 페이지야");
						System.out.println("현 게시물을 작성할때 썻던 비밀번호를 입력해줭");
						String pw = sc.next();
						if(boardlist[ch2].비밀번호.equals(pw)) {
							System.out.println("게시물 삭제에 성공했엉");
							boardlist[ch2] = null;
						}
						for(int i = ch2; i < boardlist.length; i++) {
							boardlist[ch2] = boardlist[ch2+1];
							if(ch2 == boardlist.length-1) {
								boardlist[boardlist.length-1] = null;
							}
						}
					}
					else if (ch2 == 3) {
						System.out.println("게시물 수정 페이지야");
						System.out.println("현 게시물을 작성할때 썻던 비밀번호를 입력해줭");
						String pw = sc.next();
						if(boardlist[ch2].비밀번호.equals(pw)) {
							System.out.println("비밀번호 인증에 성공했엉");
							System.out.println("수정할 제목을 입력해줭"); String title = sc.next();
							System.out.println("수정할 내용을 입력해줭"); String context = sc.next();
							boardlist[ch2].제목 = title;
							boardlist[ch2].내용 = context;
							System.out.println("수정한 내용을 보여줄겡");
							System.out.println(boardlist[ch2].제목);
							System.out.println(boardlist[ch2].내용);
						}
					}
					else {System.out.println("숫자를 잘못 입력햇엉, 다시 입력해줭");}
				}
			}
			else {System.out.println("숫자를 잘못 입력했슴돠, 다시 입력해주길 바람돠");}
			
			
		}
	}
}
