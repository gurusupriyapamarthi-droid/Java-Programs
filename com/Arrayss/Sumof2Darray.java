package com.Arrayss;

import java.util.Scanner;

public class Sumof2Darray {

	public static void main(String[] args) {
		System.out.println("----------Sum of the 2D array---------");
		Scanner sc=new Scanner(System.in);
		System.out.println("size of the row");
		int size=sc.nextInt();
		System.out.println("size of the col");
		int col=sc.nextInt();
		int[][]arr=new int[size][col];
		System.out.println("enter elements in the array");
		int sum=0;
		
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int min=arr[0][0];
		int max=arr[0][0];
		for(int i=0;i<size;i++) {
			for(int j=0;j<col;j++) {
				 sum=sum+arr[i][j];
			}
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<col;j++) {
				 if(arr[i][j]>max) {
					max=arr[i][j]; 
				 }
				 if(arr[i][j]<min) {
					 min=arr[i][j];
				 }
			}
		}
		System.out.println("sum of the 2D array  :"+sum);
		System.out.println("max of 2D array  :"+max);
		System.out.println("min of 2D array  :"+min);
		
	}

}
