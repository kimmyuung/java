package Day16;

public class Box { // 박스 클래스
	
private Object object; // 슈퍼클래스(최상위 클래스)
public void set (Object object) {
	this.object = object;
}
public Object get() {
	return object;
}

}
