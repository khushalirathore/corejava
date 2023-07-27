package core.java.Testoops;

public class TestPen {

	public static void main(String[] args) {
		
		Pen pen1 = new Pen();
		
		pen1.color = "blue";
		
		pen1.type = "zel";
		
		Pen pen2 = new Pen();
		pen2.color =  "black";
		pen2.type  =  "ballpoint";
		
		pen1.printColor();
		pen2.printColor();
		
	}
	
}
