package Day15;

public class ThreadA extends Thread{
	// field
	public boolean stop = false; // ���� �÷���
	public boolean work = true; // �۾����࿩�� �÷���
	// ����ó��
	@Override
	public void run() {
		while(!stop) { // stop�� false�� �ƴϸ� ���ѷ���
			if(work) { // work�� true�̸�
				System.out.println("Thread A �۾� ����");
			} else {Thread.yield();} // work�� false�̸� �ٸ� �����忡�� �纸
		} // w e
		System.out.println("Thread A ����");
	} // run end
}
