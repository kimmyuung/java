package Day07;

public class Day07_4 {
public static void main(String[] args) {
	
	// 1. ***** ��ü ���� ******
	Car2 mycar = new Car2();
	
	mycar.keyTurnon(); // 2. �ڵ��� �õ� �ɱ� (�μ� x, ��ȯ x)
	
	mycar.run(); // 3. �ڵ��� ���� (�μ� x, ��ȯ x)
	
	int speed = mycar.getspeed(); 
	// 4. ���� ���� �ӵ� Ȯ�� (�μ� x, ��ȯ o)
	System.out.println("���� �ӵ� : " + speed + "km/h");
	
	
	}
}
