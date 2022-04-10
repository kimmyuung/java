package 개인과제구상;

import java.util.ArrayList;

public class 팀원 {
private String 팀원이름;
private String 팀원특성;
private String 팀원시너지;
private int 팀원번호;

public 팀원() {}

public 팀원(String 팀원이름, String 팀원특성, String 팀원시너지, int 팀원번호) {
	super();
	this.팀원이름 = 팀원이름;
	this.팀원특성 = 팀원특성;
	this.팀원시너지 = 팀원시너지;
	this.팀원번호 = 팀원번호;
}

public 팀원(String 팀원이름, String 팀원특성, String 팀원시너지) {
	super();
	this.팀원이름 = 팀원이름;
	this.팀원특성 = 팀원특성;
	this.팀원시너지 = 팀원시너지;
}

public String get팀원이름() {
	return 팀원이름;
}

public void set팀원이름(String 팀원이름) {
	this.팀원이름 = 팀원이름;
}

public String get팀원특성() {
	return 팀원특성;
}

public void set팀원특성(String 팀원특성) {
	this.팀원특성 = 팀원특성;
}

public String get팀원시너지() {
	return 팀원시너지;
}

public void set팀원시너지(String 팀원시너지) {
	this.팀원시너지 = 팀원시너지;
}

public int get팀원번호() {
	return 팀원번호;
}

public void set팀원번호(int 팀원번호) {
	this.팀원번호 = 팀원번호;
}


}
