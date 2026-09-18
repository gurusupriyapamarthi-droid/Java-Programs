package com.gut;

import java.util.Scanner;

public class Leader {
//	int[] temp=new int[size];
//	temp[0]=max;
////	int j=1;
//	temp[j]=max;
////	j++;
//	System.out.println(j);
////	for(int i=0;i<j;i++) {
////		System.out.print(temp[i]+ " ");
////	}

	public static void main(String[] args) {
		System.out.println("a leader if it is greater than all elements to its righ");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array");
		int size=sc.nextInt();
		int[]arr=new int[size];
		int leader[]=new int[arr.length];
		System.out.println("elements in array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[arr.length-1];
		int count=0;
		leader[count++]=max;
		
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i];
				leader[count++]=max;
			}	
		}	
		for(int i=count-1;i>=0;i--) {
			System.out.print(leader[i]+" ");
		}
		
		
	}
	}


