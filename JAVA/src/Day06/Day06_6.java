package Day06;

import java.util.Scanner;

public class Day06_6 { // cs
	public static void main(String[] args) { // ms
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
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100]; // 보드 객체를 100개 저장할 수 있는 1차원 배열 선언
		
		// 프로그램 실행
		while(true) { // w s [종료 = X]
		
		System.out.println("----- 커뮤니티 -----");
		System.out.printf("%s\t%s\t%s \n", "번호", "내용", "제목");
		int index = 0; // 인덱스 변수 [반복순서 체크]
		// 모든 게시물조회
			for(Board board : boardlist) { // for s
				if(board != null) { // if s
				System.out.printf("%d\t%s\t%s \n", index, board.context, board.title);
				} // if e , %숫자s : 숫자만큼 자리 차지[만약에 해당 데이터
				index++;
			} // for e
			
		// 글쓰기와 글보기 메뉴
		System.out.println("\n1. 글쓰기	2. 글보기");
		System.out.println("------------------------");
		int select = scanner.nextInt();
		if (select == 1) { // 1. 글쓰기 if1 s
			// 1. 4개 변수를 입력받음
			System.out.println("----- 글 쓰기 페이지 -----");
			System.out.println("제목 : ");	String title = scanner.next();
			System.out.println("내용 : ");	String context = scanner.next();
			System.out.println("작성자 : ");	String writer = scanner.next();
			System.out.println("비밀번호 : ");	String pw = scanner.next();
			// 2. 4개 변수를 객체화
			Board board = new Board(title, context, writer, pw);
						// 4개 필드를 갖는 생성자 사용
			// 3. 배열내 빈공간을 찾아서 빈공간에 객체대입
				int i = 0;
				for( Board temp : boardlist) { // for2 s
				if(temp == null) { // if2 s -> 빈 공간을 찾으면
					boardlist[i] = board; // 해당 인덱스에 새로운 객체 저장
					break; // 한번 저장하면 반복문 종료
					} // if2 e	
					i++;
				} // for2 e
			} // if1 e
		else if(select == 2) { // 2-1. 글보기 : 해당 글번호 출력(인덱스) -> 배열에 저장되는 순서
								// -> 해당 글번호 입력받아 해당 글 상세페이지 출력
								// . 글보기 메뉴 : 1. 목록보기 2. 삭제 3. 수정
								// 2-2 삭제시 : 비밀번호 입력받아 동일하면 삭제
								// 2-3 수정시 : 작성자 비밀번호 입력받아 동일하면 제목만 내용만 수정
			System.out.println("게시물 번호를 입력해주세요");
			int bno = scanner.nextInt(); // 현 게시물 인덱스번호(=배열내 인덱스 값)
			System.out.printf("작성자 : %s   제목 : %s\n", boardlist[bno].writer, boardlist[bno].title);
			System.out.printf("내용 : %s\n" ,boardlist[bno].context);
			// 반복문 사용 목적 X -> 출력할위치[인덱스] 입력 받았기 때문에 -> 입력받은 인덱스 위치에 객체 출력
			System.out.println("------ 글보기 메뉴 -----");
			System.out.println("1. 목록보기(뒤로가기) 2. 삭제 3. 수정");
			System.out.println("-----> 선택 : ");
			int select2 = scanner.nextInt();
			if(select2 == 1) { // if 1 s // 위에 반복문이 없기 때문에 아무것도 작성하지 않아도 뒤로 가게 됨
				int index2 = 0;
				for(Board board : boardlist) { // for s
					if(board != null) { // if2 s
					System.out.printf("%d\t%s\t%s \n", index2, board.context, board.title);
					break;
					} // if2 e
				} // for e	
				index2++;
			
			} // select2 == 1 e
			
			if(select2 == 2) { // 삭제
				System.out.println("알림)) 현 게시물 비밀번호 : "); String pw = scanner.next();
				// 반복문 사용 X -> 삭제할 인덱스 위치를 입력받았기 때문 [검색 X]
				if(boardlist[bno].pw.equals(pw)) { // 게시물 객체내 비밀번호 == 입력한 비밀번호, if 1 s
					System.out.println("알림)) 삭제 성공");
					boardlist[bno] = null; // 해당 게시물에 null 대입 // 삭제 처리. 
					for(int i = bno; i<=boardlist.length; i++) 
						// 검색된 겟물의 인덱스부터 마지막인덱스까지 1씩증가
					{ // for s
						boardlist[bno] = boardlist[bno+1]; // 삭제된 게시물 다음 게시물
						// 삭제후에 삭제된 인덱스 뒤로 한칸씩 앞으로 이동
						// 만약에 해당 코드 없을 경우 배열내 사이사이에 공백 발생
						// *만약 2번 인덱스 삭제시 : 2번->3번 ~~ 99번 -> 100번인덱스 못넣음(배열길이가 100이라) : null 출력
						if(bno == boardlist.length-1) boardlist[boardlist.length-1] = null; 		
						// bno 마지막인덱스 이면 마지막인덱스에는 null 대입
						// 마지막 인덱스가 아니면 인덱스 당기기
						} // for e
							} // if 1 e
				else { System.out.println("알림)) 비밀번호가 다릅니다 [삭제실패]"); }
				} // 삭제 e
			
			if(select2 == 3) { // 수정 s
				System.out.println("알림)) 현 게시물 비밀번호 : "); String pw = scanner.next();
				if(boardlist[bno].pw.equals(pw)) { // 게시물 객체내 비밀번호 == 입력한 비밀번호
					// 해당 게시물의 제목과 내용을 새로 입력받아 현 게시물 객체 내 제목과 내용에 대입
					System.out.println("수정할 제목을 입력하세요");
					boardlist[bno].title = scanner.next(); 
					System.out.println("수정하여 올릴 게시글을 입력해주세요");
					boardlist[bno].context = scanner.next(); 
					System.out.println("알림)) 내용이 수정되었습니다.");
					// 해당 게시물에 null 대입 // 삭제 처리
							}
				else { System.out.println("알림)) 비밀번호가 다릅니다 [수정실패]"); }
			
						} // 수정 e 
			else {System.out.println("알 수 없는 번호 입니다 [재입력]");}
					
			} // 글보기 e
		else System.err.println("알림)) 알 수 없는 번호입니다.");
		} // w e
	} // me	
}// ce
