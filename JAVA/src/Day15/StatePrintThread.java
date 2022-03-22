package Day15;

public class StatePrintThread extends Thread{

	// 1. field
	private Thread targetThread;
	
	// 2. constructor
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	@Override
	public void run() {
		while(true) {
		// 스레드 상태 호출
		Thread.State state = targetThread.getState();
		System.out.println("타겟 스레드 상태 :" + state);
		// 스레드 상태 제어
		if(state == Thread.State.NEW) { // NEW : 스레드 생성상태 뜻
			targetThread.start();
		}
		if(state == Thread.State.TERMINATED) { // TERMINATED : 스레드 종료상태 뜻
			break;
			}
		}
		try {Thread.sleep(500);} catch(Exception e) {}
	}
}
