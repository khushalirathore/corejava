package core.java.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
	
	public static void main(String[] args) throws Exception {
		 
		FileOutputStream file = new FileOutputStream("C:\\Users\\hp\\Desktop\\juber\\Serialize.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Marksheet m = new Marksheet();
		
		m.id= 1;
		m.name= "juber pathan";
		m.physics= 80;
		m.chemistry= 70;
		m.maths = 90;
		m.total = m.physics + m.chemistry + m.maths ;
		
		out.writeObject(m);
		out.close();
		file.close(); 
	}

}
