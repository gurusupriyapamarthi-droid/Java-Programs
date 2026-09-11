package com.arrays;

public class Array7 {

	public static void main(String[] args) {
		System.out.println("main method start");
		int[] arr= {23,74,70,77,38,68,22,7};
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
				
			}else if (arr[i]>max) {
				max=arr[i];
				
				
			}
		}
		
		System.out.println("min num"+" "+min);
		System.out.println("max num"+" "+max);
	}

}
