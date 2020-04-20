package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

	public static void main (String[] args) {
		
			ArrayList <String> array=new ArrayList<>();
			array.add("I");
			array.add("love");
			array.add("Java");
			
			Iterator<String> iterator=array.iterator();
			
			while(iterator.hasNext()) {
			if (iterator.next().endsWith("e")){
				iterator.remove();
			}
		}
		System.out.println(iterator);

	}

}
