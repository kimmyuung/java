package 팀프로젝트참고_6조_게시판;

import java.util.Comparator;

public class Acountsort implements Comparator<Account> { // 포인트를 벌어들이는 클래스
	// Comparable 혹은 Comparator을 사용하고자 한다면 인터페이스 내에 선언된 메소드를 '반드시 구현
	// 일단, 두 인터페이스를 구체적으로 알아보기에 앞서 먼저 정답부터 말하자면, 
	//Comparable은 "자기 자신과 매개변수 객체를 비교"하는 것이고, Comparator는 "두 매개변수 객체를 비교"한다는 것
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