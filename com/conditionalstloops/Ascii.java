package com.conditionalstloops;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("to print A to Z");
		char c='A';
		System.out.println("enter a value ");
		int n=sc.nextInt();
		for(int i=1;i<=26;i++) {
			if(i==n) {
				System.out.println(" "+c);
				
			}
			c++;
		}

	}

}
