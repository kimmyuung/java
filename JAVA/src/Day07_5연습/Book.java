package Day07_5����;

public class Book {
	// 1-1. book	: �ʵ�(�����ڵ�(ISBN), ������, ����, �����뿩����, �뿩ȸ��) 
	//	�޼ҵ�(���� �˻�, ���� ���, ���� �뿩, ���� �ݳ�, ������)) ���� ���, ���� ����)
	// 1. field
	String ISBN;
	String bname;
	String writer;
	String borrow;
	
	
	// 2. constructor
	public Book() {}
	
	public Book(String iSBN, String bname, String writer) {
		super();
		ISBN = iSBN;
		this.bname = bname;
		this.writer = writer;
	}

	public Book(String iSBN, String bname, String writer, String borrow) {
		super();
		ISBN = iSBN;
		this.bname = bname;
		this.writer = writer;
		this.borrow = borrow;
		
	}
	// 3. method
	void �����뿩() {
		System.out.println("���� �뿩 ������");
		System.out.println("�뿩�� ������ �̸��� �Է����ּ���");  String bname = �����뿩���α׷�����_1.sc.next();
		int i = 0;
		for(Book temp : �����뿩���α׷�����_1.booklist) {
			if(temp != null && �����뿩���α׷�����_1.booklist[i].bname.equals(bname) && �����뿩���α׷�����_1.booklist[i].borrow.equals("�뿩 ����")) {
				System.out.printf("������ �뿩�մϴ�.");
				�����뿩���α׷�����_1.booklist[i].borrow = "�뿩 ��";	
				break;
			}
		i++;}	
		
	}
	void �����˻�() {
		System.out.println("���� �˻� ������");
		System.out.println("�˻��� ������ ISBN�� �Է����ּ���"); String isbn = �����뿩���α׷�����_1.sc.next();
		System.out.println("�˻��� ������ �̸��� �Է����ּ���");  String bname = �����뿩���α׷�����_1.sc.next();
		int i = 0;
		for(Book temp : �����뿩���α׷�����_1.booklist) {
			if(temp != null) {
				System.out.printf("�˻��� ������ ã�ҽ��ϴ�." + �����뿩���α׷�����_1.booklist[i].ISBN 
						+ �����뿩���α׷�����_1.booklist[i].bname);
						break;
			}
		i++;}	
	}
	void �������() { // ��������� ���� �޼ҵ�
		System.out.println("���� ��� ������");
		int i = 0;
		for(Book temp : �����뿩���α׷�����_1.booklist) {// ���� ��� ���
			if(temp != null) { // ��������Ʈ�� null�� �ƴ϶�� ������� ���
				System.out.printf("ISBN : %s \t å ���� : \t ���� : %s \t �뿩���� : %s \n"
						, �����뿩���α׷�����_1.booklist[i].ISBN, �����뿩���α׷�����_1.booklist[i].bname,
						�����뿩���α׷�����_1.booklist[i].writer, �����뿩���α׷�����_1.booklist[i].borrow);
			}
		i++;}	
				
	}
	void �����ݳ�() {
		System.out.println("���� �ݳ� ������"); // ���� �ݳ�
		System.out.println("�ݳ��� ������ �̸��� �Է����ּ���");  String bname = �����뿩���α׷�����_1.sc.next();
		int i = 0;
		for(Book temp : �����뿩���α׷�����_1.booklist) {
			if(temp != null && �����뿩���α׷�����_1.booklist[i].bname.equals(bname) && �����뿩���α׷�����_1.booklist[i].borrow.equals("�뿩 ��")) {
				System.out.printf("������ �ݳ��մϴ�.");
				�����뿩���α׷�����_1.booklist[i].borrow = "�뿩 ����";	
				break;
			}
		i++;}	
	}
	void �������() { // ���� ��� ������
		System.out.println("���� ��� ������"); // ���� ����� ���� ISBN, ������, ���ڸ� �Է¹���
		System.out.println("ISBN : ");		String isbn = �����뿩���α׷�����_1.sc.next();
		System.out.println("������ : ");		String bname = �����뿩���α׷�����_1.sc.next();
		System.out.println("���� : ");		String writer = �����뿩���α׷�����_1.sc.next();
		int i = 0;
		for(Book temp : �����뿩���α׷�����_1.booklist) { 
			if(temp == null) {
				Book book = new Book(isbn, bname, writer, "�뿩 ����"); // ��ü�� ����
				�����뿩���α׷�����_1.booklist[i] = book; // ��ü book�� booklist�迭�� ����
				System.out.println("��������� �Ϸ�Ǿ����ϴ�."); // ������ϿϷ�
				break;
			}
		i++;}
	}
	void ��������() { // ���� ����
		System.out.println("������ ���� ������ �Է����ּ���"); String bname = �����뿩���α׷�����_1.sc.next();
		int i = 0; // ������ ���� ������ �Է¹���
		for(Book temp : �����뿩���α׷�����_1.booklist) { // ��������Ʈ�� �����̾ƴϰ� �Է¹��� ��������� �迭���� ���������� ���ٸ�
			if(temp != null && �����뿩���α׷�����_1.booklist[i].bname.equals(bname)) {
						�����뿩���α׷�����_1.booklist[i] = null; // ���� ����
			}
		i++;}	
	}
	void ��������() {}
}
