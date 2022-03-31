package 개인과제구상;

import java.util.ArrayList;

public class 팀장 extends 게임컨트롤러{
private String 이름;
private String 스타일;
private ArrayList<팀원> 선택리스트 = new ArrayList<팀원>();
private int 포인트;


public 팀장(String 이름, String 스타일, ArrayList<팀원> 선택리스트, int 포인트) {
	super();
	this.이름 = 이름;
	this.스타일 = 스타일;
	this.선택리스트 = 선택리스트;
	this.포인트 = 포인트;
}
팀장 () {}
public String get이름() {
	return 이름;
}
public void set이름(String 이름) {
	this.이름 = 이름;
}
public String get스타일() {
	return 스타일;
}
public void set스타일(String 스타일) {
	this.스타일 = 스타일;
}
public int get포인트() {
	return 포인트;
}
public void set포인트(int 포인트) {
	this.포인트 = 포인트;
}
public ArrayList<팀원> get선택리스트() {
	return 선택리스트;
}
public void set선택리스트(ArrayList<팀원> 선택리스트) {
	this.선택리스트 = 선택리스트;
}

}
