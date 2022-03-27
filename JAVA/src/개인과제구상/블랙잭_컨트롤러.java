package 개인과제구상;

import java.util.ArrayList;
import java.util.Random;

public class 블랙잭_컨트롤러 {

	static ArrayList<블랙잭_클래스> cardlist = new ArrayList<>();

	void 카드뽑기() {
		Random random = new Random();
		int cardShape = random.nextInt(4);
		switch(cardShape) {
		case 0 : String cardShape2 = "♣"; break;
		case 1 : String cardShape3 = "♥"; break;
		case 2 : String cardShape4 = "♠"; break;
		case 3 : String cardShape5 = "◆"; break;
	}
		
	}
	void 게임시작() {}
	void 게임결과보기() {}
	void 결과보기() {}
}
