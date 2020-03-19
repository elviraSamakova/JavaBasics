package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan;
		String country;
		String language;

		scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		country = scan.nextLine();

		switch (country) {

		case "America":
			language = "english";
			break;
		case "Argentina":
			language = "spanish";
			break;
		case "Egypt":
			language = "arabic";
			break;
		case "France":
			language = "french";
			break;
		case "Italy":
			language = "italian";
			break;
		case "Malasia":
			language = "malay";
			break;
		case "Russia":
			language = "russian";
			break;
		case "Israel":
			language = "hebrew";
			break;
default:
	language="unknown";
		}
System.out.println("You speak "+language);
	}

}
