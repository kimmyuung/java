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
		for (���� temp : ��������Ʈ) { // �̸� �ߺ��� ��� X
			if (temp.get�����̸�().equals(name)) {
				return false;
			}
		}
		for (���� temp : ��������Ʈ) { // �ó����� �ʹ� ���� ������(�Ѱ� �̻��� �ó��� ������ ��� X)
			if(temp.get�����ó���().length() > 7) {
				return false;
			}
		}
		for (���� temp : ��������Ʈ) {
			if(temp.get����Ư��().length() > 5) { // Ư���� �ʹ� ���� ������(3�� �̻��� Ư�� ������ ��� X)
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
				fileOutputStream.close();
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
			fileInputStream.close();
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

	int ȿ���Ǵ�() { 
		int score = 0;
		
		for(int i = 0; i< 4; i++) { // ���� ȿ�� �Ǵ�
			for(int j =0; j<4; j++) {
				for(int k =0; k<4; k++) {
					for(int l = 0; l <4; l++) {
						if(�������ø���Ʈ.get(i).get����Ư��().equals("����") &&
								�������ø���Ʈ.get(j).get����Ư��().equals("����") &&
								�������ø���Ʈ.get(k).get����Ư��().equals("����") && 
								�������ø���Ʈ.get(l).get����Ư��().equals("����") 
								) { score += 2; }
					}
				}
			}
		}
		// ���� ȿ�� �Ǵ�
		// ���� ȿ�� �Ǵ�
		for(���� temp : �������ø���Ʈ) {
			if(!temp.get����Ư��().equals("����")) {
				score -= 3;
			}
		}
		// Ŀ�Ǿ�ȣ�� ȿ�� �Ǵ�
		// ���� ȿ�� �Ǵ�
		for(���� temp : �������ø���Ʈ) {
			if(temp.get����Ư��().equals("����")) {
				score += 1;
			}
		}
		// �ֿ��� ȿ�� �Ǵ�
		for(���� temp : �������ø���Ʈ) {
			if(!temp.get����Ư��().equals("�ֿ���")) {
				score -= 2;
			}
		}
		// ��°� ȿ�� �Ǵ�
		// �ΰ� ȿ�� �Ǵ�
		// ��Ÿ�� ȿ�� �Ǵ�
		// ������ ȿ�� �Ǵ�
		for(���� temp : �������ø���Ʈ) {
			if(temp.get����Ư��().equals("������")) {
				score += 2;
			}
		}
		return score;
	}

	int �ó����Ǵ�() {
		int score = 0;
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		for(���� temp : �������ø���Ʈ) { // ������ �ó��� �Ǵ�
			for(���� temp2 : �������ø���Ʈ) {
				for(���� temp3 : �������ø���Ʈ) {
					if(		�������ø���Ʈ.get(index1).get�����̸�().equals("���ȣ") ||
							�������ø���Ʈ.get(index1).get�����̸�().equals("���ؼ�") ||
							�������ø���Ʈ.get(index1).get�����̸�().equals("�ѿ���")
							&& 
							�������ø���Ʈ.get(index2).get�����̸�().equals("���ȣ") ||
							�������ø���Ʈ.get(index2).get�����̸�().equals("�ѿ���") ||
							�������ø���Ʈ.get(index2).get�����̸�().equals("���ؼ�") 
							&&
							�������ø���Ʈ.get(index3).get�����̸�().equals("���ȣ") ||
							�������ø���Ʈ.get(index3).get�����̸�().equals("���ؼ�") ||
							�������ø���Ʈ.get(index3).get�����̸�().equals("�ѿ���"	) ) {
						score = 3; 
					}
						
				}
			}
		}
		for(int i = 0; i<4; i++) { // 1�� �ó����Ǵ�
			for(int j=0; j<4; j++) {
				for(int k =0; k<4; k++) {
					for(int x = 0; x<4; x++) {
						if(�������ø���Ʈ.get(i).get�����̸�().equals("���ȣ") ||
								�������ø���Ʈ.get(i).get�����̸�().equals("������") ||	
								�������ø���Ʈ.get(i).get�����̸�().equals("���ؼ�") ||
								�������ø���Ʈ.get(i).get�����̸�().equals("ȫ����") &&
								�������ø���Ʈ.get(j).get�����̸�().equals("���ȣ") ||
								�������ø���Ʈ.get(j).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(j).get�����̸�().equals("���ؼ�") ||
								�������ø���Ʈ.get(j).get�����̸�().equals("ȫ����") &&
								�������ø���Ʈ.get(k).get�����̸�().equals("���ȣ") ||
								�������ø���Ʈ.get(k).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(k).get�����̸�().equals("���ؼ�") ||
								�������ø���Ʈ.get(k).get�����̸�().equals("ȫ����") &&
								�������ø���Ʈ.get(x).get�����̸�().equals("���ȣ") ||
								�������ø���Ʈ.get(x).get�����̸�().equals("���ؼ�") ||
								�������ø���Ʈ.get(x).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(x).get�����̸�().equals("ȫ����") ) {
							score = 5; 
						} 
					}
				}
			}
		}
		for(int i = 0; i<4; i++) { // 2�� �ó����Ǵ�
			for(int j=0; j<4; j++) {
				for(int k =0; k<4; k++) {
					for(int x = 0; x<4; x++) {
						if(�������ø���Ʈ.get(i).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(i).get�����̸�().equals("������") ||	
								�������ø���Ʈ.get(i).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(i).get�����̸�().equals("������") &&
								�������ø���Ʈ.get(j).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(j).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(j).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(j).get�����̸�().equals("������") &&
								�������ø���Ʈ.get(k).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(k).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(k).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(k).get�����̸�().equals("������") &&
								�������ø���Ʈ.get(x).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(x).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(x).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(x).get�����̸�().equals("������") ) {
							score = 5; 
						} 
					}
				}
			}
		}
		for(int i = 0; i<4; i++) { // 3�� �ó����Ǵ�
			for(int j=0; j<4; j++) {
				for(int k =0; k<4; k++) {
					for(int x = 0; x<4; x++) {
						if(�������ø���Ʈ.get(i).get�����̸�().equals("��Լ�") ||
								�������ø���Ʈ.get(i).get�����̸�().equals("�Ŵ���") ||	
								�������ø���Ʈ.get(i).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(i).get�����̸�().equals("������") &&
								�������ø���Ʈ.get(j).get�����̸�().equals("��Լ�") ||
								�������ø���Ʈ.get(j).get�����̸�().equals("�Ŵ���") ||
								�������ø���Ʈ.get(j).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(j).get�����̸�().equals("������") &&
								�������ø���Ʈ.get(k).get�����̸�().equals("��Լ�") ||
								�������ø���Ʈ.get(k).get�����̸�().equals("�Ŵ���") ||
								�������ø���Ʈ.get(k).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(k).get�����̸�().equals("������") &&
								�������ø���Ʈ.get(x).get�����̸�().equals("��Լ�") ||
								�������ø���Ʈ.get(x).get�����̸�().equals("�Ŵ���") ||
								�������ø���Ʈ.get(x).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(x).get�����̸�().equals("������") ) {
							score = 5; 
						} 
					}
				}
			}
		}
		for(int i = 0; i<4; i++) { // 4�� �ó����Ǵ�
			for(int j=0; j<4; j++) {
				for(int k =0; k<4; k++) {
					for(int x = 0; x<4; x++) {
						if(�������ø���Ʈ.get(i).get�����̸�().equals("�輱��") ||
								�������ø���Ʈ.get(i).get�����̸�().equals("��º�") ||	
								�������ø���Ʈ.get(i).get�����̸�().equals("���ؿ�") ||
								�������ø���Ʈ.get(i).get�����̸�().equals("�����") &&
								�������ø���Ʈ.get(j).get�����̸�().equals("�輱��") ||
								�������ø���Ʈ.get(j).get�����̸�().equals("��º�") ||
								�������ø���Ʈ.get(j).get�����̸�().equals("���ؿ�") ||
								�������ø���Ʈ.get(j).get�����̸�().equals("�����") &&
								�������ø���Ʈ.get(k).get�����̸�().equals("�輱��") ||
								�������ø���Ʈ.get(k).get�����̸�().equals("��º�") ||
								�������ø���Ʈ.get(k).get�����̸�().equals("���ؿ�") ||
								�������ø���Ʈ.get(k).get�����̸�().equals("�����") &&
								�������ø���Ʈ.get(x).get�����̸�().equals("�輱��") ||
								�������ø���Ʈ.get(x).get�����̸�().equals("��º�") ||
								�������ø���Ʈ.get(x).get�����̸�().equals("���ؿ�") ||
								�������ø���Ʈ.get(x).get�����̸�().equals("�����") ) {
							score = 5; 
						} 
					}
				}
			}
		}
		for(int i = 0; i<4; i++) { // 5�� �ó����Ǵ�
			for(int j=0; j<4; j++) {
				for(int k =0; k<4; k++) {
					for(int x = 0; x<4; x++) {
						if(�������ø���Ʈ.get(i).get�����̸�().equals("�ڹο�") ||
								�������ø���Ʈ.get(i).get�����̸�().equals("�ڿ���") ||	
								�������ø���Ʈ.get(i).get�����̸�().equals("ä�켮") &&
								�������ø���Ʈ.get(j).get�����̸�().equals("�ڹο�") ||
								�������ø���Ʈ.get(j).get�����̸�().equals("�ڿ���") ||
								�������ø���Ʈ.get(j).get�����̸�().equals("ä�켮") &&
								�������ø���Ʈ.get(k).get�����̸�().equals("�ڹο�") ||
								�������ø���Ʈ.get(k).get�����̸�().equals("�ڿ���") ||
								�������ø���Ʈ.get(k).get�����̸�().equals("ä�켮") &&
								�������ø���Ʈ.get(x).get�����̸�().equals("�ڹο�") ||
								�������ø���Ʈ.get(x).get�����̸�().equals("�ڿ���") ||
								�������ø���Ʈ.get(x).get�����̸�().equals("ä�켮") 
								 ) {
							score = 5; 
						} 
					}
				}
			}
		}
		for(int i = 0; i<4; i++) { // 6�� �ó����Ǵ�
			for(int j=0; j<4; j++) {
				for(int k =0; k<4; k++) {
					for(int x = 0; x<4; x++) {
						if(�������ø���Ʈ.get(i).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(i).get�����̸�().equals("�ڷ���") ||	
								�������ø���Ʈ.get(i).get�����̸�().equals("�ѿ���") 
								&&
								�������ø���Ʈ.get(j).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(j).get�����̸�().equals("�ڷ���") ||
								�������ø���Ʈ.get(j).get�����̸�().equals("�ѿ���") 
								&&
								�������ø���Ʈ.get(k).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(k).get�����̸�().equals("�ڷ���") ||
								�������ø���Ʈ.get(k).get�����̸�().equals("�ѿ���") 
								&&
								�������ø���Ʈ.get(x).get�����̸�().equals("������") ||
								�������ø���Ʈ.get(x).get�����̸�().equals("�ڷ���") ||
								�������ø���Ʈ.get(x).get�����̸�().equals("�ѿ���") 
								) {
							score = 5; 
						} 
					}
				}
			}
		}
		return score;
	}

	void ��������save(int Score, String name) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("D:/�ڹ�/�巡��Ʈ��������.txt");
			for (���� temp : ��������Ʈ) {
				String ���� = name + ","+ Integer.toString(Score)+ "\n";
				 // �������� �����ϸ� �ɵ�
				fileOutputStream.write(����.getBytes());
				fileOutputStream.close();
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
			fileInputStream.close();
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
