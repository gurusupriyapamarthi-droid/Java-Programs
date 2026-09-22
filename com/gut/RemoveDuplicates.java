package com.gut;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		System.out.println(" remove duplicates and return the new length");
		Scanner sc=new Scanner(System.in);
		System.out.println("-----------");
		System.out.println("enter size ");
		int size=sc.nextInt();
		int[]arr=new int[size];
		System.out.println("enter array elements  :");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Before removeing  :"+Arrays.toString(arr));
		int i=0;
		for(int j=1;j<size;j++) {
			if(arr[j]!=arr[i]) {
				i++;
				arr[i]=arr[j];
			}
		}
		System.out.println("After removeing  :");
		for(int k=0;k<=i;k++) {
			System.out.print(arr[k]+" ");
		}
	}

}
