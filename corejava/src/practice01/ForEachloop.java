package practice01;

import java.util.ArrayList;

public class ForEachloop {
	public static void main(String[] args) {
		int []number = {1234567890};
		for (int n :number) {
			System.out.println(n);
		}
		ArrayList<String>names =new ArrayList<String >();
		names.add("one ");
		names.add("two");
		for(String n :names ) {
			System.out.println(n);
		}
		
	
	}
}
