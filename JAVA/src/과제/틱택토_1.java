package ����;

import java.util.Random;
import java.util.Scanner;

public class ƽ����_1 {
public static void main(String[] args) {
	
	String[] ������ = {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"};
	String �¸��� = "";
	int count = 0;
	Scanner sc = new Scanner(System.in);
	while(true) { //w1 s
		for(int i =0; i < ������.length; i++) {
			System.out.print(������[i]);
			if(i % 3 == 2) System.out.println();
			}
	while(true) {
		System.out.println("���� �� ��ġ�� �����ϼ���."); int select = sc.nextInt();
		if(������[select].equals("[ ]")) {
			������[select] = "[O]";
			count++; break;
			}
		
	}	
	while(true) {
		Random random = new Random();
		int ��ġ = random.nextInt(9);
			if(������[��ġ].equals("[ ]")) 
			{
				������[��ġ] = "[X]";
				count++; break;
					}
				
			}	
	for(int i = 0 ; i<= 6; i+=3) {
	if(������[i].equals(������[i+1]) && ������[i+1].equals(������[i+2])) 
	{ �¸��� = ������[i];} 	}
	for(int i = 0 ; i<= 2; i++) {
	if(������[i].equals(������[i+3]) && ������[i+3].equals(������[i+6]))
	{ �¸��� = ������[i];} 	}
	if(������[0].equals(������[4]) && ������[4].equals(������[8])) {
		�¸��� = ������[0];
	}
	
	if(������[2].equals(������[4]) && ������[4].equals(������[6])) {
		�¸��� = ������[2]; 
	}
	if (�¸��� == "[O]") {System.out.println("�÷��̾ �̰���ϴ�."); break;}
	else if(�¸��� == "[X]") {System.out.println("��ǻ�Ͱ� �̰���ϴ�."); break;}
	
	
		} // w1 e
	for(int i =0; i < ������.length; i++) {
		System.out.print(������[i]);
		if(i % 3 == 2) System.out.println();
		}
	} // me
} // ce
