package Day10;
import java.util.ArrayList;
import java.util.Scanner;

import Day10.Book;

public class Day10_5_��������_����Ʈ����
{
	public static void main(String[] args)
	{
		// 1. ����Ʈ[��ü] ����
		ArrayList< Book > booklist = new ArrayList<>();
		// ����ƮŬ����<����Ʈ�ȿ� ������ Ŭ������>
		// <Ŭ����> : �ش� Ŭ������ ���� ��ü�� ����Ʈ�� ����
		// ���̴� ����{�⺻ : 10}
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			System.out.println("1. ��� 2. ��� 3. ���� 4. ���� ����");
			int ch = sc.nextInt();
			if(ch == 1) {
				// 1. �Է¹ޱ�
				System.out.println("������ : "); String name = sc.next();
				System.out.println("���� : "); String writer = sc.next();
				
				// 2. ��üȭ[ ������ ���� ----> 1�� ��ü]
				Book book = new Book(name, writer);
				
				// 3. �迭���� [���� ã�Ƽ� ] vs ����Ʈ [ ����ã�� x]
				booklist.add(book); // ����Ʈ�� ����
				// ??? -> .add��� �޼ҵ�� ������ �ε����� �ڵ������� ��ü�� �߰�, �׷��� �ߺ����Ŵ� �ȵ�
			}
			else if (ch == 2) {
				// 1. �迭[null ����] vs ����Ʈ
				System.out.println("������ \t ����");
				for(Book book : booklist) {
				System.out.println(book.get������() + "\t" + book.get����() );}
			}
			else if (ch == 3) {
				// 1. �迭[�����Ŀ� �� �ε��� ����] vs �ε���[�ڵ�]
				// 1 2 3 4 [2����] -> 1 null 3 4 vs 1 2 3 -> 1 3 4
				System.out.println("������ ������ : "); String name = sc.next();
				for(Book book : booklist) {
					if(book.get������().equals(name)) {
						booklist.remove(book);
						break; // ���� ���������� Ż��
					}
				}
			}
			else if (ch == 4) {
				System.out.println("������ ������ : "); String name = sc.next();
				for(Book book : booklist) {
					if(book.get������().equals(name)) {
						System.out.println("���� ���� :"); String writer = sc.next();
						book.set����(writer);
					}
				}
			}
		}
	
}
}
