package com.syntax.class04;

import java.util.Scanner;

public class TaskScanner1 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner (System.in);
		System.out.println("Please write amount of loan you need ");
		int num1=scan.nextInt();
		
		if (num1<=200000) {
			System.out.println("You may lend money");
		}else {
			System.out.println("You may not lend money.");
		}
		
	}

}
