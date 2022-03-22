package exam;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class 컨트롤러 {
public static Scanner sc = new Scanner(System.in);
public static ArrayList<Car> parklist = new ArrayList<>(); 

static LocalDate time2 = LocalDate.now();


	public boolean 입차 (String number) {
		Date Date = new Date();
		LocalTime time1 = LocalTime.now();
		for(Car temp : parklist) { // 차량번호 중복 검사
			if(temp != null && temp.get차량번호().contains(number)) 
			{
			System.out.println("차량번호가 중복됩니다.");
			return false;
			}
		}
		Car car = new Car(time2, number, time1, null, 0);
		
		parklist.add(car);
		return true;
	}
	public boolean 출차 (String number1) {
		int 계산비율 = 1000;
		for(Car temp : parklist) {
			if(temp != null && temp.get차량번호().equals(number1)) {
				LocalTime 출차시간 = LocalTime.now();
				temp.get입차시간().until(출차시간, ChronoUnit.MINUTES);
				System.out.println(temp.get입차시간().until(출차시간, ChronoUnit.MINUTES));
			}
		}
		return false;
	}
	
	
}
