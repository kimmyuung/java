package 백준코딩문제;

import java.util.Scanner;

public class 백준코딩_3_3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("어느 숫자까지의 합을 구할까여?");
	int ch = sc.nextInt();
	int sum = 0;
	for(int i = 1; i <= ch; i++) {
		sum += i;
	}
	System.out.println(sum);
}
}
