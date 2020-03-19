package com.syntax.class11;

public class Task2 {

	public static void main(String[] args) {
		String [][] countries= {
				{"Usa", "Kanada"},
				{"Brazil", "Argentina","Colombia"},	
				{"Italia", "France"},
				{"Japan", "Korea"},
				{"Keniya", "Uganda","China"}
		};
		for (String[] country:countries) {
			for (String name:country) {
			System.out.print(name+" ");
		}
		System.out.println();
		}
		System.out.println("======second way======");
		
		
		int count=0;
		for (int i=0; i<countries.length; i++) {
			for (int j=0; j<countries[i].length; j++) {
			System.out.print(countries[i][j]+" ");
			count++;
			}
			System.out.println();
			
		}
		
		System.out.println("Total:"+ count+ "countries.");
		
		
		
	}

}
