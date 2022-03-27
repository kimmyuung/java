package 백준코딩문제;

import java.util.Scanner;

public class 백준코딩_2_3 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("시를 입력하세요");
	int hour = sc.nextInt();
	System.out.println("분을 입력하세요");
	int minute = sc.nextInt();
	sc.close();
	// 시간과 분을 입력받음
	
	// 분이 45분 이상일시 -45 하고 출력
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
