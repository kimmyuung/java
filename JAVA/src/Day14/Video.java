package Day14;

public class Video extends Thread{
	static boolean stop = true; // ���࿩�� [true : ���� / /false : ����]
	public void Moviestop(boolean stop) {
		this.stop = stop;
		if(stop) {System.out.println("�������");}
		else System.out.println("��������");
	}
	@Override
public void run() {
	while(stop) {
		System.out.println("���������");
		try {Thread.sleep(1000);}catch(Exception e) {}
		
	}

	}
}
