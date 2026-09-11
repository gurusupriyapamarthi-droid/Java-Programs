package com.Arrayss;

public class MaxsubArray {

	public static void main(String[] args) {
		int []arr= {4,-1,6,-7,8,9,-2,1,5};
		int sum=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(sum+arr[i]>arr[i]) {
				sum+=arr[i];
			}else {
				sum=arr[i];
			}
			if(sum>max) {
				max=sum;
			}
		}
		System.out.println("max sub array   :"+max);

	}

}
