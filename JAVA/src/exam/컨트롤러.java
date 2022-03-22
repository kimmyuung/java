package exam;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class 컨트롤러 {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Car> parklist = new ArrayList<>();

	public boolean 입차(String number) {
		LocalDate Date = LocalDate.now();
		LocalTime time1 = LocalTime.now();
		for (Car temp : parklist) { // 차량번호 중복 검사
			if (temp != null && temp.get차량번호().contains(number)) {
				System.out.println("차량번호가 중복됩니다.");
				return false;
			}
		}
		Car car = new Car(Date, number, time1, null, 0);

		parklist.add(car);
		return true;
	}

	public boolean 출차(String number1) {
		int i = 0;
		for (Car temp : parklist) {
			if (temp != null && temp.get차량번호().equals(number1)) {
				LocalTime 출차시간 = LocalTime.now();
				int 총주차분 = (int) ChronoUnit.MINUTES.between(temp.get입차시간(), 출차시간);
				int 주차요금 = 0;
				if (총주차분 < 30) {
					주차요금 = 0;
				} else {
					주차요금 = (총주차분 - 30) / 10 * 1000;
				}
				컨트롤러.parklist.get(i).set출차시간(출차시간);
				컨트롤러.parklist.get(i).set금액(주차요금);
				return true;
			}
			i++;
		}
		return false;
	}

}
