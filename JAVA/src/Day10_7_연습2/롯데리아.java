package Day10_7_����2;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class �Ե����� extends ����{
String ����;
ArrayList<��ǰ> ��ǰ����Ʈ = new ArrayList<��ǰ>();

@Override
	public void ��ǰ���() {
	Scanner sc = new Scanner(System.in);
	boolean pass = true;
		System.out.println("�Ե������� ��ǰ�� ����մϴ�.");
		System.out.println("����� ��ǰ�� �̸��� �Է��ϼ���"); String name = sc.next();
		System.out.println("����� ��ǰ�� ������ �Է��ϼ���"); int price = sc.nextInt();
		System.out.println("����� ��ǰ�� ��� �Է��ϼ���"); int save = sc.nextInt();
		for(��ǰ temp : ��ǰ����Ʈ) {
			if(temp.get��ǰ����().equals(name)) {
				System.out.println("��ǰ���� �ߺ��˴ϴ�. �ٽ� �Է����ּ���");
				pass = false;
			}
		}
		if(pass) {��ǰ ��ǰ = new ��ǰ(name, price, save);
		��ǰ����Ʈ.add(��ǰ);}
		else System.out.println("��ǰ ��� ����!");
		try {
		FileOutputStream fileOutputStream = new FileOutputStream("D:/�ڹ�/�Ե��������1.txt");
		String �������� = name + "," + price + "," + save + "\n";
		fileOutputStream.write(��������.getBytes());
		sc.close();
		fileOutputStream.close();
		}catch(Exception e) {}
	}
@Override
	public void ��ǰ���() {
		System.out.println("�Ե������� ��ǰ����� ����մϴ�.");
		for(��ǰ temp : ��ǰ����Ʈ) {
			System.out.println(temp.get��ǰ����() + " " + temp.get��ǰ����() + " " + temp.get��ǰ���());
		}
	}
}
