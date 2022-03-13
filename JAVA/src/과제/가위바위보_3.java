package 과제;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보_3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int cv = 0; int pv = 0; int game = 0;
	while(true) {
	System.out.println("가위바위보 게임을 시작합니다.");
	System.out.println("0. 가위   1. 바위  2. 보  3. 종료");
	System.out.println("원하시는 메뉴를 실행하여 주세요");
	int select = scanner.nextInt();
	if(select == 0) {
		System.out.println("가위를 냅니다"); 
	}
	else if(select == 1) {
		System.out.println("바위를 냅니다"); 
	}
	else if(select == 2) {
		System.out.println("보를 냅니다"); 
	}
	else if(select == 3) {
		System.out.println("총 게임 수 : " + game);
		System.out.println("플레이어가 이긴 게임 수 : " + pv);
		System.out.println("컴퓨터가 이긴 게임 수 " + cv);
		if(pv > cv) {System.out.println("플레이어의 승리입니다.");}
		else if(pv == cv) System.out.println("무승부입니다.");
		else System.out.println("컴퓨터의 승리입니다.");
		break;
	}
	else {System.out.println("잘못된 숫자입니다. 다시 입력하여 주세요.");}
	
	Random random = new Random();
	int computer = random.nextInt(3);
	
	if(select==0 && computer == 2 || select == 1 && computer == 0 || select == 2 && computer == 1) {
		System.out.println("플레이어의 승리입니다."); game++; pv++;
	}
	else if (select==0 && computer == 0 || select == 1 && computer == 1 || select == 2 && computer == 2) {
		System.out.println("무승부입니다."); game++;
	}
	else {System.out.println("컴퓨터의 승리입니다."); cv++; game++;}
	
	
		}
	}
}
