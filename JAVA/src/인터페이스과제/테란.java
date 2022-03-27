package 인터페이스과제;

import java.util.Random;

public class 테란 implements 인터페이스_스타{

	int 미네랄;
	int 가스;
	int 인구수;

	int 마린;
	
	
	@Override
	public boolean 유닛생산(int sum, int sum1) {
		System.out.println("마린 생산 비용 : 미네랄 150, 가스 150");
		 if(sum > 200 && sum1 > 200) {
			 System.out.println("마린생산이 완료되었습니다.");
			 인구수++;
			 마린++;
			 return true;
		 }
		return false;
	}
	@Override
	public int 자원채집(int sum) {
		// TODO Auto-generated method stub
		System.out.println("SCV가 미네랄을 채취합니다.");
		Random random = new Random();
		int 미네랄 = random.nextInt(8)+1;
		sum += 미네랄;
		return sum;
	}
	@Override
	public int 가스채집(int sum1) {
		// TODO Auto-generated method stub
		Random random = new Random();
		System.out.println("SCV가 가스를 채취합니다.");
		int 가스 = random.nextInt(8)+1;
		sum1 += 가스;
		return sum1;
	}
	@Override
	public void 종족선택() {
		// TODO Auto-generated method stub
		System.out.println("테란으로 플레이합니다.");
	}
	
}
