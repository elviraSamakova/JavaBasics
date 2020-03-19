package com.syntax.class05;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		double num1;
		double num2;
		double num3;
		double largiest=5;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		num1 = scan.nextDouble();
		System.out.println("Please enter second number");
		num2 = scan.nextDouble();
		System.out.println("Please enter third number");
		num3 = scan.nextDouble();
if (num1>num2) {
	      if (num1>num3) {
		num1=largiest;
	        }else {
		largiest=num3;
	        }
}else {
	if (num2>num3){
		num2=largiest;
	}else {
		largiest=num3;
	}
}
	}

}
