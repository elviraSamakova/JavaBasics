package com.syntax.class04;

public class Task1 {

	public static void main(String[] args) {

		boolean hasDiploma = true;
		int gpaScore = 2;

		if (hasDiploma) {
			System.out.println("Congratulations!");
			if (gpaScore >= 3.5) {
				System.out.println("You are eligible for Scholarship.");
			} else {
				System.out.println("You should have studied harder!");
			}

		} else {
			System.out.println("Get a degree");
		}
	}

}