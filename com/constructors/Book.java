package com.constructors;

public class Book {
	int bookid;
	String title;
	String author;
	
	Book(int bookid,String title,String author){
		this.bookid=bookid;
		this.title=title;
		this.author=author;
		
	}
	Book(Book obj){
		this.bookid=obj.bookid;
		this.title=obj.title;
		this.author=obj.author;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Book obj=new Book(123,"java","Srikanth");
		obj.Display();
		
		Book obj1=new Book(obj);
		obj1.Display();
		

	}
	void Display() {
		System.out.println("book id number    :"+bookid);
		System.out.println("name of the title    :"+title);
		System.out.println("name of the author    :"+author);
		System.out.println();
	}

}
