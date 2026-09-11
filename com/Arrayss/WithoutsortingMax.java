package com.Arrayss;

public class WithoutsortingMax {

	public static void main(String[] args) {
		int []a = {5,30,10,12,11,40};
		int k=3;
		int large=Integer.MAX_VALUE;
		for(int i=0;i<k;i++) {
			int max=Integer.MIN_VALUE;
			for(int j:a) {
				if(j>max&&j<large) {
					max=j;	
				}	
			}
			large=max;
		}
		
		System.out.println(large);

	}
	

}
