package com.conditionalstloops;

import java.util.Scanner;

public class AutomorphicNumber {
	static boolean isAutomorphic(int n) {
		int sq=n*n;
		int r=n%100;
		if(r==n) {
			return true;
		}
		return false;	
	}
	static boolean Automorphic(int n) {
		int sq=n*n;
		int temp=n;
		int count=0;
		while(temp>0) {
			count++;
			temp=temp/10;	
		}
		int pw=Math.powExact(10, count);
		int r=sq%pw;
		if(n==r) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println("---------Automorphic Number-------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number  :");
		int n=sc.nextInt();
//		boolean status=isAutomorphic(n);
//		if(isAutomorphic(n)) {
//			System.out.println(" The given number is Automorphic Number");
//		}else {
//			System.out.println("The given number is not Automorphic Number");
//		}
		boolean status=Automorphic(n);
		if(Automorphic(n)) {
			System.out.println(" The given number is Automorphic Number");
		}else {
			System.out.println("The given number is not Automorphic Number");
		}

	}

}
