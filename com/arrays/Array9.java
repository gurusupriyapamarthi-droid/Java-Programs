package com.arrays;

public class Array9 {

	public static void main(String[] args) {
		System.out.println("print largest number in the array!");
		

		        int[] arr = {20, 50, 10, 90, 40};

		        int max = arr[0];

		        for(int i = 1; i < arr.length; i++) {

		            if(arr[i] > max) {
		                max = arr[i];
		            }
		        }

		        System.out.println("Largest Number = " + max);
		    }
		

	}


