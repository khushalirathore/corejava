package core.java.ExpectionHnad;

public class TestTryAndCatch {
	public  static void main(String[] args) {
		
		try {
			int a = 20;
			int b = 0; 
			int c = a / b;
			
			System.out.println("divison" + c);
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		}
		
		finally{
			
		}
		System.out.println("after catch handling");
	}

}
