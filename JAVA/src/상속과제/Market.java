package ��Ӱ���;

import Day09.Tire;

public class Market {
	
String ����ʾ��̵�;
String ����ʺ�й�ȣ;
String �ڵ�����ȣ;
Market emarket = new Market();
Market lottemarket = new Market();
Market () {}

public Market(String ����ʾ��̵�, String ����ʺ�й�ȣ, String �ڵ�����ȣ) {
	super();
	
	this.����ʾ��̵� = ����ʾ��̵�;
	this.����ʺ�й�ȣ = ����ʺ�й�ȣ;
	this.�ڵ�����ȣ = �ڵ�����ȣ;
}

boolean ȸ������ (String id, String pw, String number) {
	Market market = new Market(id, pw ,number);
	�����÷��̽�.memberlist.add(market);
	return false;
}


}
