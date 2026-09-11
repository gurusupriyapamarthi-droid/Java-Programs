package com.sortingDSA;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	static void divide(int[]arr) {
		if(arr.length<=1) {
			return;
		}
		int[]left=new int[arr.length/2];
		int[]right=new int[arr.length-left.length];
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
		merge(arr,left,right);
	}
	static void merge(int[]arr,int[]left,int[]right) {
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length && j<right.length) {
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
		System.out.println("---------Merge sort----------");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array  :");
		int size=sc.nextInt();
		int[]arr=new int[size];
		System.out.println("enter elements  :");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("before sorting  :"+Arrays.toString(arr));
		divide(arr);
		System.out.println("After sorting  :"+Arrays.toString(arr));

	}

}
