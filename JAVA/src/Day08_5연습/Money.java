package Day08_5¿¬½À;

public class Money {
String account;
String pw;
int money;

Money () {}
public Money(String account, String pw, int money) {
	super();
	this.account = account;
	this.pw = pw;
	this.money = money;
}
public String getAccount() {
	return account;
}
public void setAccount(String account) {
	this.account = account;
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
