package com.syntax.class20;

public class AnotherClass {

			  private String a;
		  String b;
		  protected String c;
		  public String d;
		  
		  void printW (){
		    System.out.println(b+c+d);
		    //System.out.println(b);
		   // System.out.println(c);
		   // System.out.println(d);
		    
		  }
		}

		class Main {
			
			public static void main (String [] args) {
		AnotherClass obj=new AnotherClass();
		
		obj.b="default";
		obj.c="protected";
		obj.d="public";

		obj.printW();
		  
		}
}
