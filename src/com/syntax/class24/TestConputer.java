package com.syntax.class24;

public class TestConputer {

	public static void main(String[] args) {
	Computer apple=new Apple("Apple");
	Computer lenovo=new Lenovo("Lenovo");
	Computer hp=new HP("HP");
	Computer dell=new Dell("Dell");
		
		Computer[] comp= {apple, lenovo, hp, dell};
	for (Computer c:comp) {
	c.display();
	c.start();
	
	System.out.println(" ------------   ");
	
	}
	}

}
