package com.syntax.class10;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		 Scanner scan= new Scanner (System.in);
		  
		  String [] nums=new String [7];
		  for (int i=1; i<=nums.length; i++ ){
		   System.out.println("Please enter day "+i+" of the week");
		    nums[i]=scan.next();
		    
		  }
		  
		 for (int i=1; i<=nums.length; i++){
		    System.out.println(i);
		  }
			}
		    

	}
	


