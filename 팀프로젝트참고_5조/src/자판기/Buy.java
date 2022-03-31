package 자판기;

import java.util.Random;

public class Buy extends Thread {
	
	String 음료이름;
	private boolean stop;
	
	public void setStop (boolean stop) { // 음료구매 스레드 종료메소드
		this.stop = stop ;
	}
	
	public Buy(String 음료이름) { // 생성자 객체 생성시 생성자값에 따라 다른 작업이 실행되도록 구분
		this.음료이름 = 음료이름;
	}
	
	@Override
	public synchronized void run() { // 메인스레드와 같이 실행될 스레드
		try {Thread.sleep(5000);}catch(Exception e) {} // 컴퓨터 구매활동 5초이후 시작
		while(!stop) { // 스레드 실행 종료 제어를 위해 stop 사용
			 // 음악객체 생성(컴퓨터가 구매에 성공시 재생)
			if(Controller.경고횟수>=4) { // 경고횟수 4회 이상시 스레드 종료시킴
				break;
			}
			if(음료이름=="콜라") { // Buy 객체 생성시 생성자에 따라 음료제어
				Random random = new Random(); // 랜덤객체 생성	
				int buy = random.nextInt(2)+1; // 컴퓨터가 구매할 갯수 랜덤으로 생성
				if (Controller.콜라 < buy) { // 구매할 갯수가 재고보다 적을경우
					Controller.경고횟수 += 1; // 경고 1회 증가
					Controller.메시지.add(0,"경고) 콜라가 부족하여 판매하지 못했습니다"); // 경고메시지 메시지 리스트에 저장
					if(Controller.메시지.size()>=8) { // 리스트에 문자열 과다 저장 방지를 위해 인덱스내 객체 제거(화면출력은 0~4인덱스까지만 나옴)
						Controller.메시지.remove(5);//인덱스내 객체를 제거 하지않으면 컴퓨터가 구매 메세제를 실행 할때마다 저장 
					}
				}
				else { // 랜덤으로 생성된 구매갯수가 재고보다 많을경우 (구매성공조건일경우)
					Controller.콜라 -= buy; // 콜라 재고 차감
					Controller.자금 += buy*400 ; // 차감된만큼 자금 증가
					Controller.메시지.add(0,"콜라 " + buy + " 개 판매되었습니다. + " + buy*400 + "원"); // 차감된 숫자와 금액 메시지 리스트에 저장
					구매.start(); // 구매 성공음악 재생
					if(Controller.메시지.size()>=8) { // 리스트에 문자열 과다 저장 방지를 위해 인덱스내 객체 제거(화면출력은 0~4인덱스까지만 나옴)
						Controller.메시지.remove(5); //인덱스내 객체를 제거 하지않으면 컴퓨터가 구매 메세제를 실행 할때마다 저장 
					}
				}
					try {Thread.sleep(2000-Controller.시간차이*50);}catch(Exception e) {} // 시간차이 변수에 따라 속도조절
											//int시간차이=5초경과시 1증가
			}
			else if(음료이름=="환타") { // 환타 구매 스레드 (콜라와 동일한 구조)
				Random random = new Random();
				int buy = random.nextInt(2)+1;
				if (Controller.환타 < buy) {
					Controller.경고횟수 += 1;
					Controller.메시지.add(0,"경고) 환타가 부족하여 판매하지 못했습니다");
					if(Controller.메시지.size()>=8) {
						Controller.메시지.remove(5);
					}
				}
				else {
					Controller.환타 -= buy;
					Controller.자금 += buy*300 ;
					Controller.메시지.add(0,"환타 " + buy + " 개 판매되었습니다. + " + buy*300 + "원");
					구매.start();
					if(Controller.메시지.size()>=8) {
						Controller.메시지.remove(5);
					}
				}
				try {Thread.sleep(2000-Controller.시간차이*50);}catch(Exception e) {}
			}
			else if(음료이름=="사이다") { // 사이다 구매 스레드 (콜라와 동일한 구조)
				Random random = new Random();
				int buy = random.nextInt(2)+1;
				if (Controller.사이다 < buy) {
					Controller.경고횟수 += 1;
					Controller.메시지.add(0,"경고) 사이다가 부족하여 판매하지 못했습니다");
					
					if(Controller.메시지.size()>=8) {
						Controller.메시지.remove(5);
					}
				}
				else {
					Controller.사이다 -= buy;
					Controller.자금 += buy*200 ;
					Controller.메시지.add(0,"사이다 " + buy + " 개 판매되었습니다. + " + buy*200 + "원");
					구매.start();
					if(Controller.메시지.size()>=8) {
						Controller.메시지.remove(5);
					}
				}
				try {Thread.sleep(2000-Controller.시간차이*50);}catch(Exception e) {}
			}
			else if(음료이름=="레드불") { // 레드불 구매 스레드 (콜라와 동일한 구조)	
				Random random = new Random();
				int buy = random.nextInt(2)+1;
				if (Controller.레드불 < buy) {
					Controller.경고횟수 += 1;
					Controller.메시지.add(0,"경고) 레드불이 부족하여 판매하지 못했습니다");
					
					if(Controller.메시지.size()>=8) {
						Controller.메시지.remove(5);
					}
				}
				else {
					Controller.레드불 -= buy;
					Controller.자금 += buy*1500 ;
					Controller.메시지.add(0,"레드불 " + buy + " 개 판매되었습니다. + " + buy*1500 + "원");
					구매.start();
					if(Controller.메시지.size()>=8) {
						Controller.메시지.remove(5);
					}
				}
				try {Thread.sleep(2000-Controller.시간차이*50);}catch(Exception e) {}
			}
		}
			
	}

}
