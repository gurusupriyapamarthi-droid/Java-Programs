package com.Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class NonZero {

	public static void main(String[] args) {
		System.out.println("---------non Zero elements-------");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array  :");
		int size=sc.nextInt();
		int []arr=new int[size];
		int temp=0;
		//int index=0;
		System.out.println("enter elements   :");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(arr[i]!=0) {
				arr[temp]=arr[i];
				temp++;
			}
		}
		for(int i=temp;i<arr.length;i++) {
			arr[i]=0;
		}
		System.out.println(Arrays.toString(arr));
		
			
				
		
	}
}
