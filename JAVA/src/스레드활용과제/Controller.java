package ������Ȱ�����;

import java.util.Scanner;

public class Controller {
static Scanner scanner = new Scanner(System.in);
	
	static boolean context1 = true;
	static boolean context2 = true;
	
	
	public static void ���̿͹�¯��() {
		
		while(true) {
			System.out.println("���̿͹�¯�� ��ȭ");
			System.out.println("1)��� / �Ͻ����� 2)���ư���");
			String work = scanner.next();
			���̿͹�¯�� story = new ���̿͹�¯��();
			if (work.equals("1")) {
				
				if(context1) {
					story.���̿͹�¯��_stop(true);
					story.start();
					context1 = false;
				}
				else {
					story.���̿͹�¯��_stop(false);
					context1 = true;
				}
			}
			else if (work.equals("2")) {
				System.out.println("���θ޴��� ���ư��ϴ�.");
				story.���̿͹�¯��_stop(false);
				break;
			}
		}
	}
	
	public static void �̳�;߼�() {

		while(true) {
			System.out.println("�̳�� �߼� ��ȭ");
			System.out.println("1)��� / �Ͻ����� 2)���ư���");
			String work = scanner.next();
			�̳�;߼� story2 = new �̳�;߼�();
			if (work.equals("1")) {
				
				if(context2) {
					story2.�̳�;߼�_stop(true);
					story2.start();
					context2 = false;
				}
				else {
					story2.�̳�;߼�_stop(false);
					context2 = true;
				}
			
			}
			else if (work.equals("2")) {
				System.out.println("���θ޴��� ���ư��ϴ�.");
				story2.�̳�;߼�_stop(false);
				break;
			}
		}
	}
	
	
}

