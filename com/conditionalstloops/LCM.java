package com.conditionalstloops;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		System.out.println("main method");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n1 :");
		int n1=sc.nextInt();
		System.out.println("enetr n2  :");
		int n2=sc.nextInt();
		int max=(n1>n2)?n1:n2;
		while(max!=0) {
			if(max%n1==0 && max%n2==0) {
//				System.out.println("LCM  "+max);
				
			}
			
		}
		max++;

	}

}
