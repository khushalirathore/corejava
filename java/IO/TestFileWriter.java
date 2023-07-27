package core.java.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestFileWriter {
	
	public static void main(String[] args) throws IOException  {
		 
		FileWriter file = new FileWriter("C:\\Users\\hp\\Desktop\\juber\\juber.txt");
		 
		PrintWriter pr = new PrintWriter(file);
		
		
		file.write("my self juber pathan");
	
		
			
		
		
	}
	
}


