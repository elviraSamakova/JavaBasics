package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {
//  2. Using xl file that we created to new tour application 
//	(http://www.newtours.demoaut.com/)
//	create a data driven test: 
//	Register to an account using 3-4 
//	different sets of data 
//	(exclude passing values to the drop down 
//	and try to use different locators that you know 
//	if possible)

	public static void main(String[] args) throws IOException {
		//String filePath="/Users/elvirasamakova/eclipse-workspace/MyJavaBasics/testdata/Book2.xlsx";
		String filePath = System.getProperty("user.dir") + "/testdata/Book2.xlsx";
		
		
	FileInputStream fis= new FileInputStream(filePath);
	
	
	Workbook wbook=new XSSFWorkbook(fis);
	Sheet sheet=wbook.getSheet("Sheet1");
	
	Row row1=sheet.getRow(0);
	Cell cell=row1.getCell(0);
	String r1cell2=cell.toString();
	System.out.println(r1cell2);
	
	}

}
