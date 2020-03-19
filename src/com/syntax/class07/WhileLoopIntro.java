package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		int time = 10;
		if (time < 12) {
			System.out.println("Good morning");

		}
		System.out.println("-------------While LOOP-------");

		while (time < 12) {
			System.out.println("Good morning");
			time++;

		}
//how to print numbers from 1 to 50
		int num = 1;
		while (num <= 50) {
			System.out.println(num);
			num++;
		}
//how to print from 50 to 1
		int num2 = 50;
		while (num2 >= 1) {
			System.out.print(num2 + " ");
			num2--;
		}

		System.out.println("----------------------");
//how to print odds numbers from 1 to 20
		int num3 = 1;
		while (num3 < 20) {

			System.out.println(num3);
			num3 += 2;
		}
 
	}

}
