package com.sortingDSA;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("---------insertion sort-----------");
		int[] arr = { 5, 3, 4, 1, 2 };
		System.out.println("before sort  :" + Arrays.toString(arr));
		for (int i = 1; i < arr.length; i++) {

			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
				j--;// condition

			}

		}
		System.out.print("sorted array  :" + Arrays.toString(arr));

	}

}
