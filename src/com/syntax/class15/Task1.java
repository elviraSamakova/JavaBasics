package com.syntax.class15;

public class Task1 {
//	Create a method that will take 2 parameters as a n
//	umbers and prints which number is larger.
//	
	
	void large (int a, int b) {
		if (a>b) {
			System.out.println(a+" is a large number");
		}else {
			System.out.println(b+" is a large number");
		}
	}
	
	
	public static void main(String[] args) {
		Task1 num=new Task1();
		num.large(10,20);
		
	}

}
