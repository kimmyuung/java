package exam2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class ��Ʈ�ѷ� {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Car> parklist = new ArrayList<Car>(); // Car��� ��ü�� ������ ����Ʈ ����
	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
	
	boolean ����(String number) { // ���� �޼ҵ� ����
		LocalDate localdate = LocalDate.now(); // ���糯¥�� ��ü�� ���� new�� �Ƚᵵ ��!
		LocalTime �����ð� = LocalTime.now(); // ����ð��� ��ü�� ����

		for (Car temp : parklist) { // ��ȿ���˻�
			if (parklist.size() != 0 && temp.get������ȣ().equals(number)) {
				return false; // ������ ������ȣ�� ������ false ��ȯ
			}
		}
		Car car = new Car(localdate, number, �����ð�, null, 0); // �� ��ü ����
		parklist.add(car); // ��������Ʈ�� car��� ��ü�� ����
		return true; // Ʈ�� ��ȯ
	}

	boolean ����(String number) {
		LocalTime �����ð� = LocalTime.now(); // ���� �ð��� �����ð����� ����
		int i = 0; // ��������Ʈ�� �ε��� �� ����
		for(Car temp : parklist) { // ��������Ʈ�� ����ŭ �ݺ��� ����
			if(temp != null && temp.get������ȣ().equals(number)) {
				temp.set�����ð�(�����ð�); // ���� �ð��� �����ð����� ����
				int �ѽð� = (int)ChronoUnit.MINUTES.between(temp.get�����ð�(), �����ð�);
				// �ѽð��� ���(�����ð��� �����ð��� �����̸� �̿��Ͽ�) ����� String�̹Ƿ� int�� ������ȯ
				int ��� = 0; // ���ݾ� ���� 0�� �ʱⰪ
				if(�ѽð� > 30) {��� = (�ѽð� - 30) /10 * 1000;} // 30�� �̻�� 30���� �����̱⶧���� ���� ���
				else {��� = 0;} // �ƴ϶�� ��¥!
				��Ʈ�ѷ�.parklist.get(i).set�ݾ�(���); // ��������Ʈ�� �ε����� ��� �ִ� �ݾ��� ����
				��Ʈ�ѷ�.parklist.get(i).set�����ð�(�����ð�); // ��������Ʈ�� �ε����� ��� �ִ� �����ð��� ����
				return true;
			}
		i++;} // �ε��� ����
		return false;
	}
}
