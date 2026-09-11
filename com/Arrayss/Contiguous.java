package com.Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class Contiguous {
	public static void main(String[]args) {
		System.out.println(" the contiguous subarray with the largest sum.");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		
		int max=0;
		
		
		int[]arr=new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int currentmax=0;
			for(int j=i;j<arr.length;j++) {
				currentmax=arr[j]+currentmax;
				if(currentmax>max) {
					max=currentmax;
				}
			}	
			
		}
		System.out.println(max);
		
		
	}

}
