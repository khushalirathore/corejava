package core.java.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmailRegex {
	
	public static void main(String[] args) throws IOException {
		
		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";


		
		FileReader file = new FileReader("C:\\Users\\hp\\Desktop\\juber\\regex.txt");
		
		BufferedReader in = new BufferedReader(file);
		
		String line = in.readLine();
		
		while (line == null) {
			
			System.out.println(line);
			
			line = in.readLine();
			
		}
		in.close();
		
		if(line.matches(emailreg)) {
			
			System.out.println("lne match succesfully " + line);
		}
		else {
			
			System.out.println("not match found");
		}
		
	}

}
