package Day11;

import java.util.ArrayList;

public class Controller
{
// ��� �޼ҵ�� static
	// 0. �Խù� ����Ʈ[��� �Խù��� ��� ����Ʈ]
	public static ArrayList<Board> boardlist 
	= new ArrayList<>();
	// 1. ���
	public static void list() {}
	// 2. ����
	public static void write(String ����, String ����, String �ۼ���, String ��й�ȣ) {
			// 1. ��üȭ [������ 4�� -> 1�� ��ü]
		Board board = new Board(����, ����, ��й�ȣ, �ۼ���);
			// 2. ����Ʈ�� ����
		boardlist.add(board);
			// 3. ���Ͽ� ����
	}
	// 3. ����
	public static void view() {}
	// 4. ����
	public static void update() {}
	// 5. ����
	public static void delate() {}
	// 6. ��۾���
	public static void replywrite() {}
	// 7. �Խù����� 
	public static void save() {}
	// 8. �Խù��ҷ�����
	public static void load() {}
	
}
