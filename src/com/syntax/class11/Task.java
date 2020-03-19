package com.syntax.class11;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in) ;
		
		System.out.println("Please enter your user name");
		String userName=scan.nextLine();
		
		System.out.println("Please enter your password");
		String password=scan.nextLine();
		
		System.out.println("Please confirm your password");
		String confPswd=scan.nextLine();
		//1
		 userName=""; password="";
        boolean empty=userName.isEmpty();
        boolean empty2=password.isEmpty(); 
		if (empty || empty2) {
			System.out.println("Username and Password cannot be empty.");
		}
		//2
			int size=password.length();
			if (size<9)
        System.out.println("Password is too short");
		
		//3
			boolean password=message.contains(userName);
	        System.out.println("Password cannot contain username");
	        
			
			//4
			if (password.contentEquals(userName)) {
				System.out.println("Password doesn't mach!");
			}
			
	}

}
