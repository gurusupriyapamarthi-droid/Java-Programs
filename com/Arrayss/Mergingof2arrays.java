package com.Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class Mergingof2arrays {

	public static void main(String[] args) {
		System.out.println("-----merging of two arrays-----------");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the first array   :");
		int size1=sc.nextInt();
		int[]arr1=new int[size1];
		System.out.println("enter  size of the second array   :");
		int size2=sc.nextInt();
		int[]arr2=new int[size2];
		System.out.println("elements of first array  :");
		for(int i=0;i<size1;i++) {
			arr1[i]=sc.nextInt();
			}
		System.out.println(Arrays.toString(arr1));
		System.out.println();
		System.out.println("elements of the second array  :");
		for(int i=0;i<size2;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println("-------------------------------------");
		int[]arr3=new int[size1+size2];
		System.out.println("length of arr3    :"+arr3.length);
		for(int i=0;i<size1;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<size2;i++) {
			arr3[size1+i]=arr2[i];
		}
		System.out.print(Arrays.toString(arr3));
		
		
		

	}

}
