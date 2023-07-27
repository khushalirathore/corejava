package core.java.basic;

public class OneTOHu {
	
	public static void main(String[] args) {
		for(int i = 1 ; i<= 10; i++) {
			int a = i;
			for( int j = 0; j < 10; j++, a = a+10) {	 
				System.out.print( " \t" + a);
			}
			System.out.println();
		}
	}

}
