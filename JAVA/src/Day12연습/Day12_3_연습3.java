package Day12����;

import java.io.IOException;

public class Day12_3_����3 {
	// ���� �˻� ���α׷�
			// [����]
			// 1. �Է¹ޱ� [ System.in.read() ]
			// 2. String �迭�� ���� ������ ���� 
				//		String[] ������� = {	
				//			"�ȴ�! ���̹� ��α�&����Ʈ",
				//			"������ ��Ʈ ���� Ȱ�� ������",
				//			"Tucker�� Go ��� ���α׷���",
				//			"ȥ�� �����ϴ� C ���"
				//};
			// 3. �˻���� , ������� 
				// �˻���� : Ư�� ���ڸ� �Է¹޾� ������ ���Ե� ���ڰ� ������ ��� ��� 
					// '���' �˻� ->  "Tucker�� Go ��� ���α׷���" / "ȥ�� �����ϴ� C ���"
				// ������� : ������ �������� �Ϻθ� �Է¹޾� ��µ� �������� ��ȣ�� ���� 
				// '����' ���� -> ���õ� �������� ������ ���ڿ� ���ο� ���� �Է¹޾� ->  ���� �Ϸ�
	public static void main(String[] args) throws Exception {
		String[] booklist = {"�ȴ�! ���̹� ��α�& ����Ʈ", "������ ��Ʈ ���� Ȱ�� ������", "Tucker�� Go ��� ���α׷���"
				, "ȥ�� �����ϴ� C ���"};
		byte[] bytes = new byte[1000];
		while(true) {
		System.out.println("1. ���� �˻� 2. ���� ����");
		int count = System.in.read(bytes);
		String ch = new String(bytes, 0, count-2);
		if(ch.equals("1")) {
			System.out.println("�Է��� ���� �̸��� �Է����ּ���");
			int bookfind = System.in.read(bytes);
			String ch1 = new String(bytes, 0, bookfind-2);
			for(String temp : booklist) {
				if(temp.equals(ch1)) {
					System.out.println(temp);
					
				}
				else if(temp.contains(ch1)) {
					System.out.println(temp);
				}
			}
		}
		else if(ch.equals("2")) {
			System.out.println("������ ������ �Է����ּ���");
			int bookup = System.in.read(bytes);
			String ch2 = new String(bytes, 0, bookup-2);
			int i = 0;
			for(String temp : booklist) {
				if(temp.indexOf(ch2) != -1) {
					String ch3 = temp.replace(temp, ch2);
					System.out.println(ch3);
					
				}
			i++;}
			System.out.println("������ ������ȣ�� �Է����ּ���");
			int count1 = System.in.read(bytes);
			String ch3 = new String(bytes, 0, count1-2);
			int index = Integer.parseInt(ch3);
			System.out.println("���� ���� : ");
			int old = System.in.read(bytes);
			String oldStr = new String(bytes, 0, old-2);
			System.out.println("���ο� ���� : ");
			int new1 = System.in.read(bytes);
			String newStr = new String(bytes, 0, new1-2);
			booklist[index] = booklist[index].replace(oldStr, newStr);
			
		}
		else System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
		}
	}
}
