package Day10_7_����;


import java.io.FileOutputStream;

import java.util.ArrayList;
import java.util.Scanner;

public class �Ե����� extends ����{
String ��ǰ���;
ArrayList<��ǰ> ��ǰ����Ʈ = new ArrayList<��ǰ>();
public �Ե�����(String ��ǰ���, ArrayList<��ǰ> ��ǰ����Ʈ) {
	super();
	this.��ǰ��� = ��ǰ���;
	this.��ǰ����Ʈ = ��ǰ����Ʈ;
}
public �Ե�����() {}

@Override
	public void ��ǰ�߰�() {
	Scanner sc = new Scanner(System.in);
		System.out.println("�Ե����� ��ǰ�߰�");		
		System.out.println("��ǰ ���� : ");			String name = sc.next();
		System.out.println("��ǰ ���� : ");			int price = sc.nextInt();
		System.out.println("��ǰ ��� : ");	        int save = sc.nextInt();
		��ǰ ��ǰ = new ��ǰ(name, price, save);
		��ǰ����Ʈ.add(��ǰ);
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("D:/�ڹ�/�Ե��������.txt", true);
			String �������� = name + "," + price + "," + save + "\n";
			fileOutputStream.write(��������.getBytes());
			
		}catch(Exception e) {}
		System.out.println("��ǰ ���� �Ϸ�!");
	}

@Override
	public void ��ǰ���() {
		System.out.println("��ǰ ���");
		for(��ǰ temp : ��ǰ����Ʈ) {
			System.out.println(temp.get��ǰ��() + " " + temp.get����() + " " + temp.get���());
		}
	}
}
