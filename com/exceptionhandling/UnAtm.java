package com.exceptionhandling;

import java.util.Scanner;

public class UnAtm {

	public static void main(String[] args) {
		System.out.println("----UnChecked Exception---");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element");
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("in catch e");	
		}catch(NumberFormatException ne) {
			ne.printStackTrace();
			System.out.println("in catch nfe");	
		}
		System.out.println("enter string ");
		try {
			String str=null;
			String s=sc.next();
		}catch(NullPointerException ne) {
			System.out.println("in catch ne");
		}
	}

}
