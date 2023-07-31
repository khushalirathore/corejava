package in.co.rays.array;

public class CountArray {
	public static void main(String[] args) {
		
		 String [] names = { "khushali", "raj", "sachin"};
		 
		 int count = 0;
		 
		 for(String s : names) {
			 
			 for(int i = 0; i <  s.length(); i++) {
               
				 if( s.charAt(i) == 'a'){
					 
					 count++;
					 
					 System.out.println("last a in index = "+  i+" = in  " +s );
					 
				    }
				 } 
			 }
	     }
	 }