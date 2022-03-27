package 인터페이스과제;

import java.util.Random;

public class 프로토스 implements 인터페이스_스타{
	int 미네랄;
	int 가스;
	int 인구수;
	
	int 질럿;
	
	
	 @Override
	public boolean 유닛생산(int sum, int sum1) {
		// TODO Auto-generated method stub
		 System.out.println("질럿 생산 비용 : 미네랄 200, 가스 200");
		 if(sum > 200 && sum1 > 200) {
			 System.out.println("질럿생산이 완료되었습니다.");
			 sum = sum - 200; sum1 = sum1-200;
			 인구수++;
			 질럿++;
			 return true;
		 }
		
		return false;
	}
	 @Override
		public int 자원채집(int sum) {
			// TODO Auto-generated method stub
			System.out.println("프로브가 미네랄을 채취합니다.");
			Random random = new Random();
			int 미네랄 = random.nextInt(8)+1;
			sum += 미네랄;
			return sum;
		}
		@Override
		public int 가스채집(int sum1) {
			// TODO Auto-generated method stub
			Random random = new Random();
			System.out.println("프로브가 가스를 채취합니다.");
			int 가스 = random.nextInt(8)+1;
			sum1 += 가스;
			return sum1;
		}
		
	 @Override
	public void 종족선택() {
		// TODO Auto-generated method stub
		System.out.println("프로토스로 플레이합니다.");
	}
}
