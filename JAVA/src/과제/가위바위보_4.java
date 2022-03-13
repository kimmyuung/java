package 과제;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보_4 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int game = 0; int cv = 0; int pv =  0;
	while(true) {
	System.out.println("가위바위보 게임을 시작합니다");
	System.out.println("0. 가위 1. 바위 2. 보 3. 종료");
	int select = scanner.nextInt();
	if(select == 0) {
		System.out.println("사용자는 가위를 냅니다.");
	}
	else if(select == 1) {
		System.out.println("사용자는 바위를 냅니다.");
	}
	else if(select == 2) {
		System.out.println("사용자는 보를 냅니다.");
	}
	else if(select == 3) {
		System.out.println("총 게임 수 : " + game);
		System.out.println("플레이어가 이긴 횟수 : " + pv);
		System.out.println("컴퓨터가 이긴 횟수 : " + cv);
		if(pv > cv)  {System.out.println("플레이어의 최종 승리입니다.");}
		else if(pv == cv) {System.out.println("무승부 입니다.");}
		else {System.out.println("컴퓨터의 최종 승리입니다.");}
		break;
	}
	else System.out.println("잘못된 숫자입니다. 다시 입력하여 주세요.");
	Random random = new Random();
	int com = random.nextInt(3);
	
	if (select == 0 && com == 2 || select == 1 && com == 0 || select == 2 && com == 1)
	{System.out.println("플레이어의 승리입니다."); pv++; game++;}
	else if (select == 0 && com == 0 || select == 1 && com == 1 || select == 2 && com == 2)
	{System.out.println("플레이어의 승리입니다."); game++;}
	else {System.out.println("컴퓨터의 승리입니다."); cv++; game++;}
		}
	}
}
