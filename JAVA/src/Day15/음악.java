package Day15;

public class À½¾Ç extends Thread{

	@Override
	public void run() {
		while(true) {
			System.out.println("¿ï·Á´ò¾î »çÀÌ·» ~~");
			try{Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
