package Day10_7_연습;

public class 점포 implements 키오스크인터페이스{
String 주소;
public 점포() {}
@Override
	public void 결제() {
		System.out.println("결제");
	}
@Override
	public void 상품추가() {
		System.out.println("상품 추가");
	}
@Override
	public void 장바구니() {
		System.out.println("장바구니");
	}
@Override
	public void 제품목록() {
		System.out.println("제품 목록");
	}

}
