package Day12����;

import java.util.Random;
import java.util.Scanner;

public class Day12_4_����3 {
	// ������ȣ �й� ���α׷�
	// ����
	// 1. ���� 0000~9999[4�ڸ� ����] ������ ���� 10�� �����ؼ� �迭�� ����
	// 2. ��� ���� ��ȣ�� �迭�� ����
	// 3. ���ڸ� ��ȣ�� Ȧ/¦ ����
	// 4. ���� ��¥���� ��ȣ�� Ȧ�� ���� �迭�� ����
	// 5. ���� ��¥���� ��ȣ�� ¦�� ���� �迭�� ����
	// 6. Ȧ������ �迭 ��� // ¦������ �迭 ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // �Է� ��ü ����
		String[] carlist = new String[10]; // �������� 10ĭ�� �迭 ����
		String[] oddlist = new String[10]; // Ȧ����
		String[] evenlist = new String[10]; // ¦����
		while(true) { // ���ѷ���, �������� : ���α׷����Ḧ ��������
			System.out.println("���� ���� ���α׷�");
			System.out.println("1. ���� 2. ���α׷� ����");
			for(String temp : carlist) { // �����忡 �ִ� ��� ���� ���
				if(temp != null) { // �迭�� ������� ���� ���
					if(Integer.parseInt(temp) % 2 == 0) {System.out.println( temp + "¦�� \t");}
					else System.out.print(temp + "Ȧ�� \t"); // Ȧ¦���� �Ǵ� ���� ������ ��ȯ�Ͽ� 2�� ������ �������� 0�̸� ¦��
				}
			}
			int ch = sc.nextInt();
			if(ch == 1) { // �����忡 �� ����
				Random random = new Random(); // ���� ��ü ����
				int carnum = random.nextInt(10000); // 0-9999������ ������ ����ȣ ����
				String strnum = String.format("%04d", carnum); // ���� ���� -> ����ȣ�� ������ 4�ڸ��ε� ������ ������ 3�ڸ����� ���ü��� �ֱ� ����
				boolean pass = false; // ������ ����
				for(int i = 0; i < carlist.length; i++) {
					if(carlist[i] == null) {  // �迭���� ��� ������
						carlist[i] = strnum; // ���� ����
						pass = true; // ������ ���� ���� Ʈ��� ����
						break; // ���������� �ݺ��� Ż��!
					}
				}
				if(pass == true) { // �����忡 ������ ���������� Ȧ¦���� �Ǵ����� ���ǹ� ����
					if(Integer.parseInt(strnum) % 2 == 0) { // Ȧ¦���� �Ǵ����� ����ȣ�� ���������� ��ȯ�Ͽ� �Ǵ�
						for(int i = 0; i < evenlist.length; i++) { // �������� 0�̸� ¦���̹Ƿ� ¦���� �����忡 ������Ŵ
							if(evenlist[i] == null) {
								evenlist[i] = strnum;
								break;
							}
						}}
						else for(int i = 0; i < oddlist.length; i++) { // �������� 1�̸� Ȧ���̹Ƿ� Ȧ���� �����忡 ����
							if(oddlist[i] == null) {
								oddlist[i] = strnum;
								break;
							}
						}	
					
				}
				if(pass == false) {System.out.println("�����Դϴ�.");} // ���� �� 10�� �̻��̵Ǹ� ���� 
			}
			else if(ch == 2) {
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				break;
			}
			else {System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
		}
	}
}