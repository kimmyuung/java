package Day15;

public class ThreadB extends Thread{
	// field
		public boolean stop = false; // ���� �÷���
		public boolean work = true; // �۾����࿩�� �÷���
	
		@Override
		public void run() {
			while(!stop) { // stop�� false�� �ƴϸ� ���ѷ���
				if(work) { // work�� true�̸�
					System.out.println("Thread B �۾� ����");
				} else {Thread.yield();} // work�� false�̸� �ٸ� �����忡�� �纸
			} // w e
			System.out.println("Thread B ����");
		} // run end
}
