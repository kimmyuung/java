package �����ڵ�����;

import java.util.Scanner;

public class �����ڵ�_2_4 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("�ð��� �Է��ϼ���");
	int hour = sc.nextInt();
	System.out.println("���� �Է��ϼ���");
	int minute = sc.nextInt();
	System.out.println("����� ���� �Է��ϼ���");
	int sumMinute = sc.nextInt();
	sc.close();
	// ���ϴ� �ð��� 24�� �Ѿ�� 0�� ���
	// ���� �հ谡 60�� �Ѿ�� 1�ð� �߰�
	if(hour == 23 && minute + sumMinute > 60) {
		hour = 0; 
		int sum = (minute+sumMinute) - 60;
		System.out.println( (hour) +" " + (sum));
	}
	else if(minute + sumMinute >= 60) {
		hour = ((minute + sumMinute) / 60) + hour;
		int sum = (minute + sumMinute) % 60;
		System.out.println((hour)+" " + (sum));
	}
	else System.out.println((hour) +" " + (minute + sumMinute));
}
}
