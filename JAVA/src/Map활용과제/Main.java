package MapȰ�����;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Controller con = new Controller();
	
	while(true) {
		System.out.println("ȸ���� Ŀ�´�Ƽ ����Ʈ");
		System.out.println("1. ȸ�� ���� 2. �α��� 3. ����");
		int ch = sc.nextInt();
		if(ch ==1) {
			System.out.println("Id : "); String id = sc.next();
			System.out.println("Pw : "); String pw = sc.next();
			System.out.println("Name : "); String name = sc.next();
			Member member = new Member(id, pw, name);
			boolean result = con.signup(member);
			if(result) System.out.println("���� ����");
			else System.out.println("���� ����");
		}
		else if(ch==2) {
			System.out.println("Id : "); String id = sc.next();
			System.out.println("Pw : "); String pw = sc.next();
			boolean result = con.login(id, pw);
			if(result) {
				System.out.println("�α��� ����!");
				while(true) {
					System.out.println("1. �۾��� 2. �ۺ��� 3. �α׾ƿ�");
					int ch1 = sc.nextInt();
					if(ch1==1) {
						System.out.println("1. �� ���� : "); String title = sc.next();
						System.out.println("2. �� ���� : "); String context = sc.next();
						con.write(title, context);
					}
					else if(ch1==2) {
						for(String temp : con.treeMap.keySet()) {
							System.out.println(temp + " : " + con.treeMap.get(temp));
						}
						
					}
					else if(ch1==3) {System.out.println("�α׾ƿ�!"); break;}
					else {System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�.");}
				}
				
			}
			else System.out.println("�α��� ����!");
		}
		else if(ch==3) {
			System.out.println("���α׷� ����!!");
			break;
		}
	}
}
}
