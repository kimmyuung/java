package Day10_5_����;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_����5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Book> booklist = new ArrayList<Book>();
	
	while(true) {
		System.out.println("���� ���α׷�");
		System.out.println("1. ���� ��� 2. ���� ��� 3. ���� ���� 4. ���� ����");
		int ch = sc.nextInt();
		if(ch ==1) {
			System.out.println("���� ��� ������");
			System.out.println("����� ������ �̸��� �Է����ּ���");
			String name = sc.next();
			System.out.println("����� ������ ���ڸ� �Է����ּ���");
			String writer = sc.next();
			boolean pass = true;
			for(Book temp : booklist) {
				if(temp.get������().equals(name)) {
					System.out.println("�������� �ߺ��˴ϴ�.");
					pass = false;
				}
			}
			if (pass) {
				System.out.println("���� ��� ����!");
				Book book = new Book(name, writer);
				booklist.add(book);
			}
		}
		else if(ch == 2) {
			System.out.println("���� ���");
			for(Book temp : booklist) {
				System.out.println(temp.get������() + " " + temp.get����());
			}
		}
		else if(ch == 3) {
			System.out.println("���� ���� ������");
			System.out.println("������ ������ �̸��� �Է����ּ���");
			String name = sc.next();
			for(Book temp : booklist) {
				if(temp.get������().equals(name)) {
					System.out.println("���� ����!");
					booklist.remove(temp);
				}
				else System.out.println("���� ����!");
			}
		}
		else if(ch == 4) {
			System.out.println("���� ���� ������");
			System.out.println("�ٲ� ���� �̸��� �Է����ּ���");
			String writer = sc.next();
			System.out.println("�ٲ� ������ �̸��� �Է����ּ���");
			String wirter1 = sc.next();
			for(Book temp : booklist) {
				if(temp.get����().equals(writer)) {
					temp.set����(wirter1);
					System.out.println("���� ���� ����!");
				}
				else System.out.println("���� ���� ����!");
			}
		}
		else System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
	}
	
}
}
