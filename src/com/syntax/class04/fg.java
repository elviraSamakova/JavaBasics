package com.syntax.class04;

import java.util.Scanner;

public class fg {

	public static void main(String[] args) {
		
	//	class Main {
		//  	public static void main(String[] args) {
				Scanner scan =new Scanner(System.in);
				System.out.print("Please enter your gender:");
String gender=scan.next();
System.out.print("Please enter your age");
int age=scan.nextInt();
				
	if (age>25){
		  if (gender.equals("M"));
		  System.out.println("Man");}
		  
		   else if (age<25){
		  if  (gender.equals("M"));
		  System.out.println("Boy");
		} else {
		  System.out.println("Girl");
		  
		  
		}
		  
	} else  {
		  System.out.println("Woman");  
		  
		}

		}

