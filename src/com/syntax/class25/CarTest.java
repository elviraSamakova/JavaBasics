package com.syntax.class25;

public class CarTest {

	public static void main(String[] args) {
		Car truck=new Truck(6000.0, "white", 2001);
		
		truck.calculateSalePrice();
		
		Car sedan=new Sedan(2000.0, "black", 50);
		sedan.calculateSalePrice();
	}

}
