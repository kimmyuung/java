package ����;

import java.util.Random;
import java.util.Scanner;

public class �ζ�_5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int[] ����ڹ�ȣ = new int[6];
	int[] ��÷��ȣ = new int[6];
	
	for(int i = 0; i<6; i++) {
	System.out.println("1-45�� ��ȣ�� �Է����ּ���.");
	int select = scanner.nextInt();
	boolean pass = true;
	if(select > 45 || select < 0) {
		System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
		i--;
		pass = false;
		}
	for(int j = 0; j < 6; j++) {
		if(select == ����ڹ�ȣ[j]) {
			System.out.println("���ڰ� �ߺ��˴ϴ�. �ٽ� �Է����ּ���"); i--; pass = false;
				}
			}
	if(pass == true) {����ڹ�ȣ[i] = select;}	
		}
	
	for(int i = 0; i<6; i++) {
		Random random = new Random();
		int select = random.nextInt(45)+1;
		boolean pass = true;
		if(select > 45 || select < 0) {
			i--;
			pass = false;
			}
		for(int j = 0; j < 6; j++) {
			if(select == ��÷��ȣ[j]) {
			i--; pass = false;
					}
				}
		if(pass == true) {��÷��ȣ[i] = select;}	
			}
	System.out.println("����ڰ� �Է��� ��ȣ : ");
	for(int temp : ����ڹ�ȣ) {
		System.out.print(temp +"\t");
	}
	System.out.println("\n��ǻ�Ͱ� ��÷�� ��ȣ : ");
	for(int temp : ��÷��ȣ) {
		System.out.print(temp + "\t");
	}
	int same = 0;
	for(int same1 : ����ڹ�ȣ) {
		for(int same2 : ��÷��ȣ) {
			if(same1 == same2) {same++;}
		}
	}
	System.out.println("��÷�� ��ȣ�� ������ " + same + "���Դϴ�.");
	
	
	
	}
}
