package in.co.rays.IO;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	
	public static void main(String[] args) throws IOException  {
		FileReader in = new FileReader("C:\\Users\\DELL\\Desktop\\io\\hello.txt");
		
		int ch =in.read();   //read charcter by char.
		char chr;
		while (ch!=-1) { //read while value -1
			
			System.out.print((char)ch);
			ch=in.read();
			
			
		}
		in.close();
	}
}