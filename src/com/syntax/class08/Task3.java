package com.syntax.class08;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in) ;
		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 */
		int num1;
		int num2;
		int oddSum = 0;
		int evenSum = 0;
		System.out.println("Please enter your starting number");
		num1 = sc.nextInt();
		System.out.println("Please enter your ending number");
		num2 = sc.nextInt();
		for (int i = num1; i <= num2; i++) {
			if (i % 2 != 0) {
				oddSum = oddSum + i;
			} else {
				evenSum = evenSum + i;
			}
		}
		System.out.println("The total off odd number total is " + oddSum);
		System.out.println("The total off even number total is " + evenSum);

	}

}
