package com.sortingDSA;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println("--------------Selection Sort------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array:");
		int size =sc.nextInt();
		int[]arr=new int[size];
		System.out.println("enter elements in array  :");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("before sorting  :"+Arrays.toString(arr));
		int temp=0;
		for(int i=0;i<size;i++) {
			int minIndex=i;
			for(int j=i+1;j<size;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		System.out.println("After sorting  :"+Arrays.toString(arr));


	}

}
