package 주차타워_팀과제;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
// 주차요금 : 10분당 1000원
// 처음 30분은 무료, 24시간 이상 주차시 5만원
public class 컨트롤러 {

static ArrayList<Car> carlist = new ArrayList<>();
static String[] parktower;
String[] 주차타워건설 (int park) {
	parktower = new String[park];
	for(int i = 0; i < park; i++) {
		if(parktower[i] == null) {
		parktower[i] = "[ ]";
		}
	}
	return parktower;
}
boolean 입차 (String Carnum, int location) {
	LocalDateTime sdt = LocalDateTime.now();
	for(int i = 0; i < parktower.length; i++) {
		if(parktower[location].equals("[o]")) {
		return false;
		}
	}
	
	for(int i = 0; i < parktower.length; i++) {
		if(parktower[i] != null && parktower[location].equals("[ ]")) {
		parktower[location] = "[o]";
		}
	}
	for(Car temp : carlist) {
		if(temp.get차번호().equals(Carnum)) {
			return false;
		}
	}
	Car myCar = new Car(Carnum, sdt, null);
	carlist.add(myCar);
	
	return true;
}
boolean 출차 (String carNum) {
	for(Car temp : carlist) { // 유효성 검사
		if(!temp.get차번호().equals(carNum)) {
			return false;
		}
	}
	for(int i = 0; i < parktower.length; i++) { // 주차 가능 상태로 바꾸기
		if(parktower[i].equals("[o]")) {
		parktower[i] = "[ ]";
		}
	}
	return true;
}
void 매출누적() {}
int 계산 () {
	LocalDateTime edt = LocalDateTime.now();
	for(Car temp : carlist) {
		
	}
	return 0;
}
void 매출저장() {}
void 매출출력() {}
}
