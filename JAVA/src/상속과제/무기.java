package 상속과제;

public class 무기 {
int 공격력;
String 무기이름;
int 숙련도;

public 무기(int 공격력, String 무기이름, int 숙련도) {
	super();
	this.공격력 = 공격력;
	this.무기이름 = 무기이름;
	this.숙련도 = 숙련도;
}

public int 무기사용() { // 무기 사용 구현
	for(int i = 0; i < 공격력; i++) {
		숙련도++;
		if(숙련도 == 100) System.out.println("숙련도가 최대치에 도달하였습니다.");
		return 숙련도;
	}
	return 0;
}



}
