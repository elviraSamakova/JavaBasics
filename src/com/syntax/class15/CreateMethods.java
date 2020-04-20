package com.syntax.class15;

public class CreateMethods {
	//we want to create a method that will accept marks(90, 80)
	// based on the marks it will return grade(A, B, C)
	// if grade > 90--> A, if 90<grade>80 --> B, if 80<grade>70 --> C
	
	char getGrade (int a) {
		char grade;
		
		if (a>90) {
			grade='A';
			
		}else if (a>80) {
			grade='B';
		}else if (a>70) {
			grade='C';
			
		}else if (a>60) {
			grade='D';
		}else {
			grade='F';
		}
		return grade;
		
	}
	

}
