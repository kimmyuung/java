package Day11;

public class Day11_3
{ // cs
	public static void findclass() throws Exception
	{
		// 1. 예외 던지기 [메소드명() throws 예외클래스명
		Class clazz = Class.forName("java.lang.String2");
//		try
//		{ // 예외가 발생할 것 같은 코드(실행예외) 혹은 일반예외(무조건)
//			Class class1 = Class.forName("java.lang.String2"); 
//								// 클래스찾기 메소드
//		} catch (Exception e) // 예외가 발생하면 실행되는 코드
//		{	// Exception : 예외클래스중 슈퍼클래스 이므로 모든 예외 저장 가능
//			System.out.println(e);
//		}
	}
	public static void withdraw(int money) throws Exception {
		if(20000 < money) {
			throw new Exception("잔고부족");
		}
	}
	public static void main(String[] args) 
	{ // ms
		// 예외던지기
		// 목적 : 모든 메소드에서 try{}catch(){} 사용 가능은 하나 많은 사용시 코드가 복잡
		// -> 한곳으로 예외 이동
		try {findclass(); // 호출한 곳에서 try, catch 통해 예외 해결
		} catch(Exception e) {  }
		
		try {withdraw(30000);}
		catch(Exception e) { System.out.println(e); }

	} // me
} // ce
