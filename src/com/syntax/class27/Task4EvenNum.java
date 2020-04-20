package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4EvenNum {

	public static void main(String[] args) {
		ArrayList <Integer> array=new ArrayList<>();
		for (int i=0; i<=50; i++) {
			
				array.add(i);
			
		}
		
		Iterator<Integer>  number=array.iterator();
		while(number.hasNext()) {
		if (number.next()%5==0) {
			number.remove();
		}
		}
		System.out.println(array);
	}

}
