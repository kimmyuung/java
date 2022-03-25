package 상속과제;

public class 무기고 {
무기 죽검 = new 무기(10, "죽검",  0);
무기 목검 = new 무기(20, "목검" , 0);


public int 무기사용() { // 무기 사용 구현
	int 숙련도 = 0;
	System.out.println("무기를 사용합니다.");
	System.out.println("죽검 무기의 공격력은 : " + 죽검.공격력);
	System.out.println("목검 무기의 공격력은 : " + 목검.공격력);
	for(int i = 0; i < 100 ; i--) {
	if(죽검.공격력 == 0) { 무기사용중단(); 죽검.숙련도++;}
	if(목검.공격력 == 0) { 무기사용중단(); 목검.숙련도++;}
	return 숙련도;
	}
	return 0;
}


void 무기사용중단() {
	System.out.println("무기를 손질해야 합니다.");
}
}
