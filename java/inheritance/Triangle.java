package core.java.inheritance;

public class Triangle extends Shape {

	public Triangle() {
		
	}
	
	private int hight;
	private  int base;
	
	public Triangle (int hight, int base) {
		
		this.hight = hight;
		this.base = base;
		
	} 
	
	private void sethight() {
		this.hight= hight;
	}
	
	private int gethight() {
		return hight;
	}
	private void setbase() {
		this.base = base;
	}
   private int getbase() {
		return base;

	}
	
	public void area() {
		
		double tarea = (double)(gethight() * getbase()) / 2 ;
		System.out.println("area of Triangle = "+ tarea);
	}
	
}
