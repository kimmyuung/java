package Day15;

public class 채팅 implements Runnable{
@Override
public void run() {
	// 병렬처리 실행
	while(true) { // 채팅클래스내 스레드가 실행
		System.out.println("채팅 중 ~~");
		try{Thread.sleep(500);}catch(Exception e) {}
	}
}
}
