package ��������Ʈ����_6��_�Խ���;

import java.util.Comparator;

public class Acountsort implements Comparator<Account> { // ����Ʈ�� ������̴� Ŭ����
	// Comparable Ȥ�� Comparator�� ����ϰ��� �Ѵٸ� �������̽� ���� ����� �޼ҵ带 '�ݵ�� ����
	// �ϴ�, �� �������̽��� ��ü������ �˾ƺ��⿡ �ռ� ���� ������� �����ڸ�, 
	//Comparable�� "�ڱ� �ڽŰ� �Ű����� ��ü�� ��"�ϴ� ���̰�, Comparator�� "�� �Ű����� ��ü�� ��"�Ѵٴ� ��
	int ret=0;
	@Override
	public int compare(Account o1, Account o2) {
		if(o1.getPoint()<o2.getPoint()){
			ret=1;
		}else if(o1.getPoint()>o2.getPoint()) {
			ret=-1;
		}
		return ret;
	}
}