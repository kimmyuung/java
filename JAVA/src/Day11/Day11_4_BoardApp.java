package Day11;

import java.util.Scanner;

public class Day11_4_BoardApp
{
	// 게시판 + 댓글 프로그램 [ 예외처리, 파일처리, 리스트 ]
	// 	게시물 클래스
			// 제목, 내용, 비밀번호, 작성자, 작성일, 조회수, 댓글리스트
			// 댓글리스트
	//	댓글 클래스
			// 내용, 패스워드, 작성자, 작성일
	//  컨트롤러 클래스
			// 1. 목록 2. 쓰기 3. 보기 4. 수정 5. 삭제 6. 댓글쓰기
			// 7. 게시물 저장 8. 게시물 불러오기 9. 댓글 저장 10. 댓글불러오기
	//  Day11_4_BoardApp 클래스 : 컨트롤러 메소드 호출, 입출력 [입력받아 컨트롤러에게 입력받은 값 전달]
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true) {
			try { // 예외발생 : 사용자가 문자입력시 예외발생 -> catch로 이동
				Controller.boardlist(); // 객체없이 메소드 호출이 되는 이유
				// static 메소드이기 때문에 가능
				System.out.println("1. 쓰기 2. 보기 :");
				int ch = sc.nextInt();
				if(ch == 1) {
					System.out.println("게시물 등록");
					sc.nextLine();
					System.out.println("제목 : "); String 제목 = sc.nextLine();
					// nextLine : 한줄을 통채로 저장 -> 건너뛰기
					// 그러나 nextLine 앞에 있는 next와 하나로 취급함
					// 해결방안 : 일반 next 와 nextLine 사이에 아무 nextLine을 추가
					System.out.println(제목); 	  
					
					System.out.println("내용 : "); String 내용 = sc.nextLine();
					System.out.println(내용);
			
					System.out.println("작성자 : "); String 작성자 = sc.next();
					System.out.println(작성자);
				
					System.out.println("비밀번호 : "); String 비밀번호 = sc.next();
					System.out.println(비밀번호);
					Controller.write(제목, 내용, 작성자, 비밀번호); // 인수 전달
				}
				else if (ch == 2) {}
				else {}
				}catch(Exception e) {
					System.out.println("메세지]] 번호로 입력해주세요"); 
					sc = new Scanner(System.in);} 
			
		}
	}
}
