package com.conditionalstloops;

import java.util.Scanner;

public class Smallestnum {

	public static void main(String[] args) {
		System.out.println("***smallest number *****");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int sm=10;
		int ss=10;
		while(n>0) {
			int r=n%10;
			if(r<sm) {
				ss=sm;
				sm=r;	
			}
			n=n/10;
		}
		System.out.println("first small number "+sm);

		

	}

}
