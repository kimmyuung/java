package Day18;

import java.util.ArrayList;

public class Day18_1 {

	// 컬렉션 프레임워크
	// 여러개 객체를 추가, 검색, 삭제 -> 배열
	// 배열문제점
		// 1. 불특정 다수의 객체를 저장 불가 [ 길이를 크게 설정 -> 비효율적 ]
		// 2. 삭제했을때 듬성듬성 빠진 옥수수 [ 삭제시 인덱스가 빈 현상 ]
	// 객체들을 효율적으로 추가, 삭제, 검색 ----> 컬렉션프레임워크
	// 컬렉션 : 수집 프레임워크 : 사용방법을 미리 정해 놓은 라이브러리
	// 저장 관련 클래스/ 인터페이스
	// 1. List 인터페이스 : 1. Arraylist 클래스 2. Vector 클래스 3. LinkedList 클래스
	// 2. Set 인터페이스 : 1. HashSet 클래스 2. TreeSet 클래스
	// 3. Map 인터페이스 : 1. HashMap 클래스 2. Hashtable 클래스 3. TreeMap 클래스 4. Properites 클래스
	
	
	public static void main(String[] args) {// ArrayList 클래스 : 배열과 유사 하지만 길이(저장수)가 가변[자동]
		// 1. 리스트 클래스 선언[ 리스트 안에 저장할 항목의 자료형 -> 제네릭 ]
		ArrayList<String> list = new ArrayList<>();
		// 1. ArrayList : 리스트 클래스
			// 2. < 제네릭 > : 클래스 내부에 들어가는 자료형
				// 3. list : 리스트 객체명(아무거나)
					// 4. new ArrayList<제네릭 = 생략가능>(길이= 생략가능(초기길이 10)); 
		// 2. 리스트객체 내 요소 추가
		list.add("JAVA"); // list.add(문자열 타입의 객체), 인덱스 0
		list.add("jtbc"); // 1번 인덱스
		list.add("servelet/jsp"); // 2번 인덱스
		System.out.println("리스트 내 요소 확인 :"+ list);
		list.add(2, "DB"); // 2번 인덱스에 추가
		System.out.println("리스트 내 추가 요소 확인 :"+ list);
		list.add("iBATIS");
		
		// 3. 리스트객체명.size() : 리스트객체 내 요소들의 개수 [ 길이 ]
		System.out.println("리스트 내 요소들의 개수 : " + list.size());
		
		// 4. 리스트객체명.get(인덱스) : 리스트객체 내 특정인덱스의 요소 호출
		System.out.println("리스트 내 2번 인덱스 호출 : " + list.get(2));
		
		// 5. 반복문 [리스트와 반복문 같이 사용] 
		for(int i = 0; i < list.size(); i++) { // i는 0부터 리스트내 총 길이까지 1씩 증가반복 : 인덱스 필요시 사용
			String str = list.get(i); // i번쨰 인덱스내 요소를 호출해서 저장
			System.out.println(i + ":" + str); // 출력
		}
		int i = 0;
		for(String temp : list) { // 인덱스 없이 요소들을 하나씩 사용할때
			String str = list.get(i); // i번쨰 인덱스내 요소를 호출해서 저장
			System.out.println(i + ":" + str); // 출력
			i++;
		}
		// 6. list.remove(인덱스)
		list.remove(2); // 2번 인덱스 삭제
		System.out.println("확인 : " + list);
		list.remove(2);
		System.out.println("확인 : " + list);
		list.remove("iBATIS");
		System.out.println("확인 : " + list);
		list.clear(); // 리스트에 있는 파일 모두 삭제
		System.out.println("모두 삭제 : " + list);
	}
}
