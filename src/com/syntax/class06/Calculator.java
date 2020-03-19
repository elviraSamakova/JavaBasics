package com.syntax.class06;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 2 numbers");

		double num1 = scan.nextInt();
		double num2 = scan.nextInt();
		double result = 0.0; // double=??

		System.out.println("Please enter an operator(+,-,*,/)");
		char operator = scan.next().charAt(0);

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default: 
			System.out.println("Unknown");
			return;

		}
		System.out.println("Your result is " + result);

	}

}
