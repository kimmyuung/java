package Day07;

public class Member {
		// 1. �ʵ� : ȸ����ȣ, ���̵�, ��й�ȣ, �̸�, ����ó
	int mno;
	String id;
	String pw;
	String name;
	String phone;
		// 2. ������ : ����
	public Member () {}
	// �޼ҵ�ȣ��� ��ü������
	public Member (int mno, String id, String pw, String name, String phone) {
		
		this.mno = mno;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	} // ��� �ʵ带 �޴� ������ : ȸ�����Կ� ��ü������

	// 3. �޼ҵ� : ȸ������, �α���, ���̵�ã��, ���ã��, ȸ��Ż��
	boolean join(){ // ���Լ��� True. ���Խ��� False
		System.out.println("----- ȸ�� ���� ������ -----");
		System.out.println("���̵� �Է����ּ���"); 		String id = Day07_5_BookApplication.scanner.next();
		// ���̵� �ߺ�üũ
				for(Member temp : Day07_5_BookApplication.members) {
					if(temp != null && temp.id.equals(id)) {
						// ���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ�
						System.out.println("���� ������� ���̵� �Դϴ�.");
						return false; // ���̵� �ߺ��Ǿ��� ������ ����
					}
						
				}
		System.out.println("��й�ȣ�� �Է����ּ���"); 	String pw = Day07_5_BookApplication.scanner.next();
		System.out.println("�̸��� �Է����ּ���"); 		String name = Day07_5_BookApplication.scanner.next();
		System.out.println("�ڵ�����ȣ�� �Է����ּ���"); 	String phone = Day07_5_BookApplication.scanner.next();
		// *scanner ��ü�� �ٸ� Ŭ������ static ����Ǿ� ���� * Ŭ������.�ʵ��.�Լ���();
		Member member = new Member(mno ,id, pw, name, phone);
		// ��� �ʵ� �޴� �����ڷ� ��ü ����
		
		// ȸ����ȣ �ڵ����� [��������ȣ�� + 1, ���� �ֱٿ� ������ ȸ���� ��ȣ +1]
		int bno = 0; // ȸ����ȣ �����ϴ� ����
		int index = 0;
		for(Member temp : Day07_5_BookApplication.members) {
			 if(temp == null) { // NULL ã��[null ã���� �� null-1 �ϸ� ������ȸ��
				 if(index ==0) {bno = 1; break;}// ù��° �ε����� NULL => ù ȸ�� -> ùȸ����ȣ1�� �ο�
				bno = Day07_5_BookApplication.members[index-1].mno + 1; 
				     // null �� [������ȸ��] ��ȣ�� +1
					 break;		 
			 }
			 index++;
			}	
		
		for(int i = 0; i < Day07_5_BookApplication.members.length; i++)
		//= for(Member temp : Day07_5_BookApplication.members)
		{
			if(member == null) {
				Day07_5_BookApplication.members[i] = member;
				return true;
			} 
		}
		return false; // ȸ������ ����
	}
	String login() { // ������ ������ ���̵��ȯ, ���н� NULL
		System.out.println("----- �α��� ������ -----");
		System.out.println("���̵� �Է��ϼ��� : "); String id = Day07_5_BookApplication.scanner.next(); 
		System.out.println("��й�ȣ�� �Է��ϼ��� : ");String pw = Day07_5_BookApplication.scanner.next();
		for(Member temp : Day07_5_BookApplication.members ) {
		if(temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {
			System.out.println("�α��� ����");
			System.out.println("[1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. �α׾ƿ�]");
			return temp.id;
			}
		}
		return null; // ���н� null ��ȯ
	}
	void idcheck() {
		System.out.println("----- ���̵� ã�� ������ -----");
		System.out.println("�����Ͻ� �� �� �̸��� �����Դϱ�?"); String name = Day07_5_BookApplication.scanner.next();
		System.out.println("�����Ͻ� �� �� ����ȣ�� �����Դϱ�?"); String phone = Day07_5_BookApplication.scanner.next();
		for(Member temp : Day07_5_BookApplication.members) {
			if(temp != null && temp.name.equals(name) && temp.phone.equals(phone))
			{
				System.out.println("���̵� ã�� ���� --> ���̵� : " + temp.id);
				return; // ������ ���� ã������ �ش� �޼ҵ� ����
			}
			
		}
		System.out.println("�˸�)) ������ ȸ�������� �����ϴ�.");
	}
	void pwcheck() {
		System.out.println("----- ��й�ȣ ã�� ������ -----");
		System.out.println("�����Ͻ� �� �� ���̵�� �����Դϱ�"); String id = Day07_5_BookApplication.scanner.next();
		System.out.println("�����Ͻ� �� �� �̸��� �����Դϱ�?"); String name = Day07_5_BookApplication.scanner.next();
		System.out.println("�����Ͻ� �� �� ����ȣ�� �����Դϱ�?"); String phone = Day07_5_BookApplication.scanner.next();
		for(Member temp : Day07_5_BookApplication.members) {
			if(temp != null && temp.id.equals(id)&& temp.name.equals(name) && temp.phone.equals(phone))
			{
				System.out.println("��й�ȣ ã�� ���� --> ���̵� : " + temp.pw);
				return;
			}
			
		}
		System.out.println("�˸�)) ������ ȸ�������� �����ϴ�.");
	}
	// ȸ��Ż�� �޼ҵ�
	// ȸ������ �޼ҵ�
	
	
}	
