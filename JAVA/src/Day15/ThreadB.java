package Day15;

public class ThreadB extends Thread{
	// field
		public boolean stop = false; // 종료 플래그
		public boolean work = true; // 작업진행여부 플래그
	
		@Override
		public void run() {
			while(!stop) { // stop이 false가 아니면 무한루프
				if(work) { // work가 true이면
					System.out.println("Thread B 작업 내용");
				} else {Thread.yield();} // work가 false이면 다른 스레드에게 양보
			} // w e
			System.out.println("Thread B 종료");
		} // run end
}
