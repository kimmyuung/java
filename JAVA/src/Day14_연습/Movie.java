package Day14_����;

public class Movie extends Thread{
static boolean stop = true;

public void moviestop(boolean stop) {
	this.stop= stop;
	if(stop) System.out.println("�������");
	else System.out.println("��������");
}

@Override
	public void run() {
		 try {while(stop) {
				System.out.println("���� ��� ��");
				Thread.sleep(5000);
			}} catch(Exception e) {System.out.println(e);}
	}


}
