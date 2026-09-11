package com.Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class Relativeorderofnonzeroelements {

	public static void main(String[] args) {
		System.out.println("------------maintaining the relative order of non-zero elements----------");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size if the array");
		int size=sc.nextInt();
		int[]arr=new  int [size];
		int a=0;
		System.out.println("enter elements in array  :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>0) {
				arr[a]=arr[i];
				a++;
			}
		}
		
		if(a<arr.length) {
			arr[a]=0;
			a++;
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//			
//		}
		System.out.print(Arrays.toString(arr));
		
	}

}
