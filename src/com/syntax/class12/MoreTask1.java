package com.syntax.class12;

public class MoreTask1 {

	public static void main(String[] args) {
		
		String text="Today is Sunday: 2:30 pm!!!!!!";
		
		text=text.replaceAll((" "),(""));
		System.out.println(text);
		
		String text2=text.replaceAll("[^A-Za-z]", "");
			//System.out.println(text2);
			int i=text.length(); 
			System.out.println(i+" alpha characters");
			
			
			//3task
			
	String a= "Is it saturday? "
			+ "Is it raining? "
			+ "Do we have a Java Class today?";  
	
	}

}
