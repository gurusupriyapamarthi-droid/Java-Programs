package com.conditionalstloops;

import java.util.Scanner;

public class Powerwithoutusingmath {

	public static void main(String[] args) {
		System.out.println("power without using ");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter base valu   :");
		int base=sc.nextInt();
		System.out.println("ente power value  :");
		int pw=sc.nextInt();
		int result=1;
		for(int i=1;i<=pw;i++) {
			result=result*base;
			
		}
		System.out.println("power  of"+base+"  "+pw+"="+result);
		

	}

}
