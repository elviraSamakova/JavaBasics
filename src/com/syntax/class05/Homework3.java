package com.syntax.class05;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		double num1;
		double num2;
		double num3;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		num1 = scan.nextDouble();
		System.out.println("Please enter second number");
		num2 = scan.nextDouble();
		System.out.println("Please enter third number");
		num3 = scan.nextDouble();
		
		if (num1>num2 && num1>num3 && num1!= num2 && num1!= num3) {
			System.out.println(num1 + " is the largiest number");
		} else if (num2>num1 && num2>num3 && num2!=num1 && num2!=num3) {
			System.out.println(num2 + " is the largiest number");
		} else if (num3>num1 && num3>num2 && num3!=num1 && num3!=num2) {
			System.out.println(num3 + " is the largiest number");

		} else {
		
		System.out.println("Please inter distinct numbers");
	}}
}
