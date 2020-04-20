package com.syntax.class25;

public class FileTest {

	public static void main(String[] args) {
		File obj=new JavaFile();
		obj.close();
		obj.edit();
		obj.open();
		
		File obj2=new WordFile();
//		obj2.close();
//		obj2.edit();
		obj2.open();
		
		File obj3=new PDFFile();
//		obj3.close();
//		obj3.edit();
		obj3.open();
	}

}
