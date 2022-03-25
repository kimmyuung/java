package Day18;

import java.util.ArrayList;

public class Day18_1 {

	// �÷��� �����ӿ�ũ
	// ������ ��ü�� �߰�, �˻�, ���� -> �迭
	// �迭������
		// 1. ��Ư�� �ټ��� ��ü�� ���� �Ұ� [ ���̸� ũ�� ���� -> ��ȿ���� ]
		// 2. ���������� �뼺�뼺 ���� ������ [ ������ �ε����� �� ���� ]
	// ��ü���� ȿ�������� �߰�, ����, �˻� ----> �÷��������ӿ�ũ
	// �÷��� : ���� �����ӿ�ũ : ������� �̸� ���� ���� ���̺귯��
	// ���� ���� Ŭ����/ �������̽�
	// 1. List �������̽� : 1. Arraylist Ŭ���� 2. Vector Ŭ���� 3. LinkedList Ŭ����
	// 2. Set �������̽� : 1. HashSet Ŭ���� 2. TreeSet Ŭ����
	// 3. Map �������̽� : 1. HashMap Ŭ���� 2. Hashtable Ŭ���� 3. TreeMap Ŭ���� 4. Properites Ŭ����
	
	
	public static void main(String[] args) {// ArrayList Ŭ���� : �迭�� ���� ������ ����(�����)�� ����[�ڵ�]
		// 1. ����Ʈ Ŭ���� ����[ ����Ʈ �ȿ� ������ �׸��� �ڷ��� -> ���׸� ]
		ArrayList<String> list = new ArrayList<>();
		// 1. ArrayList : ����Ʈ Ŭ����
			// 2. < ���׸� > : Ŭ���� ���ο� ���� �ڷ���
				// 3. list : ����Ʈ ��ü��(�ƹ��ų�)
					// 4. new ArrayList<���׸� = ��������>(����= ��������(�ʱ���� 10)); 
		// 2. ����Ʈ��ü �� ��� �߰�
		list.add("JAVA"); // list.add(���ڿ� Ÿ���� ��ü), �ε��� 0
		list.add("jtbc"); // 1�� �ε���
		list.add("servelet/jsp"); // 2�� �ε���
		System.out.println("����Ʈ �� ��� Ȯ�� :"+ list);
		list.add(2, "DB"); // 2�� �ε����� �߰�
		System.out.println("����Ʈ �� �߰� ��� Ȯ�� :"+ list);
		list.add("iBATIS");
		
		// 3. ����Ʈ��ü��.size() : ����Ʈ��ü �� ��ҵ��� ���� [ ���� ]
		System.out.println("����Ʈ �� ��ҵ��� ���� : " + list.size());
		
		// 4. ����Ʈ��ü��.get(�ε���) : ����Ʈ��ü �� Ư���ε����� ��� ȣ��
		System.out.println("����Ʈ �� 2�� �ε��� ȣ�� : " + list.get(2));
		
		// 5. �ݺ��� [����Ʈ�� �ݺ��� ���� ���] 
		for(int i = 0; i < list.size(); i++) { // i�� 0���� ����Ʈ�� �� ���̱��� 1�� �����ݺ� : �ε��� �ʿ�� ���
			String str = list.get(i); // i���� �ε����� ��Ҹ� ȣ���ؼ� ����
			System.out.println(i + ":" + str); // ���
		}
		int i = 0;
		for(String temp : list) { // �ε��� ���� ��ҵ��� �ϳ��� ����Ҷ�
			String str = list.get(i); // i���� �ε����� ��Ҹ� ȣ���ؼ� ����
			System.out.println(i + ":" + str); // ���
			i++;
		}
		// 6. list.remove(�ε���)
		list.remove(2); // 2�� �ε��� ����
		System.out.println("Ȯ�� : " + list);
		list.remove(2);
		System.out.println("Ȯ�� : " + list);
		list.remove("iBATIS");
		System.out.println("Ȯ�� : " + list);
		list.clear(); // ����Ʈ�� �ִ� ���� ��� ����
		System.out.println("��� ���� : " + list);
	}
}
