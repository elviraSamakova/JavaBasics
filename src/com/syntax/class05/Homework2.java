package com.syntax.class05;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String season;
		System.out.println("Please enter your birth month:");
		String month=scan.next();
		
		if (month.equals("January") || month.equals("February") || month.equals("December"))
		{
		season="Winter";
		}else if (month.equals("March") || month.equals("April") || month.equals("May"))
		{
			season="Spring";
		}else if (month.equals("June") || month.equals("July") || month.equals("August"))
		{
			season="Summer";
	}	else if (month.equals("September") || month.equals("October") || month.equals("November"))
	{
		season="Autumn";		

	}else 
	{season="Invalid month.";
		System.out.println("Please enter valid number");
	}
		if (!season.equals("Invalid month."))
	{System.out.println("You were born on "+season);
	}}}
