package in.co.rays.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriten04 {
	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("C:\\Users\\DELL\\Desktop\\io\\hello.");
		PrintWriter  pw = new PrintWriter (out);
		for (int i=0;i<5;i++) {
			System.out.println(i+":line");
			
		}
		pw.close();
		System.out.println("check C:\\Users\\DELL\\Desktop\\io\\hello.txt");
	}

}
