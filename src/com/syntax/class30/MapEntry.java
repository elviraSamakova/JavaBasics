package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {
		Map <String, Integer> month=new LinkedHashMap<>();
		
		month.put("January", 31);
		month.put("February", 28);
		month.put("March", 31);
		month.put("April", 30);
		
		System.out.println(month.size());
		//get all entries from the Map
		Set<Entry<String, Integer>> entries=month.entrySet();
		for (Entry <String, Integer>  ent:entries) {
		System.out.println(ent.getKey()+":"+ent.getValue());
		
	}
		Iterator<Entry<String,Integer>> itr= entries.iterator();	
		while(itr.hasNext()) {
			Entry <String, Integer> entry= itr.next();
			System.out.println("Key "+entry.getKey()+"== Value"+entry.getValue());
	}
		
		System.out.println(month.size());
	}
}
