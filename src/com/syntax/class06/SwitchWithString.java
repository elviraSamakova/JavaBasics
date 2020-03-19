package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithString {
	
	//public class SwitchWithStrings {
	    public static void main(String[] args) {
	        Scanner scan;
	        String country;
	        String favoriteFood;
	        
	        scan=new Scanner(System.in);
	        System.out.println("Please enter your country.");
	        country=scan.nextLine();
	        
	        switch(country.toUpperCase()) {
	        
	        case "Morocco":
	            favoriteFood="couscous";
	            break;
	        case "Belarus":
	            favoriteFood="Potato";
	            break;
	        case "Tajikistan":
	            favoriteFood="osh";
	            break;
	        case "Turkey":
	            favoriteFood="baklava";
	            break;
	        case "Afghanistan":
	            favoriteFood="mantu";
	            break;
	        case "Kazakhstan":
	            favoriteFood="beshparmak";
	            break;
	        case "US":
	            favoriteFood="Apple Pie & Fried Chicken";
	            break;
	        default:
	            favoriteFood="unknown";
	        }
	        System.out.println("Your favorite food is "+favoriteFood);
	        
	        }
	    }

