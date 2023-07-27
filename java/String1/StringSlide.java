package core.java.String1;

public class StringSlide {
	
	public static void main(String[] args) {
		String name = "JUBER pathan";
		System.out.println(name.length());
		System.out.println(name.charAt(4));
		System.out.println(name.indexOf("path"));
		System.out.println(name.indexOf("t"));
		System.out.println(name.lastIndexOf("a"));
		System.out.println(name.replace("a" , "e"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.startsWith("JUBER"));
		System.out.println(name.endsWith("han"));
		System.out.println(name.substring(7));
	}

}

