package core.java.inheritance;

public class CircleI  extends Shape {
	
	private int radius ;
	
	public static final  double  PI = 3.14;
	
	public CircleI(int radius) {
		
		
		this.radius = radius;
	}
	public void setradius( int radius) {
		 
		this.radius = radius;
		
	}
	public int getradius() {
		
		return  radius;
	}
	public void area () {
		
		double carea = (PI  * getradius() * getradius());
		
		System.out.println("area of circle = "+ carea);
	}
	 	

}
