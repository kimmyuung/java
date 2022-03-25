package Day17;

import java.util.Arrays;

public class Course<T> {
		// <���׸��̸�> : �ܺηκ��� ������ �ڷ���
	private String name;  // ������ : ���ڿ�
	private T[] students; //�л��迭 :??? -> �ܺο��� ������ �ڷ���
	public Course(String name, int capacity) 
	{// ������ : �ܺηκ��� ������� �ο��� �޾� �ο�����ŭ ���׸�Ÿ������ �迭�� �޸��Ҵ�
				
		this.name = name;
		students = (T[])new Object[capacity];
			// * ���׸�Ÿ���� �Ű�Ÿ���̱� ������ �޸��Ҵ�(=new ���)�� �ȵ�
			// 1. new Object[�ο���] = �ο��� ��ŭ object �迭 ����
			// 2. object �迭 ----> T[] �迭�� ��������ȯ
			// 3. * Object Ŭ������ �ֻ���[�θ�]�̱� ������ ����
			// 4. ObjectŬ������ ���׸�Ÿ���� T�� ��ȯ
	}
	// ������ ȣ�� �޼ҵ�
	public String getName() {
		return name;
	}
	
	// �л��迭 ȣ�� �޼ҵ�
	public T[] getStudents() {
		return students;
	}
	// �л��迭�� ��ü �߰�[ArraylistŬ���� ���� ��� ����]
	public void add(T t) {
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	
	
}
