package ����;

import java.util.Random;
import java.util.Scanner;

public class �ζ�_2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int [] ����ڹ�ȣ = new int [6];
	int [] ��÷��ȣ = new int [6];
	
	for(int i = 0; i<6; i++) {
		System.out.println("1-45 ������ ���� �� ���ϴ� ���ڸ� �Է��ϼ���");
		int select = scanner.nextInt();
		boolean pass = true;
		if(select < 0 || select > 45) { // ��ȿ�� �˻�
			System.out.println("������ ������ �ʰ��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			i--; 
			pass = false;
		}
		for(int j = 0; j<6 ; j++) { // �ߺ� �˻�
			if(select == ����ڹ�ȣ[j])
			{System.out.println("��ȣ�� �ߺ��˴ϴ�."); i--; pass = false;}
		}
		if(pass == true) {����ڹ�ȣ[i] = select;} }
		for(int temp : ����ڹ�ȣ) {System.out.println("����ڰ� ����� ��ȣ" + temp);}
		
		Random random = new Random();
		
		for (int i = 0; i < ��÷��ȣ.length; i++) {
			int com = random.nextInt(45)+1;
			boolean ��� = true;
			for(int j = 0; j<6 ; j++) { // �ߺ� �˻�
				if(com == ��÷��ȣ[j])
				{System.out.println("��ȣ�� �ߺ��˴ϴ�."); i--; ��� = false;}
			}
			if(��� == true) {com = ��÷��ȣ[i];}
			}
		
		for(int temp : ��÷��ȣ) {System.out.println("��ǻ�Ͱ� ��÷�� ��ȣ" + temp);}
		
		int ��÷ = 0;
		for(int i = 0; i< ����ڹ�ȣ.length; i++) {
			for (int j = 0; j< ��÷��ȣ.length; j++) {
				if(����ڹ�ȣ[i] == ��÷��ȣ[j]) {System.out.println("��÷!! \t"); ��÷++;}
				}
			}
		System.out.println("��÷�� ���� : " + ��÷);
		
	}
}
