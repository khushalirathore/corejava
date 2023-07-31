package in.co.rays.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class TestWriteExt {
	public static void main(String[] args) throws Exception {
		 
		FileOutputStream file = new FileOutputStream("C:\\Users\\DELL\\Desktop\\io\\hello.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Employee e = new Employee();
		
		e.id = 1;
		e.firstName = "khushali";
		e.lastName = "rathore";
		e.salary = 90000;
		
		out.writeObject(e);
		
		out.close();
		out.close();
		
		
	}

}
