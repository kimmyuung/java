package Day10;

import java.util.ArrayList;

public class Day10_4
{
	// 문법
	// 1. 입출력 2. 변수 3. 연산자 4. 제어/반복 5. 배열 /// 객체 지향 프로그래밍 6. 클래스 7. 인터페이스
	public static void main(String[] args)
	{
		// 배열 vs 리스트 
		
		// 배열[인덱스 0부터 저장]
		String[] array = new String[100];
		System.out.println("배열 : " + array); // 메모리 주소값 출력
		array[0] = "유재석"; // 배열[인덱스] : 인덱스 번호 기준으로 저장
		System.out.println("배열[0] : " + array[0]);
		System.out.println("배열길이 : " + array.length);
		// 리스트[클래스기반의 배열구조]
		ArrayList<String> listname = new ArrayList<>();
		// 컬렉션[(데이터)수집] 프레임워크(=누군가가 만들어 놓은 클래스)
		
		// ArrayList [자동완성] 
			// <자료형> : 리스트에 저장할 자료형
			// listname : 리스트 이름
			// new : 메모리 할당[객체 생성시 필수]
			// Arraylist<>(); : 생성자
		System.out.println("리스트 : " + listname); // 메모리들의 목록 출력
		listname.add("유재석"); // add("객체명") : 리스트에 객체를 추가하는 메소드 
		System.out.println("리스트[0] : " + listname.get(0) ); // 리스트명.get(인덱스) : 해당 인덱스의 객체 호출 메소드
		System.out.println("리스트길이 : " + listname.size() );
		
		// 배열 단점 : 메모리할당 1번(=메모리의 크기는 고정되어 있음) 
			// 회원배열 100개 -> 만일 100명이 넘어가면 불가능, 회원이 1명이면 나머지 99개 메모리 null -> 메모리 효율성 낮음 
		// 리스트 : 메모리크기는 가변길이[메모리 효율성 좋음)
			// 회원리스트 100개 -> 만일 100명 초과시 길이가 추가, 리스트의 기본길이 10 -> 만일 추가 하거나 삭제하면 자동 메모리 할당
		
		//  배열(문법) 		vs 		리스트(클래스)
		//  추가메소드X				추가메소드O
		//	추가: 배열명[0] = 값; 		리스트명.add(값)
		// 	호출 : 배열명[인덱스]		리스트명.get(인덱스)
		// 	삭제 : 배열명[인덱스]==null 리스트명.remove(인덱스)
		// 1 2 3... -> 1 null 3...	1 2 3... -> 1 3 ...
		// 	길이 : 배열명.length;		리스트명.size()
	}
}
