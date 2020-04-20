package com.syntax.class25;

public abstract class File {
	
public abstract void open();
 
public void edit() {
	System.out.println("File can be edited");
}
public void close() {
	System.out.println("File can be closed");
}

}
class JavaFile extends File{
	@Override
	public  void open() {
		System.out.println("to open .java file we need notepad++ or sublime text");
	}
	
}
class WordFile extends File{
	@Override
	public  void open() {
		System.out.println("to open .doc file we need Microsoft word to be installed");
	}
	
}
class PDFFile extends File{
	@Override
	public  void open() {
		System.out.println("To open a pdf file in Windows, you need a copy of Adobe Acrobat Reader or an alternative PDF reader installed on your computer.");
	}
	
}