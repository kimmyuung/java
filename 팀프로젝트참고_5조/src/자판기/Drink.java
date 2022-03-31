package 자판기;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Scanner;


public class Drink extends KeyBoard{
	
	public static void main(String[] args) { // 메시지 인덱스에 공백 넣고 추가
		Scanner scanner = new Scanner(System.in);

	    
		while(true) { // 시작화면 반복문 시작 [종료조건 : 1번선택시]
			while(true) {
				Controller.메시지랭킹리셋메소드(); // 메시지와 랭킹 리스트내 null존재할경우 NullPointer 에러 발생 방지
				Controller.load(); // 랭크 정보 저장된 파일 불러오기
				Picture.시작화면(); // 시작화면 출력 메소드
				try {
					System.out.println("\t\t\t1.게임시작\t2.순위보기"); 
					System.out.print("\t\t\t선택 >> "); int ch = scanner.nextInt();
					scanner.nextLine(); // 순위보기 화면시 엔터키사용을 위해 nextLine 사용
					if(ch==1) {
						break; // 시작화면
					}
					else if(ch==2) {
						Picture.랭크출력(); // 랭크 출력 메소드
						System.out.println("\t\t\t전단계로 돌아가시려면 아무키나 눌러주세요..");
						scanner.nextLine();
					}
					else {
						
					}
				}
				catch(Exception e) { //
					System.out.println("알림) 잘못된 입력입니다.");
					scanner = new Scanner(System.in);
				}
			}			
			Picture.시작카운트(); // 카운트다운 출력메소드	
			Controller.시작시간 = System.currentTimeMillis(); // 시작시간 저장
			//currentTimeMillis 쓴이유  시작시간을 1/1000초 단위로 알려줌  1/10억초 까지 표현해주는 nanoTime은 필요가 없었음
			TimeCheck timecheck = new TimeCheck(); // 시간 체크 객체 생성
			 // 배경음악재생 객체 생성
			Buy buy1 = new Buy("콜라"); // 컴퓨터 콜라 구매 객체 생성
			Buy buy2 = new Buy("환타"); // 컴퓨터 환타 구매 객체 생성
			Buy buy3 = new Buy("사이다"); // 컴퓨터 사이다 구매 객체 생성
			Buy buy4 = new Buy("레드불"); // 컴퓨터 레드불 구매 객체 생성
			
			

			
			
//			키보드로 음료 채우기
//			Frame f = new Frame("Demo");
//			f.setLayout(new FlowLayout());
//			f.setSize(500, 500);
//			Label l = new Label();
//			l.setText("선택중입니다..");
//			f.add(l);
//			f.setVisible(true);
//			f.setLocation(200, 200);
//			f.setAlwaysOnTop(true); // 항상 위에
//			// Creating and adding the key listener
//			KeyBoard k = new KeyBoard();
//			f.addKeyListener(k);
////////////////////////////////////////////////
			
			
			Btn buttons = new Btn(); // 버튼객체 생성
			buttons.showButton(); // 버튼 생성
				// 배경음악재생 스레드 시작 (thread 1)
			timecheck.start(); // 시간체크 스레드 시작 (thread 2)
			buy1.start(); // 컴퓨터 콜라 구매 스레드 시작 (thread 3)
			buy2.start(); // 컴퓨터 환타 구매 스레드 시작 (thread 4)
			buy3.start(); // 컴퓨터 사이다 구매 스레드 시작 (thread 5)
			buy4.start(); // 컴퓨터 레드불 구매 스레드 시작 (thread 6)
			Picture.화면출력메소드(); // 화면출력메소드 while 무한루프 (main thread)
			
			/////////////////////////게임오버////////////////////////////////////////
			
			buttons.closeButton(); // 게임오버시 버튼 제거
			Picture.gameover(); // 게임오버화면 출력 메소드
			 // 배경음악 스레드 종료
			timecheck.setStop(true); // 시간체크 스레드 종료
			buy1.setStop(true); // 구매 스레드 종료
			buy2.setStop(true); // 구매 스레드 종료
			buy3.setStop(true); // 구매 스레드 종료
			buy4.setStop(true); // 구매 스레드 종료
			
			Controller.게임리셋메소드(); // 자금, 음료 재고, 경고횟수, 시간차이 게임 초기값으로
			long 종료시간 = System.currentTimeMillis(); // 랭크판정을 위해 종료시간 확인
			long 게임시간 = (종료시간-Controller.시작시간)/1000; // 총 게임시간을 변수로 저장
			
			System.out.println();
			
			int result = Controller.랭크판정(게임시간); // 랭크 판정메소드
			if(result<=9) { // 순위가 10위이상일때 랭크등록 (인덱스 이므로 0~9)
				System.out.println(" 축하합니다!! " + (result+1) + "등 입니다!!");
				System.out.print("이름을 입력해주세요 : "); String 이름 = scanner.nextLine();
				System.out.print("코멘트를 입력해주세요 : "); String 코멘트 = scanner.nextLine();
				Controller.랭크등록(result, 게임시간, 이름, 코멘트);
			}
			Controller.save(); // 랭크정보 파일 저장메소드
			
		}	
	}
		
}