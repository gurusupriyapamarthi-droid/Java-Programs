 package com.conditionalstloops;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		System.out.println("Binary to Decimal   :");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a binary value ");
		int binary=sc.nextInt();
		int decimal=0;
		int pw=0;
		
		while(binary>0) {
			int r=binary%10;
			decimal=decimal+r*Math.powExact(2,pw++ );
			
			binary=binary/10;
		}
		System.out.println("After converting into Decimal  :"+decimal);
	}

}
