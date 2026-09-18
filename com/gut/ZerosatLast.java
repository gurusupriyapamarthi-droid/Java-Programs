package com.gut;

import java.util.Arrays;

public class ZerosatLast {
//	static void nonzero(int[]arr) {
//		int temp=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=0) {
//				arr[temp]=arr[i];
//				temp++;
//			}
//		}
//		for(int i=temp;i<arr.length;i++) {
//			arr[i]=0;
//		}
//	}
	static void nonzero(int[]arr) {
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				k++;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("move all zeros to the end ");
		int[]arr= {0, 1, 0, 3, 12};
		
		System.out.println("before sort   :"+Arrays.toString(arr));
		nonzero(arr);
		
		System.out.println("After sort   :"+Arrays.toString(arr));

	}

}
