package Day11;

import java.util.ArrayList;

public class Controller
{
// 모든 메소드는 static
	// 0. 게시물 리스트[모든 게시물을 담는 리스트]
	public static ArrayList<Board> boardlist 
	= new ArrayList<>();
	// 1. 목록
	public static void list() {}
	// 2. 쓰기
	public static void write(String 제목, String 내용, String 작성자, String 비밀번호) {
			// 1. 객체화 [변수가 4개 -> 1개 객체]
		Board board = new Board(제목, 내용, 비밀번호, 작성자);
			// 2. 리스트에 저장
		boardlist.add(board);
			// 3. 파일에 저장
	}
	// 3. 보기
	public static void view() {}
	// 4. 수정
	public static void update() {}
	// 5. 삭제
	public static void delate() {}
	// 6. 댓글쓰기
	public static void replywrite() {}
	// 7. 게시물저장 
	public static void save() {}
	// 8. 게시물불러오기
	public static void load() {}
	
}
