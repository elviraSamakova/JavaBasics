package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write {

	public static void main(String[] args) throws IOException {
		// write into existing file and add values
		String filePath="/Users/elvirasamakova/eclipse-workspace/MyJavaBasics/configs2/Examples2.properties";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop =new Properties();
		
		prop.load(fis);
		prop.setProperty("phoneNumber", "123456789");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		prop.store(fos, "Added addit key");
		
	}

}
