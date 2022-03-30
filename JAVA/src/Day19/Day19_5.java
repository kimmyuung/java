package Day19;

import java.util.TreeSet;

public class Day19_5 {
public static void main(String[] args) {
	// TreeSet Class 
	// �ϳ��� ��ü = ���
	// �� ���� �ִ� 2���� �ڽ� ��带 ���� �� �ִ�.
	// �θ𺸴� ������ ���� �ڽ� / �θ𺸴� ũ�� ������ �ڽ�
	// Ʈ���������� ���� ���ʿ� �ִ� ���� ���� ��
	// 			���� �����ʿ� �ִ� ���� ū ��
	// TreeSet<�����ڷ���Ŭ����> :
	// TreeSet<���������Ŭ����> : Comparable�� Comparator
	// 1. TreeSet Ŭ������ ��ü ����
	TreeSet<Integer> scores = new TreeSet<>();
	// 2. treeset ��ü�� ��ü(���) �߰�
	System.out.println("----- �ڵ� ���� -----");
	scores.add(87); System.out.println("Ȯ�� : " + scores);
	scores.add(98); System.out.println("Ȯ�� : " + scores);
	scores.add(75); System.out.println("Ȯ�� : " + scores);
	scores.add(95); System.out.println("Ȯ�� : " + scores);
	scores.add(80); System.out.println("Ȯ�� : " + scores);
	// 3. ��� ȣ��
	System.out.println(scores.first()); // ���� �տ� �ִ� �� = ���� ���� ��(���� ���� ��� ȣ��)
	System.out.println(scores.last()); // ���� �ڿ� �ִ� �� = ���� ū ��(���� ������ ��� ȣ��)
	System.out.println(scores.lower(95)); // 95���� ���� �� �� ���� ū ��(95 �������� ���� ���)
	System.out.println(scores.higher(95)); // 95���� ū �� �� ���� ū �� (95 �������� ������ ���)
	System.out.println(scores.floor(95)); // 95���� �������� ���� ��� [ 95���� ���ų� ���� ] 
	System.out.println(scores.ceiling(85)); // 85���� �������� ������ ��� [ 85���� ���ų� ū ]
	
	// 4. ����
	scores.pollFirst();  	System.out.println("Ȯ�� : " + scores); // ���� ����(= ���� ����) ��� ����
	scores.pollLast();		System.out.println("Ȯ�� : " + scores); // ���� ������(=���� ū) ��� ����
	
	// 5. �������� vs ��������
	System.out.println("�⺻[��������] : " + scores);
	System.out.println("�������� : " + scores.descendingSet());
	
	// ������������ �ϳ��� ���
	for(Integer temp : scores) {System.out.println(temp);}
	// ������������ �ϳ��� ���
	for(Integer temp : scores.descendingSet()) {System.out.println(temp);}
}
}
