package com.conditionalstloops;

import java.util.Scanner;

public class Numbersdivisibleby3 {

	public static void main(String[] args) {
		System.out.println("Check whether the number is divisible by 3");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number position  :");
		int n=sc.nextInt();
		System.out.println("enter divisior   :");
		int d=sc.nextInt();
		int count=0;
		int num=1;
		while(count<n) {
			if(num%d==0) {
				count++;
			}
			if(count==n) {
				System.out.println("output is  :"+num);
				
			}num++;
			
		}
	}

}
