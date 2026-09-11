package com.Arrayss;

import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		System.out.println("----------the Duplicate Number-----------");
		int[]arr={1,3,5,2,6,3,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Number   :"+arr[i]);
				}
			}
		}

	}

}
