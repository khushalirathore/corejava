package core.java.Collection;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
	 public static void main(String[] args) {
		 
		 
		 
		 Set set =  new  HashSet();
		 
		 set.add("a");
		 set.add(90);
		 set.add("b");
		 set.add("a");
		 set.add(90);
		 set.add("c");
		 set.add(70);
		 
		 
		 for(Object object : set) {
			 
			 
			 System.out.println(object);
		 }			 
				 		 
	}
	 	
	
}
