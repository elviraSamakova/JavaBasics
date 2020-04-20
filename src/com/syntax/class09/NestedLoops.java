package com.syntax.class09;

public class NestedLoops {

	public static void main(String[] args) {
		for (int i=0; i<25; i++) {
			
			for (int y=0; y<60; y++) {
				if (y<10) {
					System.out.println(i+":0"+y);
				}else {
				
				System.out.println(i+":"+y);}
			}
		}
		
	}

}
