package com.syntax.class10;

public class LargiestNum {

	public static void main(String[] args) {
		int[] nums= {200, 30, -1, 900, 56, 787};
		int largest=nums[0];
		for (int i=1; i<nums.length; i++) {
			if (nums[i]>largest) {
				largest=nums[i];
			}
		}
		System.out.println("Largest number is "+largest);

		
		String[] countries = { "USA", "Poland", "Ukraine", "Turkey", "Spain" };
		for (int y = 0; y < countries.length; y++) {
		            switch(countries[y]) {
		            
		            case "USA":
		                System.out.println("The capital is Washington DC");
		                break;
		            case "Poland":
		                System.out.println("The capital is Warsaw");
		                break;
		            case "Ukraine":
		                System.out.println("The capital is Kiev");
		                break;
		            case "Turkey":
		                System.out.println("The capital is Ankara");
		                break;
		            case "Spain":
		                System.out.println("The capital is Madrid");
		                break;
		            }
		            
		        }

	
	
	}

}
