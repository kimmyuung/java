package ��������Ʈ����_6��_�Խ���;

import java.util.Comparator;

public class Acountsort implements Comparator<Account> {

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