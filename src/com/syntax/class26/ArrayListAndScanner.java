package com.syntax.class26;


	import java.util.Scanner;
	import java.util.ArrayList;
	class ArrayListAndScanner {
	  public static void main (String[] args){
	    Scanner scan = new Scanner(System.in);
	    int num1=scan.nextInt();
	    int num2=scan.nextInt();
	    int num3=scan.nextInt();
	    int num4=scan.nextInt();
	    int num5=scan.nextInt();
	    
	    
	    
	ArrayList <Integer> array=new ArrayList<>();

	array.add(num1);
	array.add(num2);
	array.add(num3);
	array.add(num4);
	array.add(num5);
	for (int i=0; i<array.size(); i++){
	  System.out.print(array.get(i)+" ");
	  }
	    
	  }
	  
	}
