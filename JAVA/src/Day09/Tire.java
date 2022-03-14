package Day09;

public class Tire {
	// 1. field
	public int maxRotation; // 최대회전수[회전가능수]
	public int accmulatedRotation; // 누적 회전수
	public String location; // 타이어 위치
	// 2. constructor
	public Tire(int maxRotation, String location) {
		
		this.maxRotation = maxRotation; 
		// 외부로부터 전달받은 인수를 내부변수에 대입
		this.location = location;
	}
	
	// 3. method
	public boolean roll() {// 타이어 회전 구현 메소드
		accmulatedRotation++; // 누적회전수를 1증가
		if(accmulatedRotation<maxRotation) { // 만약에 누적회전수가 최대회전수보다 작으면(수명 남음)
		System.out.println(location + "Tire 수명 : " 
		+ (maxRotation-accmulatedRotation) + "회");
		return true;	}
		else {System.out.println("***" + location + "Tire 펑크 ***");
		return false; // 아니면 [수명없다]
		}
	}
}
