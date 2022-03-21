package Day14;

import java.awt.Toolkit;

public class Day14_4 {
public static void main(String[] args) {
	// p. 576 ��Ƽ������
		// ���μ��� : �ü�������� ���� ���� �ϳ��� ���ø����̼�
		// �ü���� ���μ������� �ʿ��� �޸� �Ҵ� [�ڹٿ��� �޸� ���� ���� �Ұ���, �����찡 ����]
		// �̱� ������ : �ڵ� �о��ִ� �帧 1�� = main �޼ҵ�
		// ��Ƽ ������ : �ڵ带 �о��ִ� �帧 ������ = main �޼ҵ� �� ������
		// ���� : ����� �����帧������ / �����尡 �ϳ��� ������(�켱���� �ü���� �Ҵ�) ó��
			// ������� : �ڵ�1 -> �ڵ�2 -> �ڵ�3 -> �ڵ�4 -> �ڵ�5
		// Thread Ŭ����(���ο� ������) vs Main �޼ҵ�(���ν����� ����)
	// 1. Thread Ŭ����
		// 1. ����Ŭ������ extends Thread
		// 2. run() �޼ҵ� �������̵�[������]
		// 3. ��ü ����
		// 4. ��ü.start()
		// * start() �޼ҵ� ȣ��� run �޼ҵ� ����
	// 2. Runnable �������̽�
		// Runnable ����Ŭ������ implements Runnable
		// run �޼ҵ� ����
		// �ܺο��� ������ü ����
		// Thread Ŭ���� ��ü ������ �����ڿ� ������ü �־���
		// thread Ŭ���� ��ü�� start() �޼ҵ� ����
		// *.start() �޼ҵ�� run �޼ҵ� ȣ��
		// * run() �޼ҵ�� main ������ ������ ���ο� ������ ����
	// 3. �͸�ü [ �������̽��� ���� ���� ]
	
	Toolkit toolkit = Toolkit.getDefaultToolkit();
		// �̱۽�����( main �޼ҵ� ) , 0.5�� �������� �Ҹ�����, 0.5�� �������� �� ���
	for(int i = 0; i<5; i++) {
		toolkit.beep(); System.out.println("��");
		try {
		Thread.sleep(500); // �������� : ���ν����带 0.5�ʰ� �Ͻ�����
		}catch(Exception e) {}
	}
	System.out.println("-----------------------");
	Runnable beepTask = new BeepTask();
	Thread thread = new Thread(beepTask);
	thread.start();
	
	for(int i = 0; i<5; i++) {
		toolkit.beep(); System.out.println("��");
		try {
			Thread.sleep(500);
		} catch(Exception e) {}
	}
	// Ŭ���� ��ü ����
	Thread thread2 = new BeepThread();
	// ����Ŭ���� = �ڽ�Ŭ������ ������  /////�θ� <------�ڽ� (�ڵ�����ȯ) ///// �θ� ------> �ڽ� (��������ȯ)
	thread2.start();
	// 2. ������ ��ü�� start()
		// ������ ��ü�� start() ȣ�� 
			// 1. run �޼ҵ� ȣ�� ����[��Ƽ������ ����]
	System.out.println("-----------------------");
	System.out.println();
	
	for(int i = 0; i<5; i++) {
		toolkit.beep(); System.out.println("��");
		try {
			Thread.sleep(500);
		} catch(Exception e) {}
	}
	System.out.println("-----------------------");
	
	// * �͸� ������ ��ü
	Runnable runnable = new Runnable() {
		// �������̽��� ������
		// �������̽��� new (�޸��Ҵ�) -> �޸� �Ҵ� ���� �߻�޼ҵ带 ���� ����
		// �߻�޼ҵ带 �������� ������ �͸�ü ���� �Ұ�
		// 1. Ŭ�������� implements �� �Ŀ� ����
		// 2. �������̽��� new �����ڸ� ���� �߻�޼ҵ� ���� => �͸� ��ü[ Ŭ���� ���� X ]
		@Override
		public void run() {
			// TODO Auto-generated method stub
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i =0; i < 5 ; i++) {
				toolkit.beep();
				try {Thread.sleep(500);}
				catch(Exception e) {}
			}
		}
	};
	Thread thread3 = new Thread(runnable); // ������ Ŭ���� �� �����ڿ� �������������̽� �ֱ�
	thread3.start();
	
	System.out.println("-----------------------");
	System.out.println("MAIN �޼ҵ� �ȿ� �ִ� ������ �̸� : " + Thread.currentThread().getName());
											//Thread.currentThread() : �� �ڵ带 �о��ִ� ������ ȣ�� // setName() : ������ �̸� ����
	System.out.println("�۾� ������ �̸� : " + thread.getName());
	System.out.println("�۾� ������ �̸� : " + thread2.getName());
	System.out.println("�۾� ������ �̸� : " + thread3.getName());
	
	
	System.out.println("-----------------------");
	for(int i = 0 ; i < 10 ; i++) {
		// i�� 1�϶� ������ ��ü ����[���� ���� ������ ��ü ����]
		// * ���� ��������� ��ȯ�Ҵ�[�ü�� => �����ٸ�]�̹Ƿ� ���� ���� ������ ����
		// 1. i��° ������ ��ü ����
		Thread thread4 = new CalcThread("thread" + i);
		// 2. i��° ������ ����
		thread4.start();
		// * �켱����
		if(i != 10) {thread4.setPriority(Thread.MIN_PRIORITY);}
		else thread4.setPriority(Thread.MAX_PRIORITY);
	}
	
	
	
	}
}
