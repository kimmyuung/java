package ���ΰ�������;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Random;

public class �����巡��Ʈ_��Ʈ�ѷ� {

	public static ArrayList<����> ��������Ʈ = new ArrayList<>();
	public static ArrayList<����> �������ø���Ʈ = new ArrayList<>();
	public static String[] �����ó��� = { "������", "��1��", "��2��", "��3��", "��4��", "��5��", "��6��", "ȥ�ڰ����ؿ�" };
	public static String[] ����Ư�� = { "����", "����", "����", "Ŀ�Ǿ�ȣ��", "����", "�ֿ���", "��°�", "�ΰ�", "��Ÿ��", "������" };
	public static ArrayList<����> ��������Ʈ = new ArrayList<>();
	

	String �����̱�() {
		Random random = new Random();
		int index = random.nextInt(��������Ʈ.size());
		for (���� temp : ��������Ʈ) {
			String �������� = ��������Ʈ.get(index).get�����̸�();
			return ��������;
		}
		return null;
	}

	boolean �������(String name, String skill, String combie) {
		for (���� temp : ��������Ʈ) {
			if (temp.get�����̸�().equals(name)) {
				return false;
			}
		}
		���� ���� = new ����(name, skill, combie, 0);
		��������Ʈ.add(����);
		return true;
	}

	void ��������() {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("D:/�ڹ�/��������Ʈ.txt");
			for (���� temp : ��������Ʈ) {
				String �ѳ��� = temp.get������ȣ() + "," + temp.get�����̸�() + "," + temp.get����Ư��() + "," + temp.get�����ó���()
						+ "\n";
				fileOutputStream.write(�ѳ���.getBytes());
			}
		} catch (Exception e) {
			System.out.println("���� ���� ���� �߻�!" + e);
		}
	}

	void �����ε�() {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/�ڹ�/��������Ʈ.txt");
			byte[] bytes = new byte[1000];
			fileInputStream.read(bytes);
			String �� = new String(bytes);
			String[] �ٳ����� = ��.split("\n");
			for (String temp : �ٳ�����) {
				String[] field = temp.split(",");
				���� ���� = new ����(field[0], field[1], field[2], Integer.parseInt(field[3]));
				��������Ʈ.add(����);
				return;
			}
		} catch (Exception e) {
			System.out.println("���� �ҷ����� ���� �߻�!" + e);
		}
	}

	void ȿ���Ǵ�() {

	}

	void �ó����Ǵ�() {

	}

	void ��������save(int Score, String name) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("D:/�ڹ�/�巡��Ʈ��������.txt");
			for (���� temp : ��������Ʈ) {
				String ���� = name + ","+ Integer.toString(Score)+ "\n";
				 // �������� �����ϸ� �ɵ�
				fileOutputStream.write(����.getBytes());
			}
		} catch (Exception e) {
			System.out.println("���� ���� ���� �߻�!" + e);
		}
	}

	void ��������load() {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/�ڹ�/�巡��Ʈ��������.txt");
			byte[] bytes = new byte[1000];
			fileInputStream.read(bytes);
			String �� = new String(bytes);
			String[] �ٳ����� = ��.split("\n");
			for (String temp : �ٳ�����) {
				String[] field = temp.split(",");
				���� ���� = new ����(field[0], Integer.parseInt(field[1]) );
				��������Ʈ.add(����);
				return;
			}
		} catch (Exception e) {
			System.out.println("���� �ҷ����� ���� �߻�!" + e);
		}
	}

	boolean ��������(String name, String skill, String combie) {
		for (���� temp : ��������Ʈ) {
			if (!(temp.get�����̸�().equals(name))) {
				return false;
			} else {
				temp.set�����̸�(name);
				temp.set�����ó���(combie);
				temp.set����Ư��(skill);
				��������();
				return true;
			}
		}
		return false;
	}

	boolean ��������(String name) {
		for (���� temp : ��������Ʈ) {
			if (!(temp.get�����̸�().equals(name))) {
				return false;
			} else {
				temp = null;
				��������();
				return true;
			}
		}
		return false;
	}
	boolean ��������(String name, String skill, String combie) {
		for (���� temp : ��������Ʈ) {
			if (temp.get�����̸�().equals(name)) {
				return false;
			}
		}
		���� ���� = new ����(name, skill, combie);
		�������ø���Ʈ.add(����);
		return true;
	}
}
