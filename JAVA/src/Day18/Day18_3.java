package Day18;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day18_3 {

	public static void main(String[] args) {
		//			LinkedList 클래스
		// 					ArrayList 		  vs 		 LinkedList
		// 			   			배열				   		    링크
		// 내부구조차이	  인덱스기준으로 메모리 연결[통] 	  	 서로 다른 메모리주소 연결
		// 속도				  
		// add[추가]				빠름
		// add[삽입=중간]										빠름
		// 검색					빠름							
		// 삭제												빠름
		
		// 1. Arraylist 객체 선언 [ 제네릭 : String ]
		ArrayList<String> list1 = new ArrayList<>(); // 일반적인 제품들에 많이 사용
		// 2. LinkedList 객체 선언 [ 제네릭 : String ]
		LinkedList<String> list2 = new LinkedList<>(); // 실시간으로 업데이트 시에 많이 사용(주식...)
		
		// 3. 시간변수
		Long sttime;
		Long etime;
		
		// 4. arraylist 객체에 10000개 객체를 삽입하는데 걸리는 시간
		sttime = System.nanoTime(); // 현재시간을 나노시간으로 호출
		for(int i = 0; i< 100000; i++) {
			list1.add(0, i+""); // 정수 -> 문자열 변환 : 1. String.valueOf(정수) 2. 정수 + ""
								// 문자열 -> 정수 변환 : 1. Integer.parseInt(문자열)
		}
		etime = System.nanoTime();
		System.out.println("ArrayList 10000개 삽입 작업완료 시간 : " + (etime - sttime) + " 나노초");
		sttime = System.nanoTime(); // 현재시간을 나노시간으로 호출
		for(int i = 0; i< 100000; i++) {
			list2.add(0, i+""); // 정수 -> 문자열 변환 : 1. String.valueOf(정수) 2. 정수 + ""
								// 문자열 -> 정수 변환 : 1. Integer.parseInt(문자열)
		}
		etime = System.nanoTime();
		System.out.println("LinkedList 10000개 삽입 작업완료 시간 : " + (etime - sttime) + " 나노초");
	}
		
}
