package 주차타워_팀과제;

public class 매출 {
private int 금액;
private String 연;
private String 월;
private String 일;

public 매출() {}
public 매출(int 금액, String 연, String 월, String 일) {
	super();
	this.금액 = 금액;
	this.연 = 연;
	this.월 = 월;
	this.일 = 일;
}
public int get금액() {
	return 금액;
}
public void set금액(int 금액) {
	this.금액 = 금액;
}
public String get연() {
	return 연;
}
public void set연(String 연) {
	this.연 = 연;
}
public String get월() {
	return 월;
}
public void set월(String 월) {
	this.월 = 월;
}
public String get일() {
	return 일;
}
public void set일(String 일) {
	this.일 = 일;
}


}
