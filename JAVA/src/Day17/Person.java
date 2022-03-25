package Day17;

public class Person<T> {
// 1. field
	private String name;
	private int age;
	
// 2. constructor
	public Person() {}
	public Person(String name) {this.name = name;}
// 3. method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
