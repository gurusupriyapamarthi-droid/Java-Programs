package com.conditionalstloops;

import java.util.Scanner;

public class NthEvennum {
	static boolean even(int n) {
		boolean flag =false;
			if(n%2==0) {
				flag=true;
		}
		return flag;
	}
	


	public static void main(String[] args) {
	System.out.println("Nth Even number :");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number  :");
	int result=0;
	int n=2;
	int pos=sc.nextInt();
	while(pos>0) {
		if(even(n)) {
			pos--;
			result=n;
		}
		n++;
	}
	System.out.println("nth even number is :"+result);
	
	}
}