package com.syntax.class01;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;
class Main {
  public static void main (String[] args){
 Map <String, String> address=new HashMap<>();
 address.put("Street" , "Patrick ST");
 address.put("Suite" ,"265");
 address.put("City" ,"Vienna");
 address.put("Zip" ,"22180");
 address.put("Country", "United State");
 
 Iterator <Entry <String, String>> entries= address.entrySet().iterator();	
 while (entries.hasNext()){
   System.out.println(entries.next().getValue().toUpperCase());
 }
}
}