package core.java.Collection;

public class TestPersonCollection {
	
	public static void main(String[] args) {
		 
		Person p1 = new Person(1, "juber");
		
		Person p2 = new Person(1, "juber");
		
		System.out.println(p1.equals(p2));
		
		System.out.println(p1.hashCode());
		
		System.out.println(p2.hashCode());
	}

} 
