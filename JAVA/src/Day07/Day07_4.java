package Day07;

public class Day07_4 {
public static void main(String[] args) {
	
	// 1. ***** ��ü ���� ******
	Car2 mycar = new Car2();
	
	mycar.keyTurnon(); // 2. �ڵ��� �õ� �ɱ� �μ�x,��ȯx
	
	mycar.run(); // 3. �ڵ��� ���� �μ�x,��ȯx
	
	int speed = mycar.getspeed(); // 4. ���� ���� �ӵ� Ȯ��
	System.out.println("���� �ӵ� : " + speed + "km/h");
	
	
	}
}
