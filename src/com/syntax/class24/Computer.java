package com.syntax.class24;

public class Computer {
	String model;

	public Computer (String model) {
		this.model = model;
	}

	public void display() {
		System.out.println("I have " + model);
	}

	public void start() {
		System.out.println(model + " starts by push button");
	}
}
 class Apple extends Computer {
	 public Apple (String model) {
			super(model);
}
	 public void start() {
			System.out.println(model + " starts by fingerprints ");
		}}
 
 class Lenovo extends Computer {
	 public Lenovo (String model) {
			super(model);
}
	 public void start() {
			System.out.println(model + " starts esc");
		}
	 }
 
 class HP extends Computer {
	 public HP (String model) {
			super(model);
}
	 public void start() {
			System.out.println(model + " starts by shift button");
		}	 
 }
 class Dell extends Computer {
	 public Dell (String model) {
			super(model);
}}