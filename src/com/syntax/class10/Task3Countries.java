package com.syntax.class10;

public class Task3Countries {

	public static void main(String[] args) {
		 //Create an array of countries. 
        //While retrieving all values from an array print capital for each country. 
        //(use 2 different loops).
        
        String[] countries= {"USA", "France", "Germany", "China", "Great Britain"};
        String[] capitals= {"Washington DC", "Paris", "Berlin", "Beijing", "London"};
        
        for(int i=0; i<countries.length; i++) {
                System.out.println("The capital of "+countries[i]+" is "+capitals[i]);
            }
		}
	}


