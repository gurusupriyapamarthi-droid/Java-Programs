package com.Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargeElement {

	public static void main(String[] args) {
	System.out.println("-------------Second Largest Element-----------");
	Scanner sc=new Scanner(System.in);
	int []arr=new int [5];
	int large=arr[0];
	int secondlarge=0;
	System.out.println("enter elements  :");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		
		if(arr[i]>large) {
			secondlarge=large;
			large=arr[i];
		}
		else if(arr[i]>secondlarge && arr[i]!=large) {
			secondlarge=arr[i];
		}
	}
	System.out.println("second large   :"+secondlarge);
	}
}
