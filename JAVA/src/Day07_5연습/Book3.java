package Day07_5����;

public class Book3 {
	// 1-1. book	: �ʵ�(�����ڵ�(ISBN), ������, ����, �����뿩����, �뿩ȸ��) 
		//	�޼ҵ�(���� �˻�, ���� ���, ���� �뿩, ���� �ݳ�, ������)) ���� ���, ���� ����)
		
		String ISBN;
		String bname;
		String writer;
		String borrow;
		
		Book3() {}
		public Book3(String iSBN, String bname, String writer, String borrow) {
			super();
			ISBN = iSBN;
			this.bname = bname;
			this.writer = writer;
			this.borrow = borrow;
		}
		void �����˻�() {
			System.out.println("�����˻� ������");
			System.out.println("������ : ");			String bname = �����뿩���α׷�����_3.sc.next();
			System.out.println("���� : ");			String writer = �����뿩���α׷�����_3.sc.next();
			int i = 0;
			for(Book2 temp : �����뿩���α׷�����_3.booklist) {
				if(temp != null && �����뿩���α׷�����_3.booklist[i].bname.equals(bname)) {
					System.out.println("ã���ô� �������� ���� ������ �˻��Ǿ����ϴ�");
					System.out.println(�����뿩���α׷�����_3.booklist[i].bname + "\t" + �����뿩���α׷�����_3.booklist[i].borrow);
				}
			i++;}
		}
		void �������() {
			int i = 0;
			for(Book2 temp : �����뿩���α׷�����_3.booklist) {
				if(temp != null && �����뿩���α׷�����_3.booklist[i].bname.equals(bname)) {
					System.out.println("���� ���");
					System.out.printf("ISBN : %s \t ������ : %s \t ���� : %s \t �뿩���� : %s \n"
							, �����뿩���α׷�����_3.booklist[i].ISBN,�����뿩���α׷�����_3.booklist[i].bname
							, �����뿩���α׷�����_3.booklist[i].writer, �����뿩���α׷�����_3.booklist[i].borrow);
				}
			i++;}
		}
		void �����ݳ�() {
			System.out.println("�����ݳ� ������");
			System.out.println("������ : ");			String bname = �����뿩���α׷�����_3.sc.next();
			int i = 0;
			for(Book2 temp : �����뿩���α׷�����_3.booklist) {
				if(temp != null && �����뿩���α׷�����_3.booklist[i].bname.equals(bname) && 
						�����뿩���α׷�����_3.booklist[i].borrow.equals("�뿩 ��")) {
					System.out.println("������ �ݳ��մϴ�.");
					�����뿩���α׷�����_3.booklist[i].borrow = "�뿩 ����";
				}
			i++;}
		}
		void �������() {
			System.out.println("������� ������");
			System.out.println("ISBN : "); 			String isbn = �����뿩���α׷�����_3.sc.next();
			System.out.println("������ : ");			String bname = �����뿩���α׷�����_3.sc.next();
			System.out.println("���� : ");			String writer = �����뿩���α׷�����_3.sc.next();
			int i = 0;
			for(Book2 temp : �����뿩���α׷�����_3.booklist) {
				if(temp == null) {
					Book2 book = new Book2(isbn, bname, writer, "�뿩 ����");
					�����뿩���α׷�����_3.booklist[i] = book;
					System.out.println("���� ��� �Ϸ�");
					break;
				}
			i++;}
		}
		void �����뿩() {
			System.out.println("�����뿩 ������");
			System.out.println("������ : ");			String bname = �����뿩���α׷�����_3.sc.next();
			int i = 0;
			for(Book2 temp : �����뿩���α׷�����_3.booklist) {
				if(temp != null && �����뿩���α׷�����_3.booklist[i].bname.equals(bname) && 
						�����뿩���α׷�����_3.booklist[i].borrow.equals("�뿩 ����")) {
					System.out.println("������ �뿩�մϴ�.");
					�����뿩���α׷�����_3.booklist[i].borrow = "�뿩 ��";
				}
			i++;}
		}
		void ��������() {
			System.out.println("�������� ������");
			System.out.println("ISBN : "); 			String isbn = �����뿩���α׷�����_3.sc.next();
			System.out.println("������ : ");			String bname = �����뿩���α׷�����_3.sc.next();
			int i = 0;
			for(Book2 temp : �����뿩���α׷�����_3.booklist) {
				if(temp != null && �����뿩���α׷�����_3.booklist[i].ISBN.equals(isbn) && 
						�����뿩���α׷�����_3.booklist[i].bname.equals(bname)) {
					�����뿩���α׷�����_3.booklist[i] = null;
					System.out.println("������ �����Ͽ����ϴ�.");
					}
				}
		}
		void ��������() {
			
		}
}
