package core.java.inheritance;

public class TestShape {
	
	public static void main(String[] args) {
		
	/* Shape [] s = new Shape [3];
		
		s[0] = new Rectangle();
		
		s[1] = new CircleI();
		
		s[2] = new Shape();
		
		Rectangle r = (Rectangle) s[0];
		
		
		//r.setLength(10);
		
		//r.setwidth(20);
	
		
		CircleI c = (CircleI) s[1];
		
		c.setradius(5);
		
		
		for (int i = 0; i < s.length; i++) {
			
			s[i].area();
			
			
			//////////////////    OTHER WAY    ///////////////
		       
		//  Rectangle r = new Rectangle(10,5);
		
	/*	r.setLength(10);
		
		r.setwidth(10);
		 
		
		r.area();
		
		CircleI c = new CircleI();
		
		c.setradius(5);
		
		c.area();
		
		 
		
		}   */
		
		
		
		///////////////////    CONSTRACTOR METHOD      ///////////////
		
	
			
		Rectangle r = new Rectangle(9,6, "red", 20);
		r.area();
		
		CircleI c = new CircleI(4);
		c.area();
		
		Triangle t  =   new Triangle(3,7);
		t.area();
	}

}