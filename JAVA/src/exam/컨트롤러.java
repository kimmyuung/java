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

public class ��Ʈ�ѷ� {
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Car> parklist = new ArrayList<>();

	public boolean ����(String number) {
		LocalDate Date = LocalDate.now();
		LocalTime time1 = LocalTime.now();
		for (Car temp : parklist) { // ������ȣ �ߺ� �˻�
			if (temp != null && temp.get������ȣ().contains(number)) {
				System.out.println("������ȣ�� �ߺ��˴ϴ�.");
				return false;
			}
		}
		Car car = new Car(Date, number, time1, null, 0);

		parklist.add(car);
		return true;
	}

	public boolean ����(String number1) {
		int i = 0;
		for (Car temp : parklist) {
			if (temp != null && temp.get������ȣ().equals(number1)) {
				LocalTime �����ð� = LocalTime.now();
				int �������� = (int) ChronoUnit.MINUTES.between(temp.get�����ð�(), �����ð�);
				int ������� = 0;
				if (�������� < 30) {
					������� = 0;
				} else {
					������� = (�������� - 30) / 10 * 1000;
				}
				��Ʈ�ѷ�.parklist.get(i).set�����ð�(�����ð�);
				��Ʈ�ѷ�.parklist.get(i).set�ݾ�(�������);
				return true;
			}
			i++;
		}
		return false;
	}

}
