package 자판기;

public class TimeCheck extends Thread {
	
	private boolean stop;
	
	public void setStop (boolean stop) {//게임을 다시 시작하려고보니 시작이 되지않음 -> 스레드가 계속 돌아가거나 중지상태였기때문
										//boolean stop 메소드를 걸어두지않으면 콘솔에서 오류 남 interrupt 는 중지만 시켜주기 때문에
										//조건을 달아서 stop 을하도록 만들어야함 stop을 바로쓰면 스레드 안정성에 문제가 되므로 setstop사용
		this.stop = stop ;
	}
	
	
	@Override
	public synchronized void run() {
		
		while(!stop) { // 시간체크 반복
			if(Controller.경고횟수>=4) { // 경고횟수 4회 이상시 스레드 종료시킴
				break;
			}
			long 현재시간 = System.currentTimeMillis(); // 스레드가 실행되고있는 현재 시간 저장
			long 시간차이 = (현재시간-Controller.시작시간)/1000; // 게임시작시 저장해두었던 시작시간과의 차이를 구하여
			Controller.시간차이=((int)시간차이/5)+1; // 시간차이 변수에 저장 시간차이 변수에 5초당 1만큼 전달해줌 
		}
	}

}
