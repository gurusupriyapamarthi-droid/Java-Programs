package com.conditionalstatements;

import java.util.Scanner;

public class Recurssion {
	
	void ab(int n){
		if(n>10) {
			return;
		}
		System.out.println(n);
		ab(n+1);
	}
	
	public static void main(String[] args) {

	System.out.println("main method started");
	Recurssion obj=new Recurssion();
	obj.ab(1);

	}

}
