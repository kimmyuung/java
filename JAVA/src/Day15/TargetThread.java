package Day15;

public class TargetThread extends Thread{
// 병렬처리
	@Override
	public void run() {
		for(long i = 0; i < 1000000000 ; i++) {} // RUNNABLE 멀티스레드 실행중
			try {
			Thread.sleep(1500);} catch(Exception e) {}
			// 1.5초간 대기[밀리초 : 1/1000초], WAITING 멀티스레드 일시정지 
		
		for(long i = 0; i < 1000000000; i++) {
			
		}
		// run 메소드가 종료되면 스레드 상태 : TERMINATED
	}
}
