package 백준코딩문제;

import java.util.Scanner;

public class 백준코딩_2_4 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("시간을 입력하세요");
	int hour = sc.nextInt();
	System.out.println("분을 입력하세요");
	int minute = sc.nextInt();
	System.out.println("계산할 분을 입력하세요");
	int sumMinute = sc.nextInt();
	sc.close();
	// 더하는 시간이 24가 넘어가면 0시 출력
	// 분의 합계가 60이 넘어가면 1시간 추가
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
