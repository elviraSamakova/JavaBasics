package com.syntax.class01;
interface Outputs{
	  public void display (String result);
	}

	interface Functions extends Outputs{
	  public double adding (double firstNum, double secondNum);
	  public double subtracting (double firstNumber, double secondNumber);
	  public double multiply (double firstNumber, double secondNumber);
	  public double dividing (double firstNumber, double secondNumber);
	  
	}

