package com.syntax.class12;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
						//Task2
				Scanner scan = new Scanner (System.in);
					System.out.println("Please enter a string:");
					String word=scan.nextLine();
					
					if (!(word.isEmpty())) {
						if ((word.length() %2!=0) && (word.length()>3) ) {
							System.out.println(word.substring(1, word.length() -1));
							
						}else {
							//even
						}
					}else {
						//empty 
					}
	
}
	}
