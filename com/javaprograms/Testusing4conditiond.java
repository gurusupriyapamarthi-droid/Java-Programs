package com.javaprograms;

import java.util.Scanner;

public class Testusing4conditiond {
	Scanner sc=new Scanner(System.in);
	
	void addition(int a,int b) {
		
		int y=a+b;
		System.out.println(y);
		System.out.println("enter values1:");
		int sum=sc.nextInt();
		subtraction(y, sum);
		}
	
	void subtraction(int sum, int b1) {
		System.out.println("enter values2:");
		int sum1=sum-b1;
		int mul=sc.nextInt();
		multiplication(sum1, mul);
		System.out.println("subtraction:"+sum1);
		
		
		
	}
	void multiplication(int sum1, int b2) {
		System.out.println("enter values3:");
		int sum2=sum1*b2;
		int div=sc.nextInt();
		division(sum2, div);
		System.out.println("multiplication :"+sum2);
	}
	void division(int sum2, int b3) {
		
		int sum3=sum2/b3;
		System.out.println("division :"+sum3);
		
	}

	 void main() {
		addition(10, 20);
		

	}

}
