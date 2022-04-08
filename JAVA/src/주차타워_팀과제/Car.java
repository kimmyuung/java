package 주차타워_팀과제;

import java.time.LocalDateTime;

public class Car {
private String 차번호;
private LocalDateTime 입차시간;
private LocalDateTime 출차시간;

public Car() {}


public Car(String 차번호, LocalDateTime 입차시간, LocalDateTime 출차시간) {
	super();
	this.차번호 = 차번호;
	this.입차시간 = 입차시간;
	this.출차시간 = 출차시간;
}


public String get차번호() {
	return 차번호;
}

public void set차번호(String 차번호) {
	this.차번호 = 차번호;
}


public LocalDateTime get입차시간() {
	return 입차시간;
}


public void set입차시간(LocalDateTime 입차시간) {
	this.입차시간 = 입차시간;
}


public LocalDateTime get출차시간() {
	return 출차시간;
}


public void set출차시간(LocalDateTime 출차시간) {
	this.출차시간 = 출차시간;
}


}
