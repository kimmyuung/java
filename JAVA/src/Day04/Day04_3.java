package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 { // c  s
public static void main(String[] args) { // m  s
	
	
	// 가위바위보 게임
	// 1. 사용자에게 가위[0] 바위[1] 보[2] 종료[3] 중에 입력받음
	// 2. 컴퓨터 난수발생[0-2]
	// 3. 사용자와 컴퓨터 중 승리자 판단
	// 4. 3번 선택하기 전까지 게임 실행
	// 5. 3번 선택시 -> 총 게임수, 최종 승리자(컴퓨터 : 몇판, 사용자 : 몇판 이김) 출력
	// -> 변수 : 사용자 1개, 컴퓨터 1개, 가위바위보게임 실행 횟수, 최종 승리, 플레이어 승리 수, 컴퓨터 승리 수 
	// 준비(변수)
	int player; // 사용자가 선택한 수
	int computer; // 컴퓨터가 난수를 생성한 수
	int game = 0; // 총 게임 수
	int pv = 0; int cv = 0;// 플레이어 승리 수, 컴퓨터 승리 수
	Scanner scanner = new Scanner(System.in); // 객체 선언
	
	// 프로그램 실행 [무한루프 종료 조건 : 3번 입력시 종료(break;)
	while(true) { // w  s
		System.out.println("----------가위 바위 보 게임----------");
		System.out.println("가위(0)  바위(1)  보(2)  종료(3) 선택");
		player = scanner.nextInt(); // 입력한 수 저장
		System.out.println("플레이어가 낸수 : "); // 플레이어가 낸 수 출력
		
		Random random = new Random(); // 난수 객체 선언
		// random.nextInt() : int가 표현할 수 있는 범위내 난수 발생
		// random.nextInt(수) : 0 ~ 수-1 까지 범위내 난수 발생
			// ex) random.nextInt(10) : 0 ~ 9 중 난수 발생
			// ex) random.nextInt(11) + 10 : 10 ~ 20 중 난수 발생
			// random.nextInt(수) + 시작번호 : 0 ~ 수 전까지 범위내 난수 발생
		computer = random.nextInt(3); // 난수중 정수(int형)로 가져오기
		System.out.println("컴퓨터가 낸 수 : " + computer);
		
				
		if(player == 3) {
		 System.out.println("------- 게임 결과 -------");
		 System.out.printf("플레이어 승리 수 : %d	컴퓨터 승리 수 : %d		", pv,cv);
		 System.out.printf("\n  총 게임 수 : %d ", game);
		if(cv == pv) {System.out.println("비겼습니다.");}
		else if(cv > pv) {System.out.printf("\n총 게임 수 : %d 최종승리자 : 컴퓨터", game);}
		else {System.out.printf("\n총 게임 수 : %d 최종승리자 : 플레이어", game);}
		break;
		
		}
		else {System.out.println("오류) 다시입력해주세요");}
		game++; // 게임 수 증가
		
		// 승리자 판단
		if(player == 0 && computer == 2 || player == 1 && computer == 0 || player == 2 && computer == 1) 
			{ 
			// 플레이어 승리 경우의 수 : 0 -> 2 // 1 -> 0 // 2 -> 1
			System.out.println("플레이어가 이겼습니다.");
			pv++; 
			} 
			
		else if(player == 2 && computer == 2 || player == 1 && computer == 1 || player == 0 && computer == 0)  
			{ // 비기는 수 
				System.out.println("비겼습니다.");	
				
			}
		else { // 플레이어 패배 판단
			System.out.println("컴퓨터가 승리하였습니다.");
			cv++; 
			}
	
		} // w  e
	
	
	} // m  e
} // c  e
