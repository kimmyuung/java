package Day17;

public class Day17_2 {
public static void main(String[] args) {
	// 1. 객체 생성 // new 이후는 생략 가능!!
	Box<Integer> box1 = new Box<>();
	// 2. 메소드 호출후 결과값을 객체에 대입
	box1 = Util.<Integer>boxing(100);
	// 3. 확인
	System.out.println(box1.get());
	
	// 1. p1객체를 선언하는데 생성자에 정수 1과 문자열 사과를 넣음
	// 이유 : 제네릭<정수, 문자열>
	Pari<Integer, String> p1 
	= new Pari<Integer, String>(1, "사과");
	
	// 2. p2객체 선언
	Pari<Integer, String> p2
	= new Pari<Integer, String>(1, "사과");
	// 3. 메소드호출
	// 흐름
	// Pari에 int와 String 집어넣음
	// K : int V : String
	// 
	boolean result1 = Util.<Integer, String>compare(p1, p2);
	if(result1) System.out.println("동등한 객체");
	else System.out.println("동등하지 않는 객체");
	
	
	Pari<String, String> p3 = 
	new Pari<String, String>("user1", "홍길동");
	Pari<String, String> p4 = 
	new Pari<String, String>("user2", "홍길동");
	boolean result2 = Util.compare(p3, p4);
	if(result2) System.out.println("동등!!!");
	else System.out.println("안 동등!!!");
	}
}
