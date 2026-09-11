package com.Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		System.out.println("------------Search element in  array-------");
		Scanner sc=new Scanner (System.in);
		int found=-1;
		System.out.println("enter lenght of the array");
		int length=sc.nextInt();
		int []arr=new int[length];
		System.out.println("enter elements  :");
		for(int i=0;i<length;i++) {
		 arr[i]=sc.nextInt();	
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("enter search element  :");
		int search=sc.nextInt();
		for(int i=0;i<length;i++) {
			if(arr[i]==search) {
				found=arr[i];
				System.out.println("index of the search element is    :"+i+"  "+"element is"+"  "+arr[i]);
				break;
			}
		}
		if(found!=search) {
		System.out.println("not found");
	}

}
}
