package com.operators;

public class Opdemo1 {
//Check whether a number is between 100 and 999 using &&. 
	//2.Multiply a number by 2 and divide by 2 using << and >>.

	public static void main(String[] args) {
		System.out.println("Main method start:");
		int a=555;
		String num=(a>100 && a<999)?"number is between 100 and 999":"not between";
		System.out.println("The number given is   : "+num);
		System.out.println();
		int b=14;
		System.out.println("Multiply a number by 2="+(b<<1));
		System.out.println("Divided a number by 2="+(b>>1));
		
	//	4.Check whether a number is even or odd without Using if
		int c=5;
		String var =(c %2==0)?"c is even":"odd";
		System.out.println("the given number is   :"+var);
		//3.Find the smallest of three numbers
		 int smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
		System.out.println("the smallest number is   : "+smallest);
	}

}

