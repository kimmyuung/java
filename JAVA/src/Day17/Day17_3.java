package Day17;

import java.util.ArrayList;
import java.util.Arrays;

public class Day17_3 {
public static void main(String[] args) {
	
	// 코스 클래스 제네릭에 사람클래스 넣기
	Course<Person> 사람코스 = new Course<>("일반인과정",5);
	사람코스.add(new Person("일반인"));
	사람코스.add(new Worker("직장인"));// 사람클래스에게 상속받았기 때문에 가능
	사람코스.add(new Student("학생")); // 사람클래스에게 상속받음
	사람코스.add(new Highschool("고등학생")); // 학생클래스에게 상속받았기 때문에 가능
	// 제네릭에 들어가는 클래스는 자식클래스도 같이 들어갈 수 있음
	
	Course<Worker> 직장인코스 = new Course<>("직장인과정", 5);
	//직장인코스.add(new Person("일반인")); 오류!! 부모 클래스는 들어갈 수 없음
	직장인코스.add(new Worker("직장인")); // 본인은 가능
	//직장인코스.add(new Student("학생")); 오류!! 부모 클래스는 같으나 형제 클래스는 관련이 없는 파일이라 오류
	//직장인코스.add(new Highschool("고등학생")) 고등학생-> 직장인 변환 불가
	
	Course<Student> 학생코스 = new Course<>("학생과정", 5);
	// 학생코스.add(new Person("일반인")); // x
	// 학생코스.add(new Worker("직장인")); // x
	학생코스.add(new Highschool("고등학생")); // o
	
	Course<Highschool> 고등학생코스 = new Course<>("고등학생과정",5);
	// 고등학생을 제외하고 아무것도 들어갈 수 없음
//	고등학생코스.add(new Person("일반인"));  X
//	고등학생코스.add(new Worker("직장인")); X
//	고등학생코스.add(new Student("학생"));  X
	고등학생코스.add(new Highschool("고등학생")); // O
//	// * Arraylist
//	ArrayList<Person> list = new ArrayList<Person>();
//	list.add(new Person("일반인"));
	// 메소드 호출 
			코스명단출력(사람코스);
			코스명단출력(직장인코스);
			코스명단출력(학생코스);
			코스명단출력(고등학생코스);
			// 메소드 호출 
				//학생코스명단출력(사람코스); // x
				//학생코스명단출력(직장인코스); // x
			학생코스명단출력(학생코스);
			학생코스명단출력(고등학생코스);
			
			직장인코스명단출력(사람코스);
			직장인코스명단출력(직장인코스);
				//직장인코스명단출력(학생코스); // x
				//직장인코스명단출력(고등학생코스); // x
}
//와일드카드 : ? [ 모든 클래스 대응 ]
		// 코스< ? >  : 모든 제네릭 가능 
		// 코스< ? extends 클래스명 > : 해당 클래스로부터 상속 받은(자식) 제네릭 클래스 가능
		// 코스< ? super 클래스명 > : 해당 클래스로부터 상속 준(부모) 제네릭 클래스 가능 
	
	// 1.
	public static void 코스명단출력( Course<?> 코스명단 ) {
						//인수로부터 모든코스의 제네릭 받음
						// 코스<사람> : 사람 제네릭 코스만 가능
						// 코스< ? > : 모든 제네릭 코스가 가능 
		System.out.println( 코스명단.getName() +" 수강생명단 : "
					+ Arrays.toString( 코스명단.getStudents()) );
				// Arrays : 배열 관련 메소드 제공 
					// Arrays.toString( 배열명 ) : 해당 배열내 내용 모두 호출 
	}
	// 2. 
	public static void 학생코스명단출력( Course< ? extends Student> 코스명단 ) {
						// *학생 클래스로부터 상속받은 모든 클래스만 가능 
		System.out.println( 코스명단.getName() +" 수강생명단 : "
				+ Arrays.toString( 코스명단.getStudents()) );
	}
	// 3. 
	public static void 직장인코스명단출력( Course< ? super Worker> 코스명단) {
		System.out.println( 코스명단.getName() +" 수강생명단 : "
				+ Arrays.toString( 코스명단.getStudents()) );
	}
	
}




