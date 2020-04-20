package com.syntax.class15;

 public class Main {
	
		 String school;
		 int  batch;
		 int year;
		 
		 void display(){
		    
			System.out.println("I am student of batch "+
			batch+" studying at "+school+" in the year of "+year);
		 }
		 public static void main (String[] args){
		   Main obj=new Main() {
		     
		     obj.school=("Syntax");
		     obj.year=2020;
		     obj.batch=6;
		//     obj.dasplay();
		    
		   }}}    
		   
		 
		   
		 

