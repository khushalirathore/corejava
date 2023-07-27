package core.java.Thread;

public class TestThread {
	public static void main(String[] args) {
		 
		WithoutThread t1 = new WithoutThread("juber");
		WithoutThread t2 = new WithoutThread("khan");
		t1.run();
		t2.run();
		
		
		
	}

}
