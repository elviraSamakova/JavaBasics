package com.syntax.class29;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tasks {

	public static void main(String[] args) {
		Set <String> countries=new TreeSet<>();
		
		countries.add("USA");
		countries.add("Kyrgyzstan");
		countries.add("Turkey");
		countries.add("Russia");
		countries.add("India");
		countries.add("Egypt");
		
		System.out.println(countries);
		
		Iterator<String> myIterator = countries.iterator();
		while (myIterator.hasNext()) {
			if (myIterator.next().toLowerCase().startsWith("a"))
				myIterator.remove();
				
	}
		System.out.println(countries);
		

}}
