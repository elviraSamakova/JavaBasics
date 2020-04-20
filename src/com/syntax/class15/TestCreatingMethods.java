package com.syntax.class15;

public class TestCreatingMethods {

	public static void main(String[] args) {
		
		CreateMethods obj= new CreateMethods();
			char grade=obj.getGrade(65);
		System.out.println(grade);
		
		if (grade=='A' || grade=='B'){
			System.out.println("Good job");
		}else {
			System.out.println("Keep study");
		}
	}

}
