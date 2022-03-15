package 과제;

import java.util.Random;
import java.util.Scanner;

public class 틱택토_1 {
public static void main(String[] args) {
	
	String[] 게임판 = {"[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"};
	String 승리돌 = "";
	int count = 0;
	Scanner sc = new Scanner(System.in);
	while(true) { //w1 s
		for(int i =0; i < 게임판.length; i++) {
			System.out.print(게임판[i]);
			if(i % 3 == 2) System.out.println();
			}
	while(true) {
		System.out.println("돌을 둘 위치를 선택하세요."); int select = sc.nextInt();
		if(게임판[select].equals("[ ]")) {
			게임판[select] = "[O]";
			count++; break;
			}
		
	}	
	while(true) {
		Random random = new Random();
		int 위치 = random.nextInt(9);
			if(게임판[위치].equals("[ ]")) 
			{
				게임판[위치] = "[X]";
				count++; break;
					}
				
			}	
	for(int i = 0 ; i<= 6; i+=3) {
	if(게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i+2])) 
	{ 승리돌 = 게임판[i];} 	}
	for(int i = 0 ; i<= 2; i++) {
	if(게임판[i].equals(게임판[i+3]) && 게임판[i+3].equals(게임판[i+6]))
	{ 승리돌 = 게임판[i];} 	}
	if(게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8])) {
		승리돌 = 게임판[0];
	}
	
	if(게임판[2].equals(게임판[4]) && 게임판[4].equals(게임판[6])) {
		승리돌 = 게임판[2]; 
	}
	if (승리돌 == "[O]") {System.out.println("플레이어가 이겼습니다."); break;}
	else if(승리돌 == "[X]") {System.out.println("컴퓨터가 이겼습니다."); break;}
	
	
		} // w1 e
	for(int i =0; i < 게임판.length; i++) {
		System.out.print(게임판[i]);
		if(i % 3 == 2) System.out.println();
		}
	} // me
} // ce
