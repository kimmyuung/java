package Day06_6;

import java.util.Scanner;

public class 게시판연습 {
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
			int i = 0;
			System.out.println(" ----- 커뮤니티 ----- ");
			for(Board temp : boardlist) {
				if(temp != null) {System.out.printf("게시물번호 %d \t제목 : %s\t 내용 : %s\t 작성자 : %s"
						, i, boardlist[i].제목, boardlist[i].내용, boardlist[i].작성자 );}
				}i++;
			System.out.println("1. 글쓰기 2. 글보기");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("글쓰기 페이지");	
				System.out.println("제목 : ");		String title = sc.next();
				System.out.println("내용 : ");		String content = sc.next();
				System.out.println("비밀번호 : ");		String pw = sc.next();
				System.out.println("작성자 : ");		String writer = sc.next();
				Board board = new Board(writer, pw, content, title);
				System.out.println("글쓰기가 완료되었습니다.");
				int index = 0;
				for(Board temp : boardlist) {
					if(temp == null) {boardlist[index] = board; break;}
					index++;	}
			}
			else if (ch == 2) {
				System.out.println("글 보기 페이지");
				System.out.println("게시물 번호를 입력해주세요.(0부터 시작합니다");
				int ch2 = sc.nextInt();
				System.out.printf("작성자 : %s   제목 : %s\n", boardlist[ch2].작성자, boardlist[ch2].제목);
				System.out.printf("내용 : %s\n" ,boardlist[ch2].내용);
				System.out.println("1. 목록보기 2. 삭제 3. 수정");
				int ch3 = sc.nextInt();
				if(ch3 == 1) {
					int j = 0;
					for(Board temp : boardlist) {
						if(temp != null) {System.out.printf("게시물번호 %d \t제목 : %s\t 내용 : %s\t 작성자 : %s"
								, j, boardlist[j].제목, boardlist[j].내용, boardlist[j].작성자 );}
						}j++;
				}
				else if(ch3 == 2) {
					System.out.println("게시물 삭제 페이지");
					System.out.println("현 게시물의 비밀번호를 입력해주세요."); String pw = sc.next();
						if(boardlist[ch2].비밀번호.equals(pw)) {
							System.out.println("비밀번호 인증 성공");
							System.out.println("현 게시물을 삭제합니다.");
							boardlist[ch2].내용 = null;
							boardlist[ch2].비밀번호 = null;
							boardlist[ch2].작성자 = null;
							boardlist[ch2].제목 = null;
						}
						else System.out.println("비밀번호를 잘못 입력하셨습니다.");
					for(int j = ch2; j< boardlist.length; j++) {
						boardlist[ch2] = boardlist[ch2+1];
						if(ch2 == boardlist.length) {
							boardlist[boardlist.length-1] = null;
						}
					}
					
				}
				else if(ch3 == 3) {
					System.out.println("게시물 수정 페이지");
					System.out.println("현 게시물의 비밀번호를 입력해주세요."); String pw = sc.next();
					for(Board temp : boardlist) {
						if(temp != null && boardlist[ch2].비밀번호.equals(pw)) {
							System.out.println("비밀번호 인증 성공");
							System.out.println("수정할 제목을 입력하세요"); String title = sc.next();
							System.out.println("수정할 내용을 입력하세요"); String context = sc.next();
							boardlist[ch2].내용 = context;
							boardlist[ch2].제목 = title;
						}
						else System.out.println("비밀번호를 잘못 입력하셨습니다.");}
				}
				else {System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력해주세요.");}
				
			}
			else System.out.println("숫자를 잘못입력하셨습니다. 다시 입력해주세요");
		}
	}
}
