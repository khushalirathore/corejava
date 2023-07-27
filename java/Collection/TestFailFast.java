package core.java.Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;


public class TestFailFast {
	
		public static void main(String[] args) {
		
			// List list = new ArrayList();
			
			Vector list = new Vector();
			
		
			list.add("juber");
			list.add("khushali");
			list.add("raj");
			list.add("sachin");
			list.add(100);
			
			Enumeration  it = list.elements(); 
			
			
			//Iterator it = list.iterator();
			
			list.add(300);
			
		while (it.hasMoreElements()) {
			
			System.out.println(it.nextElement());
			
		}
		}
			
			
			
			
}


