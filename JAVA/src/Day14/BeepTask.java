package Day14;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
				// Runnable ����Ŭ������ implements Runnable
				// run �޼ҵ� ����
				// �ܺο��� ������ü ����
				// Thread Ŭ���� ��ü ������ �����ڿ� ������ü �־���
				// thread Ŭ���� ��ü�� start() �޼ҵ� ����
				// *.start() �޼ҵ�� run �޼ҵ� ȣ��
				// * run() �޼ҵ�� main ������ ������ ���ο� ������ ����
@Override
public void run() { // Runnable �������̽��� run �޼ҵ�
	
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for(int i = 0; i < 5; i++) {
		toolkit.beep();
		try {
		Thread.sleep(500); // �Ϲݿ��ܰ� ������ �߻�
	}catch(Exception e) { }
	}

	
	for(int i = 0; i < 5; i++) {
		System.out.println("��");
		try {
		Thread.sleep(500); // �Ϲݿ��ܰ� ������ �߻�
	}catch(Exception e) { }
	}
}


}
