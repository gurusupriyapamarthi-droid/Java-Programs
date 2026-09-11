package com.gut;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array   :");
		int size=sc.nextInt();
		int []a=new int [size];
		System.out.println("enter elements in array   :");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("before sorting   :"+Arrays.toString(a));
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			}
				
		}
		System.out.println("After sorting   :"+Arrays.toString(a));

	}

}
