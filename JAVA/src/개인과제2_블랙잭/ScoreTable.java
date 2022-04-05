package 개인과제2_블랙잭;

import java.util.HashMap;

// ScoreTable.java
public class ScoreTable {
    private HashMap<String, int[]> table = new HashMap<>();
    
    public void Table_Create(String rank,int score) { // 테이블 생성 메소드
    	String key = rank;
    	int[] value = new int[1];
    	value[0] = score; 
    	table.put(key,value);
    }
    	
    ScoreTable(){
    //(F) key=랭크: value=점수 쌍의 테이블을 생성한다.
    	    	
    	String key = "A"; // "A"의 경우 따로 생성
    	int[] value = new int[2];
    	value[0]=1; 
    	value[1]=11;
    	table.put(key,value);
    	
    	Table_Create("2",2);
    	Table_Create("3",3);
    	Table_Create("4",4);
    	Table_Create("5",5);
    	Table_Create("6",6);
    	Table_Create("7",7);
    	Table_Create("8",8);
    	Table_Create("9",9);
    	Table_Create("10",10);
    	Table_Create("J",10);
    	Table_Create("Q",10);
    	Table_Create("K",10);   	
    }
    
    public int[] score(Card card) {
    //(G) card 의 점수를 리턴한다. A의 경우 1 또는 11이며, 이 경우에 해당 점수들로 구성된 length가 2인 정수배열이 리턴된다.
                
        if (card.getRank().equals("A")) { // "A"의 경우 따로 생성
            int[] value = new int[2];
            value[0] = 1;
            value[1] = 11;
            return value;
        }
        else {
        	int[] value = new int[1];
        	value = table.get(card.getRank()); // 카드의 rank를 해당하는 숫자로 바꾸는 과정
            return value;
        }		
    }
}