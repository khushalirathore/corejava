package core.java.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestWriteExt {
	public static void main(String[] args) throws Exception {
		 
		FileOutputStream file = new FileOutputStream("C:\\Users\\hp\\Desktop\\juber\\Ex.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Employee e = new Employee();
		
		e.id = 1;
		e.firstName = "juber";
		e.lastName = "pathan";
		e.salary = 90000;
		
		out.writeObject(e);
		
		out.close();
		out.close();
		
		
	}

}
