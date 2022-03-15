package 과제;

import java.util.Random;
import java.util.Scanner;

public class 틱택토_2 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int count = 0;
	String[] 게임판 = {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"};
	String 승리알 = "";
	
	while(true) {
		
		for(int i = 0; i<게임판.length; i++) {
			System.out.print(게임판[i]);
			if(i % 3 == 2) System.out.println();
		}
		
	while(true) {
		System.out.println("알을 둘 장소를 선택해주세요"); int select = sc.nextInt();
			if(게임판[select].equals("[ ]")) {
			게임판[select] = "[O]";
			count++; break;
				}
			 else System.out.println("이미 돌이 있습니다.");
			
		} // w2 e	
	while(true) { // w3 s
		Random random = new Random();
		int 위치 = random.nextInt(9);
			if(게임판[위치].equals("[ ]") ) 
			{
			게임판[위치] = "[X]"; 
			count++; break;
				}	
		}// w3 e	
	
	for(int i = 0; i<=6; i+=3) { // 세로
		if(게임판[i].equals(게임판[i+3]) && 게임판[i+3].equals(게임판[i+6])) {
			승리알 = 게임판[i];
		}
	}
	for(int i = 0; i<=2; i++) { // 가로
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
	
	if(승리알.equals("[O]")) {System.out.println("플레이어의 승리입니다."); break;}
	else if(승리알.equals("[X]")) {System.out.println("컴퓨터의 승리입니다."); break;}
	if(count == 9) {System.out.println("무승부입니다."); break;}
	} // w1 e
	
	
	for(int i = 0; i<게임판.length; i++) {
		System.out.print(게임판[i]);
		if(i % 3 == 2) System.out.println();
	}
	
	} // me
} // ce
