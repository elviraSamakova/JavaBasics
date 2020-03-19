package com.syntax.class05;

public class MoreLogicalOperetors {

	public static void main(String[] args) {
		int day=6;
		if (day==2 || day==3) {
			System.out.println("Today is SDLC Class");
		}	else if (day==6 || day==7) {
			System.out.println("Today is JAVA Class");
		}else if (day==1 || day==5) {
			System.out.println("Today is no class, it is day off");
		}else if (day==4) {
			System.out.println("Today is review Class");
		}else {
			System.out.println("Invalid day");
		}
		System.out.println("----------using strings--------");
	
		String day1="Wednesday";
		if (day1.equals("Tuesday") || day1.equals("Wednesday")) {
			System.out.println("Today is SDLC Class");
		}	else if (day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("Today is JAVA Class");
		}else if (day1.equals("Monday") || day1.equals("Friday")) {
			System.out.println("Today is no class, it is day off");
		}else if (day1.equals("Thursday")) {
			System.out.println("Today is review Class");
		}else {
			System.out.println("Invalid day");
		}
	
	
	}
	

}
