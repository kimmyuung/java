package ���ΰ�������;

public class ����_Ŭ���� {
private String cardShape; // ī�� ����(���̾�, �����̵�, ��Ʈ, Ŭ�ι�)
private int deckCount; // �� ī��Ʈ(���� �� ���� ī�带 ���� �ʱ� ���� ����)

����_Ŭ���� () {}

public ����_Ŭ����(String cardShape, int deckCount) {
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
