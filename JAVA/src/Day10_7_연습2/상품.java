package Day10_7_연습2;

public class 상품 {
String 상품종류;
private int 상품가격;
private int 상품재고;
public 상품() {}
public 상품(String 상품종류, int 상품가격, int 상품재고) {
	super();
	this.상품종류 = 상품종류;
	this.상품가격 = 상품가격;
	this.상품재고 = 상품재고;
}
public String get상품종류() {
	return 상품종류;
}
public void set상품종류(String 상품종류) {
	this.상품종류 = 상품종류;
}
public int get상품가격() {
	return 상품가격;
}
public void set상품가격(int 상품가격) {
	this.상품가격 = 상품가격;
}
public int get상품재고() {
	return 상품재고;
}
public void set상품재고(int 상품재고) {
	this.상품재고 = 상품재고;
}

}
