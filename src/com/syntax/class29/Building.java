package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Building {

	public static void main(String[] args) {
		Map <Integer, String> itHouse=new HashMap<>();
		itHouse.put(1, "Google");
		itHouse.put(2, "Syntax");
		itHouse.put(3, "Amazon");
		itHouse.put(4, "Macy's");
		itHouse.put(5, "Yandex");
		itHouse.put(7, "Sephora");
		itHouse.put(7, "Target");
		//itHouse.put(null, null);
		itHouse.put(8, null);
		
		
		System.out.println(itHouse.size());
		System.out.println(itHouse.replace(4, "Bloomingdale"));
		itHouse.remove(7);
		System.out.println(itHouse);
		System.out.println(itHouse.get(5));
		System.out.println("===========Set======================");
		
		//how to get all Keys from a HashMap
		Set <Integer> it=itHouse.keySet();
		for (int i:it) {
			System.out.println(i);
			System.out.println("Key is "+i+" and value is "+itHouse.get(i));
		}
		
		System.out.println("===============Iterator==================");
	
		Iterator <Integer> house =it.iterator();
		while (house.hasNext()) {
			Integer i =house.next();
			System.out.println("Key is "+i+" and value is "+itHouse.get(i));
		}
		System.out.println("===============Collection==================");
		//how to get all values from a HashMap
		Collection <String> values=itHouse.values();
		for (String value:values) {
			System.out.println(value);
		}
		Iterator <String> iterator=values.iterator();
		while (iterator.hasNext()) {
			String value=iterator.next();
			System.out.println(value);
		}
		
	}

}
