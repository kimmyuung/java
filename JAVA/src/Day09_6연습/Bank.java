package Day09_6����;

public class Bank {
// 1. field
	private String bnum; // ���¹�ȣ
	private String account; // ���� �̸�
	private String name; // ���� �������� �̸�
	private String pw; // ���� �н�����
	private int money; // ���� �ܰ�
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
