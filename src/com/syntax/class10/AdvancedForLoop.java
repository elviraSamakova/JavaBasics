package com.syntax.class10;

public class AdvancedForLoop {

	public static void main(String[] args) {
		
		String[] fruits= {"Banana", "Kiwi", "Apple", "Mango"};
		for(String fruit:fruits) {
			if (fruit.equals("Apple")) {
				System.out.println(fruit+" is your favorite fruit");
			}else
	
		System.out.println(fruit);
		}	
		
		for (int i=0; i<fruits.length; i++) {
			
			
			System.out.print(fruits[i]+" ");
		}
	}
 
}
