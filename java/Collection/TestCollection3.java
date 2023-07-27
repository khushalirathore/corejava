package core.java.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollection3 {
	public static void main(String[] args) {
		
		Person p1 = new Person(1 , "juber");
		Person p2 = new Person(2, "pathan");
		
		List list = new ArrayList();
		
	 	list.add("one");
		list.add("two");
		list.add(200);
		list.add("three");
		list.add(500);
		list.add("four");
		list.add(p1);
		list.add(p2);
		
		/*for (Object object : list) {
			
			System.out.println(object);
			for (int i = 0; i < list.size(); i++) {
			*/
				
				Iterator it  = list.iterator();
				
				while (it.hasNext()) {
					System.out.println(it.next());
					
				}
				
			}
			
		//}
		
		
	}

//}
