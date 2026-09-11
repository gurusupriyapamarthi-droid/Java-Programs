package com.Arrayss;

import java.util.Arrays;

public class Circlesum {

	public static void main(String[] args) {
		System.out.println("----------circle sum----------");
		int []arr= {1,2,3,4,5};
		int []b=new int [arr.length];
		int k=2;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=1;j<=k;j++) {
				sum+=arr[(i+j)%arr.length];
			}
			b[i]=sum;
		}
		System.out.println(Arrays.toString(b));

	}

}
