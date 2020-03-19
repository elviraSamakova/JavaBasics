package com.syntax.class05;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your heights in inches");
int heights=scan.nextInt();
if (heights<60) {
	System.out.println("You are short");
}else if (heights>=60 && heights<72) {
	System.out.println("You are medium");
}else {
	System.out.println("You are tall");
}
 

System.out.println("------task2----------");
int day=6;
if (day>=1 && day<=5) {
	System.out.println("It is a weekday!");
}else if (day>5 && day<=7) {
	System.out.println("It is a weekend!");
}else {
	System.out.println("Invalid day!");
}
 
 
	}

}
