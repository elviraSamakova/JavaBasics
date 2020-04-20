package com.syntax.class01;

abstract class Tea{
	  String teaType;
	  Tea (String teaType){
	    this.teaType=teaType;
	  }
	   public abstract void addSugar();
	}

	class LemonTea extends Tea{
	 //String teaType;
	  LemonTea (String teaType){
	    super(teaType);
	  }
	   public  void addSugar(){
	     System.out.println("For "+teaType+ " Tea we need 2 spoons of sugar");
	   }
	  
	}

	class ChaiTea extends Tea{
	  // String teaType;
	  ChaiTea (String teaType){
	    super(teaType);
	  }
	   public  void addSugar(){
	      System.out.println("For "+teaType+ " Tea we need 1 spoons of sugar");
	   }
	  
	}
