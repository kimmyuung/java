package Day01;

import java.util.Scanner;

//  �ۼ���, ����, ��¥
public class Day01_6 { //  c  s

	public static void main(String[] args) { // m  s
		
	// 1. ��ü ����
	Scanner	scanner = new Scanner(System.in);
	// 2. �Է� ��� �ȳ�				3. �����͸� �ٸ� ���� ����
	System.out.print("�ۼ��� : "); 	String writer = scanner.next();
	System.out.print("���� : "); 	String context = scanner.next();
	System.out.print("��¥ : ");	String date = scanner.next();
	// 4. ������ ���
	System.out.println("---------------�湮��----------------");
	System.out.println("|����|\t|�ۼ���|\t|����|\t|��¥|");
	System.out.println("|1 |\t|" + writer + "|\t|" + context + "|\t|" + date + "|");
	
	} // m  e
	
} // c  epackage Day01;


