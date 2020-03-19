package com.syntax.class02;

public class Variables {
	
	public static void main (String[] args) {
		
		String name="Elvira";
		String lastName="Samakova";
		char grade='A';
		String city="Philadelphia";
		String state="PA";
		long phoneNumber=2677778989l;
		
		city="Denver";
		state="Tx";
		phoneNumber=2674322345l;
		grade='B';
		
		System.out.println(city);
		System.out.println(state);
		System.out.println(grade);
		System.out.println(phoneNumber);
		
		//string concatenation
		
		System.out.println("My name is "+name +".");
		System.out.println("I live in city of "+city+" and my phone number is "+phoneNumber+"!");
	
		
		
	}
	

}
