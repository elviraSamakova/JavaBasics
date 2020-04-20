package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {

	public static void main(String[] args) {
		
		ArrayList <Food> yammy= new ArrayList<>();
		yammy.add(new Plov("plov"));
		yammy.add(new Bread("bread"));
		yammy.add(new Lagman("lagman"));

		for (int i=0; i<yammy.size(); i++) {
			yammy.get(i).cut();
			yammy.get(i).add();
			yammy.get(i).cook();
		}
		//advanced for loop
		//iterates/loops in 1 direction
		for(Food str: yammy) {
			System.out.println(str);
		}
		//we want to iterate through the collection
		Iterator<Food> it=yammy.iterator();
		//iterates in 1 direction
		while(it.hasNext()) {
			Food element=it.next();
			element.cut();
			element.add();
			element.cook();
			System.out.println(element);
	}

	}}
