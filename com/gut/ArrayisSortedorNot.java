package com.gut;

import java.util.Arrays;

public class ArrayisSortedorNot {
	static boolean isSorted(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("the array is sorted in ascending order");
		int[]arr= {10,20,30,40,50};
		System.out.println(Arrays.toString(arr));
		System.out.println("------------");
		System.out.println(isSorted(arr));
	}

}
