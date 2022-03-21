package Day14;

public class CalcThread extends Thread{

	public CalcThread(String name) {
	setName(name); // 인수로 받은 데이터로 스레드이름 정함
}
	// 멀티스레드 실행 [ 오버라이딩 ]
	@Override
	public void run() {
		for(int i =0; i<200000000; i++) {
			
		}
		System.out.println("현재 실행중인 스레드명 : "+getName());
	}
	
	
}
