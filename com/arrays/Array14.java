package com.arrays;

public class Array14 {
	public static void main(String[] args) {
	System.out.println("main method start");
	int[] arr= { 23, 74, 70, 77, 38, 68, 22, 7 };
	int min = arr[0];
	int secondMin = arr[0];
	
	
	int max = arr[0];
	int secondmax = arr[0];
	
	// Find minimum 
	for (int num : arr) { 
        if (num < min) {
            secondMin = min;
            min = num;
        } else if (num < secondMin && num != min) {
            secondMin = num;
        }
	
        //second maximum
        for (int num1 : arr) {
        		if(num1>max) {
        			secondmax = max;
        			max = num1;
        		}else if(num1>secondmax && num1 !=max) {
        			secondmax= num1;
        			
        		}
        }
        	
        }
	
//	for(int i = 1;i<arr.length;i++){
//		if (arr[i] < min) {
//			min = arr[i];
//
//		} else if (arr[i] > max) {
//			max = arr[i];
//
//		}
//	}

	System.out.println("min num"+" "+min);
	System.out.println("secondmin num"+" "+secondMin);
	System.out.println("max num"+" "+max);
	System.out.println("secondmax num"+" "+secondmax);
}
}
