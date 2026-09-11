package com.sortingDSA;

import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		System.out.println("-------------bubble sort----------");
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
			for(int j=0;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		System.out.println("After sorting  :"+Arrays.toString(arr));

	}

}
