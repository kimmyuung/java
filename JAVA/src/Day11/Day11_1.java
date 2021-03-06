package Day11;

public class Day11_1
{
// p. 386 확인문제
	// 1. 3 [ 인터페이스의 멤버 : 1. 상수필드 2. 추상메소드 3. 디폴트메소드 4. 정적메소드 ]
	// 2. 4 [ 인터페이스 변수 = 구현객체 ]
	// 구현객체 = 클래스의 implements(=구현)한 객체
	// 3.
	private static void printSound(Soundable soundable)
	{
		// 접근제한자 정적 반환타입 메소드명 (인수 [변수, 배열, 객체, 인터페이스]
		System.out.println(soundable.sound());
	}

	public static void main(String[] args)
	{
		// 3 정답
		System.out.println(new Cat());
		System.out.println(new Dog());

		Soundable soundable = new Cat();
		Soundable[] soundables = new Cat[100];
		Soundable soundabled = new Dog();

		// 4 정답
		dbWork(new Oracle());
		dbWork(new MysqlDao());

		// 5 익명객체[인터페이스가 직접 구현]
		// 구현객체 : 인터페이스 객체명 = new 클래스명();
		// 익명객체 : 인터페이스 객체명 = new 인터페이스({구현})
		Action action = new Action()
		{
			@Override
			public void work() 
			{
				System.out.println("복사를 합니다,");
			} // 익명객체의 구현 끝에는 세미콜론을 붙여야 함
		};
		action.work();
	}
	
	// 4.
	// Dao : 데이터베이스 접근 객체
	// Dto : 데이터베이스 이동 객체
	private static void dbWork(DataAccessObject dao)
	{
		// 접근제한자 정적 반환타입 메소드명 (인수 [변수, 배열, 객체, 인터페이스]
	}
}
