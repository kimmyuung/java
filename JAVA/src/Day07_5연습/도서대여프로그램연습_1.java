package Day07_5����;

import java.util.Scanner;

public class �����뿩���α׷�����_1 {
	// ���� �뿩 console ���α׷�(ver. class)
				// 1. Ŭ����
				// 1-1. book	: �ʵ�(�����ڵ�(ISBN), ������, ����, �����뿩����, �뿩ȸ��) 
							//	�޼ҵ�(���� �˻�, ���� ���, ���� �뿩, ���� �ݳ�, ������)) ���� ���, ���� ����)
				// 1-2. member	: �ʵ�(ȸ����ȣ, ���̵�, ���, �̸�, ����ó) 
								 // �޼ҵ�(ȸ������, �α���, ���̵� ã��, ��� ã��, �α׾ƿ�)
				// �α��ν� ���̵� admin�̸� �����ڸ޴�
				// 1. ���� ��� 2. ���� ����
				// + ���� ��Ͻ� ������ �Է¹޾� ���� ���ó��
				// + ���� ��Ͻ� ��� ������ ��� // ���������� ������ ������ �Է¹޾� ������ ������ ����(NULL)
				// �α׾ƿ��� �ʱ�޴���
				// 2. ȭ�� ����
					//2-1. �ʱ� �޴�[1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣ ã��]
					//2-2. �Ϲ�ȸ�� �޴�[1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. �α׾ƿ�]
					//2-3. ������ �޴�[1. ������� 2. ������� 3. �������� 4. ����(=����Ʈ����) 5. �α׾ƿ�]
	public static Book[] booklist = new Book[100];
	public static Member[] memberlist = new Member[100];
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		�����뿩���α׷�����_1 app= new �����뿩���α׷�����_1();
		app.menu();
	}
	void menu() {
		while(true) {
		System.out.println("���� �뿩 ���α׷�");
		System.out.println("1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣã�� 5. �α׾ƿ�");
		int ch = sc.nextInt();
		Member member = new Member();
		Book book = new Book();
		if(ch == 1) {
			member.ȸ������();
		}
		else if(ch == 2) {
			String result = member.�α���();
			
		if(result.equals("admin"))	{
			System.out.println("1. ������� 2. ������� 3. �������� 4. ���� 5. �α׾ƿ�");
			int ch1 = sc.nextInt();
			if(ch1 == 1) {
				book.�������();
			}
			else if(ch1 == 2) {
				book.�������();
			}
			else if(ch1 == 3) {
				book.��������();
			}
			else if(ch1 == 4) {
				book.��������();
			}
			else if(ch1 == 5) {
				System.out.println("�α׾ƿ�!"); break;
			}
			else {System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
			}
			
		else {
			System.out.println("1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. �α׾ƿ�");
			int ch1 = sc.nextInt();
			if (ch1 == 1) {
				book.�����˻�();
			}
			else if (ch1 == 2) {
				book.�������();
			}
			else if (ch1 == 3) {
				book.�����뿩();
			}
			else if (ch1 == 4) {
				book.�����ݳ�();
			}
			else if (ch1 == 5) {System.out.println("�α׾ƿ�"); break;}
			else {System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
			}
		}
		else if(ch == 3) {
			member.���̵�ã��();
		}
		else if(ch == 4) {
			member.���ã��();
		}
		else if(ch == 5) {
			member.�α׾ƿ�(); break;
		}
		else {System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
		}
	}
}
