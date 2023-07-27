package core.java.Collection;

import java.util.ArrayList;
import java.util.Collections;

import java.util.stream.Collectors;


public class ConstestStream {
	public static void main(String[] args) {
		
		
		ArrayList<Contestant> list = new ArrayList<Contestant>();
		
		
		list.add(new Contestant("juber" , "9644799243"));
		list.add(new Contestant("raj" , "9644799243"));
		list.add(new Contestant("khushali" , "9705736252"));
		list.add(new Contestant("sachin" , "3547586970"));
		list.add(new Contestant("kusum" , "975647635"));
		list.add(new Contestant("priyanshi" , "9009251256"));
		list.add(new Contestant("pushpa" , "6262074982"));
		list.add(new Contestant("ritu" , "8927450223"));
		list.add(new Contestant("payal" , "8889918622"));
		list.add(new Contestant("monty" , "8889679576"));
		list.add(new Contestant("invalid" , "8886"));

		
		System.out.println("Winner.....!!");
		
	list.stream()	.map(e -> e.phone).filter(e -> e.length()==10).distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e ->{
		Collections.shuffle(e);
		
		return e.stream();
		
	})).limit(3).forEach(e -> System.out.println(e));
	
		
	}

}



class Contestant {
	
	public String name = null;
	public String phone = null;
	
	

	public Contestant(String n, String p) {
		name = n;
		phone = p;
	}
	
}