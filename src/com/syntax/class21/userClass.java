package com.syntax.class21;

import com.sun.tools.javac.launcher.Main;

public class userClass {
String name;
int mobileNumber;

void hello () {
	System.out.println("I am a parent class method");
}
	
class 	userInfo extends userClass{
	String address;
	
	public void display () {
		
