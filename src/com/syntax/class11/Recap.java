package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {
		String [] [] groceries = {
				{"cucumber", "patato", "carrot"},
				{"mango", "apple", "banana", "kiwi"},
				{"milk", "cheese", "yogurt"}
			
		};
		//System.out.println(groceries[1][2]);
		for (int r=0; r<groceries.length; r++) {
			for (int c=0; c<groceries[r].length; c++) {
				System.out.print(groceries[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println("==============advanced for loop======");
		for (String [] array:groceries) {
			for (String items:array) {
				System.out.print(items+" ");
			} 
			System.out.println();
		}
		
	}

}
