package Day07;

public class Book {
	// 1. �ʵ�
		// ISBN [������ȣ = �ĺ���ȣ]
		// ������, �۰�, �����뿩����, �뿩��ID 
	String ISBN;
	String bname;
	String writer;
	boolean rent;
	String rentid;
	// 2. ������
	Book() {} // �⺻������ : �޼ҵ� ȣ���
	public Book(String iSBN, String bname, String writer, boolean rent, String rentid) {
		ISBN = iSBN;
		this.bname = bname;
		this.writer = writer;
		this.rent = rent;
		this.rentid = rentid;
	}  // ��� �ʵ带 ���� ������ : ������Ͻ� ���
	
	// 3. �޼ҵ�
		// 1. �����˻�
	void �����˻�() {}
		// 2. �������
	void �������() {
		System.out.println("������� ������");
		System.out.println("ISBN\t ������\t �۰�\t �뿩���ɿ���");
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp != null) { // ������ �����ϸ�
			if(temp.rent) // �����뿩�� �����ϸ�
			System.out.println(temp.ISBN + "\t" + temp.bname + "\t"+ temp.writer +"\t"+ "����");
			else // �ش� �����뿩���ΰ� false 
			{System.out.println(temp.ISBN + "\t" + temp.bname + "\t"+ temp.writer +"\t"+ "�Ұ���");}
			}
		}
	}
		// 3. �����뿩
	void �����뿩(String loginid) {
		System.out.println("�뿩�� ������ ISBN�� �Է����ּ���");
		String ch = Day07_5_BookApplication.scanner.next();
		for(Book temp : Day07_5_BookApplication.books) {
		if(temp != null && temp.ISBN.equals(ch)) {
			System.out.println("�ش� ���� �뿩�մϴ�.");
			temp.rent = false; // �뿩��
			temp.rentid = loginid;// ���� �α����� ���̵�
			return;
		}
		else {System.out.println("�˸�]] �ش� ������ �뿩���Դϴ�."); return;}
		}
		System.out.println("�˸�]] ������ ���� ISBN�� �����ϴ�.");
	}
		// 4. �����ݳ�
	void �����ݳ�() {
		
	}
		// 5. �������
	void �������() {
		System.out.println("ISBN�� �Է����ּ���"); 	String ISBN = Day07_5_BookApplication.scanner.next();
		System.out.println("���� �̸��� �Է����ּ���"); 		String bname = Day07_5_BookApplication.scanner.next();
		System.out.println("���� �۰��� �Է����ּ���"); 	String writer = Day07_5_BookApplication.scanner.next();
		Book book = new Book(ISBN , bname, writer, true, null);
		
		// ���̵� �ߺ�üũ
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp != null && temp.ISBN.equals(ISBN)) {
				// ���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ�
				System.out.println("���� ������� ISBN �Դϴ�.");
				return; // ���̵� �ߺ��Ǿ��� ������ ����
			}
				
		}
		int i = 0;
		for(Book temp : Day07_5_BookApplication.books)
			//= for(Member temp : Day07_5_BookApplication.members)
			{
				if(temp == null) {
					Day07_5_BookApplication.books[i] = book;
				return;
				} 
			 i++;	
			}
		return;
	}
		// 6. ��������
	void ��������() {}
}
