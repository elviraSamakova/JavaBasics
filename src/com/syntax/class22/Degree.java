package com.syntax.class22;

public class Degree {
	void getPrerequisite () {
		System.out.println("To get a degree you need high school diploma");
	}
}
	class Bachelor extends Degree {
		
	}
	class Masters extends Degree {
		@Override
		void getPrerequisite () {
			System.out.println("To get a degree you need Bachelor diploma");
		}
	}

