package Day17;

import java.util.ArrayList;
import java.util.Arrays;

public class Day17_3 {
public static void main(String[] args) {
	
	// �ڽ� Ŭ���� ���׸��� ���Ŭ���� �ֱ�
	Course<Person> ����ڽ� = new Course<>("�Ϲ��ΰ���",5);
	����ڽ�.add(new Person("�Ϲ���"));
	����ڽ�.add(new Worker("������"));// ���Ŭ�������� ��ӹ޾ұ� ������ ����
	����ڽ�.add(new Student("�л�")); // ���Ŭ�������� ��ӹ���
	����ڽ�.add(new Highschool("����л�")); // �л�Ŭ�������� ��ӹ޾ұ� ������ ����
	// ���׸��� ���� Ŭ������ �ڽ�Ŭ������ ���� �� �� ����
	
	Course<Worker> �������ڽ� = new Course<>("�����ΰ���", 5);
	//�������ڽ�.add(new Person("�Ϲ���")); ����!! �θ� Ŭ������ �� �� ����
	�������ڽ�.add(new Worker("������")); // ������ ����
	//�������ڽ�.add(new Student("�л�")); ����!! �θ� Ŭ������ ������ ���� Ŭ������ ������ ���� �����̶� ����
	//�������ڽ�.add(new Highschool("����л�")) ����л�-> ������ ��ȯ �Ұ�
	
	Course<Student> �л��ڽ� = new Course<>("�л�����", 5);
	// �л��ڽ�.add(new Person("�Ϲ���")); // x
	// �л��ڽ�.add(new Worker("������")); // x
	�л��ڽ�.add(new Highschool("����л�")); // o
	
	Course<Highschool> ����л��ڽ� = new Course<>("����л�����",5);
	// ����л��� �����ϰ� �ƹ��͵� �� �� ����
//	����л��ڽ�.add(new Person("�Ϲ���"));  X
//	����л��ڽ�.add(new Worker("������")); X
//	����л��ڽ�.add(new Student("�л�"));  X
	����л��ڽ�.add(new Highschool("����л�")); // O
//	// * Arraylist
//	ArrayList<Person> list = new ArrayList<Person>();
//	list.add(new Person("�Ϲ���"));
	// �޼ҵ� ȣ�� 
			�ڽ�������(����ڽ�);
			�ڽ�������(�������ڽ�);
			�ڽ�������(�л��ڽ�);
			�ڽ�������(����л��ڽ�);
			// �޼ҵ� ȣ�� 
				//�л��ڽ�������(����ڽ�); // x
				//�л��ڽ�������(�������ڽ�); // x
			�л��ڽ�������(�л��ڽ�);
			�л��ڽ�������(����л��ڽ�);
			
			�������ڽ�������(����ڽ�);
			�������ڽ�������(�������ڽ�);
				//�������ڽ�������(�л��ڽ�); // x
				//�������ڽ�������(����л��ڽ�); // x
}
//���ϵ�ī�� : ? [ ��� Ŭ���� ���� ]
		// �ڽ�< ? >  : ��� ���׸� ���� 
		// �ڽ�< ? extends Ŭ������ > : �ش� Ŭ�����κ��� ��� ����(�ڽ�) ���׸� Ŭ���� ����
		// �ڽ�< ? super Ŭ������ > : �ش� Ŭ�����κ��� ��� ��(�θ�) ���׸� Ŭ���� ���� 
	
	// 1.
	public static void �ڽ�������( Course<?> �ڽ���� ) {
						//�μ��κ��� ����ڽ��� ���׸� ����
						// �ڽ�<���> : ��� ���׸� �ڽ��� ����
						// �ڽ�< ? > : ��� ���׸� �ڽ��� ���� 
		System.out.println( �ڽ����.getName() +" ��������� : "
					+ Arrays.toString( �ڽ����.getStudents()) );
				// Arrays : �迭 ���� �޼ҵ� ���� 
					// Arrays.toString( �迭�� ) : �ش� �迭�� ���� ��� ȣ�� 
	}
	// 2. 
	public static void �л��ڽ�������( Course< ? extends Student> �ڽ���� ) {
						// *�л� Ŭ�����κ��� ��ӹ��� ��� Ŭ������ ���� 
		System.out.println( �ڽ����.getName() +" ��������� : "
				+ Arrays.toString( �ڽ����.getStudents()) );
	}
	// 3. 
	public static void �������ڽ�������( Course< ? super Worker> �ڽ����) {
		System.out.println( �ڽ����.getName() +" ��������� : "
				+ Arrays.toString( �ڽ����.getStudents()) );
	}
	
}




