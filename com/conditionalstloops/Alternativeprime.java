package com.conditionalstloops;

import java.util.Scanner;

public class Alternativeprime {
	static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Alternative prime numbers :");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range of prime numbers  :");
		int range = sc.nextInt();
		int n = 0;
		int count = 0;
		while (range >= n) {
			if (isPrime(n)) {
				count++;
				if (count % 2 != 0) {
					System.out.print(n + " ");
				}
			}
			n++;
		}
		n = 0;
		count = 0;
		System.out.println();
		while (range >= n) {
			if (isPrime(n)) {
				count++;
				if (count % 2 == 0) {
					System.out.print(n + " ");
				}
			}
			n++;
		}

	}

}
