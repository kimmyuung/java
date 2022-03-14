package Day09;

public class Computer extends Calculator{
	// 1. field
	// 2. constructor
	// 3. method
@Override // 상속받은 부모가 가지고 있는 메소드 호출
double areaCircle(double r) { 
	// 원칙적으로 같은 인수를 가지는 메소드는 안됨
	// 단, 다른 자료형이고, 같은 인수는 가능
	System.out.println("Computer 객체의 areaCircle() 실행");
	return Math.PI * r * r;
	}
}
