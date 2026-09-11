package com.conditionalstloops;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		System.out.println("sum of the digits");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			int r=n%10;
			
			sum=sum+r;
			n=n/10;
			
		}
		System.out.println("sum of the digits  :"+sum);

	}

}
