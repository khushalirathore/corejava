package core.java.practice;



public class AllPractice {
		public static void main(String[] args){
			
		int[][] table = new int [4][2];
		
		table [0] [0] = 2;
		table [0] [1] = 4;
		table [0] [2] = 6;
		table [0] [3] = 8;
		table [0] [4] = 10;
		
		table [0] [1] = 3;
		table [1] [1] = 6;
		table [2] [1] = 9;
		table [3] [1] = 12;
		table [4] [1] = 15;
		
		for (int i = 0; i < table.length; i++) {
			
			for (int j = 0; j < table[0].length; j++) {
				
				System.out.println(table[i-1][j-1] + " \t ");
				
				
			}
			System.out.println();
		}
		
		
	
		
		
		}
}
	


