package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
LinkedList <String> llist=new LinkedList<>();
llist.add("Elvira"); //comes from collection
llist.add(0, "Refia"); //comes from List
llist.add("Mike");
llist.add("Viktor");
llist.add("Christopher");

for (String m:llist) {
	System.out.println(m);
}
Iterator <String> it =llist.descendingIterator();
while (it.hasNext()) {
	String str=it.next();
	System.out.println(str);
}
  for(int i=0; i<llist.size(); i++) {
	System.out.println(llist.get(i));
} 
  
  //can we store objects of user defined classes
  
  
  
  
  
  
  
  
  
  
	}

}
