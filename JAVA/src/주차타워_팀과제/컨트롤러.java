package ����Ÿ��_������;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
// ������� : 10�д� 1000��
// ó�� 30���� ����, 24�ð� �̻� ������ 5����
public class ��Ʈ�ѷ� {

static ArrayList<Car> carlist = new ArrayList<>();
static String[] parktower;
String[] ����Ÿ���Ǽ� (int park) {
	parktower = new String[park];
	for(int i = 0; i < park; i++) {
		if(parktower[i] == null) {
		parktower[i] = "[ ]";
		}
	}
	return parktower;
}
boolean ���� (String Carnum, int location) {
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
		if(temp.get����ȣ().equals(Carnum)) {
			return false;
		}
	}
	Car myCar = new Car(Carnum, sdt, null);
	carlist.add(myCar);
	
	return true;
}
boolean ���� (String carNum) {
	for(Car temp : carlist) { // ��ȿ�� �˻�
		if(!temp.get����ȣ().equals(carNum)) {
			return false;
		}
	}
	for(int i = 0; i < parktower.length; i++) { // ���� ���� ���·� �ٲٱ�
		if(parktower[i].equals("[o]")) {
		parktower[i] = "[ ]";
		}
	}
	return true;
}
void ���⴩��() {}
int ��� () {
	LocalDateTime edt = LocalDateTime.now();
	for(Car temp : carlist) {
		
	}
	return 0;
}
void ��������() {}
void �������() {}
}
