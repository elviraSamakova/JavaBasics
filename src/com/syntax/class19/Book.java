package com.syntax.class19;

public class Book {

    String bookName;
    String bookTitle;
    int bookPrice;
    public Book (int bookPrice){
		this.bookPrice=bookPrice;
	}
	public Book(String bookName, String bookTitle){
		this(24);
		this.bookName=bookName;
		this.bookTitle=bookTitle;
	}
	public void display() {
		System.out.println("Book name is "+bookName+" title is "+bookTitle+" price is "+bookPrice);
	}
	public static void main(String[] args) {
		Book obj= new Book("Dan Brown","The Da Vinci Code");
		obj.display();
	}


}

