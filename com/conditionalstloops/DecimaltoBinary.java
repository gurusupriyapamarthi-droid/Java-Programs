package com.conditionalstloops;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		System.out.println("Decimal to Binary  :");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n number :");
		int n=sc.nextInt();
		String bi=" ";
		int r=0;
		while(n>0) {
			r=n%2;
			bi=r+bi;
			n=n/2;
		}
		System.out.println("binary value   :"+bi);
	}

}
