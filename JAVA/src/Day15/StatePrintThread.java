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
		// ������ ���� ȣ��
		Thread.State state = targetThread.getState();
		System.out.println("Ÿ�� ������ ���� :" + state);
		// ������ ���� ����
		if(state == Thread.State.NEW) { // NEW : ������ �������� ��
			targetThread.start();
		}
		if(state == Thread.State.TERMINATED) { // TERMINATED : ������ ������� ��
			break;
			}
		}
		try {Thread.sleep(500);} catch(Exception e) {}
	}
}
