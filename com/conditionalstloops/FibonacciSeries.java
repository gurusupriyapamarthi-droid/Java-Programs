package com.conditionalstloops;

import java.util.Scanner;

public class FibonacciSeries {
	static void method(int n) {
		int n1=0;
		int n2=1;
		int n3=0;
		for(int i=1;i<=n-1;i++) {
			n3=n1+n2;
			System.out.print("  "+n3);
			n1=n2;
			n2=n3;
			
		}
	}

	public static void main(String[] args) {
		System.out.println("FibonacciSeries");
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("enetr a value  :");
		int n=sc.nextInt();
		method(n);
	}

}
