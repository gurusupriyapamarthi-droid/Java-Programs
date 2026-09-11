package com.gut;

import java.util.Scanner;

public class BinarySearch {
	static boolean isFound(int []a,int k) {
		boolean flag=false;
		int low=0;
		int high=a.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==k) {
				System.out.println("search value index is   :"+mid);
				flag=true;
				break;
			}else if(a[mid]<k) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		if(flag==false) {
			System.out.println("not found   :"+ -1);
		}
		return flag;
	}
	
	
	public static void main(String[] args) {
		System.out.println("-------Binary Search------");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of the array");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println("enter elsements in array  :");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter search value k:");
		int k=sc.nextInt();
		boolean status=isFound(a,k);
	}

}
