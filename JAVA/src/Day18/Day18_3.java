package Day18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day18_3 {

	public static void main(String[] args) {
		//			LinkedList Ŭ����
		// 					ArrayList 		  vs 		 LinkedList
		// 			   			�迭				   		    ��ũ
		// ���α�������	  �ε����������� �޸� ����[��] 	  	 ���� �ٸ� �޸��ּ� ����
		// �ӵ�				  
		// add[�߰�]				����
		// add[����=�߰�]										����
		// �˻�					����							
		// ����												����
		
		// 1. Arraylist ��ü ���� [ ���׸� : String ]
		ArrayList<String> list1 = new ArrayList<>(); // �Ϲ����� ��ǰ�鿡 ���� ���
		// 2. LinkedList ��ü ���� [ ���׸� : String ]
		LinkedList<String> list2 = new LinkedList<>(); // �ǽð����� ������Ʈ �ÿ� ���� ���(�ֽ�...)
		
		// 3. �ð�����
		Long sttime;
		Long etime;
		
		// 4. arraylist ��ü�� 10000�� ��ü�� �����ϴµ� �ɸ��� �ð�
		sttime = System.nanoTime(); // ����ð��� ����ð����� ȣ��
		for(int i = 0; i< 100000; i++) {
			list1.add(0, i+""); // ���� -> ���ڿ� ��ȯ : 1. String.valueOf(����) 2. ���� + ""
								// ���ڿ� -> ���� ��ȯ : 1. Integer.parseInt(���ڿ�)
		}
		etime = System.nanoTime();
		System.out.println("ArrayList 10000�� ���� �۾��Ϸ� �ð� : " + (etime - sttime) + " ������");
		sttime = System.nanoTime(); // ����ð��� ����ð����� ȣ��
		for(int i = 0; i< 100000; i++) {
			list2.add(0, i+""); // ���� -> ���ڿ� ��ȯ : 1. String.valueOf(����) 2. ���� + ""
								// ���ڿ� -> ���� ��ȯ : 1. Integer.parseInt(���ڿ�)
		}
		etime = System.nanoTime();
		System.out.println("LinkedList 10000�� ���� �۾��Ϸ� �ð� : " + (etime - sttime) + " ������");
	}
		
}
