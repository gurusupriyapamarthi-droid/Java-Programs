package com.gut;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		System.out.println("----Insertion Sort-------");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array");
		int size =sc.nextInt();
		System.out.println("enter elements in the array");
		int[]arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("before sort   :"+Arrays.toString(arr));
		for(int i=1;i<size;i++) {
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
		System.out.println("after sort   :"+Arrays.toString(arr));
	}

}
