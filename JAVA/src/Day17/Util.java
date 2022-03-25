package Day17;

public class Util {
	
	public static <K, V> boolean compare(Pari<K, V> p1, 
			Pari<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
		
	}

	public static <T> Box<T> boxing(T t) {
					// 반환타입		// 인수
		Box<T> box = new Box<T>();
		box.set(t);
		return box; // 반환값
	}
}
