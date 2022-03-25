package Day17;

import java.util.Arrays;

public class Course<T> {
		// <제네릭이름> : 외부로부터 들어오는 자료형
	private String name;  // 과정명 : 문자열
	private T[] students; //학생배열 :??? -> 외부에서 들어오는 자료형
	public Course(String name, int capacity) 
	{// 생성자 : 외부로부터 과정명과 인원수 받아 인원수만큼 제네릭타입으로 배열내 메모리할당
				
		this.name = name;
		students = (T[])new Object[capacity];
			// * 제네릭타입은 매개타입이기 때문에 메모리할당(=new 명령)이 안됨
			// 1. new Object[인원수] = 인원수 만큼 object 배열 선언
			// 2. object 배열 ----> T[] 배열로 강제형변환
			// 3. * Object 클래스는 최상위[부모]이기 때문에 가능
			// 4. Object클래스를 제네릭타입인 T로 변환
	}
	// 과정명 호출 메소드
	public String getName() {
		return name;
	}
	
	// 학생배열 호출 메소드
	public T[] getStudents() {
		return students;
	}
	// 학생배열에 객체 추가[Arraylist클래스 설계 방식 유사]
	public void add(T t) {
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
	
	
}
