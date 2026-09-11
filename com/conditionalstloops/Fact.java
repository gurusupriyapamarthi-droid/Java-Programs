package com.conditionalstloops;

import java.util.Scanner;

public class Fact {
	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return fact(n-1)*n;
		
	}

	public static void main(String[] args) {
		System.out.println("main metod started ");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int fact=fact(n);
		System.out.println("Factorial   :"+fact);
	}

}
