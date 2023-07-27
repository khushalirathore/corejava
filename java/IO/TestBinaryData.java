package core.java.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class TestBinaryData {
	public static void main(String[] args) throws Exception {
		
		String source = "C:\\Users\\hp\\Desktop\\photo2.jpg";
		
		String target = "C:\\Users\\hp\\Desktop\\juber\\khan.jpg";
		
		FileInputStream  in = new FileInputStream(source);
		
		FileOutputStream out = new FileOutputStream(target);
		
		int ch =  in.read();    //
		
		while (ch!= -1) {
			
			out.write(ch);
			ch= in.read();
			
		}
		out.close();
		in.close();
		
	}

}
