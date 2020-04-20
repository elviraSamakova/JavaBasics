package com.syntax.class19;

public class StudentInfo {
	String name, address;
	public StudentInfo(String name, String address) {
		this.name=name;
		this.address=address;
		
	}
	void displayInfo() {
		System.out.println("My name is "+name+" and I live in "+address);
	}
	
	
	public static void main(String[] args) {
		StudentInfo obj=new StudentInfo("Elvira", "Philadelphia, PA");
		obj.displayInfo();
	}

}
