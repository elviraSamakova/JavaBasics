package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class T1 {

	public static void main(String[] args) throws IOException {
		//1
		String filePath="/Users/elvirasamakova/eclipse-workspace/MyJavaBasics/configs/Task";
		//2
		FileInputStream fileInput=new FileInputStream(filePath);
		//3
		Properties prop=new Properties();
		prop.load(fileInput);
		String name=prop.getProperty("url");
		System.out.println(name);
	}

}
