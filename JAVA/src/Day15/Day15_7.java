package Day15;

import java.awt.Toolkit;

public class Day15_7 {
	
	public static void main(String[] args) {
		// 스레드 제어
		// 1. sleep() : 주어진 시간동안 일시 정지
		
		// sleep 예제
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 10 ; i ++) {
			toolkit.beep(); try {Thread.sleep(3000); // 3000밀리초 = 3초
			}catch(Exception e) {}
		}
	}
}
