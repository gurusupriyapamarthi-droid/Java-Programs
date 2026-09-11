package com.Arrayss;

import java.util.Scanner;

public class Sumofdiagonal {

	public static void main(String[] args) {
		System.out.println("----------Sum of the Diagonal 2D array---------");
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
//		
//		for(int i=0;i<size;i++) {
//			sum=sum+arr[i][i];
//	}
//		for(int i=0;i<size;i++) {
//			for(int j=0;j<col;j++) {
//				if(i+j==arr.length-1) {
//					sum=sum+arr[i][j];
//				}
//			}
//	}
		for(int i=0;i<size;i++) {
			for(int j=0;j<col;j++) {
				if(i+j==arr.length-1 || i==j) {
					sum=sum+arr[i][j];
				}
			}
	}
			
//		System.out.println("enter search element  :");
//		int search=sc.nextInt();
//		for(int i=0;i<size;i++) {
//			for(int j=0;j<col;j++) {
//				if(search==arr[i][j]) {
//					System.out.println("search element is found at   :"+ i+" ,"+j);
//					break;
//				}	
//			}
//		}
		System.out.println("sum of the  Diagonal "+sum);

	}
}
