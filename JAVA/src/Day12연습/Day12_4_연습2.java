package Day12����;

import java.util.Random;
import java.util.Scanner;

public class Day12_4_����2 {
	// ������ȣ �й� ���α׷�
	// ����
	// 1. ���� 0000~9999[4�ڸ� ����] ������ ���� 10�� �����ؼ� �迭�� ����
	// 2. ��� ���� ��ȣ�� �迭�� ����
	// 3. ���ڸ� ��ȣ�� Ȧ/¦ ����
	// 4. ���� ��¥���� ��ȣ�� Ȧ�� ���� �迭�� ����
	// 5. ���� ��¥���� ��ȣ�� ¦�� ���� �迭�� ����
	// 6. Ȧ������ �迭 ��� // ¦������ �迭 ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] carlist = new String[10];
		String[] oddlist = new String[10];
		String[] evenlist = new String[10];
		while (true) {
			System.out.println("���� ���� ���α׷�");
			System.out.println("1. ���� ���� 2. ���α׷� ����");
			for (String temp : carlist) {
				if (temp != null) {
					if (Integer.parseInt(temp) % 2 == 0) {
						System.out.println(temp + " ¦����ȣ ��");
					} else
						System.out.println(temp + "Ȧ����ȣ ��");
				}
			}
				int ch = sc.nextInt();
				if(ch == 1) {
					Random random = new Random();
					int carnum = random.nextInt(10000);
					String park = String.format("%04d", carnum);
					boolean pass = false;
					for(int i = 0; i < carlist.length; i++) {
						if(carlist[i] == null) {
							carlist[i] = park;
							pass = true;
							break;
						}
					}
					if(pass) {
						if(carnum % 2 == 0) {
							for(int i = 0; i < evenlist.length; i++) {
								if(evenlist[i] == null) {
									evenlist[i] = park;
									break;
								} 
								}
						}
								else {
									for(int i = 0; i < oddlist.length; i++) {
										if(oddlist[i] == null) {
											oddlist[i] = park;
											break;
										}
									}
								}
							
						
					}
					if(pass= false) {System.out.println("����");}
				}
				else if(ch == 2) {
					System.out.println("���α׷��� �����մϴ�.");
					sc.close();
					break;
				}
				else System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
		} // we	
	} // me
} // ce
	