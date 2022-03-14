package Day09;

public class KumhoTire extends Tire{
				// 서브클래스 extends 슈퍼클래스
	
// 1. field
// 2. constructor
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	} // 슈퍼클래스내 생성자 [코드 줄이기]
	
// 3. method
	@Override
	public boolean roll() { // 슈퍼클래스내 메소드를 재정의[수정]
		accmulatedRotation++;
		if(accmulatedRotation< maxRotation) {
			System.out.println(location + "KumhoTire 수명 : " 
					+ (maxRotation-accmulatedRotation) + "회");
			return true;
			}
		else {System.out.println("***" + location + "KumhoTire 펑크 ***");
		return false;}
		}
	}

