package Day07;

import java.util.Scanner;

public class Day07_5_BookApplication {
	// *main �ۿ� ������ �����ϴ� ���� : ��� �޼ҵ忡�� ����ϱ� ����
	// �������� : {��������} ��ȣ������ ������ ������ {} ���� ������
	// �������� : ���� �ٸ� �޼ҵ�(={})���� ����ϴ� ����
	// static : ���α׷� ����ñ��� �޸� �Ҵ�
		// why? �Լ� ����� �Լ������� ���� �޸� �ʱ�ȭ(���� ����)
		// ���α׷� ���������� ������ ���Ǵ� ����(�޸�)
	static Scanner scanner = new Scanner(System.in);
	// ��, static�� ��ü�� ȣ�� ����
	static Member[] members = new Member[1000]; // ��� ���Ͽ��� ����ϴ� ȸ����� �迭
	static Book[] books = new Book[1000];
	public static void main(String[] args) { // �ڵ� �д� ���� �޼ҵ�[������]
	
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
	
	Day07_5_BookApplication app = new Day07_5_BookApplication();
	app.menu();
	// bookapplication Ŭ���� : ����� �����ڵ�
	// Book Ŭ���� : ���� ���� �ڵ�
	// Member Ŭ���� : ȸ�� ���� �ڵ�
	// menu(); 
		// main �޼ҵ� static �޼ҵ� �̱⶧���� static �żҵ常 ����ȣ�� ����
		// static : �޸� �켱�Ҵ� �̱⶧���� static  �� �޼ҵ�, �ʵ�, ������.
	//2. �ܺ�ȣ�� 
	//2-1 ��ü���� -> �޼ҵ� ȣ��
	
	} // me
	// �޼ҵ� ȣ�� : ����ȣ��, �ܺ�ȣ��
	// MVC : Model, View, Controlee
// 1. �ʱ� �޴� �޼ҵ�
void menu() {
	while(true) {
	System.out.println("------------- ���� �뿩 ���α׷� ---------------");
	System.out.println("[1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣ ã��]");
	int ch = scanner.nextInt();
	Member member = new Member(); //1~4 {}��ȣ���� ��밡��
	if(ch == 1) {
		// ȸ������ �޼ҵ� ȣ��
		boolean result = member.join();
		if(result) System.out.println("ȸ������ ����");
		else System.out.println("ȸ������ ����");
	}
	else if(ch==2) {
		String result = member.login();
		// �α��� �޼ҵ� ȣ��
		// 1. �Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
		// 2. ������ �޴� �޼ҵ� ȣ��
		if(result == null) {
			System.out.println("�˸�)) ������ ȸ�������������ϴ�.");
		}
		else if(result.equals("admin")) {
			System.out.println("�˸�)) �����ڸ��� �α����մϴ�.");
			admin();
		}
		else if(result != null) {
			System.out.println("�α����� �����Ͽ����ϴ�.");
			System.out.println("�ȳ��ϼ��� " + result + "��");
			normal(result);
		}
		
	}
	else if(ch==3) {
		// ���̵� ã�� �޼ҵ� ȣ��
		member.idcheck();
	}
	else if(ch==4) {
		// ��� ã�� �޼ҵ� ȣ��
		member.pwcheck();
	}
	else {
		System.err.println("�˼� ���� ��ȣ�Դϴ�.");
			}
		}
	}
// 2. �Ϲ� ȸ�� �޴� �޼ҵ�
void normal(String loginid) {
	while(true) {
	System.out.println("------------- ȸ�� �޴� ---------------");
	System.out.println("[1. ���� �˻� 2. ���� ��� 3. ���� �뿩 4. ���� �ݳ� 5. �α� �ƿ�]");
	System.out.println(">>>>>> ���� : ");	 int ch = scanner.nextInt();
	Book book = new Book(); 
	if(ch == 1) {
		book.�����˻�();
	}
	else if(ch == 2) {
		book.�������();
	}
	else if(ch == 3) {
		book.�����뿩(loginid);
	}
	else if(ch == 4) {
		book.�����ݳ�();
	}
	else if(ch==5) {return;}
	else System.out.println("�˸�]] �� �� ���� ��ȣ�Դϴ�.");
		}
	}
// 3. ������ �޴� �޼ҵ�
void admin() {
	System.out.println("------------- ������ �޴� ---------------");
	System.out.println("[1. ���� ��� 2. ���� ��� 3. ���� ���� 4. �α׾ƿ�]");
	System.out.println(">>>>>> ���� : "); int ch = scanner.nextInt();
	Book book = new Book();	
	if(ch == 1) {
			book.�������();
		}
		else if(ch == 2) {
			book.�������();
		}
		else if(ch == 3) {
			book.��������();
		}
		else if(ch == 4) { return;}
		else System.out.println("�˸�]] �� �� ���� ��ȣ�Դϴ�.");
	}
} // ce
