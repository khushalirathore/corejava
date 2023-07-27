package core.java.Collection;

import java.util.HashMap;


public class TestMap {
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7,"seven");
		map.put(8, "eight");
		
		System.out.println(map.entrySet());
		System.out.println(map.size());
		
		
	}

}
