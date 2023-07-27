package core.java.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(new Employee(1 , "zuber " ,  50000));
		list.add(new Employee(4 , "khushali ", 9000));
		list.add(new Employee(2 , "raj ", 80000));
		list.add(new Employee(2 , "sachin ", 40000));
		list.add(new Employee(5 , "uttam ", 56000));
		list.add(new Employee(7 , "monty ", 57000));
		list.add(new Employee(4 , "hemant ", 40000));
		list.add(new Employee(9 , "ratnagar ", 20000));
		list.add(new Employee(8 , "pushpa ", 30000));
		
		/* 
		 for (Object object : list) {
		 
			System.out.println(object);
			
		}
		
		*/
		//Collections.sort(list);
		
		//Collections.sort(list,new ComparetoName());
		
		//Collections.sort(list,new ComparetoSalary());
		
		Collections.sort(list,new ComparetoId());
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			
			Object object = (Object) it.next();
			
			System.out.println(object);
		}
	}

}
