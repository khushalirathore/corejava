package core.java.TestConstructor;

public class ConPerson {
	  
	public ConPerson() {
		
	}
	private int id = 0;
	private String name ;
	
	public   ConPerson(int id , String name ) {
		
		this.id= id;
		this.name= name;
		
	}
	public void setId (int id ) {
		this.id = id;
		
	}
	 public int getId() {
		   return id;
		   
		   
	   }
	public void setId(String name ) {
		this.name = name ;
		
	}
	  
	   public String getname () {
		   return name;
	   }
}
