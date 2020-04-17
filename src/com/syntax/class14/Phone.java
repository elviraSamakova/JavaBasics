package com.syntax.class14;

public class Phone {

	String name;
	String model;
	int year;
	
	
	public static void main(String[] args) {
		
		Phone phone1=new Phone();
		phone1.name="iPhone";
		phone1.model="X";
		phone1.year=2020;
		
		Phone phone2=new Phone();
		phone2.name="Samsung";
		phone2.model="Note10";
		phone2.year=2019;
		
		Phone phone3=new Phone();
		phone3.name="Nokia";
		phone3.model="6200";
		phone3.year=2010;
		
		phone1.text();
	    phone1.calls();
	    
		}
	
		void text () {
			System.out.println("Can text");
	}
void calls() {
	System.out.println("Make calls");
}
}
