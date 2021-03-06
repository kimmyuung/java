package Day11_4연습;

import java.util.Scanner;

public class Day11_4연습_1 {
	// 게시판 + 댓글 프로그램 [ 예외처리, 파일처리, 리스트 ]
		// 게시물 클래스
		// 제목, 내용, 비밀번호, 작성자, 작성일, 조회수, 댓글리스트
		// 댓글리스트
		// 댓글 클래스
		// 내용, 패스워드, 작성자, 작성일
		// 컨트롤러 클래스
		// 1. 목록 2. 쓰기 3. 보기 4. 수정 5. 삭제 6. 댓글쓰기
		// 7. 게시물 저장 8. 게시물 불러오기 9. 댓글 저장 10. 댓글불러오기
		// Day11_4_BoardApp 클래스 : 컨트롤러 메소드 호출, 입출력 [입력받아 컨트롤러에게 입력받은 값 전달]
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		컨트롤러_1 con = new 컨트롤러_1();
		con.boardload(); // 파일 불러오기
		
		while(true) {
			try {
				// 모든 게시물 출력
				System.out.printf("%s\t%10s\t%10s\t%10s\t%10s \n","번호","제목","작성자","작성일","조회수");
				int i = 0; // 리스트내 인덱스
				for(Day11.Board temp : con.boardlist) {
					System.out.printf("%d\t%10s\t%10s\t%10s\t%10s \n", i, temp.getTitle(),temp.getWriter(),temp.getDate(),temp.getViewcount());
					i++;
				}
				
				
				
				System.out.println("1.쓰기 2.보기 선택 : ");
				int ch = scanner.nextInt();
				if(ch==1) {
					System.out.println("*** 게시물 등록 ***");
					scanner.nextLine(); 
					// nextLine : 공백 포함 입력 가능
					// [ 문제! : nextLine 앞에 일반 next 하나로 취급] -> 중간에 일반 next와 nextLine 사이에 nextLine 추가 
					System.out.println(" 제목 : "); String title = scanner.nextLine();
					System.out.println(" 내용 : "); String content = scanner.nextLine();
					System.out.println(" 작성자 : "); String writer = scanner.next();
					System.out.println(" 비밀번호[수정/삭제시] : "); String pw = scanner.next();
					
					con.write(title, content, writer, pw); // 인수 전달
					
				} // if end
				else if(ch==2) {
					// 해당 게시물 번호[인덱스]를 입력받아 게시물정보 모두 출력
					System.out.println("글번호 입력 : "); int ch3 = scanner.nextInt();
					Day11.Board temp = con.boardlist.get(ch3);
					System.out.printf("%s\t%10s\t%10s\t%10s\t%10s \n","번호","제목","작성자","작성일","조회수");
					System.out.printf("%d\t%10s\t%10s\t%10s\t%10s \n",
							ch3, temp.getTitle() ,temp.getWriter(),temp.getDate(),temp.getViewcount());
					System.out.println("내용 : "+temp.getContent());
					 // 댓글출력 [추후]
					System.out.println("-----------------------------댓글창--------------------------------");
					con.replyload();
					int j=0;
					for(댓글 temp2 : con.replist) {
						if(con.replist.get(j).equals(temp2) ) {
							System.out.println("번호 : "+j+"\t작성자 : "+temp2.getRwriter()+"\t내용 : "+temp2.getReply()+"\t작성일 : "+temp2.getRdate());
						}
						j++;
						
					}
					
					System.out.println("1.뒤로가기 2.수정 3.삭제 4.댓글쓰기 5.댓글수정 6.댓글삭제");
					int ch2 = scanner.nextInt();
					
					if(ch2==1) {}
					else if(ch2==2) { // 수정할 인덱스 번호, 패스워드, 수정할 제목, 수정할 내용
						System.out.println("비밀번호 입력 : "); String pw = scanner.next();
						scanner.nextLine();
						System.out.println("수정할 제목 입력 : "); String title = scanner.nextLine();
						System.out.println("수정할 내용 입력 : "); String content = scanner.nextLine();
						boolean result = con.update(ch3,pw,title,content);
						if(result) {
							System.out.println("알림)) 해당 게시글이 수정되었습니다.");
						}
						else System.out.println("알림)) 비밀번호가 일치하지 않습니다.");
						
					}
					else if(ch2==3) { // 삭제할 인덱스 번호, 패스워드
						System.out.println("비밀번호 입력 : "); String pw = scanner.next();
						boolean result = con.delete(ch3,pw);
						if(result) {
							System.out.println("알림)) 해당 게시글이 삭제되었습니다.");
						}
						else System.out.println("알림)) 비밀번호가 일치하지 않습니다.");
					}
					else if(ch2==4) { // 인덱스 번호, 댓글 내용, 댓글 패스워드, 댓글작성자 
						scanner.nextLine();
						System.out.println("댓글 내용 : "); String content = scanner.nextLine();
						System.out.println("작성자 : "); String writer = scanner.nextLine();
						System.out.println("비밀번호 : "); String pw = scanner.next();
						con.replywrite(ch3,content,writer,pw);
						System.out.println("알림)) 댓글 작성이 완료되었습니다.");
						
					}
					else if(ch2==5) {
						System.out.println("댓글번호 입력 : "); int ch4 = scanner.nextInt();
						System.out.println("비밀번호 입력 : "); String pw = scanner.next();
						scanner.nextLine();
						System.out.println("수정할 내용 입력 : "); String content = scanner.nextLine();
						boolean result = con.replyupdate(ch4,pw,content);
						if(result) {
							System.out.println("알림)) 해당 게시글이 수정되었습니다.");
						}
						else System.out.println("알림)) 비밀번호가 일치하지 않습니다.");
					}
					else if(ch2==6) {
						System.out.println("댓글번호 입력 : "); int ch4 = scanner.nextInt();
						System.out.println("비밀번호 입력 : "); String pw = scanner.next();
						boolean result = con.replydelete(ch4,pw);
						if(result) {
							System.out.println("알림)) 해당 댓글이 삭제되었습니다.");
						}
						else System.out.println("알림)) 비밀번호가 일치하지 않습니다.");
					}
					else System.out.println("알림)) 알 수 없는 번호입니다.");
					
				} // else if end 게시물 보기
				else System.out.println("알림)) 알 수 없는 번호입니다.");
			}catch(Exception e) {
				System.out.println("알림)) 잘못된 입력입니다.");
			}
			
		} // while end
	}
}
