package Day15;

import java.awt.Toolkit;

public class Day15_7 {
	
	public static void main(String[] args) {
		// ������ ����
		// 1. sleep() : �־��� �ð����� �Ͻ� ����
		
		// sleep ����
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 10 ; i ++) {
			toolkit.beep(); try {Thread.sleep(3000); // 3000�и��� = 3��
			}catch(Exception e) {}
		}
	}
}
