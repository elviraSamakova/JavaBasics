package com.syntax.class13;

public class SwapValues {

	public static void main(String[] args) {
		 String str1="Day";
		 String str2="Night";
		 
		 str1=str1+str2; //DayNight
		 str2=str1.substring(0, 3); //Day
		 str1=str1.substring(3); //Night
		 
		 
		 System.out.println(str1+"  "+ str2);
		 
		 
		 
		 
		 
	}

}
