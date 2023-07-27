package core.java.IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestReadExt {
	public static void main(String[] args) throws Exception {
		 
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\Desktop\\juber\\Ex.txt");
		
		ObjectInputStream in = new ObjectInputStream(file);
		
		Employee e = (Employee) in.readObject();
		
		
		System.out.println(e.id);
		
		System.out.println(e.firstName);
		
		System.out.println(e.lastName);
		
		System.out.println(e.salary);
		
		in.close();
		file.close();
	}

}
