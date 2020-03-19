package com.syntax.class05;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		int score;
		int score1;
		int score2;
		int score3;
		String grade;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please input your quiz score");
		score1 = scan.nextInt();
		System.out.println("Please input your mid term score");
		score2 = scan.nextInt();
		System.out.println("Please input your final score");
		score3 = scan.nextInt();
		score = (score1 + score2 + score3) / 3;
		// System.out.println("Your ");

		if (score >= 90) {
			grade = "A";
		} else if (score >= 70 && score < 90) {
			grade = "B";
		} else if (score >= 50 && score < 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		System.out.println("Based on your average score -your grade is " + grade);
	}

}
