package com.syntax.class08;

import java.io.InputStream;
import java.util.Scanner;

public class Task2YesForCreditCard {

	public static void main(String[] args) {

	Scanner scan =new Scanner (System.in);	
for (int i=1; i<=10; i++) {
System.out.println("Would you like to apply for a credit card?");
String  apply=scan.next(); 
if (apply.contentEquals("yes")) {
	System.out.println("Congratulation!");
	break;
		
	}

}
		
	}

}
