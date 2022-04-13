package 백준코딩문제;

import java.util.Scanner;
// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
public class 백준코딩_3_11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
	int x = sc.nextInt();
	int[] nlist = new int[x];
	int z = sc.nextInt();
	for(int i =0; i < x; i++) {
		 nlist[i]= sc.nextInt();
	}
	sc.close();
	for(int i =0; i < x; i++) {
		if(nlist[i] < z) {System.out.println(nlist[i]);}
	}
}
}
