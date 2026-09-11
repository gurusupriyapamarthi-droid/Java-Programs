package com.tgh;

import java.util.Arrays;

public class ArrayofInteger {

	public static void main(String[] args) {
		System.out.println("An Array of Integer ");
		int[] arr = { 8, 4, 6, 2, 3 };
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					arr[i] = arr[i] - arr[j];
					break;
				}
			}

		}

		System.out.println(Arrays.toString(arr));
	}

}
