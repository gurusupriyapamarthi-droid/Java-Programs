package com.conditionalstloops;

import java.util.Scanner;

public class Palindrome {
	static boolean ispalindrome(int n) {
		boolean flag=false;
		int temp=n;
		int reverse=0;
		int r=0;
		while(temp>0) {
			r=temp%10;
			reverse=reverse*10+r;
			temp=temp/10;
			
		}if(reverse==n) {
			return flag=true;
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println("---Palindrome-----");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number  :");
		int n=sc.nextInt();
		boolean status=ispalindrome(n);
		if(status) {
			System.out.println("the given number is palindrome");
		}else {
			System.out.println("the given number is not palindrome");
		}

	}

}
