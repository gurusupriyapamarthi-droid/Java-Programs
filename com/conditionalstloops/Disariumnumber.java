package com.conditionalstloops;

import java.util.Scanner;

public class Disariumnumber {

	public static void main(String[] args) {
		System.out.println(" ----------A Disarium Number------------ ");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number   :");
		int n = sc.nextInt();
		int sum = 0;
		int count = 0;
		int temp = n;
		int temp1 = n;
		while (temp > 0) {
			count++;
			temp = temp / 10;
		}
		while (temp1 > 0) {
			int r = temp1 % 10;
			temp1 = temp1 / 10;
			int pw = (int) Math.pow(r, count);
			sum = sum + pw;
			count--;
		}
		if (n == sum) {
			System.out.println("Disarium Number");
		} else {
			System.out.println("not Disarium Number");
		}

	}

}