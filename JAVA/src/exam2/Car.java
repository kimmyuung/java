package exam2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Car {
	// 1. field
private LocalDate 주차날짜;
private String 차량번호;
private LocalTime 입차시간;
private LocalTime 출차시간;
private int 금액;
	// 2. constructor
public Car() {}
public Car(LocalDate 주차날짜, String 차량번호, LocalTime 입차시간, LocalTime 출차시간, int 금액) {
	super();
	this.주차날짜 = 주차날짜;
	this.차량번호 = 차량번호;
	this.입차시간 = 입차시간;
	this.출차시간 = 출차시간;
	this.금액 = 금액;
}
	// 3. method(getter and setter)
public LocalDate get주차날짜() {
	return 주차날짜;
}
public void set주차날짜(LocalDate 주차날짜) {
	this.주차날짜 = 주차날짜;
}
public String get차량번호() {
	return 차량번호;
}
public void set차량번호(String 차량번호) {
	this.차량번호 = 차량번호;
}
public LocalTime get입차시간() {
	return 입차시간;
}
public void set입차시간(LocalTime 입차시간) {
	this.입차시간 = 입차시간;
}
public LocalTime get출차시간() {
	return 출차시간;
}
public void set출차시간(LocalTime 출차시간) {
	this.출차시간 = 출차시간;
}
public int get금액() {
	return 금액;
}
public void set금액(int 금액) {
	this.금액 = 금액;
}

}
