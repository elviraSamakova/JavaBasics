package com.syntax.class12;

import java.util.Scanner;

public class Task3GenderRevielNameSug {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter Mom's name");
		String word=scan.nextLine();
		int halfM=word.length()/2;
		
		System.out.println("Please enter Dad's name");
		String word2=scan.nextLine();
		int halfD=word2.length()/2;
		
		System.out.println("Are you expecting boy or girl?");
		String word3=scan.nextLine();
		
		if (word3.equalsIgnoreCase("boy")) {
		String str;
			String dad =word2.substring(0, 3);
		    String mom=word.substring(3);
		    System.out.println(dad+mom);
		}else {
			//girl
			String str;
			String dad =word2.substring(0, 3);
		    String mom=word.substring(3);
			 System.out.println(mom+dad);
		}
		
	}

}
