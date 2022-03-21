package Day14;

import java.awt.Toolkit;

public class Day14_4 {
public static void main(String[] args) {
	// p. 576 멀티스레드
		// 프로세스 : 운영체제에서는 실행 중인 하나의 애플리케이션
		// 운영체제가 프로세스에게 필요한 메모리 할당 [자바에서 메모리 관리 직접 불가능, 윈도우가 수행]
		// 싱글 스레드 : 코드 읽어주는 흐름 1개 = main 메소드
		// 멀티 스레드 : 코드를 읽어주는 흐름 여러개 = main 메소드 외 여러개
		// 병렬 : 설계상 병렬흐름이지만 / 스레드가 하나씩 순차적(우선순위 운영체제가 할당) 처리
			// 실행순서 : 코드1 -> 코드2 -> 코드3 -> 코드4 -> 코드5
		// Thread 클래스(새로운 스레드) vs Main 메소드(메인스레드 내장)
	// 1. Thread 클래스
		// 1. 임의클래스에 extends Thread
		// 2. run() 메소드 오버라이딩[재정의]
		// 3. 객체 생성
		// 4. 객체.start()
		// * start() 메소드 호출시 run 메소드 실행
	// 2. Runnable 인터페이스
		// Runnable 임의클래스에 implements Runnable
		// run 메소드 구현
		// 외부에서 구현객체 생성
		// Thread 클래스 객체 생성시 생성자에 구현객체 넣어줌
		// thread 클래스 객체내 start() 메소드 실행
		// *.start() 메소드는 run 메소드 호출
		// * run() 메소드는 main 스레드 제외한 새로운 스레드 만듦
	// 3. 익명객체 [ 인터페이스내 직접 구현 ]
	
	Toolkit toolkit = Toolkit.getDefaultToolkit();
		// 싱글스레드( main 메소드 ) , 0.5초 간격으로 소리실행, 0.5초 간격으로 띵 출력
	for(int i = 0; i<5; i++) {
		toolkit.beep(); System.out.println("띵");
		try {
		Thread.sleep(500); // 현스레드 : 메인스레드를 0.5초간 일시정지
		}catch(Exception e) {}
	}
	System.out.println("-----------------------");
	Runnable beepTask = new BeepTask();
	Thread thread = new Thread(beepTask);
	thread.start();
	
	for(int i = 0; i<5; i++) {
		toolkit.beep(); System.out.println("띵");
		try {
			Thread.sleep(500);
		} catch(Exception e) {}
	}
	// 클래스 객체 생성
	Thread thread2 = new BeepThread();
	// 슈퍼클래스 = 자식클래스의 생성자  /////부모 <------자식 (자동형변환) ///// 부모 ------> 자식 (강제형변환)
	thread2.start();
	// 2. 스레드 객체내 start()
		// 스레드 객체내 start() 호출 
			// 1. run 메소드 호출 역할[멀티스레드 실행]
	System.out.println("-----------------------");
	System.out.println();
	
	for(int i = 0; i<5; i++) {
		toolkit.beep(); System.out.println("띵");
		try {
			Thread.sleep(500);
		} catch(Exception e) {}
	}
	System.out.println("-----------------------");
	
	// * 익명 스레드 객체
	Runnable runnable = new Runnable() {
		// 인터페이스명 변수명
		// 인터페이스에 new (메모리할당) -> 메모리 할당 위해 추상메소드를 먼저 구현
		// 추상메소드를 구현하지 않으면 익명객체 선언 불가
		// 1. 클래스에게 implements 한 후에 구현
		// 2. 인터페이스에 new 연산자를 통한 추상메소드 구현 => 익명 객체[ 클래스 관련 X ]
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
	Thread thread3 = new Thread(runnable); // 스레드 클래스 내 생성자에 스레드인터페이스 넣기
	thread3.start();
	
	System.out.println("-----------------------");
	System.out.println("MAIN 메소드 안에 있는 스레드 이름 : " + Thread.currentThread().getName());
											//Thread.currentThread() : 현 코드를 읽어주는 스레드 호출 // setName() : 스레드 이름 변경
	System.out.println("작업 스레드 이름 : " + thread.getName());
	System.out.println("작업 스레드 이름 : " + thread2.getName());
	System.out.println("작업 스레드 이름 : " + thread3.getName());
	
	
	System.out.println("-----------------------");
	for(int i = 0 ; i < 10 ; i++) {
		// i가 1일때 스레드 객체 생성[가장 먼저 스레드 객체 생성]
		// * 먼저 만들어져도 순환할당[운영체제 => 스케줄링]이므로 가장 먼저 끝나지 않음
		// 1. i번째 스레드 객체 생성
		Thread thread4 = new CalcThread("thread" + i);
		// 2. i번째 스레드 실행
		thread4.start();
		// * 우선순위
		if(i != 10) {thread4.setPriority(Thread.MIN_PRIORITY);}
		else thread4.setPriority(Thread.MAX_PRIORITY);
	}
	
	
	
	}
}
