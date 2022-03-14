package Day09;

public class HankookTire extends Tire{
// 1. field
	
// 2. constructor
public HankookTire(int maxRotation, String location) {
	super( maxRotation, location);
}
// 3. method
@Override
public boolean roll() {
	accmulatedRotation++;
	if(accmulatedRotation< maxRotation) {
		System.out.println(location + "HankookTire ¼ö¸í : " 
				+ (maxRotation-accmulatedRotation) + "È¸");
		return true;
		}
	else {System.out.println("***" + location + "HankookTire ÆãÅ© ***");
	return false;}
	}
}
