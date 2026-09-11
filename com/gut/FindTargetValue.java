package com.gut;

import java.util.Arrays;
import java.util.Scanner;

public class FindTargetValue {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("-------- the index of the target element-----");
		System.out.println("----using linear search-------");
		System.out.println("enter size of the array");
		int size=sc.nextInt();
		int[]arr=new int [size];
		System.out.println("enter elements in the array   :");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("input array   :"+Arrays.toString(arr));
		System.out.println("enter target value  :");
		int target=sc.nextInt();
		boolean found=false;
		for(int i=0;i<size;i++) {
			if(arr[i]==target) {
				found=true;
				System.out.println("index of the target value  :"+i);
				break;
			}	
		}
		if(found==false) {
			System.out.println("not found   :"+-1);
		}
		
		}

}
