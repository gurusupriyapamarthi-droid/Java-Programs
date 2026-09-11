package com.gut;

import java.util.Scanner;

public class SecondLargewithoutSorting {

	public static void main(String[] args) {
		System.out.println("-------the second largest element------");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array  :");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("enter elements in the array   :");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
//		System.out.println("enter k  :");
		int k = 2;
		int large = Integer.MAX_VALUE;
		for (int i = 0; i < k; i++) {
			int max = Integer.MIN_VALUE;
			for (int j : a) {
				if (j > max && j < large) {
					max = j;
				}
			}
			large = max;
		}

//		int[] arr = { 8, 4, 3, 2, 1, 9 };
//		int max = Integer.MIN_VALUE;
//		int large=Integer.MIN_VALUE;
//		for (int j : arr) {
//			if (j > large) {
//				large = max;
//				max = j;
//			}
//		if(j<large && j>max) {
//			max=j;
//		}
//		
//		}

		System.out.println("kth largest value   :" + large);
	}

}
