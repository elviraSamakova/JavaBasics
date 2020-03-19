package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		Scanner scan;
		String sale;
		double price;
		double discount;
		double finalPrice;
	 scan=new Scanner (System.in);
	 System.out.println("Is there any sale?");
	
	sale=scan.nextLine();
	if (sale.equalsIgnoreCase("Yes") ) {
		//What is the price?
		System.out.println("What is the price?");
		price=scan.nextDouble();
		if (price<20) {
			discount=0.1;
			
		}else if (price>20 && price<100) {
			discount=price*0.2;
			
		}else if (price>=100 && price<500) {
			discount=price*0.3;
			
		}else   {
			discount=price*0.5;
			
		}
		finalPrice=price*discount;
		System.out.println("After "+discount+" dollars discount the price of the item reduced from "+
		+price+" to "+finalPrice);
		
	}else {
		System.out.println("We are not going shoping.");
	}
		
	}

}
