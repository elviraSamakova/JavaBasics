package com.syntax.class18;

public class Family {
	
		public static int countA (String s)
		{
			int count=0;
	s=s.toLowerCase();
			for( int i = 0; i < s.length(); i++){
				if (s.charAt(i)=='a') 
					count++;
		  }
		  return  count;
		}
		
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(countA("aaA")); //3
			System.out.println(countA("aaBBdf8k3AAadnklA")); //6
		}
	}