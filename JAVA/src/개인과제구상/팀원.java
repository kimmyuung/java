package 개인과제구상;

public class 팀원 extends 팀장{
String 이름;
String 특성;
String 시너지;
String 효과;

public 팀원(String 이름, String 특성, String 시너지) {
	super();
	this.이름 = 이름;
	this.특성 = 특성;
	this.시너지 = 시너지;
	
}
팀원 () {}
public String get이름() {
	return 이름;
}
public void set이름(String 이름) {
	this.이름 = 이름;
}
public String get특성() {
	return 특성;
}
public void set특성(String 특성) {
	this.특성 = 특성;
}
public String get시너지() {
	return 시너지;
}
public void set시너지(String 시너지) {
	this.시너지 = 시너지;
}
public String get효과() {
	return 효과;
}
public void set효과(String 효과) {
	this.효과 = 효과;
}

}
