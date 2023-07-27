package core.java.IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class TestDeSerialization {
	
	public static void main(String[] args) throws Exception {
		 
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\Desktop\\juber\\Serialize.txt");
		
		ObjectInputStream in = new ObjectInputStream(file);
		
		Marksheet m = (Marksheet) in.readObject();		
		
		System.out.println(m.id);
		System.out.println(m.name);
		System.out.println(m.physics);
		System.out.println(m.chemistry);
		System.out.println(m.maths);
		System.out.println(m.total);
		
		in.close();
		file.close();
		
	}

}
