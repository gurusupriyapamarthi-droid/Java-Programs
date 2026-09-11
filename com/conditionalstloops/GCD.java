package com.conditionalstloops;

import java.util.Scanner;

public class GCD {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started  ");
		int gcd = 1;
		System.out.println("enetr 1st number n1  :");
		int n1 = sc.nextInt();
		System.out.println("enetr 2nd number n2  :");
		int n2 = sc.nextInt();
		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}

		}
		System.out.println("*******GCD**************");
		System.out.println("GCD  :" + gcd);
		System.out.println("**********LCM***********");
		int lcm=(n1*n2)/gcd;
		System.out.println("lcm  :"+lcm);
	}

}
