package 상속과제;

public class 무기단련장 {
public static void main(String[] args) {
	
	무기고 무기들 = new 무기고();
	
	for(int i = 0; i< 30 ; i++) {
		int 오른손숙련도 = 무기들.무기사용();
		int 왼손숙련도 = 무기들.무기사용();
		if (오른손숙련도 == 100) {
			System.out.println("숙련도가 최대치에 도달하여 무기를 교체합니다.");
			무기들.목검 = new 대검(200, "대검", 0);
		}
		if(왼손숙련도 == 100) {
			System.out.println("숙련도가 최대치에 도달하여 무기를 교체합니다.");
			무기들.죽검 = new 세검(100, "세검", 0);
		}
	}
	
	
	
	}
}
