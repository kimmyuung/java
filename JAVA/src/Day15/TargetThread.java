package Day15;

public class TargetThread extends Thread{
// ����ó��
	@Override
	public void run() {
		for(long i = 0; i < 1000000000 ; i++) {} // RUNNABLE ��Ƽ������ ������
			try {
			Thread.sleep(1500);} catch(Exception e) {}
			// 1.5�ʰ� ���[�и��� : 1/1000��], WAITING ��Ƽ������ �Ͻ����� 
		
		for(long i = 0; i < 1000000000; i++) {
			
		}
		// run �޼ҵ尡 ����Ǹ� ������ ���� : TERMINATED
	}
}
