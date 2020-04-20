package com.syntax.class25;

public abstract class Marks {
	int a,b,c,d;
	
	Marks (int a, int b, int c){
		this.a=a; this.b=b; this.c=c;
	}
	Marks (int a,int b,int c,int d){
		this.a=a; this.b=b; this.c=c; this.d=d;
	}
	
public abstract double getPercentage();
}

class A extends Marks{
	A(int a, int b, int c){
		super(a,b,c);
	}

	@Override
	public double getPercentage() {
		System.out.print("Student A average mark is ");
		return (a+b+c)/3;
	}
}
class B extends Marks{
	B(int a, int b, int c, int d){
		super(a,b,c,d);
	}

	@Override
public	double getPercentage() {
		System.out.print("Student B average mark is ");
		return (a+b+c+d)/4;
	}
}