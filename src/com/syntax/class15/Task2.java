package com.syntax.class15;

public class Task2 {

	void evenOdd(int a) {
		if (a%2==0) {
			System.out.println(a+" is Even number");
		}else {
			System.out.println(a+" is Odd number");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Task2 num=new Task2();
		num.evenOdd(4);
		
	}

}
