package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task {

	public static void main(String[] args) {
		
		Map<String, String> country =new TreeMap<>();
		country.put("USA", "Washington DC");
		country.put("Kyrgyzstan", "Bishkek");
		country.put("Madagaskar", "Antananarivu");
		country.put("Russia", "Moskow");
		
		
		
		for (String key:country.keySet()) {
			System.out.println("Key is "+key);
		}
		Iterator <String> iter=country.keySet().iterator();
	while (iter.hasNext()) {
	System.out.println(iter.next());
	}
	for (String  val:country.values()) {
		System.out.println("Value is "+val);
	}
	Iterator <String>iterator=country.values().iterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	
	}

}
