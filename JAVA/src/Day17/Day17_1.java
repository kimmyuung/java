package Day17;

public class Day17_1 {

	public static void main(String[] args) {
		
		// p. 659
			// ���׸�
			// ���� : public class Ŭ������<���׸��̸�>
		// 1. ��ü ����
		Box<String> box1 = new Box<String>();
		// Ŭ������ String Ÿ�� �ֱ�
		box1.set("ȫ�浿");
		String str = box1.get();
		// 2. ��ü ����
		Box<Integer> box2 =new Box<>();
		// Ŭ������ Integer Ÿ�� �ֱ� // ��<��������>
		box2.set(6);
		int value = box2.get();
		
		
		// ��ü �����ϴµ� ���׸�Ÿ�� �ֱ�
		Product<Tv, String> product1 = new Product<>();
		// ��ü�� �ʵ忡 �� ���׸�Ÿ������ �� �ֱ�
		product1.setKind(new Tv());
		product1.setModel("����Ʈ tv");
		// ȣ��(�� ��ȯ ����)
		Tv tv = product1.getKind();
		String tvmodel = product1.getModel();
		
		// ��ü �����ϴµ� ���׸�Ÿ�� �ֱ�
		Product<Car, String> product2 = new Product<>();
		// ��ü�� �ʵ忡 �� ���׸�Ÿ������ �� �ֱ�
		product2.setKind(new Car());
		product2.setModel("����");
		// ȣ��
		Car car = product2.getKind();
		String carmodel = product2.getModel();
		
		Product<Integer, Double> product3 = new Product<>(); // �ڷ�Ÿ�� �ձ��ڴ� �빮�ڷ� �ۼ��ؾ��Ѵ�...
		
	}
}
