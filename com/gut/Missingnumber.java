package com.gut;

public class Missingnumber {

	public static void main(String[] args) {
		System.out.println("-----one number missing----");
		int []arr= {7,1,2,3,4,5};
		int n=arr.length+1;
		int actualSum=0;
		int expectedSum=n*(n+1)/2;
		for(int i=0;i<arr.length;i++) {
			 actualSum= actualSum+arr[i];
		}
		System.out.println("missing value");
		System.out.println(expectedSum-actualSum);

	}

}
