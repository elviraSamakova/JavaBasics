package com.syntax.class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFilesReading {

	public static void main(String[] args) throws IOException {
		
		// to read the file:
		// 1. have file
		String filePath="/Users/elvirasamakova/eclipse-workspace/MyJavaBasics/configs2/Examples2.properties";
		
		//2. bring object of FileInputStream
		FileInputStream fileInput=new FileInputStream(filePath);
		
		//3. to handle data from .properties file we need Properties class
		Properties prop =new Properties();
		
		prop.load(fileInput);
		String name=prop.getProperty("name");
		System.out.println(name);
		
		String city=prop.getProperty("city");
		System.out.println(city);
		
	Set <Object>	key=prop.keySet();
		for (Object k:key) {
			System.out.println(k);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 

}
