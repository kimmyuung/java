package 과제;

import java.util.Random;
import java.util.Scanner;

public class 틱택토_5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int count = 0;
	String[] 게임판 = {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"};
	String 승리알 = "";
	
	while(true) {
		for(int i = 0; i < 게임판.length; i++) {
			System.out.print(게임판[i]);
			if(i % 3 == 2) System.out.println();
		}
		
	while(true) {
		System.out.println("돌을 둘 위치를 입력해주세요");
		int s1 = sc.nextInt();
		if(게임판[s1].equals("[ ]")) {
			게임판[s1] = "[O]";
			count++ ; break;
		}
	}
	while(true) {
		Random random = new Random();
		int s1 = random.nextInt(9);
		if(게임판[s1].equals("[ ]")) {
			게임판[s1] = "[X]";
			count++ ; break;
		}	
	}
	for(int i = 0; i<=6; i+=3) {
		if(게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i+2])) {
			승리알 = 게임판[i];
		}
	}
	
	for(int i = 0; i<=2; i++) {
		if(게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i+2])) {
			승리알 = 게임판[i];
		}
	}
	if(게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8])) {
		승리알 = 게임판[0];
	}
	if(게임판[2].equals(게임판[4]) && 게임판[4].equals(게임판[6])) {
		승리알 = 게임판[2];
	}
	if(승리알.equals("[O]")) {System.out.println("플레이어의 승리"); break;}
	if(승리알.equals("[X]")) {System.out.println("컴퓨터의 승리"); break;}
	if(count == 9) {System.out.println("무승부"); break;}
	
	} // w e
	for(int i = 0; i < 게임판.length; i++) {
		System.out.print(게임판[i]);
		if(i % 3 == 2) System.out.println();
	}
	
	}
}
