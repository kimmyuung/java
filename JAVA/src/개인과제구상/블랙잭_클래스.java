package 개인과제구상;

public class 블랙잭_클래스 {
private String cardShape; // 카드 문양(다이아, 스페이드, 하트, 클로버)
private int deckCount; // 덱 카운트(게임 중 같은 카드를 뽑지 않기 위해 설정)

블랙잭_클래스 () {}

public 블랙잭_클래스(String cardShape, int deckCount) {
	super();
	this.cardShape = cardShape;
	this.deckCount = deckCount;
}

public String getCardShape() {
	return cardShape;
}

public void setCardShape(String cardShape) {
	this.cardShape = cardShape;
}

public int getDeckCount() {
	return deckCount;
}

public void setDeckCount(int deckCount) {
	this.deckCount = deckCount;
}

}
