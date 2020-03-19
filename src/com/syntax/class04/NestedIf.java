package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		//daclare date and day
		//if Friday -->if date is 13->wach a scary movie
		//-->if date is not 13->wach a comedy
		boolean isFriday=true;
		int date=13;
		
		if (isFriday) {
			System.out.println("Today is Friday, I will go movie.");
			
			if (date==14) {
				System.out.println("I'll wach a scary movie");
				
			}else {
				System.out.println("Today is not Friday, I am staying home");
				
			}
		}
		
		
			}
	

	}


