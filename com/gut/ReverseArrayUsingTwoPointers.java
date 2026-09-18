package com.gut;

import java.util.Arrays;

public class ReverseArrayUsingTwoPointers {

	public static void main(String[] args) {
		System.out.println(" reverse the array without using another array");
		int []arr= {1,2,3,4,5};
		System.out.println("before reverse   :"+Arrays.toString(arr));
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		System.out.println("After reverse    :"+Arrays.toString(arr));

	}

}
