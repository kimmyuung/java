package 상속과제;

public class 세검 extends 무기{

	
	public 세검 (int 공격력, String 무기이름, int 숙련도) {
		super(공격력, 무기이름, 숙련도);
	}
	
	@Override
	public int 무기사용() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 공격력; i++) {
			숙련도++;
			if(숙련도 == 100) System.out.println("세검 숙련도가 최대치에 도달하였습니다.");
			return 숙련도;
		}
		return 0;
	}
	
	
}
