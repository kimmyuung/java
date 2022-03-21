package Day14;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
				// Runnable 임의클래스에 implements Runnable
				// run 메소드 구현
				// 외부에서 구현객체 생성
				// Thread 클래스 객체 생성시 생성자에 구현객체 넣어줌
				// thread 클래스 객체내 start() 메소드 실행
				// *.start() 메소드는 run 메소드 호출
				// * run() 메소드는 main 스레드 제외한 새로운 스레드 만듦
@Override
public void run() { // Runnable 인터페이스내 run 메소드
	
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for(int i = 0; i < 5; i++) {
		toolkit.beep();
		try {
		Thread.sleep(500); // 일반예외가 무조건 발생
	}catch(Exception e) { }
	}

	
	for(int i = 0; i < 5; i++) {
		System.out.println("띵");
		try {
		Thread.sleep(500); // 일반예외가 무조건 발생
	}catch(Exception e) { }
	}
}


}
