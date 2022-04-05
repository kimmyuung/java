package Day11_4����;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import Day11.Board;

public class ��Ʈ�ѷ�_1 {

	// ��Ʈ�ѷ� Ŭ����
			// 1. ��� 2. ���� 3. ���� 4. ���� 5. ���� 6. ��۾���
			// 7. �Խù� ���� 8. �Խù� �ҷ����� 9. ��� ���� 10. ��ۺҷ�����
	
	// ��� �޼ҵ�� static 
	
		// �Խù� ����Ʈ
		public static ArrayList<Board> boardlist = new ArrayList<>();
		// ��� ����Ʈ
		public static ArrayList<���> replist = new ArrayList<>();

		
		
		// 2. ����޼ҵ�
		public static void write(String title, String content, String writer, String pw) {
			// 1. ��üȭ
			Board board = new Board(title, content, pw, writer);
			// 2. ����Ʈ�� ���� 
			boardlist.add(board);
			// 3. ���Ͽ� ����
			boardsave();
		}	
		
		// 4. �����޼ҵ�
		public static boolean update(int ch3, String pw, String title, String content) {
			if(boardlist.get(ch3).getPassword().equals(pw)) {
				boardlist.get(ch3).setTitle(title);
				boardlist.get(ch3).setContent(content);
				boardsave();
				return true;
			}
			else return false;
		}
		// 5. �����޼ҵ�
		public static boolean delete(int ch3, String pw) {
			if(boardlist.get(ch3).getPassword().equals(pw)) {
				boardlist.remove(ch3);
				boardsave();
				return true;
			}
			else return false;
		}
		// 6. ��۾���޼ҵ�
		public static void replywrite(int ch3, String content, String writer, String pw) {
			
			��� reply = new ���(content, pw, writer, null);
			replist.add(reply);
			replysave();
			
		}
		// 7. �Խù� ����/���� �޼ҵ�
		public static void boardsave() {
			
			// ����Ʈ�� ��� �Խù��� ���Ͽ� ����
			try {
				// 1. ������� Ŭ����
				FileOutputStream outputStream = new FileOutputStream("D:/java/�Խù�����.txt");
				// 2. ���Ͽ� �ۼ��� ���� [ ���پ� = �Խù� 1���� = ��ü 1���� ]
				for(Board board : boardlist) {
					String �ۼ����� = board.getTitle()+","+board.getContent()+","+board.getPassword()+","
							+board.getWriter()+","+board.getViewcount()+","+board.getDate()+"\n";
				// 3. ����[���ڿ�] -> ����Ʈ�� ��ȯ [ �ܺ����(��Ʈ��) : ��Ŵ��� : ����Ʈ ]
				// 4. �������� [ write() ]
					outputStream.write(�ۼ�����.getBytes());
				}
			}catch(Exception e) {
				System.out.println("�˸�)) ���� ���� ����(�����ڿ��� ����)");
			}
		}
		// 8. �Խù��ҷ�����޼ҵ� [���α׷� ����] ���� --> ����Ʈ
		public static void boardload() {
			try {
				// 1. ���� �Է� Ŭ����
				FileInputStream fileInputStream = new FileInputStream("D:/java/�Խù�����.txt");
				// 2. ����Ʈ �迭 ����
				byte[] bytes = new byte[1024];
				// 3. ��� ����Ʈ �о�ͼ� ����Ʈ�� ����
				fileInputStream.read(bytes);
				// 4. ����Ʈ -> ���ڿ� ��ȯ
				String file = new String(bytes);
				// 5. ���ڿ� �ڸ��� [ ���پ�(\n) -> 1����ü ]
				String[] boards = file.split("\n");
				// 6. ���ڿ� �ڸ��� [ (,) -> �� �ʵ� ]
				int i=0; // �ε�����
				for(String temp : boards) { 
					if(i+1==boards.length) break;			
					String[] field = temp.split(",");
					// 7. ��üȭ
					Board board = new Board(field[0], field[1], field[2], field[3],Integer.parseInt(field[4]),field[5], null);
					// 8. ����Ʈ ���
					boardlist.add(board);
					i++; // �ε��� ����
				}
				
			} catch(Exception e) {
				System.out.println("�˸�)) ���� �ε� ����(�����ڿ��� ����)");
			}
		}
		// 9. �������޼ҵ�
		public static void replysave() {
			// ����Ʈ�� ��� �Խù��� ���Ͽ� ����
					try {
						// 1. ������� Ŭ����
						FileOutputStream outputStream = new FileOutputStream("D:/java/�������.txt");
						// 2. ���Ͽ� �ۼ��� ���� [ ���پ� = ��� 1���� = ��ü 1���� ]
						for(��� reply : replist) {
							String �ۼ����� = reply.getReply()+","+reply.getPw()+","+reply.getRwriter()+","+reply.getRdate()+"\n";
						// 3. ����[���ڿ�] -> ����Ʈ�� ��ȯ [ �ܺ����(��Ʈ��) : ��Ŵ��� : ����Ʈ ]
						// 4. �������� [ write() ]
							outputStream.write(�ۼ�����.getBytes());
						}
					}catch(Exception e) {
						System.out.println("�˸�)) ��� ���� ����(�����ڿ��� ����)");
					}
		}
		// 10. ��ۺҷ�����޼ҵ�
		public static void replyload() {
			try {
				// 1. ���� �Է� Ŭ����
				FileInputStream fileInputStream = new FileInputStream("D:/java/�������.txt");
				// 2. ����Ʈ �迭 ����
				byte[] bytes = new byte[1024];
				// 3. ��� ����Ʈ �о�ͼ� ����Ʈ�� ����
				fileInputStream.read(bytes);
				// 4. ����Ʈ -> ���ڿ� ��ȯ
				String file = new String(bytes);
				// 5. ���ڿ� �ڸ��� [ ���پ�(\n) -> 1����ü ]
				String[] replis = file.split("\n");
				// 6. ���ڿ� �ڸ��� [ (,) -> �� �ʵ� ]
				int i=0; // �ε�����
				for(String temp : replis) { 
					if(i+1==replis.length) break;			
					String[] field = temp.split(",");
					// 7. ��üȭ
					��� reply = new ���(field[0], field[1], field[2], field[3]);
					// 8. ����Ʈ ���
					replist.add(reply);
					i++; // �ε��� ����
				}
				
			} catch(Exception e) {
				System.out.println("�˸�)) ���� �ε� ����(�����ڿ��� ����)");
			}
		}
		
		// 11. ��� �����޼ҵ�
			public static boolean replyupdate(int ch4, String pw, String content) {
				if(replist.get(ch4).getPw().equals(pw)) {
					replist.get(ch4).setReply(content);
					replysave();
					return true;
				}
				else return false;
			}
			// 12. ��� �����޼ҵ�
			public static boolean replydelete(int ch4, String pw) {
				if(replist.get(ch4).getPw().equals(pw)) {
					replist.remove(ch4);
					replysave();
					return true;
				}
				else return false;
			}
		
		
		
		
		
	} // c e

