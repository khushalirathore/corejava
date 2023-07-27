package core.java.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	
	public static void main(String[] args) {
		
		Collection List =  new ArrayList();
		
		
		List.add("one");
		List.add(100);
		List.add("two");
		
		//System.out.println(List);
		 
		
		Collection  c = new ArrayList();
		
		c.add("three");
		c.add("four");
		c.add(200);
		
		
		//List.clear();
		c.clear();
		
		//List.addAll(c);
		c.addAll(List);
		
		System.out.println(List);
		System.out.println(c);
		
	}

}
