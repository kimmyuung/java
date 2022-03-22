package Day08_5연습;

public class Borrow {
private int 대출금액;
private int 상환금액;
Borrow () {}
public Borrow(int 대출금액, int 상환금액) {
	super();
	this.대출금액 = 대출금액;
	this.상환금액 = 상환금액;
}
public int get대출금액() {
	return 대출금액;
}
public void set대출금액(int 대출금액) {
	this.대출금액 = 대출금액;
}
public int get상환금액() {
	return 상환금액;
}
public void set상환금액(int 상환금액) {
	this.상환금액 = 상환금액;
}

}
