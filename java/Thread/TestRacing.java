package core.java.Thread;

public class TestRacing {
	
	public static void main(String[] args) {
		
		Racing t1 = new Racing("juber");
		Racing t2 = new Racing("pathan");
		
		t1.start();
		t2.start();
		
	}

}
