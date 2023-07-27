package core.java.Collection;

import java.util.SortedSet;
import java.util.TreeSet;
 
public class TestTreeSet {
	
	public static void main(String[] args) {

		SortedSet  set = new TreeSet();
		
		set.add("a");
		set.add("c");
		set.add("f");
		set.add("g");
		set.add("d");
		set.add("e");
		set.add("b");
		
		for(Object object: set) {
			
			System.out.print(object + ",");
		}
		
		System.out.println();
		
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet("d"));
		System.out.println(set.tailSet("e"));
		System.out.println(set.subSet("c", "f"));
		
	}

}
