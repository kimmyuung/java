package Day08;

import java.util.Scanner;


public class Member {
	
	// �ʵ�
	String id;
	String password;
	String name;
	String phone;

	//������
	public Member () {}
	
	public Member(String id, String password, String name, String phone) {
		
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	// �޼ҵ� 
	//ȸ���ֿ���: 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
		///ȸ������
		boolean ȸ������ (){
			System.out.println("------ȸ������------");
			System.out.println("���̵�: "); String id = Day08_5.scanner.next();
			System.out.println("��й�ȣ: "); String password = Day08_5.scanner.next();
			System.out.println("�̸�: ");		String name = Day08_5.scanner.next();
			System.out.println("����ó: "); String phone = Day08_5.scanner.next();
			
			////���̵� �ߺ�
			for(Member temp: Day08_5.members) {
				if(temp != null) {
					System.out.println("���� ������� ���̵��Դϴ�.");
					return false;
				}
			}
			
			///ȸ������ ����
			Member member = new Member(id, password, name, phone);
			
			int  i =0;
			for(Member temp : Day08_5.members) {
				if(temp==null) {
					System.err.println("ȸ������ �Ϸ�");
					Day08_5.members[i]= member;
					return true;
				}
				i++;
			}
			
			return false;
			
		}
		///�α���
		String �α���() {
			System.out.println("----�α��� ������-----"); 
			System.out.println("���̵�: "); String id = Day08_5.scanner.next();
			System.out.println("��й�ȣ: "); String password = Day08_5.scanner.next();
		
		
		/////�α��� ����
			for(Member temp : Day08_5.members) {
				if(temp!=null && temp.id.equals(id) && temp.password.equals(password)) {
					System.out.println("�α��� ����");
					return temp.id;
				}
				
			}
		/////�α��� ����
			return null;
		
		}
		
		///���̵�ã��
		void ���̵�ã��() {
			System.out.println(" ----- ���̵�ã�� ������ ------");
			System.out.println("�̸�: "); String name =Day08_5.scanner.next();
			System.out.println("��ȭ��ȣ: "); String phone = Day08_5.scanner.next();
		///���̵� ã�� ����
			for(Member temp : Day08_5.members) {
				if(temp!=null && temp.name.equals(name)&&temp.phone.equals(phone)) {
				System.out.println("ȸ������ ���̵�: " + temp.id);
				return;
				}
			}	
			
		///���̵�ã�� ����
			System.out.println("������ ȸ�������� �����ϴ�.");
		
		}
		////��й�ȣã��
		void ��й�ȣã��() {
			System.out.println(" ----- ��й�ȣã�� ������ ------");
			System.out.println("���̵�: "); String id =Day08_5.scanner.next();
			System.out.println("��ȭ��ȣ: "); String phone = Day08_5.scanner.next();
		///���̵� ã�� ����
			for(Member temp : Day08_5.members) {
				if(temp!=null && temp.id.equals(id)&&temp.phone.equals(phone)) {
				System.out.println("ȸ������ ��й�ȣ: " + temp.password);
				return;
				}
			}	
			
		//��й�ȣã�� ����
			System.out.println("������ ȸ�������� �����ϴ�.");
		
		}
		
	
	
}
