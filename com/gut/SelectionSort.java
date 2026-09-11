package com.gut;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println("-----selection sort-----");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array  :");
		int size=sc.nextInt();
		int[]a=new int [size];
		System.out.println("enter elements in the array   :");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("before sort   :"+Arrays.toString(a));
		int temp=0;
		for(int i=0;i<size;i++) {
			int midIndex=i;
			for(int j=i+1;j<size;j++) {
				if(a[j]<a[midIndex]) {
					midIndex=j;
				}
			}
			temp=a[i];
			a[i]=a[midIndex];
			a[midIndex]=temp;
		}
		System.out.println("After sort   :"+Arrays.toString(a));

	}

}
