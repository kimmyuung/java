package 상속과제;

import Day09.Tire;

public class Market {
	
String 멤버십아이디;
String 멤버십비밀번호;
String 핸드폰번호;
Market emarket = new Market();
Market lottemarket = new Market();
Market () {}

public Market(String 멤버십아이디, String 멤버십비밀번호, String 핸드폰번호) {
	super();
	
	this.멤버십아이디 = 멤버십아이디;
	this.멤버십비밀번호 = 멤버십비밀번호;
	this.핸드폰번호 = 핸드폰번호;
}

boolean 회원가입 (String id, String pw, String number) {
	Market market = new Market(id, pw ,number);
	마켓플레이스.memberlist.add(market);
	return false;
}


}
