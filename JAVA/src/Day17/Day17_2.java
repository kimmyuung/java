package Day17;

public class Day17_2 {
public static void main(String[] args) {
	// 1. ��ü ���� // new ���Ĵ� ���� ����!!
	Box<Integer> box1 = new Box<>();
	// 2. �޼ҵ� ȣ���� ������� ��ü�� ����
	box1 = Util.<Integer>boxing(100);
	// 3. Ȯ��
	System.out.println(box1.get());
	
	// 1. p1��ü�� �����ϴµ� �����ڿ� ���� 1�� ���ڿ� ����� ����
	// ���� : ���׸�<����, ���ڿ�>
	Pari<Integer, String> p1 
	= new Pari<Integer, String>(1, "���");
	
	// 2. p2��ü ����
	Pari<Integer, String> p2
	= new Pari<Integer, String>(1, "���");
	// 3. �޼ҵ�ȣ��
	// �帧
	// Pari�� int�� String �������
	// K : int V : String
	// 
	boolean result1 = Util.<Integer, String>compare(p1, p2);
	if(result1) System.out.println("������ ��ü");
	else System.out.println("�������� �ʴ� ��ü");
	
	
	Pari<String, String> p3 = 
	new Pari<String, String>("user1", "ȫ�浿");
	Pari<String, String> p4 = 
	new Pari<String, String>("user2", "ȫ�浿");
	boolean result2 = Util.compare(p3, p4);
	if(result2) System.out.println("����!!!");
	else System.out.println("�� ����!!!");
	}
}
