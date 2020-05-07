package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {
		String filePath=System.getProperty("user.dir")+"/testdata/task1.xlsx";
	
	FileInputStream fis= new FileInputStream(filePath);
	
	Workbook wbook=new XSSFWorkbook(fis);
	Sheet sheet=wbook.getSheet("Sheet1");
	
	Row row1=sheet.getRow(0);
	Cell cell=row1.getCell(1);
	String r1cell2=cell.toString();
	System.out.println(r1cell2);
	
	
	
	}

}
