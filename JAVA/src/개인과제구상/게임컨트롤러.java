package ���ΰ�������;

import java.io.FileOutputStream;
import java.util.ArrayList;

public class ������Ʈ�ѷ� implements �����巡��Ʈ_�������̽�{
	static ArrayList<����> ��������Ʈ = new ArrayList<����>();
	static ArrayList<����> ���帮��Ʈ = new ArrayList<����>();

@Override
public void ��������() {
	System.out.println("������ �����Ͽ����ϴ�.");
}
@Override
	public boolean �������(String �̸�, String Ư��, String �ó���) {
	boolean pass = true;
	for(���� temp : ��������Ʈ) {
		if(temp.get�̸�().equals(�̸�)) {
			pass = false;
		}
	}
	if(pass)
	{���� ���� = new ���� (�̸�, Ư��, �ó���);
	��������Ʈ.add(����); 
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

	boolean ��������(String name, String �̸�, String Ư��, String �ó���) {
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
			String ���� = temp.get�̸�() + "," + temp.getƯ��() + "," + temp.get�ó���() + "\n";
			fileOutputStream.write(����.getBytes());  fileOutputStream.close();}
			}catch(Exception e) {}
	}
	void Ư���Ǵ�() {}
	void �ó����Ǵ�() {}
	void �¸��Ǵ�() {}
}



