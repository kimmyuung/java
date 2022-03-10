package Day07;

public class Day07_3 {
public static void main(String[] args) {
	
	// 메소드 호출시
		// 내부호출 : 메소드가 선언된 클래스[파일]내 메소드 호출시
			// 메소드명만 사용 ex) avg(인수1, 인수2)
		// 외부호출 : 메소드가 선언된 다른 클래스[파일]내 메소드 호출 시
			// 객체를 통해서 메소드명 호출 ex) myCalc.avg(인수1, 인수2)
	
	// p.227 내부호출
	Calculator2 myCalc = new Calculator2();
	myCalc.excute(); // 외부에서 메소드호출
	
	
	}
}
