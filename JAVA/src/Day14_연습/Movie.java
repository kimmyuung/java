package Day14_연습;

public class Movie extends Thread{
static boolean stop = true;

public void moviestop(boolean stop) {
	this.stop= stop;
	if(stop) System.out.println("영상재생");
	else System.out.println("영상종료");
}

@Override
	public void run() {
		 try {while(stop) {
				System.out.println("영상 재생 중");
				Thread.sleep(5000);
			}} catch(Exception e) {System.out.println(e);}
	}


}
