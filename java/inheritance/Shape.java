package core.java.inheritance;

public class Shape {

	public Shape() {
		
	}
	
	 private String color = null;
	
	private int borderwidth = 0;
	
	public Shape(String color , int borderwidth) {
		this.color = color;
		this.borderwidth = borderwidth;
		
	} 
	
	public void setcolor (String color ) {
		this.color = color;
		
	}
	public String getcolor() {
		return color;
		
	}
	public void setborderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
		
	}
	public int getborderwidth() {
		return borderwidth;
	}
	 
	public void area() {
		
		//System.out.println("Shape method");
		
		System.out.println("shape araea color = " );
		System.out.println("shape area borderwidth = ");
		
	}
}
	
		
	
	


