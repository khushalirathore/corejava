package core.java.Thread;

public class WithoutThread {
	
	public String name = null;
	public WithoutThread() {

	this.name = name;
	
	}
 public WithoutThread(String name) {
	  this.name = name;
 }
public void run() {
	 
	 for (int i = 1; i <=5 ; i++) {
		 
		 System.out.println(i + " "+ name);
		
	}
	
}
	

}
