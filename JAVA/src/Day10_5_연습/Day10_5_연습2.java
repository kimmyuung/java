package Day10_5_����;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_����2 {
	// ����ƮŬ����<����Ʈ�ȿ� ������ Ŭ������>
				// <Ŭ����> : �ش� Ŭ������ ���� ��ü�� ����Ʈ�� ����
				// ���̴� ����{�⺻ : 10}
		//�޴� : 1. ��� 2. ��� 3. ���� 4. ���� ����
	public static void main(String[] args) {
		ArrayList<Book> booklist = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. ��� 2. ��� 3. ���� 4. ���� ����");
			System.out.println(">> ���� : ");
			int ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("����� å�� �̸��� �Է��ϼ���");
				String name = sc.next();
				System.out.println("����� å�� ���ڸ� �Է��ϼ���");
				String writer = sc.next();
				boolean pass = false;
				for(Book temp : booklist) {
					if(temp.get������().equals(name)) {
						System.out.println("�������� �ߺ��˴ϴ�.");
						pass = false;
					}
				}
				if(pass) {
					Book book = new Book(name, writer);
					booklist.add(book);
				}
			}
			else if(ch == 2) {
				for(Book temp : booklist) {
					System.out.println(temp.get������() + temp.get����());
				}
			}
			else if(ch == 3) {
				System.out.println("������ �������� �Է��ϼ���");
				String name = sc.next();
				for(Book temp : booklist) {
					if(temp.get������().equals(name)) {
						booklist.remove(temp);
					}
				}
			}
			else if(ch == 4) {
				System.out.println("������ ���ڸ��� �Է��ϼ���");
				String writer = sc.next();
				for(Book temp : booklist) {
					if(temp.get����().equals(writer)) {
						temp.set����(writer);
						System.out.println("���� �Ϸ�!");
					}
				}
			}
		}
	}
}
