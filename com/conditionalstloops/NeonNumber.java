package com.conditionalstloops;

import java.util.Scanner;

public class NeonNumber {
	static boolean isneon(int n) {
		boolean flag = false;
		int temp = n * n;
		int r = 0;
		int sum = 0;

		while (temp > 0) {
			int sq = temp % 10; // 81
			sum = sq + sum;
			temp = temp / 10;//

		}

		if (sum == n)
			return true;
		return flag;
	}

	public static void main(String[] args) {
		System.out.println("---neon number-----");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number   :");
		int n = sc.nextInt();
		boolean status = isneon(n);
		if (status) {
			System.out.println("the given number is neon number");
		} else {
			System.out.println("not neon number   :");
		}

	}
	
}
