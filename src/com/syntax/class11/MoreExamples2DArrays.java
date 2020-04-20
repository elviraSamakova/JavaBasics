package com.syntax.class11;

public class MoreExamples2DArrays {

	public static void main(String[] args) {
		String [][] professions= {
				{"QA Testers", "Developers", "Product Owner", "Scrum Master"},
				{"Math Teacher","Science Teacher", "ESL Teacher" },
				{"Dentist", "Surgeon"}
		
		};
		for (String[] ocupation :professions) {
			for (String title :ocupation) {
				System.out.print(title+" ");
			}
			System.out.println();
		}
		 
	}

}