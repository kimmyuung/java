package Day07_5����;

public class Member3 {
	// 1-2. member	: �ʵ�(ȸ����ȣ, ���̵�, ���, �̸�, ����ó) 
		 // �޼ҵ�(ȸ������, �α���, ���̵� ã��, ��� ã��, �α׾ƿ�)
		String imem;
		String id;
		String pw;
		String name;
		String phone;
		public Member3(String imem, String id, String pw, String name, String phone) {
			super();
			this.imem = imem;
			this.id = id;
			this.pw = pw;
			this.name = name;
			this.phone = phone;
		}
		Member3 () {}
		
		void ȸ������ () {
			System.out.println("ȸ������ ������");
			System.out.println("���̵� : "); 			String id = �����뿩���α׷�����_3.sc.next();
			System.out.println("��� : ");			String pw = �����뿩���α׷�����_3.sc.next();
			System.out.println("�̸� : ");			String name = �����뿩���α׷�����_3.sc.next();
			System.out.println("�ڵ�����ȣ : ");		String number = �����뿩���α׷�����_3.sc.next();
			int i = 0;
			for(Member3 temp : �����뿩���α׷�����_3.memberlist) {
				if(temp == null) {
					Member3 member = new Member3("i", id, pw, name, number);
					�����뿩���α׷�����_3.memberlist[i] = member;
					System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
					break;
				}
			i++;}
		}
		String �α��� () {
			System.out.println("�α��� ������");
			System.out.println("���̵� : "); 			String id2 = �����뿩���α׷�����_3.sc.next();
			System.out.println("��� : ");			String pw = �����뿩���α׷�����_3.sc.next();
			int i = 0;
			for(Member3 temp : �����뿩���α׷�����_3.memberlist) {
				if(temp != null && �����뿩���α׷�����_3.memberlist[i].id.equals(id2) && �����뿩���α׷�����_3.memberlist[i].pw.equals(pw)) 
				{
				System.out.println("�α���");	return id2;
				}
			i++;}
			return null;
		}
		void ���̵�ã�� () {
			System.out.println("���̵� ã�� ������");
			System.out.println("�̸� : ");			String name = �����뿩���α׷�����_3.sc.next();
			System.out.println("�ڵ�����ȣ : ");		String number = �����뿩���α׷�����_3.sc.next();
			int i = 0;
			for(Member3 temp : �����뿩���α׷�����_3.memberlist) {
				if(temp != null && �����뿩���α׷�����_3.memberlist[i].name.equals(name) && �����뿩���α׷�����_3.memberlist[i].phone.equals(number)) 
				{
				System.out.println("���̵�  : " + �����뿩���α׷�����_3.memberlist[i].id);	 
				}
			i++;}
		}
		void ���ã�� () {
			System.out.println("��й�ȣ ã�� ������");
			System.out.println("���̵� : ");	        String id = �����뿩���α׷�����_3.sc.next();
			System.out.println("�̸� : ");			String name = �����뿩���α׷�����_3.sc.next();
			System.out.println("�ڵ�����ȣ : ");		String number = �����뿩���α׷�����_3.sc.next();
			int i = 0;
			for(Member3 temp : �����뿩���α׷�����_3.memberlist) {
				if(temp != null && �����뿩���α׷�����_3.memberlist[i].name.equals(name) && �����뿩���α׷�����_3.memberlist[i].phone.equals(number)
						&& �����뿩���α׷�����_3.memberlist[i].id.equals(id)) 
				{
				System.out.println("��й�ȣ : " + �����뿩���α׷�����_3.memberlist[i].pw);	 
				}
			i++;}
		}
		void �α׾ƿ� () {
			System.out.println("�α׾ƿ�!");
		}
}
