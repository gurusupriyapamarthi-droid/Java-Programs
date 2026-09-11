package com.arrays;

public class Array11 {

	public static void main(String[] args) {
		System.out.println("main method start!");
		int[]a= {10,20,30};
		int[]b= {40,50,60};
		int[]c= new int[a.length+b.length];
		System.out.println(c.length);
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for (int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		System.out.println(" arrays:");
		for(int e:c) {
			System.out.print(e+" ");
			
		}
		

	}

}
