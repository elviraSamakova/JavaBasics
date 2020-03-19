package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSweatch {

	public static void main(String[] args) {
		Scanner scan;
		char gender;
		String genderType;
	
		scan=new Scanner(System.in);
		System.out.println("Please enter gender:M or F ");
		gender=scan.next().charAt(0);
		
		switch (gender) {
		
		case 'M':
			genderType="Male";
			break;
		case 'F':
		genderType="Femail";
		break;
		default:
			genderType="Unknown";
		}
		System.out.println("Your gender is "+gender);
	}

}
