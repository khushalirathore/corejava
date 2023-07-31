package in.co.rays.IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritten01 {
	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("C:\\Users\\DELL\\Desktop\\io\\hello.txt");
		out.write("A");
		out.write("\n");
		out.write("Hello");
		out.append("\n");
		out.write("line ");
		out.close();
		System.out.println("check C:\\Users\\DELL\\Desktop\\io\\hello.txt");
		
	}

}
