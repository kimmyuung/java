package Day14;

public class Sound extends Thread{
static boolean stop = true; // ���࿩�� [true : ���� / /false : ����]

public void Soundstop(boolean stop) {
	this.stop = stop;
	if(this.stop) {System.err.println("�Ҹ���� ����");}
	else {System.out.println("�Ҹ� ����");}
}
@Override
public void run() {
	while(this.stop) // stop ������ true�̸� ���ѷ��� [ �������� : stop������ false�̸�]
	{System.out.println("�Ҹ� �����");}
	try {Thread.sleep(1000);} catch(Exception e) {}
	
	
	
	}
}
