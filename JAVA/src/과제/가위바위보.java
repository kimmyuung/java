package 과제;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {
public static void main(String[] args) {
	
	int game = 0; int pv = 0; int cv = 0; 
	while(true) {
	System.out.println("가위바위보 게임을 시작합니다.");
	System.out.println("1. 가위 2. 바위 3. 보 4. 종료");
	Scanner scanner = new Scanner(System.in);
	int select = scanner.nextInt();
	Random random = new Random();
	int computer = scanner.nextInt(3)+1; //
	System.out.println("컴퓨터가 낸 가위바위보는 : " + computer);
	
	if(select == 1) {
		System.out.println("가위를 냅니다.");
		game++;
	}
	else if(select == 2) {
		System.out.println("바위를 냅니다.");
		game++;
	}
	else if(select == 3) {
		System.out.println("보를 냅니다");
		game++;
	}
	else if(select == 4) {
		System.out.println("총 게임 횟수 : " + game);
		System.out.println("사용자가 이긴 횟수 : " + pv);
		System.out.println("컴퓨터가 이긴 횟수 : " + cv);
		if(cv < pv) {System.out.println("사용자가 승리하였습니다.");}
		else if(cv == pv) {System.out.println("무승부입니다.");}
		else System.out.println("컴퓨터의 승리입니다.");
	}
	else {System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요");}
	
	
	
	if( select ==1 && computer == 3 || select == 2 && computer == 1 || select == 3 && computer == 2)
	{System.out.println("플레이어가 승리하였습니다."); pv++;}
	else if(select ==1 && computer ==1 || select ==2 && computer ==2 || select == 3 && computer == 3)
	{System.out.println("무승부입니다."); game++;}
	else {System.out.println("컴퓨터의 승리입니다. "); cv++;}
	
		}
	}
}
