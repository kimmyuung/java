package Day14;

public class Sound extends Thread{
static boolean stop = true; // 실행여부 [true : 시작 / /false : 종료]

public void Soundstop(boolean stop) {
	this.stop = stop;
	if(this.stop) {System.err.println("소리재생 시작");}
	else {System.out.println("소리 끄기");}
}
@Override
public void run() {
	while(this.stop) // stop 변수가 true이면 무한루프 [ 종료조건 : stop변수가 false이면]
	{System.out.println("소리 재생중");}
	try {Thread.sleep(1000);} catch(Exception e) {}
	
	
	
	}
}
