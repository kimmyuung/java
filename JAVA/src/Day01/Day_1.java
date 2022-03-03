	// ctrl + (+) , (-) : 확대 축소
	// 주석처리( 컴파일 제외 -> 실행 영향 없는 코드)
	// 1. // 슬래쉬 2번 : 한줄 주석
	// 2. /* 여러줄주석 */
	// tab 들여쓰기
package Day01; // 패키지명[ 소스파일들의 폴더 ] 

public class Day_1 { // 클래스 시작( = c  s)
	
	// public : 접근제한자 -> 전범위
	// class : 클래스 선언(=클래스를 사용하겠다!)
	// Day01_1 : 클래스 이름
	// * 모든 곳에서 사용하는 Day01_1 이라는 이름을 갖는 클래스 선언
	// { : 시작  //  } : 끝 * 중괄호 안 맞으면 오류 발생!
	// 1. class 안에서 코드 작성 [ class 밖에선 작성 불가 ]
	// 자바는 100% 객체 지향이기 때문
	// 2. 실행코드는  main 함수
		// main 입력후 ctrl + 스페이스 -> 엔터
	public static void main(String[] args) { // main start
		
		// public : 접근제한자
		// static : 정적변수
		// void : 반환타입 없다(=돌려주는 값이 없다)
			// main 함수 = 메인 스레드를 가지고 있는 함수[필수]
				// 스레드 = 코드를 읽어주는 흐름?
		// * main함수 {} 안에 작성된 코드는 실행
		// syso -> ctrl + 스페이스바 : 출력 자동완성
		System.out.println("java 출력"); // 고급언어
		// 컴파일(ctrl + f11)로 실행, ctrl + s  저장
		
	} // main end
}// class end
