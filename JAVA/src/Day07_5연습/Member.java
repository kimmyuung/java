package Day07_5����;

public class Member {
	// 1-2. member	: �ʵ�(ȸ����ȣ, ���̵�, ���, �̸�, ����ó) 
	 // �޼ҵ�(ȸ������, �α���, ���̵� ã��, ��� ã��, �α׾ƿ�)
	// 1. field
	int inum;
	String id;
	String pw;
	String name;
	String phone;
	// 2. constructor
	public Member(int inum, String id, String pw, String name, String phone) {
		super();
		this.inum = inum;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	public Member() {}
	// 3. method
	void ȸ������ () {
		System.out.println("ȸ������ ������ ");	
		System.out.println("���̵� : ");			String id = �����뿩���α׷�����_1.sc.next();
		System.out.println("��й�ȣ : ");			String pw = �����뿩���α׷�����_1.sc.next();
		System.out.println("�̸� : ");			String name = �����뿩���α׷�����_1.sc.next();
		System.out.println("��ȭ��ȣ : ");			String phone = �����뿩���α׷�����_1.sc.next();
		int i = 0;
		for(Member temp : �����뿩���α׷�����_1.memberlist) {
			if(temp == null) {
				Member member = new Member(i, id, pw, name, phone);
				�����뿩���α׷�����_1.memberlist[i] = member;
				System.out.println("ȸ������ �Ϸ�");
			}
		i++;}
	}
	
	String �α��� () {
		System.out.println("�α��� ������");
		System.out.println("���̵� �Է��ϼ���");		String id = �����뿩���α׷�����_1.sc.next();
		System.out.println("��й�ȣ�� �Է��ϼ���");		String pw = �����뿩���α׷�����_1.sc.next();
		int i = 0;
		for(Member temp : �����뿩���α׷�����_1.memberlist) {
			if(temp != null && �����뿩���α׷�����_1.memberlist[i].id.equals(id) && �����뿩���α׷�����_1.memberlist[i].pw.equals(pw)) 
			{
			System.out.println("�α��� ����");	return id; // ���̵� ���������� �ƴ��� Ȯ���ϱ� ���� ���̵� ��ȯ
			}
		i++;}
	return null;
	}
	void ���̵�ã��() {
		System.out.println("���̵�ã�� ������");
		System.out.println("�̸��� �Է��ϼ���");			String name = �����뿩���α׷�����_1.sc.next();
		System.out.println("��ȭ��ȣ�� �Է��ϼ���");		String phone = �����뿩���α׷�����_1.sc.next();
		int i = 0;
		for(Member temp : �����뿩���α׷�����_1.memberlist) {
			if(temp != null && �����뿩���α׷�����_1.memberlist[i].name.equals(name) && �����뿩���α׷�����_1.memberlist[i].phone.equals(phone)) {
				System.out.println("���̵� ã�� ����");
				System.out.println("���̵� : " + �����뿩���α׷�����_1.memberlist[i].id);
			}
		}
	}
	void ���ã��() {
		System.out.println("��й�ȣã�� ������");
		System.out.println("���̵� �Է��ϼ���");			String id = �����뿩���α׷�����_1.sc.next();
		System.out.println("�̸��� �Է��ϼ���");		String name = �����뿩���α׷�����_1.sc.next();
		int i = 0;
		for(Member temp : �����뿩���α׷�����_1.memberlist) {
			if(temp != null && �����뿩���α׷�����_1.memberlist[i].name.equals(name) && �����뿩���α׷�����_1.memberlist[i].id.equals(id)) {
				System.out.println("��й�ȣ ã�� ����");
				System.out.println("��й�ȣ : " + �����뿩���α׷�����_1.memberlist[i].pw);
			}
		}
	}
	void �α׾ƿ�() {
		System.out.println("�α׾ƿ�");
	}
}
