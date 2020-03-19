package com.syntax.clacc09.copy;

public class ArrayIntro {

	public static void main(String[] args) {
		//declare an array & initializing $ 
		
		int [] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		
		//access element from array
		System.out.println(array[2]);
		
		
		
		//2 way
		
		String[] carArray; 
		carArray=new String[3];
		
		carArray[0]="BMW";
		carArray[1]="Lexus";
		carArray[2]="Toyota";
		System.out.println("I am driving "+array[1]);
		
		
		   int[] numbers=new int[3];
	        numbers[0]=100;
	        numbers[1]=200;
	        numbers[2]=300;
	        //change value of numbers[1]
	        numbers[1]=2000;
	        
	        System.out.println(numbers[1]+numbers[0]);//2100
	        
				
		
	}

}
