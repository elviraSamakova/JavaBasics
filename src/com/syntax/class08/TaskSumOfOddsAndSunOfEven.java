package com.syntax.class08;

public class TaskSumOfOddsAndSunOfEven {

	public static void main(String[] args) {
		int evensSum = 0;
		int oddsSum = 0;

		for (int num = 1; num <= 99; num++) {
			if (num % 2 == 0) {
				evensSum = evensSum + num;

			} else {
				oddsSum = oddsSum + num;

			}
		}
		System.out.println("Sum of evens " + evensSum);
		System.out.println("Sum of odds " + oddsSum);
	}

}
