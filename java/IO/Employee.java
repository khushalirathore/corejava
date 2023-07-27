package core.java.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable{

	public int id = 0;
	public String  firstName = null;
	public String lastName = null;
	public int salary = 0;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeInt(id);
		
		out.writeObject(firstName);
		
		out.writeObject(lastName);
		
		out.writeObject(salary);
		
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
  		id = in.readInt();
  		firstName = (String) in.readObject();
  		lastName = (String) in.readObject();
  		salary = in.readInt();
         	
		
	}
	
	
		
}
