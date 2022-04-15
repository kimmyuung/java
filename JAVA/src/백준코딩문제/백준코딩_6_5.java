package 백준코딩문제;

import java.util.Scanner;

public class 백준코딩_6_5 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String eng = sc.next();
	char[] englist = new char[eng.length()];
	int count = 0;
	for(int i = 0; i < eng.length(); i++) {
		englist[i] = eng.charAt(i);
		System.out.println(englist[i]);
	}
	sc.close();
}
}
