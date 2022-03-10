package Day07;

public class Calculator2 {
	// 1. 필드
	
	// 2. 생성자
	
	// 3. 메소드
	void excute() { // 인수 x, 반환 x, 실행메소드
		double result = avg(7, 10); // 내부에서 호출시 .객체 필요없음
		printIn("실행결과 : " + result);
	}
	
	double avg(int x, int y) { // 평균 메소드
		// 인수 O, 반환 O
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
		}
	int plus(int x, int y) { 
		// 인수 O, 반환 O, 더하기 메소드
		int result = x + y;
		return result;
	}
	void printIn(String message) { 
		// 인수 x, 반환 x, 결과 출력 메소드
		System.out.println(message);
	}
}
