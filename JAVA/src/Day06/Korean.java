package Day06;

public class Korean {
	// Korean 클래스 선언
	
		// 1. 필드
		String nation = "대한민국";
		// 국가 변수에 미리 대한민국 대입
		String name ;
		// 이름 변수에는 초기화 X -> NULL
		String ssn;
		// 주민등록번호 변수에는 초기화 X -> NULL
		
		// 2. 생성자
		// 조건1. 생성자이름 == 클래스이름 동일
		// 조건2. 외부로부터 들어오는 매개값[인수] 선언
		// 조건3. 동일한 생산자 이름을 가질 수 없다.
			// 오버로딩 : 동일한 이름일 경우 코드를 재정의
		
		Korean() { // 1. 빈생성자
			// 내용물 X
		}
		Korean(String name) {
			this.name = name;
		}
		// 필드 2개를 가지는 생성자
		Korean(String name, String ssn) {
			this.name = name; // name 내부변수 , n 외부변수
			this.ssn = ssn;
		}
		
		
		// 필드 3개를 가지는 생성자
		Korean(String nation, String name, String ssn) {
			this.nation = 	nation;
			this.name 	= 	name;
			this.ssn	= 	ssn;
			// 내부변수 == 외부변수가 같으면 충돌
			// -> 관례는 내부변수와 외부변수의 이름을 같게 함
			// 내부변수 표시 방법
			// 해결방법 : 앞에 this를 붙임
			// this.필드명 : 현재클래스 내 필드 호출
			// this.nation(내부) = nation(외부)
		}
		// 3. 메소드
}
