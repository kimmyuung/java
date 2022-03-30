package Day19;

import java.util.TreeSet;

public class Day19_5 {
public static void main(String[] args) {
	// TreeSet Class 
	// 하나의 객체 = 노드
	// 각 노드는 최대 2개의 자식 노드를 가질 수 있다.
	// 부모보다 작으면 왼쪽 자식 / 부모보다 크면 오른쪽 자식
	// 트리구조에서 가장 왼쪽에 있는 가장 작은 값
	// 			가장 오른쪽에 있는 가장 큰 값
	// TreeSet<기존자료형클래스> :
	// TreeSet<사용자정의클래스> : Comparable와 Comparator
	// 1. TreeSet 클래스의 객체 선언
	TreeSet<Integer> scores = new TreeSet<>();
	// 2. treeset 객체에 객체(요소) 추가
	System.out.println("----- 자동 정렬 -----");
	scores.add(87); System.out.println("확인 : " + scores);
	scores.add(98); System.out.println("확인 : " + scores);
	scores.add(75); System.out.println("확인 : " + scores);
	scores.add(95); System.out.println("확인 : " + scores);
	scores.add(80); System.out.println("확인 : " + scores);
	// 3. 노드 호출
	System.out.println(scores.first()); // 가장 앞에 있는 것 = 가장 작은 수(가장 왼쪽 노드 호출)
	System.out.println(scores.last()); // 가장 뒤에 있는 것 = 가장 큰 수(가장 오른쪽 노드 호출)
	System.out.println(scores.lower(95)); // 95보다 낮은 수 중 가장 큰 수(95 기준으로 왼쪽 노드)
	System.out.println(scores.higher(95)); // 95보다 큰 수 중 가장 큰 수 (95 기준으로 오른쪽 노드)
	System.out.println(scores.floor(95)); // 95포함 기준으로 왼쪽 노드 [ 95보다 같거나 작은 ] 
	System.out.println(scores.ceiling(85)); // 85포함 기준으로 오른쪽 노드 [ 85보다 같거나 큰 ]
	
	// 4. 삭제
	scores.pollFirst();  	System.out.println("확인 : " + scores); // 가장 왼쪽(= 가장 작은) 노드 삭제
	scores.pollLast();		System.out.println("확인 : " + scores); // 가장 오른쪽(=가장 큰) 노드 삭제
	
	// 5. 오름차순 vs 내림차순
	System.out.println("기본[오름차순] : " + scores);
	System.out.println("내림차순 : " + scores.descendingSet());
	
	// 오름차순으로 하나씩 출력
	for(Integer temp : scores) {System.out.println(temp);}
	// 내림차순으로 하나씩 출력
	for(Integer temp : scores.descendingSet()) {System.out.println(temp);}
}
}
