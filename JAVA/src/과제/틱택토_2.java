package ����;

import java.util.Random;
import java.util.Scanner;

public class ƽ����_2 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int count = 0;
	String[] ������ = {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"};
	String �¸��� = "";
	
	while(true) {
		
		for(int i = 0; i<������.length; i++) {
			System.out.print(������[i]);
			if(i % 3 == 2) System.out.println();
		}
		
	while(true) {
		System.out.println("���� �� ��Ҹ� �������ּ���"); int select = sc.nextInt();
			if(������[select].equals("[ ]")) {
			������[select] = "[O]";
			count++; break;
				}
			 else System.out.println("�̹� ���� �ֽ��ϴ�.");
			
		} // w2 e	
	while(true) { // w3 s
		Random random = new Random();
		int ��ġ = random.nextInt(9);
			if(������[��ġ].equals("[ ]") ) 
			{
			������[��ġ] = "[X]"; 
			count++; break;
				}	
		}// w3 e	
	
	for(int i = 0; i<=6; i+=3) { // ����
		if(������[i].equals(������[i+3]) && ������[i+3].equals(������[i+6])) {
			�¸��� = ������[i];
		}
	}
	for(int i = 0; i<=2; i++) { // ����
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
	
	if(�¸���.equals("[O]")) {System.out.println("�÷��̾��� �¸��Դϴ�."); break;}
	else if(�¸���.equals("[X]")) {System.out.println("��ǻ���� �¸��Դϴ�."); break;}
	if(count == 9) {System.out.println("���º��Դϴ�."); break;}
	} // w1 e
	
	
	for(int i = 0; i<������.length; i++) {
		System.out.print(������[i]);
		if(i % 3 == 2) System.out.println();
	}
	
	} // me
} // ce
