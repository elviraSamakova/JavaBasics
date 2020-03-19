package com.syntax.class04;

import java.util.Scanner;

public class ScannerAndVerification {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Please enter first number");
		int num1=scan.nextInt();
		
		System.out.println("Please enter second number");
		int num2=scan.nextInt();
		
		if (num1>num2) {
			System.out.println(num1 + "is larger than "+ num2);
			
		} else if (num1<num2) {
				System.out.println(num1 +" is less than "+ num2);
		
			} else {
				System.out.println("numbers are equal");
			}
	}

}
