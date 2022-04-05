package 개인과제2_블랙잭;

import java.util.Random;
import java.util.Scanner;

public class 게임_블랙잭 { // cs
public static void main(String[] args)
{ // ms
	// 준비
	Scanner sc = new Scanner(System.in);
	int [] playercard = new int[11];
	int [] dealercard = new int[11];
	int pv = 0;		int cv = 0;		int game = 0;
	int player = 0;
	int dealer = 0;
	try { // t s
	
	System.out.println("블랙잭 게임을 시작합니다.");
	System.out.println("[[메뉴 1. 시작 ]]");
	int select = sc.nextInt();
	
	if(select == 1) { // if1 s
		while(true) {
		Random random = new Random();
		
		boolean cardcheck = false;
		System.out.println("블랙잭게임을 시작합니다.");
		System.out.println("1. 카드뽑기 2. 게임결과보기 3. 게임종료");
		int select1 = sc.nextInt();
		if (select1 == 1) {
			for(int i = 0; i<playercard.length; i++) {
				if(playercard[i] == 0)
				{	System.out.println("카드를 뽑습니다.");
				playercard[i] = random.nextInt(10)+1; // 1-11까지의 숫자중
				System.out.println("플레이어가 뽑은 카드 : " + playercard[i]);
				cardcheck = true;
				player += playercard[i];
				break;	}	
			}
		
		for(int i = 0; i < dealercard.length; i++) {
			if(dealercard[i] == 0) {
				System.out.println("딜러가 카드를 뽑습니다.");
				dealercard[i] = random.nextInt(10)+1;
				System.out.println("딜러가 뽑은 카드 : " + dealercard[i]);
				cardcheck = true;
				dealer += dealercard[i];
				break;
			}
		}
		
				System.out.println("플레이어가 뽑은 카드의 합 : " + player);
				System.out.println("딜러가 뽑은 카드의 합 : " + dealer);
			
		if (player > 21) {System.out.println("플레이어 버스트~ 플레이어가 패배하였습니다."); cv++; game++; break;}
		if (dealer > 21) {System.out.println("딜러 버스트~ 딜러가 패배하였습니다."); pv++; game++; break; }
		
		}else if(select1 == 2) {
			System.out.println("플레이어가 뽑은 카드의 합 : " + player);
			System.out.println("딜러가 뽑은 카드의 합 : " + dealer);
			if(dealer>player) {
				System.out.println("딜러가 승리하였습니다"); game++; cv++; 
				player = 0; dealer = 0;
			}
			else if (dealer < player) {
				System.out.println("플레이어가 승리하였습니다."); game++; pv++; 
				player = 0; dealer = 0;
			}
			else if (dealer == player) {
				System.out.println("비겼습니다."); game++;
				player = 0; dealer = 0;
			}
		}
		else if (select1 ==3) {
		System.out.println("게임을 종료합니다."); 
		System.out.println("총 게임 수 : " + game);
		System.out.println("플레이어 승리 수 : " + pv);
		System.out.println("딜러 게임 수 : " + cv);
		if(cv < pv) {System.out.println("플레이어가 최종승리하였습니다.");  break;}
		else if(cv > pv) {System.out.println("딜러가 최종승리하였습니다."); break;}
		else if(cv == pv) {break;}
		}
	}
	
	}}catch(Exception e) {System.out.println("문자를 입력하셨습니다. 게임을 재실행 해주세요.");} //t c e
} // me
} // ce
