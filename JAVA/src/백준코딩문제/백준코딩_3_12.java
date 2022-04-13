package 백준코딩문제;

import java.util.Scanner;

public class 백준코딩_3_12 {
public static void main(String[] args) {
	// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	Scanner sc = new Scanner(System.in);
	while(true) {
	int x = sc.nextInt();
	int y = sc.nextInt();
	
	System.out.println(x+y);
	if(x==0 && y ==0) {sc.close(); break;}
	}
}
}
