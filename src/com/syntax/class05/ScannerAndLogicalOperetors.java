package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperetors {

	public static void main(String[] args) {
		int age;
		Scanner scan;
		scan=new Scanner (System.in);
		System.out.println("Please enter your age");
		age=scan.nextInt();
		if (age>=0 && age<3) {
			System.out.println("You are a baby");
		}else if (age>=3 && age<5) {
		System.out.println("You are a kid");
	}else if (age>=6 && age<=12) {
		System.out.println("You are a kid");
	}else if (age>12 && age<=19) {
		System.out.println("You are a teenager");
	}else if (age>=20 && age<65) {
		System.out.println("You are an adult");
	}else {
		System.out.println("You are a senior");
	}
}
}
