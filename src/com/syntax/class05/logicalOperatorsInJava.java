package com.syntax.class05;

public class logicalOperatorsInJava {

	public static void main(String[] args) {
		/*
		 * and, or, not
		 * if (true && true)-->true
		 * if (true && false)-->false
		 * if(false && true)-->false
		 * if (false && false)-->false
		 * OR
		 * if (true ||true)-->true 
		 * if (true && false)-->true
		 * if(false && true)-->true
		 * if (false && false)-->false
		 */
		int num=7;
		if (num>=1 && num<=10) {
			System.out.println("This number is small");
		
		}else if (num>10 && num<=100) {
			System.out.println("This is a big number");
		}else if (num>100 && num<=1000) {
			System.out.println("This is a large number");
		}else {
			System.out.println("Number is a super large");
		}
		
		
	}

}
