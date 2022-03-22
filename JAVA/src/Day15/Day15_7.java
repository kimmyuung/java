package Day15;

import java.awt.Toolkit;

public class Day15_7 {
	
	public static void main(String[] args) {
		// ������ ����
		// 1. Thread.sleep() : �־��� �ð����� �Ͻ� ����
		// 2. Thread.yield() : �ٸ� �����忡�� ���� �纸 [ ��� ���·� ���� ]
		// 3. Thread.join() : �ٸ� �����尡 ����ɶ����� ��ٷȴٰ� ���� [ �ϳ��� ������� ���ļ� ���� ] 
		// sleep ����
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 10 ; i ++) {
			toolkit.beep(); try {Thread.sleep(3000); // 3000�и��� = 3��
			}catch(Exception e) {}
		}
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		// ��ü����
		
		threadA.start();
		threadB.start(); // ������ ����
		
		try{threadA.sleep(3000);}catch(Exception e) {}
		threadA.work = false; // Thread.yield(); �ش� ������ �Ͻ�����
		
		try {threadA.sleep(3000);}catch(Exception e) {}
		threadA.work = true; // �ش� ������ �Ͻ����� Ǯ��
		
		try {threadA.sleep(3000);}catch(Exception e) {}
		threadA.stop = true; // ������ a,b ����(���������� ���� �� �����尡 �����)
		threadB.stop = true;
		// stop(); : �������� �ʴ� �޼ҵ�(������ ���� ���߿� ���������� ������ �������� ������ ����)
		
		SumThread sumThread = new SumThread();
		// 1. ��ü ����
		sumThread.start();
		// 2.  ������ ����
		try { // 3. main������� sumThread ���� -> �ϳ��� ������
		sumThread.join(); // �Ϲ� ����ó�� �߻�
		}catch(Exception e) {}
		
		// 4.
		System.out.println("1-100 �� :" + sumThread.getsum());
		// main �����尡 join ������ �� : 0
			// sumThread�� ���ϱ� ���������� main ������ sum ���
		// main �����尡 join ���� �� : 5050
	}
}
