package ���ΰ�������;

import java.util.Scanner;

public class ��������1_���� {
public static void main(String[] args) {
	// 0. ���� �غ�
	Scanner scanner = new Scanner(System.in);
	
	try { // ����ó��
	while(true) {
	System.out.println("����Ÿ�� ���� ���α׷�");
	System.out.println("[[1. ���� 2. ���� 3. ���⺸��]]");
	int select = scanner.nextInt();
	if (select == 1) {
		
	}	
	else if(select == 2) {
		
	}
	else if(select == 3) {
		
	}
	else if(select < 0) {
		System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
	}
	else {System.out.println("���ڸ� �߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");}
	} // we 
	}catch(Exception e) {System.out.println("���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");} // tc e
}
}
