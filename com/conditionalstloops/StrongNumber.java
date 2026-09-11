package com.conditionalstloops;

import java.util.Scanner;

//1.Write a Java program to check whether a number
//is a Strong number or not?
//->A Strong Number is a positive integer whose value 
//is equal to the sum of the factorial of its digits.
//Example: 145 = 1! + 4! + 5! = 1 + 24 + 120 = 145

public class StrongNumber {
	
	static int factor(int n) {
		int fact=1;
		for(int i=n;i>0;i--) {
			fact=fact*i;
			
		}
		return fact;
	}
	 static int sum(int n) {
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum=sum+factor(r);
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("main method started ");
		System.out.println("enter a number  :");
		int n=sc.nextInt();
		int status=sum(n);
		if(n==status) {
			System.out.println("strong");
		}else {
			System.out.println("not strong");
		}
		
		}
		
	}


