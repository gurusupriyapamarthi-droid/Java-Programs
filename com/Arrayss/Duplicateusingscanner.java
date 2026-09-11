package com.Arrayss;

import java.util.Scanner;

public class Duplicateusingscanner {

	public static void main(String[] args) {
		System.out.println("--------Duplicate Number----------");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array   :");
		int size=sc.nextInt();
		int[]arr=new int[size];
		System.out.println("size :   "+size);
		System.out.println("length   :"+arr.length);
		System.out.println("enter array elements  :");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {	
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicate number is   :"+arr[i]);
				}
			}	
		}
	}

}
