package Day06;

public class Day06_1 { // c  s
	public static void main(String[] args) { // m  s
	
		// 클래스
			// 1. 클래스 : 설계도
			// 2. 객체(인스턴스) : 설계도 기반으로 메모리 할당 받은 변수
				// ex) 붕어빵 틀 = 클래스 // 밀가루, 물, 팥, 슈크림 => 필드[속성=상태]
									  // 굽기, 뒤집기, 판매 : 메소드[행동]
		// 붕어빵 틀로부터 여러 개의 붕어빵 생성 -> 서로 다른 붕어빵 생성 [붕어빵1, 붕어빵2 ~~]
		
		// 회원 = 클래스 
			// 아이디, 비번, 생년월일, 이름, 이메일, 전화번호, 성별 => 필드
			// 회원가입, 아이디찾기, 비밀번호찾기, 회원탈퇴, 로그인 => 메소드(행동)
				// 서로 다른 회원 생성[회원1, 회원2 ~~~]
		
		//p. 195
		Student s1 = new Student();
		// 1. Student : 정의된 클래스명
		// 2. student : 객체명[아무거나] + 추천[클래스명의 소문자]
		// 3. new 연산자 : 메모리(저장공간) 생성
		// 4. Student() : 생성자명( )
		// * 객체 생성시 4가지 필요!!
		System.out.println("s1 변수가 Student 객체를 참조합니다");
		System.out.println(s1);
		// 출력값 : day06(패키지)	@Student(클래스)	@메모리 위치
		
		Student s2 = new Student();
		System.out.println("s2 변수가 Student 객체를 참조합니다");
		System.out.println(s2);
		// 출력값 : day06(패키지)	@Student(클래스)	@메모리 위치(s1과 다름)
		
		
		
		
	} // m  e
} // c  e

