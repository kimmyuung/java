package �����ڵ�����;

import java.util.Scanner;

public class �����ڵ�_2_3 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("�ø� �Է��ϼ���");
	int hour = sc.nextInt();
	System.out.println("���� �Է��ϼ���");
	int minute = sc.nextInt();
	sc.close();
	// �ð��� ���� �Է¹���
	
	// ���� 45�� �̻��Ͻ� -45 �ϰ� ���
	// 
	if(hour == 0) {
		hour = 24;
	}
	if(minute >= 45) {
		minute = minute - 45;
		System.out.print(hour); System.out.print(" " +minute);
		}
	else if(minute < 45) {
		hour--;
		minute = (minute + 60) - 45;
		System.out.print(hour); System.out.print(" " +minute);
	}
	
}
}
