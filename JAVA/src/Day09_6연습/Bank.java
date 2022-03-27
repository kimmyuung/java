package Day09_6연습;

public class Bank {
// 1. field
	private String bnum; // 계좌번호
	private String account; // 계좌 이름
	private String name; // 계좌 소유주의 이름
	private String pw; // 계좌 패스워드
	private int money; // 계좌 잔고
// 2. constructor
	Bank() {}
public Bank(String bnum, String account, String name, String pw, int money) {
	super();
	this.bnum = bnum;
	this.account = account;
	this.name = name;
	this.pw = pw;
	this.money = money;
}
//3. method
public String getBnum() {
	return bnum;
}
public void setBnum(String bnum) {
	this.bnum = bnum;
}
public String getAccount() {
	return account;
}
public void setAccount(String account) {
	this.account = account;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}
	

}
