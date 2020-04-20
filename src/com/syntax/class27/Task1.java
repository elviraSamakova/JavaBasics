package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {
		ArrayList <String> array=new ArrayList<>();
		array.add("Toyota");
		array.add("BMW");
		array.add("Lexus");
		
		for (int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		
		}
		
		for (String ar:array) {
		
			System.out.println(ar);
		}
		Iterator<String> iterator=array.iterator();
		while(iterator.hasNext()) {
		String d=iterator.next();
		System.out.println(d);
		}
	}

}
