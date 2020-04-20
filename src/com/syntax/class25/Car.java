package com.syntax.class25;

public abstract class Car {
double carPrice;
String color;

Car (double carPrice, String color){
	this.carPrice=carPrice;
	this.color=color;
}

public abstract void calculateSalePrice();
}


class Truck extends Car{
	int weight;
	Truck (double carPrice, String color, int weight){
			super(carPrice, color);
			this.weight=weight;
	}
	@Override
public	void calculateSalePrice() {
		 //if weight>2000 then returned 
		 //price car should include 10% discount, 
		 //otherwise 20% discount.
		if (weight>2000) {
			carPrice=carPrice-carPrice*0.01; 
			System.out.println(carPrice);
			
		}else {
			carPrice=carPrice-carPrice*0.02;
			System.out.println(carPrice);
		}
	}
	
}

class Sedan extends Car{
	int length;
	Sedan (double carPrice, String color, int lenght){
			super(carPrice, color);
			this.length=length;
	}
	@Override
public	void calculateSalePrice() {
//		 The Sedan class has field as length and
//		also does it is own implementation of calculateSalePrice(): 
//			if length of sedan is >20 feet 
//		then returned car price should include 5% discount, 
//		otherwise 10% discount
		if (length>20) {
			carPrice-=carPrice*0.05; 
			System.out.println(carPrice);
			
		}else {
			carPrice-=carPrice*0.01;
			System.out.println(carPrice);
		}
	}
}
	





