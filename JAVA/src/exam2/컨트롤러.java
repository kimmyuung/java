package exam2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class 컨트롤러 {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Car> parklist = new ArrayList<Car>(); // Car라는 객체를 가지는 리스트 선언
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
	
	boolean 입차(String number) { // 입차 메소드 시작
		LocalDate localdate = LocalDate.now(); // 현재날짜를 객체로 선언 new는 안써도 됨!
		LocalTime 입차시간 = LocalTime.now(); // 현재시간을 객체로 선언

		for (Car temp : parklist) { // 유효성검사
			if (parklist.size() != 0 && temp.get차량번호().equals(number)) {
				return false; // 동일한 차량번호가 있으면 false 반환
			}
		}
		Car car = new Car(localdate, number, 입차시간, null, 0); // 차 객체 선언
		parklist.add(car); // 주차리스트에 car라는 객체를 저장
		return true; // 트루 반환
	}

	boolean 출차(String number) {
		LocalTime 출차시간 = LocalTime.now(); // 현재 시간을 출차시간으로 설정
		int i = 0; // 주차리스트의 인덱스 값 설정
		for(Car temp : parklist) { // 주차리스트의 수만큼 반복문 실행
			if(temp != null && temp.get차량번호().equals(number)) {
				temp.set출차시간(출차시간); // 지금 시간을 출차시간으로 설정
				int 총시간 = (int)ChronoUnit.MINUTES.between(temp.get입차시간(), 출차시간);
				// 총시간을 계산(입차시간과 출차시간의 분차이를 이용하여) 결과가 String이므로 int로 강제변환
				int 계산 = 0; // 계산금액 설정 0은 초기값
				if(총시간 > 30) {계산 = (총시간 - 30) /10 * 1000;} // 30분 이상시 30분이 무료이기때문에 빼고 계산
				else {계산 = 0;} // 아니라면 공짜!
				컨트롤러.parklist.get(i).set금액(계산); // 주차리스트의 인덱스의 비어 있는 금액을 수정
				컨트롤러.parklist.get(i).set출차시간(출차시간); // 주차리스트의 인덱스의 비어 있는 출차시간을 수정
				return true;
			}
		i++;} // 인덱스 증가
		return false;
	}
}
