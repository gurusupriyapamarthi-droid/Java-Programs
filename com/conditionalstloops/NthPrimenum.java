package com.conditionalstloops;

import java.util.Scanner;

public class NthPrimenum {
	static boolean isPrime(int n) {
		boolean flag = true;

		if (n == 0 || n == 1) {
			flag = false;
		}

		for (int j = 2; j < n; j++) {
			if (n % j == 0) {
				flag = false;
				break;
			}
		}
		return flag;

	}

	public static void main(String[] args) {
		System.out.println("Nth Prime Number  :");
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int n = 0;
		System.out.println("enter a value  :");
		int pos = sc.nextInt();
		while (pos > 0) {
			if (isPrime(n)) {
				pos--;
				result = n;
			}
			n++;

		}
		System.out.println("nth prime number is   :" + result);
	}

}
