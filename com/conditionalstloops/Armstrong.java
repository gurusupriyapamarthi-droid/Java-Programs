package com.conditionalstloops;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("to find Armstrong number  :");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number   :");
		int n = sc.nextInt();
		boolean status = isArmstrong(n);
		if (status) {
			System.out.println("the given number is armstrong  ");

		} else {
			System.out.println("not Armstrong");
		}

	}

	static boolean isArmstrong(int n) {
		boolean flag = false;
		int temp = n;
		int temp1 = n;
		int sum = 0;
		int count = 0;

		while (temp > 0) {
			count++;
			temp = temp / 10;
			
		}
		while (temp1 > 0) {
			
			int r = temp1 % 10;
			temp1 = temp1 / 10;
			int pw = Math.powExact(r, count);
			
			sum = sum + pw;

		}
		if (n == sum) {
			flag = true;
		} 
		return flag;
	}

}
