package in.co.rays.loop;

public class WhileOdd {

	public static void main(String[]args) {
		
		int i = 0;
		int sum = 0;
		
		while(i <= 20) {
			if(i % 2 !=0) {
				
				System.out.print(" " + i );
				i++;
		
		
			}
			sum  = sum +i;
			 
			i++;
		}
		System.out.println(" = " + sum);
	}
}
