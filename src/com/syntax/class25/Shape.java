package com.syntax.class25;

public interface Shape {

	public abstract void calculateArea(double a);
	
	public abstract void calculatePerimiter(double a);
}

class Circle implements Shape{

	@Override
	public void calculateArea(double a) {
				System.out.println("The area of the circle is "+(3.14*a*a));
	}

	@Override
	public void calculatePerimiter(double a) {
		System.out.println("Perimeter of Circle is "+2*3.14*a);
		
	}
	
}
class  Square  implements Shape {

	@Override
	public void calculateArea(double a) {
		System.out.println("Area of Square is "+a*a);		
	}

	@Override
	public void calculatePerimiter(double a) {
		System.out.println("Perimeter of Square is "+4*a);		
	}
	
}
