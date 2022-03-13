package 과제;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보_2 {
public static void main(String[] args) {
	int game = 0;
	int pv = 0; int cv = 0;
Scanner scanner = new Scanner(System.in);
	while(true) {
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println("0. 가위 1. 바위 2. 보 3. 종료");
		System.out.println("메뉴를 선택해주세요.");
		int select = scanner.nextInt();
		Random random = new Random();
		int computer = random.nextInt(3);
		if(select == 0) {
			System.out.println("가위를 내셨습니다.");
			game++;
		}
		else if(select ==1) {
			System.out.println("바위를 내셨습니다.");
			game++;
		}
		else if(select ==2) {
			System.out.println("보를 내셨습니다.");
			game++;
		}
		else if(select ==3) {
			System.out.println("총 게임 수 : " + (game-1));
			System.out.println("컴퓨터의 승리 횟수 :" + (cv-1));
			System.out.println("사용자의 승리 횟수 : " + pv);
			if(pv < cv-1) {System.out.println("컴퓨터가 승리하였습니다.");}
			else if(pv == cv-1) {System.out.println("무승부입니다.");;}
			else {System.out.println("사용자가 승리하였습니다.");}
			break;
			
		}
		else {System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력해주세요");}
		if (select == 0 && computer == 2 || select == 1 && computer == 0 || select == 2 && computer == 1)
		{System.out.println("플레이어가 승리하였습니다"); pv++;}
		else if (select == 2 && computer == 2 || select == 1 && computer == 1 || select == 0 && computer == 0)
		{System.out.println("무승부입니다."); game++;}
		else System.out.println("컴퓨터의 승리입니다."); cv++;
		
		
		}
	}
}
