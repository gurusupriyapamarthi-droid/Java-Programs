package com.constructors;

public class Constructorschaining {
	String collegeName;
	String sName;
	int sNumber;

	Constructorschaining() {
		this("vcube", "java");//
		System.out.println("no arg constructor-----");
	}

	Constructorschaining(String collegeName, String sName) { //vcube java
		this("vit", "s", 123); //3arg 
		System.out.println("two arg constructor------");
		this.collegeName=collegeName;
		this.sName=sName;
		this.sNumber=sNumber;
	}

	Constructorschaining(String collegeName, String sName, int sNumber) { //vit s 123
		System.out.println("three arg constructor");
		this.collegeName = collegeName; //vit
		this.sName = sName;//s
		this.sNumber = sNumber;//123

	}

	public static void main(String[] args) {
		System.out.println("main method started:");
		Constructorschaining obj = new Constructorschaining();

		obj.show();

	}

	void show() {
		System.out.println("name of the college   " + collegeName);
		System.out.println("name of the student  " + sName);
		System.out.println("number of the student  :" + sNumber);
	}

}
