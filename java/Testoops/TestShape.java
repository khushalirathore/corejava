package core.java.Testoops;

public class TestShape {
	public static void main(String[] args) {
		 
		Shape s = new Shape();
		s.SetColor("red");
		s.setBorderWidth(3);
		
		System.out.println(s.getColor());
		
		System.out.println(s.getBorderWidth());
		
	}

}
