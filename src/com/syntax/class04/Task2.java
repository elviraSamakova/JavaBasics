package com.syntax.class04;

public class Task2 {

	public static void main(String[] args) {

		double morgageRate = 4.9;
		long morgagePrice = 10000;

		if (morgageRate < 4.5) {
			System.out.println("I will buy a house.");
			if (morgagePrice > 20000) {
				System.out.println("I will take a loan.");
			} else {
				System.out.println("I will pay cash.");
			}

		} else {
			System.out.println("I will not buy a house.");
		}
	}

}
