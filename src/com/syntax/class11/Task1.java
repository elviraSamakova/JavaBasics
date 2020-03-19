package com.syntax.class11;

public class Task1 {

	public static void main(String[] args) {
		String [] cars= {"American", "German","Korean","Italian" };
		for (String madeIn:cars) {
			System.out.print(madeIn+" ");
		}
		System.out.println();
		System.out.println("======second way======");
		
		for (int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		
	}

}
