package com.syntax.class01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
class Main{
public static void main(String[] args) {
	ArrayList <Integer> array=new ArrayList<>();
//	for (int i=0; i<=100; i++) {
//		
//			array.add(i);
//		
//	}
//	
	Iterator<Integer>  number=array.iterator();
	while(number.hasNext()) {
		for (int i=0; i<=100; i++) {
			
			array.add(i);
			if (number.next()%array.add(i)==0) {
		number.remove();
	}
	}
	System.out.println(array);
}
	}


}
