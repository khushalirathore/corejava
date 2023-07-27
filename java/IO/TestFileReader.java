package core.java.IO;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
	
	public static void main(String[] args) throws IOException  {
		 
		FileReader file  = new FileReader("C:\\Users\\hp\\Desktop\\juber\\juber.txt");
		
		  int ch = file.read();
		  
		  while (ch != -1) {
			  
				 System.out.print((char)ch);
			  
			  ch = file.read();
			 
			
		}
		  file.close();
		  
		  
}
}