package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		double sales;
		double commition;
		
		System.out.println("How much is your sales?");
		 sales=scan.nextDouble();
		
		if (sales>=1 && sales<=100) {
		commition=sales*0.10;
		}else if (sales>100 && sales<=200) {
			commition=sales*0.2;
		}else if (sales>200 && sales<=500) {
			commition=sales*0.3;
		}else {
			commition=sales*0.5;
		}
		System.out.println("Based on your sales your "
				+ "commition is "+commition);
		
	}

}
