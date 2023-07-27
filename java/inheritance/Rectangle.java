 package core.java.inheritance;

public class Rectangle extends Shape {
	
	
	private int length;
	private int width;
	
	public Rectangle(int length, int width , String color,int borderwidth) {
		super(color,borderwidth);
		this.length = length;
		this.width = width;
		
	}
	public void setLength(int length) {

		this.length = length;
		
	}
	public void setwidth(int width) {
		 this.width = width;
		 
	}
	public int getLength() {
		return length;
		
	}
	public int getWidth() {
		
		return width;
	}
	public void area() {
		
		int rarea = getLength()*getWidth();
		System.out.println("rectangle  Area = "+rarea);
		
	}

}
