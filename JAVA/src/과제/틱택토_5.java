package ����;

import java.util.Random;
import java.util.Scanner;

public class ƽ����_5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int count = 0;
	String[] ������ = {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"};
	String �¸��� = "";
	
	while(true) {
		for(int i = 0; i < ������.length; i++) {
			System.out.print(������[i]);
			if(i % 3 == 2) System.out.println();
		}
		
	while(true) {
		System.out.println("���� �� ��ġ�� �Է����ּ���");
		int s1 = sc.nextInt();
		if(������[s1].equals("[ ]")) {
			������[s1] = "[O]";
			count++ ; break;
		}
	}
	while(true) {
		Random random = new Random();
		int s1 = random.nextInt(9);
		if(������[s1].equals("[ ]")) {
			������[s1] = "[X]";
			count++ ; break;
		}	
	}
	for(int i = 0; i<=6; i+=3) {
		if(������[i].equals(������[i+1]) && ������[i+1].equals(������[i+2])) {
			�¸��� = ������[i];
		}
	}
	
	for(int i = 0; i<=2; i++) {
		if(������[i].equals(������[i+1]) && ������[i+1].equals(������[i+2])) {
			�¸��� = ������[i];
		}
	}
	if(������[0].equals(������[4]) && ������[4].equals(������[8])) {
		�¸��� = ������[0];
	}
	if(������[2].equals(������[4]) && ������[4].equals(������[6])) {
		�¸��� = ������[2];
	}
	if(�¸���.equals("[O]")) {System.out.println("�÷��̾��� �¸�"); break;}
	if(�¸���.equals("[X]")) {System.out.println("��ǻ���� �¸�"); break;}
	if(count == 9) {System.out.println("���º�"); break;}
	
	} // w e
	for(int i = 0; i < ������.length; i++) {
		System.out.print(������[i]);
		if(i % 3 == 2) System.out.println();
	}
	
	}
}
