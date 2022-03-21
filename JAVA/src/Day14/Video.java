package Day14;

public class Video extends Thread{
	static boolean stop = true; // 실행여부 [true : 시작 / /false : 종료]
	public void Moviestop(boolean stop) {
		this.stop = stop;
		if(stop) {System.out.println("영상재생");}
		else System.out.println("영상종료");
	}
	@Override
public void run() {
	while(stop) {
		System.out.println("영상재생중");
		try {Thread.sleep(1000);}catch(Exception e) {}
		
	}

	}
}
