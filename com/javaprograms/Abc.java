package com.javaprograms;

public class Abc {

	static int c;
	{
		int a = 10;
		int b = 20;
		c = a + b;
		System.out.println("static");

	}
	{

		System.out.println("instance");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		Abc a = new Abc();
		System.out.println(a.c);

	}

}
