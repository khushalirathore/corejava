 package core.java.practice;

public class Calculatorsim {
	  public static void main(String[] args) {
		
		  int a = 50;
		  int b = 5;
		  
      	  int sigh ='+';
		  
		  switch (sigh) {
		  
		case '+' :
			
          System.out.println(a+b);			 
			break;
			
		case '-' :
			
			System.out.println(a - b);
			break; 
			
		case '*' :
			
			System.out.println(a * b);
			break;
			
		case '/' :
			
			System.out.println(a / b);
            break;
            
		default:
			System.out.println("invalid sigh");
			break;
		}
				  
		  
	}

}
