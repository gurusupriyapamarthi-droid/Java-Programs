package com.conditionalstloops;

import java.util.Scanner;

public class GCDusingwhile {

	public static void main(String[] args) {
		System.out.println("   main method ");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n1 :");
		int n1=sc.nextInt();
		System.out.println("enetr n2  :");
		int n2=sc.nextInt();
		
		int gcd=1;
		while(n2!=0) {
			int temp=n2;
			n2=n1%n2;
			n1=temp;
		}
		System.out.println("GCD  :"+n1);
	}

}
