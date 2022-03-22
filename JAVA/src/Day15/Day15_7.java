package Day15;

import java.awt.Toolkit;

public class Day15_7 {
	
	public static void main(String[] args) {
		// 스레드 제어
		// 1. Thread.sleep() : 주어진 시간동안 일시 정지
		// 2. Thread.yield() : 다른 스레드에게 실행 양보 [ 대기 상태로 변경 ]
		// 3. Thread.join() : 다른 스레드가 종료될때까지 기다렸다가 실행 [ 하나의 스레드로 합쳐서 실행 ] 
		// sleep 예제
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 10 ; i ++) {
			toolkit.beep(); try {Thread.sleep(3000); // 3000밀리초 = 3초
			}catch(Exception e) {}
		}
		
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		// 객체생성
		
		threadA.start();
		threadB.start(); // 스레드 시작
		
		try{threadA.sleep(3000);}catch(Exception e) {}
		threadA.work = false; // Thread.yield(); 해당 스레드 일시정지
		
		try {threadA.sleep(3000);}catch(Exception e) {}
		threadA.work = true; // 해당 스레드 일시정지 풀기
		
		try {threadA.sleep(3000);}catch(Exception e) {}
		threadA.stop = true; // 스레드 a,b 종료(마지막까지 실행 후 스레드가 종료됨)
		threadB.stop = true;
		// stop(); : 권장하지 않는 메소드(스레드 실행 도중에 꺼져버리기 때문에 스레드의 안정성 문제)
		
		SumThread sumThread = new SumThread();
		// 1. 객체 생성
		sumThread.start();
		// 2.  스레드 실행
		try { // 3. main스레드와 sumThread 조인 -> 하나의 스레드
		sumThread.join(); // 일반 예외처리 발생
		}catch(Exception e) {}
		
		// 4.
		System.out.println("1-100 합 :" + sumThread.getsum());
		// main 스레드가 join 안했을 때 : 0
			// sumThread가 더하기 끝나기전에 main 스레드 sum 출력
		// main 스레드가 join 했을 때 : 5050
	}
}
