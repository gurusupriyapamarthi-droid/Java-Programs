package com.identifier;

import java.util.Scanner;

public class Squarenumber {
	int squareNumber() {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter int value:");
		int a1= sc.nextInt();
		int b=a1*a1;
		System.out.println("square value is:  "+b);
		return 100;
	}
	
	
	
	

	public static void main(String[] args) {
		System.out.println("---");
		Squarenumber obj = new Squarenumber();
		
		
		obj.squareNumber();
		
		
		

	}

}
