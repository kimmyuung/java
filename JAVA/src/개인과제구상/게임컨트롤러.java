package ���ΰ�������;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Random;


public class ������Ʈ�ѷ� implements �����巡��Ʈ_�������̽�{
	static ArrayList<����> ��������Ʈ = new ArrayList<����>(); // ���� ����Ʈ
	static ArrayList<����> ���帮��Ʈ = new ArrayList<����>(); // ���� ����Ʈ
	static ArrayList<����> �������� = new ArrayList<����>(); // ������ ������ ����
@Override
public void ��������() {
	System.out.println("������ �����Ͽ����ϴ�.");
}
@Override
	public boolean �������(String �̸�, String Ư��, String �ó���, int �ε���) {
	boolean pass = true;
	int i = 0;
	for(���� temp : ��������Ʈ) {
		if(temp.get�̸�().equals(�̸�)) {
			pass = false;
		}
	}
	if(pass)
	{���� ���� = new ���� (�̸�, Ư��, �ó���, i);
	��������Ʈ.add(����); 
	i++;
	save();
	return true;
	}
	else return false;
	}
@Override
	public void ���弱��() {
		System.out.println("������ �����ϼ̽��ϴ�. ������ �����մϴ�.");
	}
@Override
	public void ����ȣ��() {
		
	}

	boolean ��������(String name, String �̸�, String Ư��, String �ó���, int �ε���) {
		for(���� temp : ��������Ʈ) {
			if(temp.get�̸�().equals(name)) {
				temp.set�̸�(�̸�);
				temp.setƯ��(Ư��);
				temp.set�ó���(�ó���);
				save();
				return true;
			}
			else return false;
		}
		 return false;
	}
	boolean ��������(String name) {
		for(���� temp : ��������Ʈ) {
			if(temp.get�̸�().equals(name)) {
				��������Ʈ.remove(temp);
				save();
				return true;
			}
			else return false;
		}
		 return false;
	}
	void save() {
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("D:/�ڹ�/�巡��Ʈ����.txt");
			for(���� temp : ��������Ʈ) {
			String ���� = temp.get�̸�() + "," + temp.getƯ��() + "," + temp.get�ó���() +"," +temp.�ε��� + "\n" ;
			fileOutputStream.write(����.getBytes());  fileOutputStream.close();}
			}catch(Exception e) {}
	}
	void load() {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/�ڹ�/�巡��Ʈ����.txt");
			byte[] ����Ʈ�迭 = new byte[1000];
			fileInputStream.read(����Ʈ�迭);
			String ��ü���� = ����Ʈ�迭.toString();
			String[] ���� = ��ü����.split("\n");
			for(String temp : ����) {
			String[] field = temp.split(",");
			���� ���� = new ����(field[0], field[1], field[2], Integer.parseInt(field[3]));
			��������Ʈ.add(����); 
			fileInputStream.close();
			}
			}catch(Exception e) {System.out.println(e);}
		
	
	}
	void Ư���Ǵ�() {}
	void �ó����Ǵ�() {}
	void �¸��Ǵ�() {}
	String �����̱�() {
		Random random = new Random();
		int index = random.nextInt(��������Ʈ.size());
		for(���� temp : ��������Ʈ) {
			if(temp.�ε��� == index)
			temp.get�̸�();
			return temp.get�̸�();	
		}
		return null;
	}
	
}



