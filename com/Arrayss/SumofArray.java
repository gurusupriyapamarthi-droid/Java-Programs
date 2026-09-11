package com.Arrayss;

public class SumofArray {

	public static void main(String[] args) {
		System.out.println("----------array---------");
		int []arr= {10,20,30,40,50};
		int []arr2= {37,47,34,47,78,73,82,0};
		int sum=0;
		int avg=0;
		int large=arr[0];
		int small=arr[0];
		
		for(int i=arr.length-1;i>=0;i--) {
			sum=sum+arr[i];
		}
		avg=sum/arr.length;
		System.out.println("sum of the array is  :"+sum);
		System.out.println("avg of array   :"+avg);
		for(int a:arr2) {
			if(a>large){
				large=a;
			}
			if(a<small) {
				small=a;
			}
			
		}
		System.out.println("large element is   :"+large);
		System.out.println("small element is   :"+small);
		

		

	}

}
