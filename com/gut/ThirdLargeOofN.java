package com.gut;

import java.util.Scanner;

public class ThirdLargeOofN {

	public static void main(String[] args) {
		System.out.println("the third largest distinct element");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size   :");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("enter elements   :");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int fLarge=Integer.MIN_VALUE;
		int sLarge=Integer.MIN_VALUE;
		int tLarge=Integer.MIN_VALUE;
		for(int i=0;i<size;i++) {
			int num=arr[i];
			if(num==fLarge ||num==sLarge||num==tLarge) {
				continue;
			}
			if(num>fLarge) {
				tLarge=sLarge;
				sLarge=fLarge;
				fLarge=num;
			}
			else if(num>sLarge) {
				tLarge=sLarge;
				sLarge=num;
			}else if(num>tLarge) {
				tLarge=num;
			}
		}
		if(tLarge!=Integer.MIN_VALUE) {
			System.out.println("Third Large   :"+tLarge);
		}else {
			System.out.println("Third Large not found");
		}

	}

}
