package ���ΰ���2_����;

import java.util.Vector;

// Player.java
public class Player{
    private Vector<Card> hand = new Vector<Card>();

    public void addCard(Card card) {
        //(A) ī�带 �߰��Ѵ�.
        hand.add(card);
    }
    
    public Card get(int item) {
        //(B) item��° ī�带 �����Ѵ�.
		return hand.get(item);      		
	}
    
    public Vector<Card> getHand() {
        //(C) ������ �ִ� �и� ��� �����Ѵ�.
  		return hand;
    }   
} 