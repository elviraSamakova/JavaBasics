package com.syntax.clacc09;

public class Task1And2 {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {
			for (int y = 1; y <= i; y++) {
				System.out.print(i);

			}
			System.out.println();

		}
		System.out.println("________________________________");
		for (int i = 1; i <= 5; i++) {
			for (int y = 1; y <= i; y++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int c = 5; c >=1; c--) {
			for (int d = 1; d <= c; d++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
