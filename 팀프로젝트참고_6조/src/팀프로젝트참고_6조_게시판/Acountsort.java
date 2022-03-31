package 팀프로젝트참고_6조_게시판;

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