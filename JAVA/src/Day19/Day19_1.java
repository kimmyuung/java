package Day19;

import java.util.HashSet;
import java.util.Iterator;

public class Day19_1 {

	public static void main(String[] args) {
		
		// 컬렉션(수집)프레임워크(미리만들어진클래스)
			// 배열의 단점을 보완하기 위해 사용
			// 1. List Collection
				// 1. ArrayList Class : Single Thread / // Insert / Delate slower than LinkedList
				// 2. Vector Class : Multi Thread(Synchronized O)
				// 3. LinkedList Class : Insert / Delate faster than ArrayList!
			// 2. Set Collection
				// No Index (=저장순서 없음 -> 객체 중복 불가) 
				// 1. HashSet Class 
					// 1. .add(객체명) :set 객체내 객체(=요소) 추가
					// 2. .size() : set 객체내 객체(요소) 개수
					// 3. .iterator : set 객체 순회 메소드
						// * Iterator<제네릭> 인터페이스명 : 순서없는 객체 순회 인터페이스
						// * Iterator<제네릭> iterator = set.iterator();
						// 1. iterator.hasnext() : 다음 객체 존재 여부 확인
						// 2. iterator.next() : 다음 요소 가져오기
						// or
						// for (임시객체명 : set객체명) { }
					// 4. .remove(객체명) : set 객체내 객체 삭제
					// 5. .clear() : set 객체내 객체 전체 삭제
					// 6. .contains() : set 객체내 소유 여부 확인
			// 3. Map Collection
		
		// 1. HashSet Class
		HashSet<String> set = new HashSet<>();
		// HashSet : CollectionFrameWork Class
		 	// 2. <제네릭> : Set Class 안에 들어가는 자료형
			// 3. set : 객체명(아무거나)
			// 4. new : 객체 생성시 메모리 할당
			// 5. HashSet<생략가능>() : 생성자
		// 2. set 객체 내 객체 넣기 [ set객체명.add(객체명); ]
		set.add("java");  	System.out.println("확인 : "+ set);
		set.add("JDBC");	System.out.println("확인 : "+ set);
		set.add("Servlet/JSP");	System.out.println("확인 : "+ set);
		set.add("java");	System.out.println("확인 : "+ set); // 객체 중복 불가능
		set.add("iBATIS");	System.out.println("확인 : " + set);
		
		// 3. set 객체내 객체 수 [ set객체명.size() : ]
		System.out.println("set 안에 들어있는 객체 수 : " + set.size());
		
		// 4. Iterator : 저장된 객체를 한번씩 가져오는 반복자 리턴 ( 순회 )
			// * set 컬렉션 에서 사용되는 이유 : 인덱스가 없기 때문에 객체를 호출하는 방법이 없음
		Iterator<String> iterator = set.iterator(); // set 객체내 iterator() : 순회
		while(iterator.hasNext() ) { // .hasNext() : 다음 요소 존재 여부 확인 = 다른 요소 있으면 true 없으면 false
			String element = iterator.next(); // .next() : 다음 요소 가져오기
			System.out.println("\t" + element);
		}
		// * for문과 컬렉션 활용
			// for (임시 객체명 : 컬렉션/배열 ) : 컬렉션/배열내 요소들을 한번씩 가져오는 반복자
			// : Iterator 역할 수행
		int x = 0;
		for(String element : set) {
			System.out.println("\t" + element);
			x++;
		}
		// 5. set객체명.remove(객체명) : set객체내 해당 객체를 삭제
		set.remove("JDBC");
		System.out.println("확인 : " + set);
		set.remove("iBATIS");
		System.out.println("확인 : " + set);
		
		// 6. set객체명.clear() : set 객체내 모든 객체를 비우기[ 삭제 ]
		set.clear(); System.out.println("확인 : " + set);
		
	}
	
}
