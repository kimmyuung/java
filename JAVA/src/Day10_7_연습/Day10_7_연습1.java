package Day10_7_����;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Day10_7_����1 {
	// Ŭ���� : �Ե�����, ����ŷ
		// ��� : ����
		// �������̽� : Ű����ũ �������̽�
		// ����ó�� : ��ǰ���� ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<��ǰ> ��ǰ����Ʈ = new ArrayList<��ǰ>();
		
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/�ڹ�/�Ե��������.txt");
			byte[] ����Ʈ�迭 = new byte[1000];
			fileInputStream.read(����Ʈ�迭);
			String ���ϳ��� = new String(����Ʈ�迭);
			String[] ��ǰ���� = ���ϳ���.split("\n");
			for(String temp : ��ǰ����) {
				String[] field = temp.split(",");
				��ǰ ��ǰ = new ��ǰ(field[0], Integer.parseInt(field[1]), Integer.parseInt(field[2]));
				��ǰ����Ʈ.add(��ǰ);
			}
		} catch(Exception e) {}
		Ű����ũ�������̽� �Ե����� = new �Ե�����("���缮", ��ǰ����Ʈ);
		while(true) {
			�Ե�����.��ǰ���();
			int ch = sc.nextInt();
			if(ch==-1) �Ե�����.��ǰ�߰�();
			else if (ch == 0) �Ե�����.����();
			else �Ե�����.��ٱ���();
		}
	}
}
