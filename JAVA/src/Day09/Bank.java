package Day09;

public class Bank {

	// 1. field
	private String bnum; // 계좌번호[중복x]
	private String pw; // 비밀번호
	private String name; // 계좌주
	private int bmoney; // 예금액
	
	
	// 2. constructor
public Bank() {}
public Bank(String bnum, String pw, String name, int bmoney) {
		
		this.bnum = bnum;
		this.pw = pw;
		this.name = name;
		this.bmoney = bmoney;
	}
	// 3. method

// 7. get, set 메소드[필드가 private 인경우]
public String getBnum() {
	return bnum;
}
public void setBnum(String bnum) {
	this.bnum = bnum;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBmoney() {
	return bmoney;
}
public void setBmoney(int bmoney) {
	this.bmoney = bmoney;
}

}
