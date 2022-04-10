package 개인과제구상;

public class 팀장 extends 팀원{
private String 팀장이름;
private String 팀장효과;

public 팀장(String 팀장이름, String 팀장효과) {
	super();
	this.팀장이름 = 팀장이름;
	this.팀장효과 = 팀장효과;
}

public String get팀장이름() {
	return 팀장이름;
}

public void set팀장이름(String 팀장이름) {
	this.팀장이름 = 팀장이름;
}

public String get팀장효과() {
	return 팀장효과;
}

public void set팀장효과(String 팀장효과) {
	this.팀장효과 = 팀장효과;
}


}
