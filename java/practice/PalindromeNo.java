package core.java.practice;

public class PalindromeNo {
	
	public static void main(String[] args) {
		
		int number = 111;
		int r ;
		int sum = 0 , a;
		int m;
		
		m = number;
		
		while(number >0) {
			
			r = number % 10;
			
			sum = (sum * 10) + r;
			
			number = number / 10;
			
		}
		
		if(m == sum) {
			
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not Palindrome number  ");
		}
		
	}

}
