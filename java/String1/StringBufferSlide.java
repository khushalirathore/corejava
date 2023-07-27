package core.java.String1;

public class StringBufferSlide {
	public static void main(String[] args){
		
		String s1 = "juber";
		String s2 = "khan";
		StringBuffer sb = new StringBuffer("juber");
		sb.append("khushali");
		System.out.println(sb);
		System.out.println("length : "+ sb.length());
		System.out.println("capicity : "+ sb.charAt(5));
		System.out.println("index of : " + sb.indexOf("khu"));
	    System.out.println("replace : " + sb.replace(0 , 5, "khu"));
		System.out.println("revers : "+ sb.reverse());
		
	}

}
