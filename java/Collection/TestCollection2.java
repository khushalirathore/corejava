package core.java.Collection;

import java.util.ArrayList;
import java.util.List;


public class TestCollection2 {

	public static void main(String[] args) {
		 
		List list = new ArrayList();
		
		list.add("one");
		list.add(500);
		list.add("two");
		list.add("five");
	
		list.set(2, "juber");
		
		System.out.println(list);
		
		
		
	}
		
}
