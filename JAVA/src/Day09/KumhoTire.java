package Day09;

public class KumhoTire extends Tire{
				// ����Ŭ���� extends ����Ŭ����
	
// 1. field
// 2. constructor
	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
	} // ����Ŭ������ ������ [�ڵ� ���̱�]
	
// 3. method
	@Override
	public boolean roll() { // ����Ŭ������ �޼ҵ带 ������[����]
		accmulatedRotation++;
		if(accmulatedRotation< maxRotation) {
			System.out.println(location + "KumhoTire ���� : " 
					+ (maxRotation-accmulatedRotation) + "ȸ");
			return true;
			}
		else {System.out.println("***" + location + "KumhoTire ��ũ ***");
		return false;}
		}
	}

