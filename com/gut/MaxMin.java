package com.gut;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		System.out.println(" a sorted array, rearrange it in max-min form");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array");
		int size=sc.nextInt();
		int[]arr=new int[size];
		int []result=new int[arr.length];
		System.out.println("elements in array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int left=0;
		int right=arr.length-1;
		int index=0;
		while(left<=right) {
			result[index]=arr[right];
			index++;
			right--;
			if(left<=right) {
				result[index]=arr[left];
				index++;
				left++;
			}
		}
		System.out.println("After rearrange  :"+Arrays.toString(result));
	}

}
