package com.conditionalstloops;

import java.util.Scanner;

public class Swapthefirstandlastdigits {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("swap the first and last digits");
		System.out.println();
		System.out.println("enter a number  :");//12345
		int n=sc.nextInt();
		int original=n;
		int lastdigit=n%10;
		int firstdigit=0;
		int count=0;
		int temp=n;
		
		while(temp>0) {
			firstdigit=temp;
			temp=temp/10;
			count++;
		}
		//double pw=Math.pow(10, count-1);
		//int mid=(original%pw)/10;
		int middle=(original%Math.powExact(10, count-1))/10;
		int swap=lastdigit*Math.powExact(10, count-1)+middle*10+firstdigit;
		System.out.println("after swapping     :"+swap);
		
		
		

	}

}
