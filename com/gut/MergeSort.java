package com.gut;

import java.util.Arrays;

public class MergeSort {
	static void divide(int[]arr) {
		if(arr.length<=1) {
			return;
		}
		int []left=new int[arr.length/2];
		int []right=new int[arr.length-left.length];
		int i=0;
		for(;i<left.length;i++) {
			left[i]=arr[i];
		}
		for(int j=0;j<right.length;j++) {
			right[j]=arr[i];
			i++;
		} 
		divide(left);
		divide(right);
		merge(left,right,arr);
	}
	static void merge(int[]left,int[]right,int[]arr) {
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length&&j<right.length) {
			if(left[i]<right[j]) {
				arr[k]=left[i];
				i++;
			}else {
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<left.length) {
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length) {
			arr[k]=right[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		System.out.println("sort the array using Merge Sort");
		int[]arr= {38, 27, 43, 3, 9, 82, 10};
		System.out.println("before sort   :"+Arrays.toString(arr));
		divide(arr);
		System.out.println("After sort  :"+Arrays.toString(arr));

	}

}
